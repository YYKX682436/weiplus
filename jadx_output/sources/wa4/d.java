package wa4;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f444210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f444211e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f444212f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f444213g;

    /* renamed from: h, reason: collision with root package name */
    public wa4.g f444214h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Author");
        if (fVar == null || !(fVar instanceof wa4.d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return false;
        }
        wa4.d dVar = (wa4.d) fVar;
        if (!n51.f.a(this.f444210d, dVar.f444210d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return false;
        }
        if (!n51.f.a(this.f444211e, dVar.f444211e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return false;
        }
        if (!n51.f.a(this.f444212f, dVar.f444212f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return false;
        }
        if (!n51.f.a(this.f444213g, dVar.f444213g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return false;
        }
        if (n51.f.a(this.f444214h, dVar.f444214h)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.Author");
        return false;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f444210d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f444211e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f444212f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f444213g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            wa4.g gVar = this.f444214h;
            if (gVar != null) {
                fVar.i(5, gVar.computeSize());
                this.f444214h.writeFields(fVar);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f444210d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f444211e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f444212f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f444213g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            wa4.g gVar2 = this.f444214h;
            if (gVar2 != null) {
                j17 += b36.f.i(5, gVar2.computeSize());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return j17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return 0;
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.d dVar = (wa4.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dVar.f444210d = aVar2.k(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return 0;
        }
        if (intValue == 2) {
            dVar.f444211e = aVar2.k(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return 0;
        }
        if (intValue == 3) {
            dVar.f444212f = aVar2.k(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return 0;
        }
        if (intValue == 4) {
            dVar.f444213g = aVar2.k(intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return 0;
        }
        if (intValue != 5) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            wa4.g gVar3 = new wa4.g();
            if (bArr != null && bArr.length > 0) {
                gVar3.parseFrom(bArr);
            }
            dVar.f444214h = gVar3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.Author");
        return 0;
    }
}
