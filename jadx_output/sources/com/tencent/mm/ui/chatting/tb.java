package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class tb extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public em.i1 f202711d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f202712e;

    /* renamed from: f, reason: collision with root package name */
    public long f202713f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f202714g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f202715h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f202716i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f202715h = new com.tencent.mm.ui.chatting.rb(this);
        this.f202716i = new com.tencent.mm.ui.chatting.kb(this);
    }

    public final void T6() {
        boolean z17 = getActivity().getResources().getConfiguration().orientation == 2;
        int dimensionPixelSize = getActivity().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        int dimensionPixelSize2 = getActivity().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo);
        int dimensionPixelSize3 = getActivity().getResources().getDimensionPixelSize(z17 ? com.tencent.mm.R.dimen.f479731dn : com.tencent.mm.R.dimen.f479693cs);
        em.i1 i1Var = this.f202711d;
        if (i1Var != null) {
            i1Var.b().setPadding(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    public final void finish() {
        getActivity().finish();
        getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477848d6);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ej6;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        em.i1 i1Var = this.f202711d;
        if (i1Var != null) {
            i1Var.b().post(new com.tencent.mm.ui.chatting.qb(this));
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03d1 A[Catch: Exception -> 0x03ec, TRY_LEAVE, TryCatch #0 {Exception -> 0x03ec, blocks: (B:38:0x03a5, B:41:0x03b4, B:43:0x03bd, B:45:0x03c5, B:50:0x03d1), top: B:37:0x03a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x05b2  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r88) {
        /*
            Method dump skipped, instructions count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.tb.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        em.i1 i1Var = this.f202711d;
        if (i1Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        i1Var.a().removeCallbacks(this.f202716i);
        long j17 = this.f202713f;
        if (j17 != 0) {
            cf5.l lVar = cf5.l.f40987a;
            cf5.d dVar = (cf5.d) cf5.l.f40988b.remove(java.lang.Long.valueOf(j17));
            if (dVar != null) {
                jz5.l[] lVarArr = new jz5.l[6];
                lVarArr[0] = new jz5.l("msg_svr_id", java.lang.Long.valueOf(dVar.f40957a));
                lVarArr[1] = new jz5.l("enter_source", dVar.f40958b);
                lVarArr[2] = new jz5.l("stay_ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - dVar.f40959c));
                lVarArr[3] = new jz5.l("selection_triggered", java.lang.Long.valueOf(dVar.f40960d ? 1L : 0L));
                lVarArr[4] = new jz5.l("actions", kz5.n0.g0(dVar.f40961e, ",", null, null, 0, null, null, 62, null));
                lVarArr[5] = new jz5.l("inner_version", 1);
                java.util.LinkedHashMap j18 = kz5.c1.j(lVarArr);
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                if (lifecycleScope != null) {
                    v65.i.b(lifecycleScope, null, new cf5.j(j18, null), 1, null);
                }
            }
        }
        n3.h2.a(getActivity().getWindow(), true);
        new n3.m3(getActivity().getWindow(), getActivity().getWindow().getDecorView()).f334374a.g(1);
        getActivity().getWindow().getDecorView().setSystemUiVisibility(getActivity().getWindow().getDecorView().getSystemUiVisibility() & (-513));
    }
}
