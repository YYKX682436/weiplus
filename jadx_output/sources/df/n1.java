package df;

/* loaded from: classes7.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f229525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(df.w1 w1Var) {
        super(1);
        this.f229525d = w1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z17 = this.f229525d.f229590q.get();
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "waitFlutterReady isSuccess:" + booleanValue + ", isDestroyed:" + z17, new java.lang.Object[0]);
        if (!z17) {
            df.w1 w1Var = this.f229525d;
            synchronized (w1Var) {
                w1Var.f229586m = true;
                arrayList = new java.util.ArrayList(w1Var.f229587n);
                w1Var.f229587n.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((yz5.a) it.next()).invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
