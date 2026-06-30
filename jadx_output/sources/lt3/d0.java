package lt3;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f321208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(lt3.f0 f0Var) {
        super(0);
        this.f321208d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[start] mixThread=");
        lt3.f0 f0Var2 = this.f321208d;
        sb6.append(f0Var2.f321237z);
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", sb6.toString());
        try {
            f0Var2.g();
            lt3.f0.c(f0Var2);
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Media.VideoMixer", e17, "error on startVideoMixer", new java.lang.Object[0]);
            yz5.r rVar = f0Var2.f321213b;
            if (rVar == null) {
                return null;
            }
            mt3.a aVar = f0Var2.f321212a;
            rVar.C(aVar.f331293e, aVar.f331294f, java.lang.Boolean.FALSE, -1);
            return f0Var;
        }
    }
}
