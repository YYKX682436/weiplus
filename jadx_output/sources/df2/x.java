package df2;

/* loaded from: classes3.dex */
public final class x extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.y f231750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(df2.y yVar, java.lang.Class cls) {
        super(cls);
        this.f231750b = yVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.nb2 result = (r45.nb2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.y yVar = this.f231750b;
        com.tencent.mars.xlog.Log.i(yVar.f231832m, "polling success, enable_show_guide_info:" + result.getBoolean(0) + ", guide_wording:" + result.getString(1));
        yVar.f231833n = result;
    }
}
