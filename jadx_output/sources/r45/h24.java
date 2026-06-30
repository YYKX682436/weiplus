package r45;

/* loaded from: classes7.dex */
public class h24 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f375773d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f375774e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375775f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375776g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375777h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375778i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375779m;

    /* renamed from: n, reason: collision with root package name */
    public r45.i7 f375780n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375781o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f375782p;

    /* renamed from: q, reason: collision with root package name */
    public r45.pw6 f375783q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h24)) {
            return false;
        }
        r45.h24 h24Var = (r45.h24) fVar;
        return n51.f.a(this.BaseResponse, h24Var.BaseResponse) && n51.f.a(this.f375773d, h24Var.f375773d) && n51.f.a(this.f375774e, h24Var.f375774e) && n51.f.a(this.f375775f, h24Var.f375775f) && n51.f.a(this.f375776g, h24Var.f375776g) && n51.f.a(this.f375777h, h24Var.f375777h) && n51.f.a(this.f375778i, h24Var.f375778i) && n51.f.a(this.f375779m, h24Var.f375779m) && n51.f.a(this.f375780n, h24Var.f375780n) && n51.f.a(this.f375781o, h24Var.f375781o) && n51.f.a(this.f375782p, h24Var.f375782p) && n51.f.a(this.f375783q, h24Var.f375783q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375774e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.j14 j14Var = this.f375773d;
            if (j14Var != null) {
                fVar.i(2, j14Var.computeSize());
                this.f375773d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f375775f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f375776g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f375777h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f375778i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f375779m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            r45.i7 i7Var = this.f375780n;
            if (i7Var != null) {
                fVar.i(9, i7Var.computeSize());
                this.f375780n.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f375781o;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            java.lang.String str6 = this.f375782p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            r45.pw6 pw6Var = this.f375783q;
            if (pw6Var == null) {
                return 0;
            }
            fVar.i(12, pw6Var.computeSize());
            this.f375783q.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.j14 j14Var2 = this.f375773d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            java.lang.String str7 = this.f375775f;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f375776g;
            if (str8 != null) {
                g17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f375777h;
            if (str9 != null) {
                g17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f375778i;
            if (str10 != null) {
                g17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f375779m;
            if (str11 != null) {
                g17 += b36.f.j(8, str11);
            }
            r45.i7 i7Var2 = this.f375780n;
            if (i7Var2 != null) {
                g17 += b36.f.i(9, i7Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f375781o;
            if (gVar2 != null) {
                g17 += b36.f.b(10, gVar2);
            }
            java.lang.String str12 = this.f375782p;
            if (str12 != null) {
                g17 += b36.f.j(11, str12);
            }
            r45.pw6 pw6Var2 = this.f375783q;
            return pw6Var2 != null ? g17 + b36.f.i(12, pw6Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.h24 h24Var = (r45.h24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    h24Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr3 != null && bArr3.length > 0) {
                        j14Var3.parseFrom(bArr3);
                    }
                    h24Var.f375773d = j14Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.jv5 jv5Var = new r45.jv5();
                    if (bArr4 != null && bArr4.length > 0) {
                        jv5Var.parseFrom(bArr4);
                    }
                    h24Var.f375774e.add(jv5Var);
                }
                return 0;
            case 4:
                h24Var.f375775f = aVar2.k(intValue);
                return 0;
            case 5:
                h24Var.f375776g = aVar2.k(intValue);
                return 0;
            case 6:
                h24Var.f375777h = aVar2.k(intValue);
                return 0;
            case 7:
                h24Var.f375778i = aVar2.k(intValue);
                return 0;
            case 8:
                h24Var.f375779m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.i7 i7Var3 = new r45.i7();
                    if (bArr5 != null && bArr5.length > 0) {
                        i7Var3.parseFrom(bArr5);
                    }
                    h24Var.f375780n = i7Var3;
                }
                return 0;
            case 10:
                h24Var.f375781o = aVar2.d(intValue);
                return 0;
            case 11:
                h24Var.f375782p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.pw6 pw6Var3 = new r45.pw6();
                    if (bArr6 != null && bArr6.length > 0) {
                        pw6Var3.parseFrom(bArr6);
                    }
                    h24Var.f375783q = pw6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
