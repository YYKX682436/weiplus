package df2;

/* loaded from: classes3.dex */
public final class vz extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f231645b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz(df2.a00 a00Var, java.lang.Class cls) {
        super(cls);
        this.f231645b = a00Var;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f231645b.f229648m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.xb2 result = (r45.xb2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.a00 a00Var = this.f231645b;
        com.tencent.mars.xlog.Log.i(a00Var.f229648m, "onPollingSuccess info: " + pm0.b0.g(result));
        a00Var.f229650o.postValue(result);
    }
}
