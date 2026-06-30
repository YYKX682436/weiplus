package lm2;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qn f319389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r45.qn qnVar) {
        super(1);
        this.f319389d = qnVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.util.concurrent.ConcurrentHashMap safeSetValue = (java.util.concurrent.ConcurrentHashMap) obj;
        kotlin.jvm.internal.o.g(safeSetValue, "$this$safeSetValue");
        r45.qn qnVar = this.f319389d;
        r45.qm1 qm1Var = qnVar.f384101d;
        if (qm1Var == null || (str = qm1Var.getString(1)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            com.tencent.mm.plugin.finder.live.util.x xVar = com.tencent.mm.plugin.finder.live.util.x.f115742a;
            if (!(xVar.g(str) || xVar.h(str))) {
                safeSetValue.put(str, lm2.p.a(lm2.h0.f319392i, qnVar, null, 1, null));
            }
        }
        return jz5.f0.f302826a;
    }
}
