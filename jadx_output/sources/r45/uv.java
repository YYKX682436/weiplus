package r45;

/* loaded from: classes9.dex */
public class uv extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387655d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387656e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387657f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387658g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387659h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387660i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387661m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387662n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f387663o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uv)) {
            return false;
        }
        r45.uv uvVar = (r45.uv) fVar;
        return n51.f.a(this.BaseRequest, uvVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f387655d), java.lang.Integer.valueOf(uvVar.f387655d)) && n51.f.a(this.f387656e, uvVar.f387656e) && n51.f.a(this.f387657f, uvVar.f387657f) && n51.f.a(this.f387658g, uvVar.f387658g) && n51.f.a(this.f387659h, uvVar.f387659h) && n51.f.a(this.f387660i, uvVar.f387660i) && n51.f.a(this.f387661m, uvVar.f387661m) && n51.f.a(this.f387662n, uvVar.f387662n) && n51.f.a(this.f387663o, uvVar.f387663o);
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
            fVar.e(2, this.f387655d);
            java.lang.String str = this.f387656e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387657f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f387658g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f387659h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f387660i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f387661m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f387662n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f387663o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f387655d);
            java.lang.String str9 = this.f387656e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f387657f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f387658g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f387659h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f387660i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f387661m;
            if (str14 != null) {
                i18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f387662n;
            if (str15 != null) {
                i18 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f387663o;
            return str16 != null ? i18 + b36.f.j(10, str16) : i18;
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
        r45.uv uvVar = (r45.uv) objArr[1];
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
                    uvVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                uvVar.f387655d = aVar2.g(intValue);
                return 0;
            case 3:
                uvVar.f387656e = aVar2.k(intValue);
                return 0;
            case 4:
                uvVar.f387657f = aVar2.k(intValue);
                return 0;
            case 5:
                uvVar.f387658g = aVar2.k(intValue);
                return 0;
            case 6:
                uvVar.f387659h = aVar2.k(intValue);
                return 0;
            case 7:
                uvVar.f387660i = aVar2.k(intValue);
                return 0;
            case 8:
                uvVar.f387661m = aVar2.k(intValue);
                return 0;
            case 9:
                uvVar.f387662n = aVar2.k(intValue);
                return 0;
            case 10:
                uvVar.f387663o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
