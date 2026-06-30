package go0;

/* loaded from: classes14.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f273809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f273811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(go0.q1 q1Var, int i17, int i18) {
        super(0);
        this.f273809d = q1Var;
        this.f273810e = i17;
        this.f273811f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.s1 s1Var = this.f273809d.f273828o;
        if (s1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDrawSize: [");
            int i17 = this.f273810e;
            sb6.append(i17);
            sb6.append(',');
            int i18 = this.f273811f;
            sb6.append(i18);
            sb6.append(']');
            com.tencent.mars.xlog.Log.i("LiveVisitorRenderer", sb6.toString());
            s1Var.f273845e = i17;
            s1Var.f273846f = i18;
        }
        return jz5.f0.f302826a;
    }
}
