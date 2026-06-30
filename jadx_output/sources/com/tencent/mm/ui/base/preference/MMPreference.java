package com.tencent.mm.ui.base.preference;

@db5.a(8192)
/* loaded from: classes11.dex */
public abstract class MMPreference extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
    public static final java.lang.String TAG = "MicroMsg.mmui.MMPreference";
    private byte _hellAccFlag_;
    private com.tencent.mm.ui.base.preference.h0 adapter;
    protected android.widget.ImageView bannerCloseBtn;
    protected android.widget.TextView bannerTv;
    protected android.widget.RelativeLayout bannerView;
    private android.view.View bottomMask;
    private android.widget.ListView list;

    /* renamed from: sp, reason: collision with root package name */
    private android.content.SharedPreferences f197762sp;
    private boolean dirty = false;
    private boolean isRefreshing = false;
    private final java.util.List<android.widget.AbsListView.OnScrollListener> scrollListeners = new java.util.ArrayList();

    public final void U6() {
        com.tencent.mm.ui.base.preference.h0 h0Var = this.adapter;
        h0Var.f197822x = new com.tencent.mm.ui.base.preference.x(this);
        h0Var.notifyDataSetChanged();
        int resourceId = getResourceId();
        if (resourceId != -1) {
            this.adapter.g(resourceId);
        }
        this.list.setAdapter((android.widget.ListAdapter) this.adapter);
        this.list.setOnItemClickListener(new com.tencent.mm.ui.base.preference.a0(this));
        this.list.setOnItemLongClickListener(new com.tencent.mm.ui.base.preference.b0(this));
        this.list.setOnScrollListener(new com.tencent.mm.ui.base.preference.c0(this));
    }

    public void addOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener) {
        this.scrollListeners.add(onScrollListener);
    }

    public boolean autoRefresh() {
        return true;
    }

    public com.tencent.mm.ui.base.preference.h0 createAdapter(android.content.SharedPreferences sharedPreferences) {
        return new com.tencent.mm.ui.base.preference.h0(this, getListView(), sharedPreferences);
    }

    public void createUI() {
        this.list.setAdapter((android.widget.ListAdapter) this.adapter);
    }

    public boolean dirty() {
        return this.dirty;
    }

    public void dispatchClick(com.tencent.mm.ui.base.preference.h0 h0Var, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference.f197780q != null) {
            onPreferenceTreeClick(h0Var, preference);
        }
    }

    public void doPrepareData() {
    }

    public android.view.View getBottomMask() {
        return this.bottomMask;
    }

    public android.view.View getBottomView() {
        return null;
    }

    public android.content.SharedPreferences getDefaultSharedPreferences() {
        return this.f197762sp;
    }

    public int getFooterResourceId() {
        return -1;
    }

    public android.view.View getFooterView() {
        return null;
    }

    public int getHeaderResourceId() {
        return -1;
    }

    public android.view.View getHeaderView() {
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c0n;
    }

    public android.widget.ListView getListView() {
        return this.list;
    }

    public com.tencent.mm.ui.base.preference.r getPreferenceScreen() {
        return this.adapter;
    }

    public abstract int getResourceId();

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean isContentAtTop() {
        return !this.list.canScrollVertically(-1);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f197762sp = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.list = (android.widget.ListView) findViewById(android.R.id.list);
        this.bottomMask = findViewById(com.tencent.mm.R.id.aur);
        this.adapter = createAdapter(this.f197762sp);
        this.bannerView = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.l2z);
        this.bannerTv = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l2y);
        this.bannerCloseBtn = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.l2x);
        doPrepareData();
        int headerResourceId = getHeaderResourceId();
        android.view.View headerView = getHeaderView();
        if (headerResourceId != -1) {
            this.list.addHeaderView(getLayoutInflater().inflate(headerResourceId, (android.view.ViewGroup) null));
        } else if (headerView != null) {
            if (headerView.getLayoutParams() != null) {
                headerView.setLayoutParams(new android.widget.AbsListView.LayoutParams(headerView.getLayoutParams()));
            } else {
                com.tencent.mars.xlog.Log.e(TAG, "[arthurdan.mmpreference] Notice!!! header.getLayoutParams() is null!!!\n");
            }
            this.list.addHeaderView(headerView);
        }
        int footerResourceId = getFooterResourceId();
        android.view.View footerView = getFooterView();
        if (footerResourceId != -1) {
            this.list.addFooterView(getLayoutInflater().inflate(footerResourceId, (android.view.ViewGroup) null));
        } else if (footerView != null) {
            if (footerView.getLayoutParams() != null) {
                footerView.setLayoutParams(new android.widget.AbsListView.LayoutParams(footerView.getLayoutParams()));
            } else {
                com.tencent.mars.xlog.Log.e(TAG, "[arthurdan.mmpreference] Notice!!! footer.getLayoutParams() is null!!!\n");
            }
            this.list.addFooterView(footerView);
        }
        android.view.View bottomView = getBottomView();
        if (bottomView != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.l2v);
            frameLayout.addView(bottomView);
            frameLayout.setVisibility(0);
        }
        android.view.View view = this.bottomMask;
        if (view != null) {
            int i17 = showBottomMask().booleanValue() ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/preference/MMPreference", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/preference/MMPreference", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        U6();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }

    public abstract boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference);

    public boolean onPreferenceTreeLongClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference, android.view.View view) {
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (autoRefresh()) {
            this.adapter.notifyDataSetChanged();
        }
        super.onResume();
    }

    public boolean onSetToTop() {
        android.widget.ListView listView = this.list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(listView);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/base/preference/MMPreference", "onSetToTop", "()Z", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        com.tencent.mm.sdk.platformtools.m.a((android.widget.ListView) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/ui/base/preference/MMPreference", "onSetToTop", "()Z", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        return true;
    }

    public void releaseUI() {
        this.list.setAdapter((android.widget.ListAdapter) null);
    }

    public void removeOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener) {
        this.scrollListeners.remove(onScrollListener);
    }

    public void setListViewBackgroundColor(int i17) {
        this.list.setBackgroundColor(i17);
    }

    public void setSelection(int i17) {
        this.list.setSelection(i17);
    }

    public void setShowBottomLine(java.lang.Boolean bool) {
        com.tencent.mm.ui.base.preference.h0 h0Var = this.adapter;
        h0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPreferenceAdapter", "setShowBootomLine: %B", bool);
        h0Var.f197821w = bool.booleanValue();
    }

    public void setShowTopLine(java.lang.Boolean bool) {
        com.tencent.mm.ui.base.preference.h0 h0Var = this.adapter;
        h0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPreferenceAdapter", "setShowTopLine: %B", bool);
        h0Var.f197820v = bool.booleanValue();
    }

    public java.lang.Boolean showBottomMask() {
        return java.lang.Boolean.FALSE;
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(la5.y0.class);
    }

    public void updateAdapter(com.tencent.mm.ui.base.preference.h0 h0Var) {
        this.adapter = h0Var;
        U6();
    }
}
