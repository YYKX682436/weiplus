package t00;

/* loaded from: classes9.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(c00.n3 n3Var) {
        super(1);
        this.f414366d = n3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.n8 n8Var = (bw5.n8) obj;
        boolean z17 = n8Var != null && n8Var.f30539f == 0;
        c00.n3 n3Var = this.f414366d;
        if (z17) {
            n3Var.b(null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("result", n8Var != null ? n8Var.getErrMsg() : null);
            n3Var.d(jSONObject);
        }
        return jz5.f0.f302826a;
    }
}
