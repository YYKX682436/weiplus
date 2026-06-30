package wa4;

/* loaded from: classes4.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f444259d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l76 f444260e;

    /* renamed from: f, reason: collision with root package name */
    public int f444261f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f444262g;

    /* renamed from: h, reason: collision with root package name */
    public int f444263h;

    /* renamed from: i, reason: collision with root package name */
    public int f444264i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
        if (fVar == null || !(fVar instanceof wa4.m)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        wa4.m mVar = (wa4.m) fVar;
        if (!n51.f.a(this.f444259d, mVar.f444259d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (!n51.f.a(this.f444260e, mVar.f444260e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444261f), java.lang.Integer.valueOf(mVar.f444261f))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (!n51.f.a(this.f444262g, mVar.f444262g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (!n51.f.a(java.lang.Integer.valueOf(this.f444263h), java.lang.Integer.valueOf(mVar.f444263h))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        if (n51.f.a(java.lang.Integer.valueOf(this.f444264i), java.lang.Integer.valueOf(mVar.f444264i))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
        return false;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f444259d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.l76 l76Var = this.f444260e;
            if (l76Var != null) {
                fVar.i(2, l76Var.computeSize());
                this.f444260e.writeFields(fVar);
            }
            fVar.e(3, this.f444261f);
            java.lang.String str2 = this.f444262g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f444263h);
            fVar.e(6, this.f444264i);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f444259d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.l76 l76Var2 = this.f444260e;
            if (l76Var2 != null) {
                j17 += b36.f.i(2, l76Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(3, this.f444261f);
            java.lang.String str4 = this.f444262g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            int e18 = e17 + b36.f.e(5, this.f444263h) + b36.f.e(6, this.f444264i);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return 0;
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.m mVar = (wa4.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mVar.f444259d = aVar2.k(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.l76 l76Var3 = new r45.l76();
                    if (bArr != null && bArr.length > 0) {
                        l76Var3.parseFrom(bArr);
                    }
                    mVar.f444260e = l76Var3;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 3:
                mVar.f444261f = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 4:
                mVar.f444262g = aVar2.k(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 5:
                mVar.f444263h = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            case 6:
                mVar.f444264i = aVar2.g(intValue);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return -1;
        }
    }
}
