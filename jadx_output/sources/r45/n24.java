package r45;

/* loaded from: classes7.dex */
public class n24 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f381015d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381016e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jv5 f381017f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381018g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381019h;

    /* renamed from: i, reason: collision with root package name */
    public r45.eb0 f381020i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f381021m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381022n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f381023o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f381024p;

    /* renamed from: q, reason: collision with root package name */
    public r45.sv6 f381025q;

    /* renamed from: r, reason: collision with root package name */
    public r45.i7 f381026r;

    /* renamed from: s, reason: collision with root package name */
    public r45.pw6 f381027s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n24)) {
            return false;
        }
        r45.n24 n24Var = (r45.n24) fVar;
        return n51.f.a(this.BaseResponse, n24Var.BaseResponse) && n51.f.a(this.f381015d, n24Var.f381015d) && n51.f.a(this.f381016e, n24Var.f381016e) && n51.f.a(this.f381017f, n24Var.f381017f) && n51.f.a(this.f381018g, n24Var.f381018g) && n51.f.a(this.f381019h, n24Var.f381019h) && n51.f.a(this.f381020i, n24Var.f381020i) && n51.f.a(java.lang.Boolean.valueOf(this.f381021m), java.lang.Boolean.valueOf(n24Var.f381021m)) && n51.f.a(this.f381022n, n24Var.f381022n) && n51.f.a(this.f381023o, n24Var.f381023o) && n51.f.a(this.f381024p, n24Var.f381024p) && n51.f.a(this.f381025q, n24Var.f381025q) && n51.f.a(this.f381026r, n24Var.f381026r) && n51.f.a(this.f381027s, n24Var.f381027s);
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
            r45.j14 j14Var = this.f381015d;
            if (j14Var != null) {
                fVar.i(2, j14Var.computeSize());
                this.f381015d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f381016e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.jv5 jv5Var = this.f381017f;
            if (jv5Var != null) {
                fVar.i(4, jv5Var.computeSize());
                this.f381017f.writeFields(fVar);
            }
            java.lang.String str = this.f381018g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f381019h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.eb0 eb0Var = this.f381020i;
            if (eb0Var != null) {
                fVar.i(7, eb0Var.computeSize());
                this.f381020i.writeFields(fVar);
            }
            fVar.a(8, this.f381021m);
            java.lang.String str3 = this.f381022n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f381023o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f381024p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            r45.sv6 sv6Var = this.f381025q;
            if (sv6Var != null) {
                fVar.i(12, sv6Var.computeSize());
                this.f381025q.writeFields(fVar);
            }
            r45.i7 i7Var = this.f381026r;
            if (i7Var != null) {
                fVar.i(13, i7Var.computeSize());
                this.f381026r.writeFields(fVar);
            }
            r45.pw6 pw6Var = this.f381027s;
            if (pw6Var != null) {
                fVar.i(15, pw6Var.computeSize());
                this.f381027s.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            r45.j14 j14Var2 = this.f381015d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f381016e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            r45.jv5 jv5Var2 = this.f381017f;
            if (jv5Var2 != null) {
                i18 += b36.f.i(4, jv5Var2.computeSize());
            }
            java.lang.String str6 = this.f381018g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f381019h;
            if (str7 != null) {
                i18 += b36.f.j(6, str7);
            }
            r45.eb0 eb0Var2 = this.f381020i;
            if (eb0Var2 != null) {
                i18 += b36.f.i(7, eb0Var2.computeSize());
            }
            int a17 = i18 + b36.f.a(8, this.f381021m);
            java.lang.String str8 = this.f381022n;
            if (str8 != null) {
                a17 += b36.f.j(9, str8);
            }
            java.lang.String str9 = this.f381023o;
            if (str9 != null) {
                a17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f381024p;
            if (str10 != null) {
                a17 += b36.f.j(11, str10);
            }
            r45.sv6 sv6Var2 = this.f381025q;
            if (sv6Var2 != null) {
                a17 += b36.f.i(12, sv6Var2.computeSize());
            }
            r45.i7 i7Var2 = this.f381026r;
            if (i7Var2 != null) {
                a17 += b36.f.i(13, i7Var2.computeSize());
            }
            r45.pw6 pw6Var2 = this.f381027s;
            return pw6Var2 != null ? a17 + b36.f.i(15, pw6Var2.computeSize()) : a17;
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
        r45.n24 n24Var = (r45.n24) objArr[1];
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
                    n24Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr2 != null && bArr2.length > 0) {
                        j14Var3.parseFrom(bArr2);
                    }
                    n24Var.f381015d = j14Var3;
                }
                return 0;
            case 3:
                n24Var.f381016e = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.jv5 jv5Var3 = new r45.jv5();
                    if (bArr3 != null && bArr3.length > 0) {
                        jv5Var3.parseFrom(bArr3);
                    }
                    n24Var.f381017f = jv5Var3;
                }
                return 0;
            case 5:
                n24Var.f381018g = aVar2.k(intValue);
                return 0;
            case 6:
                n24Var.f381019h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.eb0 eb0Var3 = new r45.eb0();
                    if (bArr4 != null && bArr4.length > 0) {
                        eb0Var3.parseFrom(bArr4);
                    }
                    n24Var.f381020i = eb0Var3;
                }
                return 0;
            case 8:
                n24Var.f381021m = aVar2.c(intValue);
                return 0;
            case 9:
                n24Var.f381022n = aVar2.k(intValue);
                return 0;
            case 10:
                n24Var.f381023o = aVar2.k(intValue);
                return 0;
            case 11:
                n24Var.f381024p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.sv6 sv6Var3 = new r45.sv6();
                    if (bArr5 != null && bArr5.length > 0) {
                        sv6Var3.parseFrom(bArr5);
                    }
                    n24Var.f381025q = sv6Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.i7 i7Var3 = new r45.i7();
                    if (bArr6 != null && bArr6.length > 0) {
                        i7Var3.parseFrom(bArr6);
                    }
                    n24Var.f381026r = i7Var3;
                }
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.pw6 pw6Var3 = new r45.pw6();
                    if (bArr7 != null && bArr7.length > 0) {
                        pw6Var3.parseFrom(bArr7);
                    }
                    n24Var.f381027s = pw6Var3;
                }
                return 0;
        }
    }
}
