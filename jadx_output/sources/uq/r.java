package uq;

/* loaded from: classes4.dex */
public class r extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f430187d;

    /* renamed from: e, reason: collision with root package name */
    public int f430188e;

    /* renamed from: f, reason: collision with root package name */
    public long f430189f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f430190g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof uq.r)) {
            return false;
        }
        uq.r rVar = (uq.r) fVar;
        return n51.f.a(this.BaseRequest, rVar.BaseRequest) && n51.f.a(this.f430187d, rVar.f430187d) && n51.f.a(java.lang.Integer.valueOf(this.f430188e), java.lang.Integer.valueOf(rVar.f430188e)) && n51.f.a(java.lang.Long.valueOf(this.f430189f), java.lang.Long.valueOf(rVar.f430189f)) && n51.f.a(this.f430190g, rVar.f430190g);
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
            java.lang.String str = this.f430187d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f430188e);
            fVar.h(4, this.f430189f);
            java.lang.String str2 = this.f430190g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f430187d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f430188e) + b36.f.h(4, this.f430189f);
            java.lang.String str4 = this.f430190g;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
        uq.r rVar = (uq.r) objArr[1];
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
                rVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            rVar.f430187d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            rVar.f430188e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            rVar.f430189f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        rVar.f430190g = aVar2.k(intValue);
        return 0;
    }
}
