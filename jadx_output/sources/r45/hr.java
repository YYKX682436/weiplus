package r45;

/* loaded from: classes8.dex */
public class hr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376394d;

    /* renamed from: e, reason: collision with root package name */
    public int f376395e;

    /* renamed from: f, reason: collision with root package name */
    public r45.sr f376396f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hr)) {
            return false;
        }
        r45.hr hrVar = (r45.hr) fVar;
        return n51.f.a(this.f376394d, hrVar.f376394d) && n51.f.a(java.lang.Integer.valueOf(this.f376395e), java.lang.Integer.valueOf(hrVar.f376395e)) && n51.f.a(this.f376396f, hrVar.f376396f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376394d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f376395e);
            r45.sr srVar = this.f376396f;
            if (srVar != null) {
                fVar.i(3, srVar.computeSize());
                this.f376396f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f376394d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f376395e);
            r45.sr srVar2 = this.f376396f;
            return srVar2 != null ? j17 + b36.f.i(3, srVar2.computeSize()) : j17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.hr hrVar = (r45.hr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hrVar.f376394d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hrVar.f376395e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.sr srVar3 = new r45.sr();
            if (bArr != null && bArr.length > 0) {
                srVar3.parseFrom(bArr);
            }
            hrVar.f376396f = srVar3;
        }
        return 0;
    }
}
