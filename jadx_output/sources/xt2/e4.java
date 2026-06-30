package xt2;

/* loaded from: classes3.dex */
public final class e4 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f456724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.j31 f456725b;

    public e4(xt2.b5 b5Var, r45.j31 j31Var) {
        this.f456724a = b5Var;
        this.f456725b = j31Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.ui.MMActivity mMActivity;
        int i17;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FLASH_SALE_ENABLED_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        xt2.b5 b5Var = this.f456724a;
        if (z17) {
            mMActivity = b5Var.f456636h;
            i17 = com.tencent.mm.R.string.lqv;
        } else {
            mMActivity = b5Var.f456636h;
            i17 = com.tencent.mm.R.string.lqu;
        }
        java.lang.String string = mMActivity.getString(i17);
        kotlin.jvm.internal.o.d(string);
        db5.t7.i(b5Var.f456636h, string, com.tencent.mm.R.raw.icons_filled_done);
        b5Var.C(z17, this.f456725b);
    }
}
