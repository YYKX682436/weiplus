package t00;

/* loaded from: classes9.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z20.b f414351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z20.b bVar) {
        super(1);
        this.f414351d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bw5.q9 q9Var = this.f414351d.f469538b;
        q9Var.f32008p = new org.json.JSONObject(it).toString();
        q9Var.f32013u[11] = true;
        return jz5.f0.f302826a;
    }
}
