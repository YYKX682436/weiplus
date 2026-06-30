package v53;

/* loaded from: classes4.dex */
public class h extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433338d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433339e;

    /* renamed from: f, reason: collision with root package name */
    public int f433340f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f433341g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof v53.h)) {
            return false;
        }
        v53.h hVar = (v53.h) fVar;
        return n51.f.a(this.BaseRequest, hVar.BaseRequest) && n51.f.a(this.f433338d, hVar.f433338d) && n51.f.a(this.f433339e, hVar.f433339e) && n51.f.a(java.lang.Integer.valueOf(this.f433340f), java.lang.Integer.valueOf(hVar.f433340f)) && n51.f.a(this.f433341g, hVar.f433341g);
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
            java.lang.String str = this.f433338d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f433339e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f433340f);
            com.tencent.mm.protobuf.g gVar = this.f433341g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f433338d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f433339e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f433340f);
            com.tencent.mm.protobuf.g gVar2 = this.f433341g;
            return gVar2 != null ? e17 + b36.f.b(5, gVar2) : e17;
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
        v53.h hVar = (v53.h) objArr[1];
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
                hVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            hVar.f433338d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hVar.f433339e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            hVar.f433340f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        hVar.f433341g = aVar2.d(intValue);
        return 0;
    }
}
