package wj2;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.py1 f446709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r45.py1 py1Var, wj2.w wVar) {
        super(0);
        this.f446709d = py1Var;
        this.f446710e = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.py1 py1Var = this.f446709d;
        if (py1Var.getInteger(1) > 0) {
            int integer = py1Var.getInteger(1);
            wj2.w wVar = this.f446710e;
            if (integer != wVar.C) {
                wVar.C = py1Var.getInteger(1);
                com.tencent.mars.xlog.Log.i(wVar.getTAG(), "doHighLightLikeLive interval:" + wVar.C);
            }
        }
        return jz5.f0.f302826a;
    }
}
