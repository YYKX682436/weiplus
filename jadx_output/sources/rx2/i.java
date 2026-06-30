package rx2;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.p f400975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rx2.p pVar) {
        super(0);
        this.f400975d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rx2.p pVar = this.f400975d;
        com.tencent.mm.ui.MMActivity mMActivity = pVar.f400983d;
        java.lang.String string = mMActivity.getResources().getString(com.tencent.mm.R.string.cmc);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(mMActivity), false, 2, null);
        java.lang.String string2 = j37 != null ? j37.u0().getString(36) : null;
        if (string2 == null || string2.length() == 0) {
            string2 = mMActivity.getResources().getString(com.tencent.mm.R.string.cme);
        }
        kotlin.jvm.internal.o.d(string2);
        java.lang.String string3 = mMActivity.getResources().getString(com.tencent.mm.R.string.cmd);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        pVar.c(string, string2, string3);
        return jz5.f0.f302826a;
    }
}
