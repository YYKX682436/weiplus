package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class r6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.u6 f135770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f135771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.tencent.mm.plugin.finder.viewmodel.component.u6 u6Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f135770d = u6Var;
        this.f135771e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.u6 u6Var = this.f135770d;
        u6Var.f136096d = true;
        java.lang.String stringExtra = u6Var.getIntent().getStringExtra("finder_username");
        boolean z17 = false;
        boolean booleanExtra = u6Var.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        if ((stringExtra != null ? stringExtra.equals(xy2.c.e(u6Var.getContext())) : false) && booleanExtra) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.view.d5 d5Var = com.tencent.mm.plugin.finder.view.f5.f132064i;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f135771e;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) appCompatActivity;
        android.view.View decorView = mMFragmentActivity.getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        com.tencent.mm.plugin.finder.view.f5 b17 = d5Var.b(mMFragmentActivity, decorView, z17 ? 1 : 2, false, 58);
        android.app.Activity context = u6Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.v6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.v6.class)).P6();
        java.util.ArrayList arrayList = ((com.tencent.mm.plugin.finder.feed.h7) ((jz5.n) u6Var.f136101i).getValue()).f106905b;
        if (!arrayList.contains(u6Var)) {
            arrayList.add(u6Var);
        }
        return b17;
    }
}
