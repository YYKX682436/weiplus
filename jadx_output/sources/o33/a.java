package o33;

/* loaded from: classes2.dex */
public class a extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342723d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f342724e;

    /* renamed from: f, reason: collision with root package name */
    public int f342725f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o33.a)) {
            return false;
        }
        o33.a aVar = (o33.a) fVar;
        return n51.f.a(this.BaseRequest, aVar.BaseRequest) && n51.f.a(this.f342723d, aVar.f342723d) && n51.f.a(this.f342724e, aVar.f342724e) && n51.f.a(java.lang.Integer.valueOf(this.f342725f), java.lang.Integer.valueOf(aVar.f342725f));
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
            java.lang.String str = this.f342723d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f342724e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f342725f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f342723d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f342724e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.e(4, this.f342725f);
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
        o33.a aVar3 = (o33.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                aVar3.f342723d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                aVar3.f342724e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            aVar3.f342725f = aVar2.g(intValue);
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
            aVar3.BaseRequest = heVar3;
        }
        return 0;
    }
}
