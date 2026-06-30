package uq;

/* loaded from: classes4.dex */
public class g extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f430141d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f430142e;

    /* renamed from: f, reason: collision with root package name */
    public int f430143f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f430144g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof uq.g)) {
            return false;
        }
        uq.g gVar = (uq.g) fVar;
        return n51.f.a(this.BaseRequest, gVar.BaseRequest) && n51.f.a(this.f430141d, gVar.f430141d) && n51.f.a(this.f430142e, gVar.f430142e) && n51.f.a(java.lang.Integer.valueOf(this.f430143f), java.lang.Integer.valueOf(gVar.f430143f)) && n51.f.a(this.f430144g, gVar.f430144g);
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
            java.lang.String str = this.f430141d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f430142e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f430143f);
            java.lang.String str3 = this.f430144g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f430141d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f430142e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f430143f);
            java.lang.String str6 = this.f430144g;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        uq.g gVar = (uq.g) objArr[1];
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
                gVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            gVar.f430141d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            gVar.f430142e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            gVar.f430143f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        gVar.f430144g = aVar2.k(intValue);
        return 0;
    }
}
