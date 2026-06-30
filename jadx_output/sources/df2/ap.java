package df2;

/* loaded from: classes3.dex */
public final class ap extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.bp f229733b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(df2.bp bpVar, java.lang.Class cls) {
        super(cls);
        this.f229733b = bpVar;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f229733b.f229820m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.tp1 result = (r45.tp1) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.bp bpVar = this.f229733b;
        com.tencent.mars.xlog.Log.i(bpVar.f229820m, "info: " + pm0.b0.g(result));
        ((je2.t) bpVar.business(je2.t.class)).f299268n.postValue(result);
    }
}
