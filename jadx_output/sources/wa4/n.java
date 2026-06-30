package wa4;

/* loaded from: classes4.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f444265d;

    /* renamed from: e, reason: collision with root package name */
    public int f444266e;

    /* renamed from: f, reason: collision with root package name */
    public int f444267f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f444268g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f444269h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        if (fVar == null || !(fVar instanceof wa4.n)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        wa4.n nVar = (wa4.n) fVar;
        if (!n51.f.a(java.lang.Long.valueOf(this.f444265d), java.lang.Long.valueOf(nVar.f444265d))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444266e), java.lang.Integer.valueOf(nVar.f444266e))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444267f), java.lang.Integer.valueOf(nVar.f444267f))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        if (!n51.f.a(this.f444268g, nVar.f444268g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        if (n51.f.a(this.f444269h, nVar.f444269h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        return false;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f444265d);
            fVar.e(2, this.f444266e);
            fVar.e(3, this.f444267f);
            java.lang.String str = this.f444268g;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f444269h;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f444265d) + 0 + b36.f.e(2, this.f444266e) + b36.f.e(3, this.f444267f);
            java.lang.String str3 = this.f444268g;
            if (str3 != null) {
                h17 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f444269h;
            if (str4 != null) {
                h17 += b36.f.j(7, str4);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return h17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.n nVar = (wa4.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nVar.f444265d = aVar2.i(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (intValue == 2) {
            nVar.f444266e = aVar2.g(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (intValue == 3) {
            nVar.f444267f = aVar2.g(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (intValue == 6) {
            nVar.f444268g = aVar2.k(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        }
        if (intValue != 7) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return -1;
        }
        nVar.f444269h = aVar2.k(intValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        return 0;
    }
}
