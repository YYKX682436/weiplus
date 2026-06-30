package ot0;

/* loaded from: classes4.dex */
public final class y implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f348814a;

    public y(android.content.Context context) {
        this.f348814a = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        km5.b b17 = km5.u.b();
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = ot0.f0.f348472a;
        if ((u3Var2 != null && u3Var2.isShowing()) && (u3Var = ot0.f0.f348472a) != null) {
            u3Var.dismiss();
        }
        android.content.Context context = this.f348814a;
        ot0.f0.f348472a = db5.e1.Q(context, context.getResources().getString(com.tencent.mm.R.string.f490573yv), context.getResources().getString(com.tencent.mm.R.string.f490604zq), true, true, new ot0.x(b17));
        ot0.f0.f348473b = true;
        return null;
    }
}
