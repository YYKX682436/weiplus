package wa4;

/* loaded from: classes4.dex */
public class w extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public long f444291e;

    /* renamed from: f, reason: collision with root package name */
    public int f444292f;

    /* renamed from: h, reason: collision with root package name */
    public int f444294h;

    /* renamed from: i, reason: collision with root package name */
    public int f444295i;

    /* renamed from: m, reason: collision with root package name */
    public int f444296m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f444290d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f444293g = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f444297n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f444298o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
        if (fVar == null || !(fVar instanceof wa4.w)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        wa4.w wVar = (wa4.w) fVar;
        if (!n51.f.a(this.f444290d, wVar.f444290d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Long.valueOf(this.f444291e), java.lang.Long.valueOf(wVar.f444291e))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444292f), java.lang.Integer.valueOf(wVar.f444292f))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(this.f444293g, wVar.f444293g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444294h), java.lang.Integer.valueOf(wVar.f444294h))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444295i), java.lang.Integer.valueOf(wVar.f444295i))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444296m), java.lang.Integer.valueOf(wVar.f444296m))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (!n51.f.a(this.f444297n, wVar.f444297n)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        if (n51.f.a(this.f444298o, wVar.f444298o)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
        return false;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
        java.util.LinkedList linkedList = this.f444293g;
        java.util.LinkedList linkedList2 = this.f444290d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 3, linkedList2);
            fVar.h(2, this.f444291e);
            fVar.e(3, this.f444292f);
            fVar.g(4, 3, linkedList);
            fVar.e(5, this.f444294h);
            fVar.e(6, this.f444295i);
            fVar.e(7, this.f444296m);
            fVar.g(8, 1, this.f444297n);
            fVar.g(9, 3, this.f444298o);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 3, linkedList2) + 0 + b36.f.h(2, this.f444291e) + b36.f.e(3, this.f444292f) + b36.f.g(4, 3, linkedList) + b36.f.e(5, this.f444294h) + b36.f.e(6, this.f444295i) + b36.f.e(7, this.f444296m) + b36.f.g(8, 1, this.f444297n) + b36.f.g(9, 3, this.f444298o);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            this.f444297n.clear();
            this.f444298o.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return 0;
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.w wVar = (wa4.w) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wVar.f444290d.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 2:
                wVar.f444291e = aVar2.i(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 3:
                wVar.f444292f = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 4:
                wVar.f444293g.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 5:
                wVar.f444294h = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 6:
                wVar.f444295i = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 7:
                wVar.f444296m = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 8:
                wVar.f444297n.add(aVar2.k(intValue));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            case 9:
                wVar.f444298o.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return 0;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                return -1;
        }
    }
}
