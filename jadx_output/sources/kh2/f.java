package kh2;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh2.l f307998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kh2.l lVar) {
        super(1);
        this.f307998d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map reportMap = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(reportMap, "reportMap");
        com.tencent.mars.xlog.Log.i(this.f307998d.f308004a, "reportScore: " + reportMap);
        com.tencent.mm.plugin.finder.live.util.s1.f115677a.a(com.tencent.mm.plugin.finder.live.util.r1.f115663e, reportMap);
        return jz5.f0.f302826a;
    }
}
