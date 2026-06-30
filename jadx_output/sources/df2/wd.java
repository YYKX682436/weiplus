package df2;

/* loaded from: classes3.dex */
public final class wd extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.yd f231680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f231681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(df2.yd ydVar, r45.y23 y23Var) {
        super(2);
        this.f231680d = ydVar;
        this.f231681e = y23Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f231680d.f231857m, "auto receive coupon for product " + this.f231681e.getLong(0) + ", success: " + booleanValue);
        return jz5.f0.f302826a;
    }
}
