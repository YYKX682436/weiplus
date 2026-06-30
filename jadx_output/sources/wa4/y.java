package wa4;

/* loaded from: classes4.dex */
public class y extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f444305d;

    /* renamed from: e, reason: collision with root package name */
    public int f444306e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
        if (fVar == null || !(fVar instanceof wa4.y)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return false;
        }
        wa4.y yVar = (wa4.y) fVar;
        if (!n51.f.a(this.f444305d, yVar.f444305d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return false;
        }
        if (n51.f.a(java.lang.Integer.valueOf(this.f444306e), java.lang.Integer.valueOf(yVar.f444306e))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
        return false;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f444305d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f444306e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f444305d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f444306e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return j17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return 0;
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.y yVar = (wa4.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yVar.f444305d = aVar2.k(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return 0;
        }
        if (intValue != 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return -1;
        }
        yVar.f444306e = aVar2.g(intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
        return 0;
    }
}
