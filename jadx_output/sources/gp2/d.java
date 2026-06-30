package gp2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final gp2.d f274210d = new gp2.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        so2.h3 h3Var = so2.h3.f410392d;
        com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "quickSend size: " + so2.h3.f410395g.size());
        if (so2.h3.f410395g.size() > 0) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = so2.h3.f410397i;
            n3Var.removeMessages(1);
            n3Var.sendEmptyMessage(1);
        }
        return jz5.f0.f302826a;
    }
}
