package com.tencent.mm.plugin.sns.ui.picker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI;", "Lcom/tencent/mm/ui/gallery/BaseMediaTabActivity;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsAlbumPickerUI extends com.tencent.mm.ui.gallery.BaseMediaTabActivity {
    public static final /* synthetic */ int I = 0;
    public com.tencent.mm.ui.widget.dialog.u3 B;

    /* renamed from: g, reason: collision with root package name */
    public boolean f170228g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f170229h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.d6 f170230i;

    /* renamed from: o, reason: collision with root package name */
    public int f170233o;

    /* renamed from: t, reason: collision with root package name */
    public long f170238t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f170239u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f170240v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f170241w;

    /* renamed from: f, reason: collision with root package name */
    public int f170227f = 9;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f170231m = jz5.h.b(td4.u1.f417735d);

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f170232n = "";

    /* renamed from: p, reason: collision with root package name */
    public int f170234p = 10;

    /* renamed from: q, reason: collision with root package name */
    public boolean f170235q = true;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f170236r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f170237s = "";

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f170242x = jz5.h.b(new td4.s1(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f170243y = jz5.h.b(new td4.t1(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f170244z = jz5.h.b(new td4.w1(this));
    public final jz5.g A = jz5.h.b(new td4.d1(this));
    public final jz5.g C = jz5.h.b(new td4.v1(this));
    public final jz5.g D = jz5.h.b(new td4.c2(this));
    public final java.lang.Runnable E = new td4.d2(this);
    public final td4.b F = new td4.b1(this);
    public final td4.b2 G = new td4.b2(this);
    public final jz5.g H = jz5.h.b(new td4.f1(this));

    public static final void X6(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$fetchNextPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchNextPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoadingMoreFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.setBounceEnabled(false);
        if (snsAlbumPickerUI.f170229h || !snsAlbumPickerUI.f170235q) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoadingMoreFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        } else {
            snsAlbumPickerUI.c7().post(new td4.x1(snsAlbumPickerUI));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoadingMoreFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        }
        snsAlbumPickerUI.c7().postDelayed(new td4.c1(snsAlbumPickerUI), 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchNextPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$fetchNextPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    public static final /* synthetic */ androidx.recyclerview.widget.RecyclerView Y6(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAlbumRv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        androidx.recyclerview.widget.RecyclerView c76 = snsAlbumPickerUI.c7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAlbumRv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return c76;
    }

    public static final /* synthetic */ boolean Z6(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z17 = snsAlbumPickerUI.f170235q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return z17;
    }

    public static final /* synthetic */ td4.g0 a7(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAlbumPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        td4.g0 f76 = snsAlbumPickerUI.f7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAlbumPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return f76;
    }

    public static final boolean b7(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isNeedAutoLoopDataFetch", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedAutoLoopDataFetch", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z17 = snsAlbumPickerUI.f170233o <= 2 || snsAlbumPickerUI.f7().getItemCount() <= 24;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedAutoLoopDataFetch", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isNeedAutoLoopDataFetch", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return z17;
    }

    @Override // com.tencent.mm.ui.gallery.BaseMediaTabActivity
    public android.view.View U6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFooterView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.picker.view.SnsAlbumPickerFooter snsAlbumPickerFooter = (com.tencent.mm.plugin.sns.ui.picker.view.SnsAlbumPickerFooter) ((jz5.n) this.H).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFooterView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return snsAlbumPickerFooter;
    }

    @Override // com.tencent.mm.ui.gallery.BaseMediaTabActivity
    public void V6(androidx.appcompat.app.AppCompatActivity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        kotlin.jvm.internal.o.g(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            activity.getWindow().setDecorFitsSystemWindows(false);
        }
        android.view.Window window = activity.getWindow();
        if (window != null) {
            window.clearFlags(1024);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    public final androidx.recyclerview.widget.RecyclerView c7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAlbumRv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        java.lang.Object value = ((jz5.n) this.f170242x).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAlbumRv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return recyclerView;
    }

    public final android.widget.Button d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMNextBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        java.lang.Object value = ((jz5.n) this.f170243y).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.Button button = (android.widget.Button) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMNextBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return button;
    }

    public final java.lang.String e7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        java.lang.Object value = ((jz5.n) this.f170231m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String str = (java.lang.String) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return str;
    }

    public final td4.g0 f7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAlbumPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        td4.g0 g0Var = (td4.g0) ((jz5.n) this.C).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAlbumPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return g0Var;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        super.finish();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(getIntent().getIntExtra("KEY_PARAMS_EXIT_ANIM", -1));
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            overridePendingTransition(-1, valueOf.intValue());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    public final android.widget.TextView g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f170244z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return textView;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return com.tencent.mm.R.id.jdy;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return com.tencent.mm.R.layout.c9w;
    }

    public final java.lang.String h7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (getIntent().getIntExtra("query_source_type", 0) == 43) {
            if (i17 <= 0) {
                java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f490441v5);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                return string;
            }
            java.lang.String str = getContext().getResources().getString(com.tencent.mm.R.string.f490441v5) + '(' + i17 + ')';
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            return str;
        }
        if (i17 <= 0) {
            java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.f490502ww);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            return string2;
        }
        java.lang.String str2 = getContext().getResources().getString(com.tencent.mm.R.string.f490502ww) + '(' + i17 + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return str2;
    }

    public final td4.g i7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsFileSaveHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        td4.g gVar = (td4.g) ((jz5.n) this.D).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsFileSaveHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return gVar;
    }

    public final int j7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        int i17 = this.f170234p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return i17;
    }

    public final void k7(java.util.List selectItemList) {
        java.lang.String l17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownloadMedia", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        kotlin.jvm.internal.o.g(selectItemList, "selectItemList");
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.j97);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showMaterialLoadingDialog", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        this.B = com.tencent.mm.ui.widget.dialog.u3.f(getContext(), string, true, 3, new td4.y1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMaterialLoadingDialog", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        td4.g i76 = i7();
        i76.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downLoadSnsMediaFileList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        i76.e().clear();
        i76.e().addAll(selectItemList);
        i76.d().clear();
        i76.f417661e = new java.util.LinkedHashMap(i76.e().size());
        i76.f417658b = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownLoadManager", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        Cj.c(i76.f417665i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownLoadManager", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        i76.f417662f = Cj;
        java.util.Iterator it = selectItemList.iterator();
        while (it.hasNext()) {
            td4.f2 f2Var = (td4.f2) it.next();
            if (f2Var.b().f377856e == 6) {
                l17 = com.tencent.mm.plugin.sns.model.f6.b(f2Var.a().getLocalid(), f2Var.b());
                if (l17 == null) {
                    l17 = "";
                }
            } else {
                l17 = com.tencent.mm.plugin.sns.model.i1.l(f2Var.b());
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsAlbumPickerDownloadHelper", "downLoadSnsMediaFileList: destFilePath null, mediaObj id:" + f2Var.b().f377855d);
            }
            java.util.Map map = i76.f417661e;
            if (map != null) {
                java.lang.String Id = f2Var.b().f377855d;
                kotlin.jvm.internal.o.f(Id, "Id");
                kotlin.jvm.internal.o.d(l17);
            }
        }
        td4.g.c(i76, null, 1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downLoadSnsMediaFileList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownloadMedia", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    public final void l7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        android.widget.Button d76 = d7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNextButtonEnable", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z17 = 1 <= i17 && i17 <= this.f170227f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNextButtonEnable", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        d76.setEnabled(z17);
        d7().setText(h7(i17));
        if (i17 > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFooterView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            com.tencent.mm.plugin.sns.ui.picker.view.SnsAlbumPickerFooter snsAlbumPickerFooter = (com.tencent.mm.plugin.sns.ui.picker.view.SnsAlbumPickerFooter) ((jz5.n) this.H).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFooterView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            android.widget.Button button = (android.widget.Button) snsAlbumPickerFooter.findViewById(com.tencent.mm.R.id.kap);
            button.setEnabled(true);
            button.setText(h7(i17));
            xg5.a aVar = this.f208685e;
            if (aVar != null) {
                ((b33.f) aVar).X6();
            }
        } else {
            xg5.a aVar2 = this.f208685e;
            if (aVar2 != null) {
                ((b33.f) aVar2).V6();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        byte[] byteArray;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        super.onActivityResult(i17, i18, intent);
        if (i17 == 8) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("sns_album_select_mediaobj_id_list") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>();
            }
            td4.g0 f76 = f7();
            f76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedItemListByMediaId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (stringArrayListExtra.isEmpty()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedItemListByMediaId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            } else {
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMObjIdMediaInfoMap", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    java.util.Map map = (java.util.Map) ((jz5.n) f76.f417672n).getValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMObjIdMediaInfoMap", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    td4.f2 f2Var = (td4.f2) map.get(next);
                    if (f2Var != null) {
                        arrayList.add(f2Var);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedItemListByMediaId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            }
            td4.g0 f77 = f7();
            f77.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSelectedState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator it6 = f77.Q().iterator();
            while (it6.hasNext()) {
                int O = f77.O((td4.f2) it6.next());
                if (O != -1) {
                    linkedHashSet.add(java.lang.Integer.valueOf(O));
                }
            }
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                int O2 = f77.O((td4.f2) it7.next());
                if (O2 != -1) {
                    linkedHashSet.add(java.lang.Integer.valueOf(O2));
                }
            }
            f77.Q().clear();
            f77.Q().addAll(arrayList);
            java.util.Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                f77.notifyItemChanged(((java.lang.Number) it8.next()).intValue());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSelectedState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            l7(arrayList.size());
            if (i18 == -1 && (!stringArrayListExtra.isEmpty())) {
                k7(arrayList);
            }
        } else if (i17 == 292) {
            com.tencent.mm.plugin.sns.statistics.f fVar = com.tencent.mm.plugin.sns.statistics.f.f164849a;
            com.tencent.mm.plugin.sns.statistics.f.b(fVar, 107, 0, 0L, 0, this.f170237s, 12, null);
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = intent != null ? (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
            android.os.Bundle bundle = ut3.f.f431176c.f431178b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMediaGeneratedEnterFinderPostUI", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerUI", "onMediaGeneratedEnterFinderPostUI");
            android.content.Intent intent2 = getIntent();
            if (captureDataManager$CaptureVideoNormalModel != null) {
                android.content.Intent intent3 = new android.content.Intent();
                if (this.f170239u) {
                    intent3.putExtras(intent2);
                }
                pm0.v.l(intent3, bundle, "ORIGIN_MUSIC_PATH");
                pm0.v.l(intent3, bundle, "ORIGIN_BGM_URL");
                pm0.v.e(intent3, bundle, "MEDIA_IS_MUTE", false, 4, null);
                pm0.v.e(intent3, bundle, "MUSIC_IS_MUTE", false, 4, null);
                pm0.v.h(intent3, bundle, "SOUND_TRACK_TYPE", 0, 4, null);
                pm0.v.l(intent3, bundle, "MUSIC_FEED_ID");
                if (bundle != null) {
                    byte[] byteArray2 = bundle.getByteArray("MEDIA_EXTRA_MUSIC");
                    if (byteArray2 != null) {
                        intent3.putExtra("MEDIA_EXTRA_MUSIC", byteArray2);
                    }
                    byte[] byteArray3 = bundle.getByteArray("ORIGIN_MUSIC_INFO");
                    if (byteArray3 != null) {
                        intent3.putExtra("ORIGIN_MUSIC_INFO", byteArray3);
                    }
                    java.io.Serializable parcelableArrayList = bundle.getParcelableArrayList("KEY_POST_HALF_RECT_LIST");
                    if (parcelableArrayList != null) {
                        intent3.putExtra("KEY_POST_HALF_RECT_LIST", parcelableArrayList);
                    }
                }
                java.util.ArrayList arrayList2 = (java.util.ArrayList) captureDataManager$CaptureVideoNormalModel.a().b("KEY_IMAGE_QUALITY_INT_ARRAY", new java.util.ArrayList());
                java.util.List list = captureDataManager$CaptureVideoNormalModel.f155666m;
                if (list != null && true == (list.isEmpty() ^ true)) {
                    intent3.putExtra("postType", 2);
                    kotlin.jvm.internal.o.f(list, "getMultiImagePath(...)");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add((java.lang.String) it9.next());
                    }
                    intent3.putExtra("postMediaList", arrayList3);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.util.Iterator it10 = list.iterator(); it10.hasNext(); it10 = it10) {
                        arrayList4.add(2);
                    }
                    intent3.putExtra("postTypeList", arrayList4);
                    intent3.putExtra("postThumbList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155662f));
                    if (arrayList2 != null && arrayList2.size() == list.size()) {
                        intent3.putExtra("key_post_media_quality_list", arrayList2);
                    }
                    pm0.v.j(intent3, bundle, "KEY_POST_HALF_IMAGE_LIST");
                    i19 = 0;
                } else {
                    intent3.putExtra("postType", 4);
                    intent3.putExtra("postMediaList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155661e));
                    i19 = 0;
                    intent3.putExtra("postTypeList", kz5.c0.d(4));
                    intent3.putExtra("postThumbList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155662f));
                    if (arrayList2 != null && arrayList2.size() == 1) {
                        intent3.putExtra("key_post_media_quality_list", arrayList2);
                    }
                    if (bundle != null && (byteArray = bundle.getByteArray("video_composition")) != null) {
                        intent3.putExtra("video_composition", byteArray);
                    }
                }
                intent3.putExtra("post_id", this.f170236r);
                intent3.putExtra("edit_id", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
                intent3.putExtra("key_finder_post_from", intent2.getIntExtra("key_finder_post_from", -1));
                intent3.addFlags(67108864);
                intent3.setClassName(this, "com.tencent.mm.plugin.finder.ui.FinderPostUI");
                fVar.a(107, 1, java.lang.System.currentTimeMillis() - this.f170238t, 1, this.f170237s);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(intent3);
                java.util.Collections.reverse(arrayList5);
                str = "onMediaGeneratedEnterFinderPostUI";
                yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI", "onMediaGeneratedEnterFinderPostUI", "(Landroid/content/Context;Lcom/tencent/mm/plugin/recordvideo/jumper/CaptureDataManager$CaptureVideoNormalModel;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList5.get(i19));
                yj0.a.f(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI", "onMediaGeneratedEnterFinderPostUI", "(Landroid/content/Context;Lcom/tencent/mm/plugin/recordvideo/jumper/CaptureDataManager$CaptureVideoNormalModel;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
            } else {
                str = "onMediaGeneratedEnterFinderPostUI";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.statistics.f.f164849a.a(107, 1, java.lang.System.currentTimeMillis() - this.f170238t, 0, this.f170237s);
        super.onBackPressed();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerUI", "onCreate");
        super.onCreate(bundle);
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setBgColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleIntent", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        java.lang.String stringExtra = getIntent().getStringExtra("key_finder_post_id");
        if (stringExtra == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(gm0.j1.b().j());
            sb6.append('_');
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.lang.System.currentTimeMillis());
            stringExtra = sb6.toString();
        }
        this.f170236r = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_finder_context_id");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f170237s = stringExtra2;
        this.f170239u = getIntent().getBooleanExtra("album_from_finder_add_media", false);
        java.lang.String stringExtra3 = getIntent().getStringExtra("sns_userName");
        if (stringExtra3 == null) {
            stringExtra3 = e7();
        }
        this.f170232n = stringExtra3;
        this.f170234p = getIntent().getIntExtra("album_show_source_type", 10);
        this.f170241w = getIntent().getBooleanExtra("album_select_only", false);
        this.f170227f = getIntent().getIntExtra("album_select_count_limit", 9);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleIntent", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean booleanExtra = getIntent().getBooleanExtra("album_show_actionbar", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("album_show_footerbar", true);
        if (booleanExtra) {
            setMMTitle(getContext().getResources().getString(com.tencent.mm.R.string.j9a));
            setBackBtn(new td4.g1(this), com.tencent.mm.R.drawable.f480726b6);
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        } else {
            hideActionbarLine();
            hideActionBarOperationArea();
            _hideActionBar();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFooterBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        android.view.View view = (android.view.View) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFooterBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        int i17 = !booleanExtra2 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsAlbumNavigationBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsAlbumNavigationBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsAlbumRecyclerView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.model.d6 d6Var = this.f170230i;
        if (d6Var == null) {
            d6Var = com.tencent.mm.plugin.sns.model.l4.Kj();
        }
        this.f170230i = d6Var;
        androidx.recyclerview.widget.RecyclerView c76 = c7();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(this, 4);
        gridLayoutManager.B = new td4.o1(this);
        c76.setLayoutManager(gridLayoutManager);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.res.Resources resources = context.getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHorizontalSpan", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        int dimensionPixelSize = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480606aa5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHorizontalSpan", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVerticalSpan", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480606aa5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVerticalSpan", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowLastLine", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowLastLine", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addIgnoreItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        linkedHashSet.add(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addIgnoreItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addIgnoreItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        linkedHashSet.add(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addIgnoreItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        td4.h hVar = new td4.h(dimensionPixelSize, dimensionPixelSize2, -16777216, false, linkedHashSet);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        c7().N(hVar);
        c7().i(new td4.q1(this));
        c7().postDelayed(new td4.r1(this), 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsAlbumRecyclerView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        f7().J(this.f170232n);
        td4.g0 f76 = f7();
        td4.h1 h1Var = new td4.h1(this);
        f76.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMOnPreload", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        f76.f417677s = h1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMOnPreload", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.g0 f77 = f7();
        td4.i1 i1Var = new td4.i1(this);
        f77.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        f77.f417674p = i1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.g0 f78 = f7();
        td4.j1 j1Var = new td4.j1(this);
        f78.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMOnSelectItemChangedCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        f78.f417675q = j1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMOnSelectItemChangedCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.g0 f79 = f7();
        td4.k1 k1Var = new td4.k1(this);
        f79.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMOnGridMediaClickListener", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        f79.f417676r = k1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMOnGridMediaClickListener", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.g0 f710 = f7();
        td4.l1 l1Var = new td4.l1(this);
        f710.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMOnShowLoadingFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        f710.f417678t = l1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMOnShowLoadingFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        td4.g0 f711 = f7();
        td4.m1 m1Var = new td4.m1(this);
        f711.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMOnSelectReachLimitCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        f711.f417679u = m1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMOnSelectReachLimitCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        c7().setAdapter(f7());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSnsAlbumNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        android.widget.Button d76 = d7();
        td4.g0 f712 = f7();
        f712.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        int size = f712.Q().size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNextButtonEnable", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z18 = 1 <= size && size <= this.f170227f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNextButtonEnable", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        d76.setEnabled(z18);
        d7().setOnClickListener(new td4.n1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSnsAlbumNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkNetworkState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(getContext())) {
            db5.t7.makeText(getContext(), com.tencent.mm.R.string.f490500wu, 0).show();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNetworkState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.statistics.f.b(com.tencent.mm.plugin.sns.statistics.f.f164849a, 107, 0, 0L, 0, this.f170237s, 12, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.model.d6 d6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerUI", "onDestroy");
        super.onDestroy();
        this.f170228g = true;
        com.tencent.mm.plugin.sns.model.l4.Kj().b(this.f170232n);
        com.tencent.mm.plugin.sns.model.l4.Tj().removeCallbacks(this.E);
        if (gm0.j1.b().m() && (d6Var = this.f170230i) != null) {
            d6Var.c(this.G, j7());
        }
        i7().f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerUI", "onPause");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumPickerUI", "onResume");
        super.onResume();
        this.f170238t = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }
}
