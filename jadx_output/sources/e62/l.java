package e62;

/* loaded from: classes4.dex */
public class l implements yj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e62.m f249773a;

    public l(e62.m mVar) {
        this.f249773a = mVar;
    }

    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        l52.f fVar;
        l52.f fVar2;
        l52.f fVar3;
        l52.f fVar4;
        l52.f fVar5;
        if (str.startsWith("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI") || str.startsWith("com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC")) {
            e62.m mVar = this.f249773a;
            if (mVar.f249776c == null) {
                return;
            }
            if (str4.equals("smoothScrollToPosition")) {
                if (objArr == null || objArr.length < 1) {
                    return;
                }
                e62.f fVar6 = mVar.f249776c;
                int intValue = ((java.lang.Integer) objArr[0]).intValue();
                e62.p pVar = (e62.p) fVar6;
                pVar.getClass();
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, smoothScrollToPosition: %d", java.lang.Integer.valueOf(intValue));
                e62.q qVar = pVar.f249804a;
                e62.j b17 = qVar.b(qVar.f249806d);
                if (b17 == null || (fVar5 = b17.f249768d) == null) {
                    return;
                }
                fVar5.f316596p = intValue;
                return;
            }
            if (str4.equals("smoothScrollToPositionFromTop")) {
                if (objArr == null || objArr.length < 2) {
                    return;
                }
                e62.f fVar7 = mVar.f249776c;
                int intValue2 = ((java.lang.Integer) objArr[0]).intValue();
                ((java.lang.Integer) objArr[1]).intValue();
                e62.p pVar2 = (e62.p) fVar7;
                pVar2.getClass();
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, smoothScrollToPositionFromTop: %d", java.lang.Integer.valueOf(intValue2));
                e62.q qVar2 = pVar2.f249804a;
                e62.j b18 = qVar2.b(qVar2.f249806d);
                if (b18 == null || (fVar4 = b18.f249768d) == null) {
                    return;
                }
                fVar4.f316596p = intValue2;
                return;
            }
            if (str4.equals("scrollToTop")) {
                if (objArr == null || objArr.length < 1) {
                    return;
                }
                e62.f fVar8 = mVar.f249776c;
                e62.p pVar3 = (e62.p) fVar8;
                pVar3.getClass();
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, scrollToTop...");
                e62.q qVar3 = pVar3.f249804a;
                e62.j b19 = qVar3.b(qVar3.f249806d);
                if (b19 == null || (fVar3 = b19.f249768d) == null) {
                    return;
                }
                fVar3.f316596p = 0;
                return;
            }
            if (str4.equals("scrollToPositionWithOffset")) {
                if (objArr == null || objArr.length < 1) {
                    return;
                }
                e62.f fVar9 = mVar.f249776c;
                int intValue3 = ((java.lang.Integer) objArr[0]).intValue();
                ((java.lang.Integer) objArr[1]).intValue();
                e62.p pVar4 = (e62.p) fVar9;
                pVar4.getClass();
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, scrollToPositionWithOffset: %d", java.lang.Integer.valueOf(intValue3));
                e62.q qVar4 = pVar4.f249804a;
                e62.j b27 = qVar4.b(qVar4.f249806d);
                if (b27 == null || (fVar2 = b27.f249768d) == null) {
                    return;
                }
                fVar2.f316596p = intValue3;
                return;
            }
            if (!str4.equals("scrollToPosition") || objArr == null || objArr.length < 1) {
                return;
            }
            e62.f fVar10 = mVar.f249776c;
            int intValue4 = ((java.lang.Integer) objArr[0]).intValue();
            e62.p pVar5 = (e62.p) fVar10;
            pVar5.getClass();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, scrollToPosition: %d", java.lang.Integer.valueOf(intValue4));
            e62.q qVar5 = pVar5.f249804a;
            e62.j b28 = qVar5.b(qVar5.f249806d);
            if (b28 == null || (fVar = b28.f249768d) == null) {
                return;
            }
            fVar.f316596p = intValue4;
        }
    }
}
