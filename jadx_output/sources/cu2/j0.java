package cu2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cu2.j0 f222413d = new cu2.j0();

    public j0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            c61.l7 l7Var = (c61.l7) i95.n0.c(c61.l7.class);
            l7Var.getClass();
            gm0.j1.b().c();
            return (com.tencent.mm.plugin.finder.extension.reddot.k3) ((jz5.n) l7Var.C).getValue();
        } catch (com.tencent.wcdb.database.SQLiteException e17) {
            com.tencent.mars.xlog.Log.e("FinderRedDotCtrInfoNativeStorage", "init storage fail," + e17.getMessage() + '!');
            return null;
        }
    }
}
