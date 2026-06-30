package r45;

/* loaded from: classes2.dex */
public class ng5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381385d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381386e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381387f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381388g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381389h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zs f381390i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381391m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381392n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f381393o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f381394p;

    /* renamed from: q, reason: collision with root package name */
    public r45.jo6 f381395q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ng5)) {
            return false;
        }
        r45.ng5 ng5Var = (r45.ng5) fVar;
        return n51.f.a(this.BaseResponse, ng5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f381385d), java.lang.Integer.valueOf(ng5Var.f381385d)) && n51.f.a(this.f381386e, ng5Var.f381386e) && n51.f.a(this.f381387f, ng5Var.f381387f) && n51.f.a(this.f381388g, ng5Var.f381388g) && n51.f.a(this.f381389h, ng5Var.f381389h) && n51.f.a(this.f381390i, ng5Var.f381390i) && n51.f.a(this.f381391m, ng5Var.f381391m) && n51.f.a(this.f381392n, ng5Var.f381392n) && n51.f.a(this.f381393o, ng5Var.f381393o) && n51.f.a(this.f381394p, ng5Var.f381394p) && n51.f.a(this.f381395q, ng5Var.f381395q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f381385d);
            java.lang.String str = this.f381386e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381387f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381388g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f381389h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.zs zsVar = this.f381390i;
            if (zsVar != null) {
                fVar.i(7, zsVar.computeSize());
                this.f381390i.writeFields(fVar);
            }
            java.lang.String str5 = this.f381391m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f381392n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f381393o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f381394p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            r45.jo6 jo6Var = this.f381395q;
            if (jo6Var != null) {
                fVar.i(12, jo6Var.computeSize());
                this.f381395q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f381385d);
            java.lang.String str9 = this.f381386e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f381387f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f381388g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f381389h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            r45.zs zsVar2 = this.f381390i;
            if (zsVar2 != null) {
                i18 += b36.f.i(7, zsVar2.computeSize());
            }
            java.lang.String str13 = this.f381391m;
            if (str13 != null) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f381392n;
            if (str14 != null) {
                i18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f381393o;
            if (str15 != null) {
                i18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f381394p;
            if (str16 != null) {
                i18 += b36.f.j(11, str16);
            }
            r45.jo6 jo6Var2 = this.f381395q;
            return jo6Var2 != null ? i18 + b36.f.i(12, jo6Var2.computeSize()) : i18;
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
        r45.ng5 ng5Var = (r45.ng5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    ng5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ng5Var.f381385d = aVar2.g(intValue);
                return 0;
            case 3:
                ng5Var.f381386e = aVar2.k(intValue);
                return 0;
            case 4:
                ng5Var.f381387f = aVar2.k(intValue);
                return 0;
            case 5:
                ng5Var.f381388g = aVar2.k(intValue);
                return 0;
            case 6:
                ng5Var.f381389h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.zs zsVar3 = new r45.zs();
                    if (bArr2 != null && bArr2.length > 0) {
                        zsVar3.parseFrom(bArr2);
                    }
                    ng5Var.f381390i = zsVar3;
                }
                return 0;
            case 8:
                ng5Var.f381391m = aVar2.k(intValue);
                return 0;
            case 9:
                ng5Var.f381392n = aVar2.k(intValue);
                return 0;
            case 10:
                ng5Var.f381393o = aVar2.k(intValue);
                return 0;
            case 11:
                ng5Var.f381394p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.jo6 jo6Var3 = new r45.jo6();
                    if (bArr3 != null && bArr3.length > 0) {
                        jo6Var3.parseFrom(bArr3);
                    }
                    ng5Var.f381395q = jo6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
