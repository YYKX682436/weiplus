package df2;

/* loaded from: classes10.dex */
public final class yb extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231854b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(df2.zb zbVar, java.lang.Class cls) {
        super(cls);
        this.f231854b = zbVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.lb2 result = (r45.lb2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.zb zbVar = this.f231854b;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        com.tencent.mm.plugin.finder.live.util.y.o(zbVar, kotlinx.coroutines.internal.b0.f310484a, null, new df2.xb(zbVar, result, null), 2, null);
    }
}
