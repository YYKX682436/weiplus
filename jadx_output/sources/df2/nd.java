package df2;

/* loaded from: classes3.dex */
public final class nd extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.od f230850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(df2.od odVar, java.lang.Class cls) {
        super(cls);
        this.f230850b = odVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        java.lang.Object obj;
        r45.pb2 result = (r45.pb2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.od odVar = this.f230850b;
        java.lang.String str = odVar.f230953m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recevie  result = ");
        sb6.append(pm0.b0.g(result));
        sb6.append(", lastResult = ");
        r45.ug1 ug1Var = odVar.f230956p;
        if (ug1Var == null || (obj = pm0.b0.g(ug1Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        df2.od odVar2 = this.f230850b;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        com.tencent.mm.plugin.finder.live.util.y.o(odVar2, kotlinx.coroutines.internal.b0.f310484a, null, new df2.md(odVar2, result, null), 2, null);
    }
}
