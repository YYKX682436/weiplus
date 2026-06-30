package r45;

/* loaded from: classes2.dex */
public class cw extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f371857d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371858e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371859f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cw)) {
            return false;
        }
        r45.cw cwVar = (r45.cw) fVar;
        return n51.f.a(this.BaseRequest, cwVar.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f371857d), java.lang.Long.valueOf(cwVar.f371857d)) && n51.f.a(this.f371858e, cwVar.f371858e) && n51.f.a(this.f371859f, cwVar.f371859f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.h(2, this.f371857d);
            java.lang.String str = this.f371858e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f371859f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f371857d);
            java.lang.String str3 = this.f371858e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f371859f;
            return str4 != null ? i18 + b36.f.j(4, str4) : i18;
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
        r45.cw cwVar = (r45.cw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                cwVar.f371857d = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 3) {
                cwVar.f371858e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            cwVar.f371859f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            cwVar.BaseRequest = heVar3;
        }
        return 0;
    }
}
