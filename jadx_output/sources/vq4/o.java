package vq4;

/* loaded from: classes12.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f439367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f439368e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rh.c1 c1Var, int i17) {
        super(1);
        this.f439367d = c1Var;
        this.f439368e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(subJson, "$this$subJson");
        int i17 = this.f439368e;
        rh.c1 c1Var = this.f439367d;
        c1Var.r(new vq4.n(i17, subJson, c1Var));
        return jz5.f0.f302826a;
    }
}
