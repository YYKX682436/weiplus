package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.s2 f132690d;

    public n2(com.tencent.mm.plugin.finder.view.s2 s2Var) {
        this.f132690d = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.s2 s2Var = this.f132690d;
        android.content.Context context = s2Var.f132994b;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        kz5.p0 p0Var = kz5.p0.f313996d;
        long j17 = s2Var.f132995c;
        java.lang.String str = s2Var.f132996d;
        int i17 = s2Var.f132998f;
        java.lang.String str2 = s2Var.f132999g;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = s2Var.f133000h;
        gm0.j1.d().g(new db2.j5(1, p0Var, j17, str, i17, str3, str4 == null ? "" : str4, s2Var.f133001i, V6));
        android.content.Context context2 = s2Var.f132994b;
        db5.t7.h(context2, context2.getResources().getString(com.tencent.mm.R.string.f491301cp3));
        s2Var.f133002j = 1;
        s2Var.dismiss();
    }
}
