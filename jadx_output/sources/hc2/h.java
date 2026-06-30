package hc2;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f280327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k41 f280328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.app.Activity activity, r45.k41 k41Var) {
        super(1);
        this.f280327d = activity;
        this.f280328e = k41Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("FinderExt", "jumpLiteApp result:" + booleanValue);
        android.app.Activity activity = this.f280327d;
        if (booleanValue) {
            com.tencent.mm.sdk.platformtools.u3.i(new nf.d(new hc2.f(activity)), 800L);
        } else {
            hc2.i.f(activity, this.f280328e.getString(3));
        }
        return jz5.f0.f302826a;
    }
}
