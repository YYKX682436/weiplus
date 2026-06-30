package r45;

/* loaded from: classes4.dex */
public class ou extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382515d;

    /* renamed from: e, reason: collision with root package name */
    public float f382516e;

    /* renamed from: f, reason: collision with root package name */
    public float f382517f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382518g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ou)) {
            return false;
        }
        r45.ou ouVar = (r45.ou) fVar;
        return n51.f.a(this.BaseRequest, ouVar.BaseRequest) && n51.f.a(this.f382515d, ouVar.f382515d) && n51.f.a(java.lang.Float.valueOf(this.f382516e), java.lang.Float.valueOf(ouVar.f382516e)) && n51.f.a(java.lang.Float.valueOf(this.f382517f), java.lang.Float.valueOf(ouVar.f382517f)) && n51.f.a(this.f382518g, ouVar.f382518g);
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
            java.lang.String str = this.f382515d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.d(3, this.f382516e);
            fVar.d(4, this.f382517f);
            java.lang.String str2 = this.f382518g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f382515d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int d17 = i18 + b36.f.d(3, this.f382516e) + b36.f.d(4, this.f382517f);
            java.lang.String str4 = this.f382518g;
            return str4 != null ? d17 + b36.f.j(5, str4) : d17;
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
        r45.ou ouVar = (r45.ou) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                ouVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ouVar.f382515d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ouVar.f382516e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            ouVar.f382517f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ouVar.f382518g = aVar2.k(intValue);
        return 0;
    }
}
