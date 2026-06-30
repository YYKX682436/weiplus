package wa4;

/* loaded from: classes4.dex */
public class x extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public boolean f444301f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f444299d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f444300e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f444302g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f444303h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f444304i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
        if (fVar == null || !(fVar instanceof wa4.x)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        }
        wa4.x xVar = (wa4.x) fVar;
        if (!n51.f.a(this.f444299d, xVar.f444299d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        }
        if (!n51.f.a(this.f444300e, xVar.f444300e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        }
        if (!n51.f.a(java.lang.Boolean.valueOf(this.f444301f), java.lang.Boolean.valueOf(xVar.f444301f))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        }
        if (!n51.f.a(this.f444302g, xVar.f444302g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        }
        if (!n51.f.a(this.f444303h, xVar.f444303h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        }
        if (n51.f.a(this.f444304i, xVar.f444304i)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
        return false;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
        java.util.LinkedList linkedList = this.f444300e;
        java.util.LinkedList linkedList2 = this.f444299d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f444301f);
            fVar.g(4, 1, this.f444302g);
            fVar.g(5, 1, this.f444303h);
            fVar.g(6, 1, this.f444304i);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f444301f) + b36.f.g(4, 1, this.f444302g) + b36.f.g(5, 1, this.f444303h) + b36.f.g(6, 1, this.f444304i);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            this.f444302g.clear();
            this.f444303h.clear();
            this.f444304i.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return 0;
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.x xVar = (wa4.x) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    wa4.y yVar = new wa4.y();
                    if (bArr2 != null && bArr2.length > 0) {
                        yVar.parseFrom(bArr2);
                    }
                    xVar.f444299d.add(yVar);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    wa4.y yVar2 = new wa4.y();
                    if (bArr3 != null && bArr3.length > 0) {
                        yVar2.parseFrom(bArr3);
                    }
                    xVar.f444300e.add(yVar2);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return 0;
            case 3:
                xVar.f444301f = aVar2.c(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return 0;
            case 4:
                xVar.f444302g.add(aVar2.k(intValue));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return 0;
            case 5:
                xVar.f444303h.add(aVar2.k(intValue));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return 0;
            case 6:
                xVar.f444304i.add(aVar2.k(intValue));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return 0;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return -1;
        }
    }
}
