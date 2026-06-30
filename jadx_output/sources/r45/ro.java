package r45;

/* loaded from: classes8.dex */
public class ro extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385033d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385034e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385035f;

    /* renamed from: g, reason: collision with root package name */
    public int f385036g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385037h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385038i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ro)) {
            return false;
        }
        r45.ro roVar = (r45.ro) fVar;
        return n51.f.a(this.BaseRequest, roVar.BaseRequest) && n51.f.a(this.f385033d, roVar.f385033d) && n51.f.a(this.f385034e, roVar.f385034e) && n51.f.a(this.f385035f, roVar.f385035f) && n51.f.a(java.lang.Integer.valueOf(this.f385036g), java.lang.Integer.valueOf(roVar.f385036g)) && n51.f.a(this.f385037h, roVar.f385037h) && n51.f.a(this.f385038i, roVar.f385038i);
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
            java.lang.String str = this.f385033d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f385034e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f385035f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f385036g);
            com.tencent.mm.protobuf.g gVar = this.f385037h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            java.lang.String str4 = this.f385038i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f385033d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f385034e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f385035f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f385036g);
            com.tencent.mm.protobuf.g gVar2 = this.f385037h;
            if (gVar2 != null) {
                e17 += b36.f.b(6, gVar2);
            }
            java.lang.String str8 = this.f385038i;
            return str8 != null ? e17 + b36.f.j(7, str8) : e17;
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
        r45.ro roVar = (r45.ro) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    roVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                roVar.f385033d = aVar2.k(intValue);
                return 0;
            case 3:
                roVar.f385034e = aVar2.k(intValue);
                return 0;
            case 4:
                roVar.f385035f = aVar2.k(intValue);
                return 0;
            case 5:
                roVar.f385036g = aVar2.g(intValue);
                return 0;
            case 6:
                roVar.f385037h = aVar2.d(intValue);
                return 0;
            case 7:
                roVar.f385038i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
