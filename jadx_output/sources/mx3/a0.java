package mx3;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332526d;

    public a0(java.lang.String str) {
        this.f332526d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        ot0.q qVar = new ot0.q();
        ux3.a aVar = new ux3.a();
        mx3.i0 i0Var = mx3.i0.f332577a;
        java.lang.String toUser = this.f332526d;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        java.lang.String string = mx3.i0.f332582f.getString(toUser, null);
        vx3.k kVar = vx3.l.E;
        vx3.i b17 = string == null ? kVar.b() : kVar.f(string);
        aVar.f431874b = b17;
        qVar.f348666i = 1077936177;
        qVar.f(aVar);
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        f9Var.d1(ot0.q.u(qVar, null, null));
        f9Var.setType(1077936177);
        f9Var.j1(0);
        f9Var.u1(toUser);
        f9Var.e1(c01.w9.o(toUser));
        long x17 = c01.w9.x(f9Var);
        wx3.a.f(3, 1, "", toUser, b17.d());
        com.tencent.mars.xlog.Log.i("MicroMsg.QuickRingtoneHelper", "insert ringtone msg %d", java.lang.Long.valueOf(x17));
    }
}
