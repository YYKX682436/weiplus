package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public abstract class MMFragment extends com.tencent.mm.ui.FragmentActivitySupport implements ih5.d, android.view.View.OnAttachStateChangeListener {
    protected static final int DEFAULT_TOAST_TIME = 3000;
    public static final java.lang.String FLAG_OVERRIDE_ENTER_ANIMATION = "MMActivity.OverrideEnterAnimation";
    public static final java.lang.String FLAG_OVERRIDE_EXIT_ANIMATION = "MMActivity.OverrideExitAnimation";
    private static final java.lang.String TAG = "MicroMsg.MMFragment";
    private static final java.lang.String TAG2 = "MicroMsg.INIT";
    private boolean bounceEnable;
    java.lang.String className;
    protected com.tencent.mm.ui.ga mController;
    private boolean mCurVisible;
    private ih5.d mListener;
    protected androidx.appcompat.app.AppCompatActivity mParent;
    private com.tencent.mm.ui.MMFragment mParentFragment;
    private boolean mParentVisible;
    private com.tencent.mm.ui.widget.SwipeBackLayout mSwipeBackLayout;

    public MMFragment() {
        this.mController = new com.tencent.mm.ui.rc(this);
        this.bounceEnable = true;
        this.mParentVisible = false;
        this.mCurVisible = false;
    }

    public static java.util.Locale initLanguage(android.content.Context context) {
        return com.tencent.mm.ui.ga.Q(context);
    }

    public void activateBroadcast(boolean z17) {
        this.mController.e(z17);
    }

    public void addDialog(android.app.Dialog dialog) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (dialog == null) {
            gaVar.getClass();
            return;
        }
        if (gaVar.F == null) {
            gaVar.F = new java.util.ArrayList();
        }
        gaVar.F.add(dialog);
    }

    public void addIconOptionMenu(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.i(i17, i18, "", false, onMenuItemClickListener, null, com.tencent.mm.ui.fb.NORMAL);
    }

    public void addSearchMenu(boolean z17, com.tencent.mm.ui.tools.c9 c9Var) {
        this.mController.j(z17, c9Var);
    }

    public void addTextOptionMenu(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.i(i17, 0, str, false, onMenuItemClickListener, null, com.tencent.mm.ui.fb.NORMAL);
    }

    public boolean callBackMenu() {
        return this.mController.k();
    }

    public void dealContentView(android.view.View view) {
    }

    public void enableBackMenu(boolean z17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        com.tencent.mm.ui.eb ebVar = gaVar.C;
        if (ebVar == null || ebVar.f208380f == z17) {
            return;
        }
        ebVar.f208380f = z17;
        gaVar.N0();
    }

    public void enableOptionMenu(boolean z17) {
        this.mController.p(true, -1, z17);
    }

    public com.tencent.mm.ui.eb findMenuInfo(int i17) {
        return this.mController.E(i17);
    }

    public void finish() {
        if (this.isCurrentActivity) {
            if (thisActivity() != null) {
                thisActivity().finish();
            }
        } else if (thisActivity() != null) {
            thisActivity().getSupportFragmentManager().popBackStack();
        }
        int intExtra = thisActivity().getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
        int intExtra2 = thisActivity().getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
        if (intExtra != -1) {
            getContext().overridePendingTransition(intExtra, intExtra2);
        }
    }

    public void fullScreenNoTitleBar(boolean z17) {
        this.mController.t(z17);
    }

    public void fullScreenWithTitleBar(boolean z17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (z17) {
            gaVar.f208670t.getWindow().setFlags(1024, 1024);
        } else {
            gaVar.f208670t.getWindow().clearFlags(1024);
        }
    }

    public android.view.View getBodyView() {
        return this.mController.f208634b;
    }

    public ul5.k getBounceView() {
        return this.mController.f208674v;
    }

    public final android.view.View getContentView() {
        return this.mController.w();
    }

    public com.tencent.mm.ui.ga getController() {
        return this.mController;
    }

    public int getCustomBounceId() {
        return -1;
    }

    public int getForceOrientation() {
        return this.mController.A();
    }

    public s75.b getIdentityString() {
        return new s75.b("");
    }

    public boolean getLandscapeMode() {
        return this.mController.f208676x;
    }

    /* renamed from: getLayoutId */
    public abstract int getF72225d();

    public android.view.View getLayoutView() {
        return null;
    }

    public android.content.res.Resources getMMResources() {
        return thisActivity().getResources();
    }

    public java.lang.String getMMString(int i17) {
        return thisActivity().getString(i17);
    }

    public java.lang.CharSequence getMMTitle() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        androidx.appcompat.app.b bVar = gaVar.G;
        if (bVar == null) {
            return null;
        }
        java.lang.String str = gaVar.f208652k;
        return str != null ? str : bVar.n();
    }

    public int getStreamMaxVolume(int i17) {
        return this.mController.f208648i.getStreamMaxVolume(i17);
    }

    public int getStreamVolume(int i17) {
        return this.mController.f208648i.getStreamVolume(i17);
    }

    public com.tencent.mm.ui.widget.SwipeBackLayout getSwipeBackLayout() {
        return this.mSwipeBackLayout;
    }

    public int getTitleLocation() {
        androidx.appcompat.app.b bVar = this.mController.G;
        if (bVar == null) {
            return 0;
        }
        return bVar.l();
    }

    public void hideTitleView() {
        this.mController.J();
    }

    public boolean hideVKB() {
        return this.mController.K();
    }

    public boolean interceptSupportInvalidateOptionsMenu() {
        if (!this.mController.S()) {
            return false;
        }
        this.mController.N0();
        return true;
    }

    public boolean isActionbarMenuUseOriginalSys() {
        return false;
    }

    public boolean isFragmentVisible() {
        return this.mCurVisible;
    }

    public boolean isLayoutInDecorView() {
        return false;
    }

    public boolean isScreenEnable() {
        return this.mController.f208650j;
    }

    public boolean isSupportCustomActionBar() {
        return isSupportNavigationSwipeBack();
    }

    public final boolean isSupportNavigationSwipeBack() {
        if (db5.f.g() && ep.a.a()) {
            return supportNavigationSwipeBack();
        }
        return false;
    }

    public boolean isTitleShowing() {
        androidx.appcompat.app.b bVar = this.mController.G;
        if (bVar == null) {
            return false;
        }
        return bVar.q();
    }

    public final void j0(boolean z17, boolean z18) {
        if (z17 == this.mCurVisible) {
            return;
        }
        com.tencent.mm.ui.MMFragment mMFragment = this.mParentFragment;
        boolean isFragmentVisible = mMFragment == null ? this.mParentVisible : mMFragment.isFragmentVisible();
        boolean isVisible = super.isVisible();
        boolean userVisibleHint = getUserVisibleHint();
        boolean z19 = isFragmentVisible && isVisible && userVisibleHint && !z18;
        com.tencent.mars.xlog.Log.i(TAG, "[filterAndNotifyVisibility] visible = %s parent = %s, super = %s, hint = %s name:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(isFragmentVisible), java.lang.Boolean.valueOf(isVisible), java.lang.Boolean.valueOf(userVisibleHint), getClass().getName());
        if (z19 != this.mCurVisible) {
            this.mCurVisible = z19;
            onVisibilityChanged(z19);
        }
    }

    public int keyboardState() {
        return this.mController.f208655l0;
    }

    public boolean needShowIdcError() {
        return true;
    }

    public boolean noActionBar() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        com.tencent.mars.xlog.Log.i(TAG, "onAttach");
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof com.tencent.mm.ui.MMFragment)) {
            com.tencent.mm.ui.MMFragment mMFragment = (com.tencent.mm.ui.MMFragment) parentFragment;
            this.mParentFragment = mMFragment;
            mMFragment.setOnVisibilityChangedListener(this);
        }
        j0(true, false);
    }

    public void onCancelDrag() {
    }

    @Override // com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mController.e0(thisActivity().getBaseContext(), (androidx.appcompat.app.AppCompatActivity) thisActivity());
        this.mController.E0(thisActivity().getResources().getColor(com.tencent.mm.R.color.f478490b));
        com.tencent.mm.ui.ga gaVar = this.mController;
        boolean z17 = this.bounceEnable;
        gaVar.f208675w = z17;
        ul5.k kVar = gaVar.f208674v;
        if (kVar != null) {
            kVar.setBounceEnabled(z17);
        }
    }

    public void onCreateBeforeSetContentView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.mController.g0(menu)) {
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(TAG, "onCreateView");
        setHasOptionsMenu(true);
        android.view.View contentView = getContentView();
        if (!isSupportNavigationSwipeBack()) {
            return contentView;
        }
        android.view.View contentView2 = getContentView();
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) contentView2.getParent();
        if (viewGroup2 != null) {
            this.mSwipeBackLayout = (com.tencent.mm.ui.widget.SwipeBackLayout) android.view.LayoutInflater.from(thisActivity()).inflate(com.tencent.mm.R.layout.cxh, viewGroup2, false);
            viewGroup2.removeView(contentView2);
            viewGroup2.addView(this.mSwipeBackLayout);
        } else {
            this.mSwipeBackLayout = (com.tencent.mm.ui.widget.SwipeBackLayout) android.view.LayoutInflater.from(thisActivity()).inflate(com.tencent.mm.R.layout.cxh, (android.view.ViewGroup) null);
        }
        this.mSwipeBackLayout.addView(contentView2);
        this.mSwipeBackLayout.setContentView(contentView2);
        this.mSwipeBackLayout.d(true);
        this.mSwipeBackLayout.setAutoResetToNoTranslucent(false);
        this.mSwipeBackLayout.setSwipeGestureDelegate(new com.tencent.mm.ui.sc(this));
        return this.mSwipeBackLayout;
    }

    @Override // com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.ga gaVar = this.mController;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        gaVar.f208649i0.dead();
        gaVar.H();
        q75.a.b(activity);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getView().removeOnAttachStateChangeListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        com.tencent.mm.ui.MMFragment mMFragment = this.mParentFragment;
        if (mMFragment != null) {
            mMFragment.setOnVisibilityChangedListener(null);
        }
        super.onDetach();
        j0(false, false);
        this.mParentFragment = null;
    }

    public void onDragBegin() {
    }

    @Override // ih5.d
    public void onFragmentVisibilityChanged(boolean z17) {
        j0(z17, false);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z17) {
        super.onHiddenChanged(z17);
        j0(!z17, z17);
    }

    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (this.mController.h0(i17, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            finish();
            return true;
        }
        if (i17 == 82 && keyEvent.getAction() == 1) {
            return onKeyUp(i17, keyEvent);
        }
        return false;
    }

    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        boolean z17;
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.getClass();
        if (i17 == 82 && keyEvent.getAction() == 1) {
            com.tencent.mm.ui.eb ebVar = gaVar.f208657m0;
            if (ebVar != null && ebVar.f208380f) {
                gaVar.l(gaVar.f208659n0, ebVar);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        return z17;
    }

    public void onKeyboardStateChanged() {
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return this.mController.j0(menuItem);
    }

    public void onParentVisibilityChanged(boolean z17) {
        this.mParentVisible = z17;
        j0(z17, false);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.zj.a(2, this.className);
        super.onPause();
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.e(false);
        gaVar.f208649i0.dead();
        java.lang.System.currentTimeMillis();
        onParentVisibilityChanged(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(android.view.Menu menu) {
        this.mController.k0(menu);
        super.onPrepareOptionsMenu(menu);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.zj.a(1, this.className);
        super.onResume();
        java.lang.System.currentTimeMillis();
        this.mController.l0();
        java.lang.System.currentTimeMillis();
        onParentVisibilityChanged(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.A() == -1) {
            gaVar.f208676x = gaVar.f208672u.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("settings_landscape_mode", false);
            boolean booleanExtra = gaVar.f208670t.getIntent().getBooleanExtra("KEY_SUPPORT_ORIENTATION", false);
            if (gaVar.f208676x || booleanExtra) {
                gaVar.f208670t.setRequestedOrientation(-1);
            } else {
                gaVar.f208670t.setRequestedOrientation(1);
            }
        } else {
            gaVar.f208670t.setRequestedOrientation(gaVar.A());
        }
        super.onStart();
        onParentVisibilityChanged(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        onParentVisibilityChanged(false);
    }

    public void onSwipeBack() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        j0(true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        getView().addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        j0(false, false);
    }

    public void onVisibilityChanged(boolean z17) {
        ih5.d dVar = this.mListener;
        if (dVar != null) {
            dVar.onFragmentVisibilityChanged(z17);
        }
        android.os.Bundle arguments = getArguments();
        com.tencent.mars.xlog.Log.i(TAG, "[onVisibilityChanged] visible:%s name:%s id:%s", java.lang.Boolean.valueOf(z17), getClass().getName(), java.lang.Integer.valueOf((arguments == null || !arguments.containsKey(getClass().getName())) ? -1 : arguments.getInt(getClass().getName())));
    }

    public void removeAllOptionMenu() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        java.util.LinkedList linkedList = gaVar.D;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
        gaVar.N0();
    }

    public boolean removeOptionMenu(int i17) {
        return this.mController.n0(i17);
    }

    public void setActivityController(com.tencent.mm.ui.ga gaVar) {
        if (gaVar != null) {
            this.mController = gaVar;
        }
    }

    public void setBackBtn(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.s0(onMenuItemClickListener, 0);
    }

    public void setBackBtnVisible(boolean z17) {
        this.mController.t0(z17);
    }

    public void setBackGroundColorResource(int i17) {
        this.mController.u0(i17);
    }

    public final void setBodyView(int i17) {
        this.mController.v0(i17);
    }

    public void setBounceEnabled(boolean z17) {
        this.bounceEnable = z17;
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.f208675w = z17;
        ul5.k kVar = gaVar.f208674v;
        if (kVar != null) {
            kVar.setBounceEnabled(z17);
        }
    }

    public void setLeftText(java.lang.String str, java.lang.Runnable runnable) {
        this.mController.x0(str, runnable);
    }

    public void setMMNormalView() {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.f208672u != null) {
            gaVar.N(gaVar.f208670t);
        }
    }

    public void setMMSubTitle(java.lang.String str) {
        this.mController.A0(str);
    }

    public void setMMSubTitleColor(int i17) {
        android.widget.TextView textView;
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.G == null || (textView = gaVar.N) == null) {
            return;
        }
        textView.setTextColor(i17);
        gaVar.f208665q0 = i17;
    }

    public void setMMSubTitleVisibility(int i17) {
        this.mController.N.setVisibility(i17);
    }

    public void setMMTitle(java.lang.String str) {
        this.mController.C0(str);
    }

    public void setMMTitleColor(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar.G == null) {
            return;
        }
        gaVar.H.setTextColor(i17);
    }

    public void setOnVisibilityChangedListener(ih5.d dVar) {
        this.mListener = dVar;
    }

    public void setParent(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.mParent = appCompatActivity;
    }

    @java.lang.Deprecated
    public void setRedDotVisibilty(int i17) {
    }

    public void setScreenEnable(boolean z17) {
        this.mController.F0(z17);
    }

    public void setTitleBarDoubleClickListener(java.lang.Runnable runnable) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        androidx.appcompat.app.b bVar = gaVar.G;
        if (bVar == null || runnable == null) {
            return;
        }
        bVar.j().setOnClickListener(new com.tencent.mm.ui.oa(gaVar, runnable));
    }

    @java.lang.Deprecated
    public void setTitleClickAction(android.view.GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
    }

    public void setTitleLogo(int i17, int i18) {
        this.mController.I0(i17, i18);
    }

    public void setTitleMuteIconVisibility(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.getClass();
        gaVar.f208666r = i17 == 0;
        gaVar.Y0();
    }

    public void setTitlePhoneIconVisibility(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.getClass();
        gaVar.f208668s = i17 == 0;
        gaVar.Y0();
    }

    public void setTitleVisibility(int i17) {
        this.mController.J0(i17);
    }

    @java.lang.Deprecated
    public void setToTop(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        com.tencent.mars.xlog.Log.i(TAG, "[setUserVisibleHint] isVisibleToUser:%s name:%s", java.lang.Boolean.valueOf(z17), getClass().getName());
        super.setUserVisibleHint(z17);
        j0(z17, false);
    }

    public void showHomeBtn(boolean z17) {
        this.mController.K0(z17);
    }

    public void showOptionMenu(boolean z17) {
        this.mController.L0(true, -1, z17);
    }

    public void showTitleView() {
        androidx.appcompat.app.b bVar = this.mController.G;
        if (bVar == null) {
            return;
        }
        bVar.L();
    }

    public void showVKB() {
        com.tencent.mm.ui.ga.M0(this.mController.f208670t);
    }

    @Override // com.tencent.mm.ui.FragmentActivitySupport, androidx.fragment.app.Fragment
    public void startActivity(android.content.Intent intent) {
        startActivityReal(intent);
    }

    public void startActivityReal(android.content.Intent intent) {
        super.startActivity(intent);
    }

    public boolean supportNavigationSwipeBack() {
        return true;
    }

    @Override // com.tencent.mm.ui.FragmentActivitySupport
    public androidx.fragment.app.FragmentActivity thisActivity() {
        return this.mController.x() != null ? this.mController.x() : super.getActivity();
    }

    public android.content.res.Resources thisResources() {
        androidx.fragment.app.FragmentActivity activity = super.getActivity();
        return activity == null ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources() : activity.getResources();
    }

    public void updateDescription(java.lang.String str) {
        this.mController.R0(str);
    }

    public void updateOptionMenu(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        updateOptionMenu(i17, i18, i19, false, onMenuItemClickListener);
    }

    public void updateOptionMenuIcon(int i17, int i18) {
        this.mController.T0(i17, i18);
    }

    public void updateOptionMenuListener(int i17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        com.tencent.mm.ui.eb E = this.mController.E(i17);
        if (E != null) {
            E.f208388n = onMenuItemClickListener;
            E.f208389o = onLongClickListener;
        }
    }

    public void updateOptionMenuRedDot(int i17, boolean z17) {
        this.mController.U0(i17, z17);
    }

    public void updateOptionMenuText(int i17, java.lang.String str) {
        this.mController.V0(i17, str);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.app.Activity getContext() {
        return this.mController.x();
    }

    public java.lang.String getMMString(int i17, java.lang.Object... objArr) {
        return thisActivity().getString(i17, objArr);
    }

    public boolean hideVKB(android.view.View view) {
        return this.mController.M(view);
    }

    public void setBackBtn(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17) {
        this.mController.s0(onMenuItemClickListener, i17);
    }

    public void setMMSubTitle(int i17) {
        this.mController.z0(i17);
    }

    public void setMMTitle(int i17) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.C0(gaVar.f208672u.getString(i17));
    }

    public void updateOptionMenu(int i17, int i18, int i19, boolean z17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.V0(i17, gaVar.x().getString(i18));
        this.mController.T0(i17, i19);
        com.tencent.mm.ui.eb E = this.mController.E(i17);
        if (E != null) {
            E.f208388n = onMenuItemClickListener;
            E.f208389o = null;
        }
        this.mController.U0(i17, z17);
        com.tencent.mm.ui.ga gaVar2 = this.mController;
        com.tencent.mm.ui.eb E2 = gaVar2.E(i17);
        gaVar2.o0(E2.f208375a);
        gaVar2.D.add(E2);
        gaVar2.N0();
    }

    public void enableOptionMenu(int i17, boolean z17) {
        this.mController.p(false, i17, z17);
    }

    public void showOptionMenu(int i17, boolean z17) {
        this.mController.L0(false, i17, z17);
    }

    public static void showVKB(android.app.Activity activity) {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    public void addIconOptionMenu(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i19) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.getClass();
        com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.NORMAL;
        com.tencent.mm.ui.eb ebVar = new com.tencent.mm.ui.eb();
        ebVar.f208375a = i17;
        ebVar.f208377c = i19;
        ebVar.f208376b = i18;
        ebVar.f208382h = "";
        ebVar.f208388n = onMenuItemClickListener;
        ebVar.f208389o = null;
        ebVar.f208386l = fbVar;
        ebVar.f208387m = false;
        if ((i18 == com.tencent.mm.R.drawable.f481980ap2 || i18 == com.tencent.mm.R.raw.icons_outlined_more || i18 == com.tencent.mm.R.raw.actionbar_icon_dark_more) && com.tencent.mm.sdk.platformtools.t8.K0("")) {
            ebVar.f208382h = gaVar.f208672u.getString(com.tencent.mm.R.string.w_);
        }
        gaVar.o0(ebVar.f208375a);
        gaVar.D.add(ebVar);
        gaVar.N0();
    }

    public void addTextOptionMenu(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        this.mController.i(i17, 0, str, false, onMenuItemClickListener, onLongClickListener, com.tencent.mm.ui.fb.NORMAL);
    }

    public MMFragment(boolean z17) {
        super(z17);
        this.mController = new com.tencent.mm.ui.rc(this);
        this.bounceEnable = true;
        this.mParentVisible = false;
        this.mCurVisible = false;
    }

    public void addTextOptionMenu(int i17, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener, com.tencent.mm.ui.fb fbVar) {
        this.mController.i(i17, 0, str, false, onMenuItemClickListener, onLongClickListener, fbVar);
    }

    public void updateOptionMenu(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i19) {
        this.mController.T0(i17, i18);
        com.tencent.mm.ui.eb E = this.mController.E(i17);
        if (E != null) {
            E.f208388n = onMenuItemClickListener;
            E.f208389o = null;
        }
        com.tencent.mm.ui.ga gaVar = this.mController;
        com.tencent.mm.ui.eb E2 = gaVar.E(i17);
        if (E2 != null && (E2.f208376b != i18 || E2.f208377c != i19)) {
            E2.f208376b = i18;
            E2.f208377c = i19;
            E2.f208378d = true;
            gaVar.N0();
        }
        com.tencent.mm.ui.ga gaVar2 = this.mController;
        com.tencent.mm.ui.eb E3 = gaVar2.E(i17);
        gaVar2.o0(E3.f208375a);
        gaVar2.D.add(E3);
        gaVar2.N0();
    }

    public void addIconOptionMenu(int i17, java.lang.String str, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.g(i17, str, i18, onMenuItemClickListener);
    }

    public void addIconOptionMenu(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.f(i17, i18, i19, onMenuItemClickListener);
    }

    public void addIconOptionMenu(int i17, int i18, int i19, boolean z17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.i(i17, i19, gaVar.f208672u.getString(i18), z17, onMenuItemClickListener, null, com.tencent.mm.ui.fb.NORMAL);
    }

    public void addIconOptionMenu(int i17, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        this.mController.i(i17, i18, "", false, onMenuItemClickListener, onLongClickListener, com.tencent.mm.ui.fb.NORMAL);
    }

    public void addIconOptionMenu(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        com.tencent.mm.ui.ga gaVar = this.mController;
        gaVar.i(i17, i19, gaVar.f208672u.getString(i18), false, onMenuItemClickListener, onLongClickListener, com.tencent.mm.ui.fb.NORMAL);
    }

    public void addIconOptionMenu(int i17, int i18, android.graphics.drawable.Drawable drawable, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.h(i17, getString(i18), drawable, onMenuItemClickListener);
    }

    public void addIconOptionMenu(int i17, java.lang.String str, android.graphics.drawable.Drawable drawable, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.h(i17, str, drawable, onMenuItemClickListener);
    }
}
