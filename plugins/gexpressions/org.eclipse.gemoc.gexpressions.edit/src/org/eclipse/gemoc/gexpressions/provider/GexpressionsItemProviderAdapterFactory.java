/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.gemoc.gexpressions.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.gemoc.gexpressions.util.GexpressionsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GexpressionsItemProviderAdapterFactory extends GexpressionsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GexpressionsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GProgram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GProgramItemProvider gProgramItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGProgramAdapter() {
		if (gProgramItemProvider == null) {
			gProgramItemProvider = new GProgramItemProvider(this);
		}

		return gProgramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GImportStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GImportStatementItemProvider gImportStatementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GImportStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGImportStatementAdapter() {
		if (gImportStatementItemProvider == null) {
			gImportStatementItemProvider = new GImportStatementItemProvider(this);
		}

		return gImportStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GNavigationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GNavigationExpressionItemProvider gNavigationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GNavigationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGNavigationExpressionAdapter() {
		if (gNavigationExpressionItemProvider == null) {
			gNavigationExpressionItemProvider = new GNavigationExpressionItemProvider(this);
		}

		return gNavigationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GReferenceExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GReferenceExpressionItemProvider gReferenceExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GReferenceExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGReferenceExpressionAdapter() {
		if (gReferenceExpressionItemProvider == null) {
			gReferenceExpressionItemProvider = new GReferenceExpressionItemProvider(this);
		}

		return gReferenceExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GStringExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GStringExpressionItemProvider gStringExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GStringExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGStringExpressionAdapter() {
		if (gStringExpressionItemProvider == null) {
			gStringExpressionItemProvider = new GStringExpressionItemProvider(this);
		}

		return gStringExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GBooleanExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GBooleanExpressionItemProvider gBooleanExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GBooleanExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGBooleanExpressionAdapter() {
		if (gBooleanExpressionItemProvider == null) {
			gBooleanExpressionItemProvider = new GBooleanExpressionItemProvider(this);
		}

		return gBooleanExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GIntegerExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GIntegerExpressionItemProvider gIntegerExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GIntegerExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGIntegerExpressionAdapter() {
		if (gIntegerExpressionItemProvider == null) {
			gIntegerExpressionItemProvider = new GIntegerExpressionItemProvider(this);
		}

		return gIntegerExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GDoubleExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GDoubleExpressionItemProvider gDoubleExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GDoubleExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGDoubleExpressionAdapter() {
		if (gDoubleExpressionItemProvider == null) {
			gDoubleExpressionItemProvider = new GDoubleExpressionItemProvider(this);
		}

		return gDoubleExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GIfExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GIfExpressionItemProvider gIfExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GIfExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGIfExpressionAdapter() {
		if (gIfExpressionItemProvider == null) {
			gIfExpressionItemProvider = new GIfExpressionItemProvider(this);
		}

		return gIfExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GBraceExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GBraceExpressionItemProvider gBraceExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GBraceExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGBraceExpressionAdapter() {
		if (gBraceExpressionItemProvider == null) {
			gBraceExpressionItemProvider = new GBraceExpressionItemProvider(this);
		}

		return gBraceExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GEnumLiteralExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEnumLiteralExpressionItemProvider gEnumLiteralExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GEnumLiteralExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGEnumLiteralExpressionAdapter() {
		if (gEnumLiteralExpressionItemProvider == null) {
			gEnumLiteralExpressionItemProvider = new GEnumLiteralExpressionItemProvider(this);
		}

		return gEnumLiteralExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GAndExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GAndExpressionItemProvider gAndExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GAndExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGAndExpressionAdapter() {
		if (gAndExpressionItemProvider == null) {
			gAndExpressionItemProvider = new GAndExpressionItemProvider(this);
		}

		return gAndExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GXorExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GXorExpressionItemProvider gXorExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GXorExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGXorExpressionAdapter() {
		if (gXorExpressionItemProvider == null) {
			gXorExpressionItemProvider = new GXorExpressionItemProvider(this);
		}

		return gXorExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GOrExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GOrExpressionItemProvider gOrExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GOrExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGOrExpressionAdapter() {
		if (gOrExpressionItemProvider == null) {
			gOrExpressionItemProvider = new GOrExpressionItemProvider(this);
		}

		return gOrExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GEqualityExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEqualityExpressionItemProvider gEqualityExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GEqualityExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGEqualityExpressionAdapter() {
		if (gEqualityExpressionItemProvider == null) {
			gEqualityExpressionItemProvider = new GEqualityExpressionItemProvider(this);
		}

		return gEqualityExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GRelationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GRelationExpressionItemProvider gRelationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GRelationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGRelationExpressionAdapter() {
		if (gRelationExpressionItemProvider == null) {
			gRelationExpressionItemProvider = new GRelationExpressionItemProvider(this);
		}

		return gRelationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GAdditionExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GAdditionExpressionItemProvider gAdditionExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GAdditionExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGAdditionExpressionAdapter() {
		if (gAdditionExpressionItemProvider == null) {
			gAdditionExpressionItemProvider = new GAdditionExpressionItemProvider(this);
		}

		return gAdditionExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GMultiplicationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GMultiplicationExpressionItemProvider gMultiplicationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GMultiplicationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGMultiplicationExpressionAdapter() {
		if (gMultiplicationExpressionItemProvider == null) {
			gMultiplicationExpressionItemProvider = new GMultiplicationExpressionItemProvider(this);
		}

		return gMultiplicationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.gemoc.gexpressions.GNegationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GNegationExpressionItemProvider gNegationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.gemoc.gexpressions.GNegationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGNegationExpressionAdapter() {
		if (gNegationExpressionItemProvider == null) {
			gNegationExpressionItemProvider = new GNegationExpressionItemProvider(this);
		}

		return gNegationExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (gProgramItemProvider != null) gProgramItemProvider.dispose();
		if (gImportStatementItemProvider != null) gImportStatementItemProvider.dispose();
		if (gNavigationExpressionItemProvider != null) gNavigationExpressionItemProvider.dispose();
		if (gReferenceExpressionItemProvider != null) gReferenceExpressionItemProvider.dispose();
		if (gStringExpressionItemProvider != null) gStringExpressionItemProvider.dispose();
		if (gBooleanExpressionItemProvider != null) gBooleanExpressionItemProvider.dispose();
		if (gIntegerExpressionItemProvider != null) gIntegerExpressionItemProvider.dispose();
		if (gDoubleExpressionItemProvider != null) gDoubleExpressionItemProvider.dispose();
		if (gIfExpressionItemProvider != null) gIfExpressionItemProvider.dispose();
		if (gBraceExpressionItemProvider != null) gBraceExpressionItemProvider.dispose();
		if (gEnumLiteralExpressionItemProvider != null) gEnumLiteralExpressionItemProvider.dispose();
		if (gAndExpressionItemProvider != null) gAndExpressionItemProvider.dispose();
		if (gXorExpressionItemProvider != null) gXorExpressionItemProvider.dispose();
		if (gOrExpressionItemProvider != null) gOrExpressionItemProvider.dispose();
		if (gEqualityExpressionItemProvider != null) gEqualityExpressionItemProvider.dispose();
		if (gRelationExpressionItemProvider != null) gRelationExpressionItemProvider.dispose();
		if (gAdditionExpressionItemProvider != null) gAdditionExpressionItemProvider.dispose();
		if (gMultiplicationExpressionItemProvider != null) gMultiplicationExpressionItemProvider.dispose();
		if (gNegationExpressionItemProvider != null) gNegationExpressionItemProvider.dispose();
	}

}
