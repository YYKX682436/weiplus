package ot0;

/* loaded from: classes4.dex */
public final class d0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ot0.d0 f348440a = new ot0.d0();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = ot0.f0.f348472a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        ot0.f0.f348472a = null;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bool.booleanValue() & ot0.f0.f348473b);
        ot0.f0.f348473b = false;
        return valueOf;
    }
}
