package com.lonepulse.icklebot.test.activity.support;

/*
 * #%L
 * IckleBot Integration Tests
 * %%
 * Copyright (C) 2013 Lonepulse
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.view.animation.Animation;

import com.lonepulse.icklebot.bind.BindManager;
import com.lonepulse.icklebot.network.NetworkManager;
import com.lonepulse.icklebot.test.R;
import com.lonepulse.icklebot.test.activity.suppport.ImplicitInjectionFragmentActivity;
import com.xtremelabs.robolectric.RobolectricTestRunner;

/**
 * <p>Unit test for {@link ImplicitInjectionFragmentFragmentActivity}.
 * 
 * @category test
 * <br><br>
 * @version 1.1.4
 * <br><br>
 * @author <a href="mailto:lahiru@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
@RunWith(RobolectricTestRunner.class)
public class ImplicitInjectionFragmentActivityTest {
	
	
	/**
	 * <p>The instance of {@link ImplicitInjectionFragmentActivity} 
	 * whose implicit injection is to be tested.
	 */
	private ImplicitInjectionFragmentActivity activity;
	
	
	/**
	 * <p>Sets up the test by instantiating {@link #activity}.
	 * 
	 * @throws Exception
	 * 			if {@link #activity} instantiation terminated 
	 * 			with an error
	 */
	@Before
	public final void setUp() throws Exception {
		
		activity = new ImplicitInjectionFragmentActivity();
		activity.onCreate(null);
	}

	/**
	 * <p>Test for layout, title and window-features injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.0
	 */
	@Test
	public final void testConfiguration() throws Exception {
	
		assertNotNull(activity.findViewById(R.id.root));
		assertTrue(activity.getTitle().toString().equalsIgnoreCase("Implicit Injection"));
	}
	
	/**
	 * <p>Test application injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.1
	 */
	@Test
	public final void testApplication() throws Exception {
		
		assertNotNull(activity.application);
	}
	
	/**
	 * <p>Test string injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.1
	 */
	@Test
	public final void testString() throws Exception {
		
		assertNotNull(activity.btnSubmit);
	}
	
	/**
	 * <p>Test integer injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.1
	 */
	@Test
	public final void testInteger() throws Exception {
		
		assertEquals(activity.major_version, 1);
	}
	
	/**
	 * <p>Test view injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.1
	 */
	@Test
	public final void testView() throws Exception {
		
		assertNotNull(activity.btnSubmit);
	}
	
	/**
	 * <p>Test drawable injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.1
	 */
	@Test
	public final void testDrawable() throws Exception {
		
		assertNotNull(activity.ic_launcher);
	}
	
	/**
	 * <p>Test color injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.2
	 */
	@Test
	public final void testColor() throws Exception {
		
		assertEquals(activity.getResources().getColor(R.color.bg_generic), 
					 activity.bg_generic, 0);
	}
	
	/**
	 * <p>Test dimension injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.2
	 */
	@Test
	public final void testDimension() throws Exception {
		
		assertEquals(12.0, activity.txt_small, 0);
	}
	
	/**
	 * <p>Test boolean injection.</p>
	 * 
	 * <p><b>NOTE</b>: Robolectric v1.1 retrieves false 
	 * for all boolean resources. Hence a null check on 
	 * a boolean wrapper is performed.</p>
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.1
	 */
	@Test
	public final void testBoolean() throws Exception {
		
		assertNotNull(activity.theme_generic);
	}
	
	/**
	 * <p>Test {@link Animation} injection.</p>
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.1
	 */
	@Test
	public final void testAnimation() throws Exception {
		
		assertNotNull(activity.fade_out);
	}
	
	/**
	 * <p>Test system service injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.1
	 */
	@Test
	public final void testSystemService() throws Exception {
		
		assertNotNull(activity.telephony_service);
	}
	
	/**
	 * <p>Test {@link BindManager} injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.4
	 */
	@Test
	public final void testIckleServiceBind() throws Exception {
		
		assertNotNull(activity.bindManager);
	}
	
	/**
	 * <p>Test {@link NetworkManager} injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.4
	 */
	@Test
	public final void testIckleServiceNetwork() throws Exception {
		
		assertNotNull(activity.networkManager);
	}
	
	/**
	 * <p>Test POJO injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.1
	 */
	@Test
	public final void testPOJO() throws Exception {
		
		assertNotNull(activity.accountsService);
	}
	
	/**
	 * <p>Test layout injection.
	 * 
	 * @throws Exception
	 * 			if test terminated with an error
	 * 
	 * @since 1.1.3
	 */
	@Test
	public final void testLayout() throws Exception {
		
		assertNotNull(activity.rootView);
	}
}
