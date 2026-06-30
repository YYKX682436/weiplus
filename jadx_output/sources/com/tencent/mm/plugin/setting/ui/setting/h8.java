package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class h8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.k8 f161099d;

    public h8(com.tencent.mm.plugin.setting.ui.setting.k8 k8Var) {
        this.f161099d = k8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.setting.ui.setting.k8 k8Var = this.f161099d;
        android.app.Activity context = k8Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.setting.ui.setting.hb hbVar = (com.tencent.mm.plugin.setting.ui.setting.hb) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.setting.ui.setting.hb.class);
        java.lang.String str = k8Var.f161229d;
        hbVar.getClass();
        gm0.j1.d().g(new r61.f1(4));
        hbVar.f161102d = db5.e1.Q(hbVar.getContext(), hbVar.getString(com.tencent.mm.R.string.f490573yv), hbVar.getString(com.tencent.mm.R.string.j0h), true, true, com.tencent.mm.plugin.setting.ui.setting.fb.f161031d);
    }
}
