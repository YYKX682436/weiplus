package df2;

/* loaded from: classes.dex */
public final class da extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f229961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(df2.zb zbVar) {
        super(1);
        this.f229961d = zbVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.util.List results = (java.util.List) obj;
        kotlin.jvm.internal.o.g(results, "results");
        int i17 = 0;
        if (!results.isEmpty()) {
            java.util.Iterator it = results.iterator();
            while (it.hasNext()) {
                if (!((r45.mf1) it.next()).getBoolean(4)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            df2.zb zbVar = this.f229961d;
            java.lang.String str = zbVar.f231939m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[aiAssistant] some tool calls failed, count=");
            if (!results.isEmpty()) {
                java.util.Iterator it6 = results.iterator();
                while (it6.hasNext()) {
                    if ((!((r45.mf1) it6.next()).getBoolean(4)) && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            db5.t7.g(zbVar.O6(), "AI工具执行失败");
        }
        return jz5.f0.f302826a;
    }
}
