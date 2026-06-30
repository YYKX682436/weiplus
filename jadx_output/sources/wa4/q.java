package wa4;

/* loaded from: classes4.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f444275d;

    /* renamed from: e, reason: collision with root package name */
    public int f444276e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f444277f;

    /* renamed from: g, reason: collision with root package name */
    public long f444278g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        if (fVar == null || !(fVar instanceof wa4.q)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        }
        wa4.q qVar = (wa4.q) fVar;
        if (!n51.f.a(this.f444275d, qVar.f444275d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444276e), java.lang.Integer.valueOf(qVar.f444276e))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        }
        if (!n51.f.a(this.f444277f, qVar.f444277f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        }
        if (n51.f.a(java.lang.Long.valueOf(this.f444278g), java.lang.Long.valueOf(qVar.f444278g))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        return false;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f444275d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f444276e);
            java.lang.String str2 = this.f444277f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f444278g);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f444275d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f444276e);
            java.lang.String str4 = this.f444277f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            int h17 = j17 + b36.f.h(4, this.f444278g);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return h17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.q qVar = (wa4.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qVar.f444275d = aVar2.k(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (intValue == 2) {
            qVar.f444276e = aVar2.g(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (intValue == 3) {
            qVar.f444277f = aVar2.k(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        }
        if (intValue != 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return -1;
        }
        qVar.f444278g = aVar2.i(intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        return 0;
    }
}
