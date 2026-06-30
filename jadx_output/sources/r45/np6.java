package r45;

/* loaded from: classes9.dex */
public class np6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381577d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381578e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381579f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381580g;

    /* renamed from: h, reason: collision with root package name */
    public int f381581h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f381582i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public r45.n34 f381583m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381584n;

    /* renamed from: o, reason: collision with root package name */
    public r45.tw4 f381585o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f381586p;

    /* renamed from: q, reason: collision with root package name */
    public r45.d70 f381587q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.np6)) {
            return false;
        }
        r45.np6 np6Var = (r45.np6) fVar;
        return n51.f.a(this.BaseResponse, np6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f381577d), java.lang.Integer.valueOf(np6Var.f381577d)) && n51.f.a(this.f381578e, np6Var.f381578e) && n51.f.a(this.f381579f, np6Var.f381579f) && n51.f.a(this.f381580g, np6Var.f381580g) && n51.f.a(java.lang.Integer.valueOf(this.f381581h), java.lang.Integer.valueOf(np6Var.f381581h)) && n51.f.a(this.f381582i, np6Var.f381582i) && n51.f.a(this.f381583m, np6Var.f381583m) && n51.f.a(this.f381584n, np6Var.f381584n) && n51.f.a(this.f381585o, np6Var.f381585o) && n51.f.a(java.lang.Boolean.valueOf(this.f381586p), java.lang.Boolean.valueOf(np6Var.f381586p)) && n51.f.a(this.f381587q, np6Var.f381587q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381582i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f381577d);
            java.lang.String str = this.f381578e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381579f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381580g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f381581h);
            fVar.g(7, 8, linkedList);
            r45.n34 n34Var = this.f381583m;
            if (n34Var != null) {
                fVar.i(8, n34Var.computeSize());
                this.f381583m.writeFields(fVar);
            }
            java.lang.String str4 = this.f381584n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            r45.tw4 tw4Var = this.f381585o;
            if (tw4Var != null) {
                fVar.i(10, tw4Var.computeSize());
                this.f381585o.writeFields(fVar);
            }
            fVar.a(11, this.f381586p);
            r45.d70 d70Var = this.f381587q;
            if (d70Var == null) {
                return 0;
            }
            fVar.i(12, d70Var.computeSize());
            this.f381587q.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f381577d);
            java.lang.String str5 = this.f381578e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f381579f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f381580g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int e17 = i18 + b36.f.e(6, this.f381581h) + b36.f.g(7, 8, linkedList);
            r45.n34 n34Var2 = this.f381583m;
            if (n34Var2 != null) {
                e17 += b36.f.i(8, n34Var2.computeSize());
            }
            java.lang.String str8 = this.f381584n;
            if (str8 != null) {
                e17 += b36.f.j(9, str8);
            }
            r45.tw4 tw4Var2 = this.f381585o;
            if (tw4Var2 != null) {
                e17 += b36.f.i(10, tw4Var2.computeSize());
            }
            int a17 = e17 + b36.f.a(11, this.f381586p);
            r45.d70 d70Var2 = this.f381587q;
            return d70Var2 != null ? a17 + b36.f.i(12, d70Var2.computeSize()) : a17;
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
        r45.np6 np6Var = (r45.np6) objArr[1];
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
                    np6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                np6Var.f381577d = aVar2.g(intValue);
                return 0;
            case 3:
                np6Var.f381578e = aVar2.k(intValue);
                return 0;
            case 4:
                np6Var.f381579f = aVar2.k(intValue);
                return 0;
            case 5:
                np6Var.f381580g = aVar2.k(intValue);
                return 0;
            case 6:
                np6Var.f381581h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.n34 n34Var3 = new r45.n34();
                    if (bArr3 != null && bArr3.length > 0) {
                        n34Var3.parseFrom(bArr3);
                    }
                    np6Var.f381582i.add(n34Var3);
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.n34 n34Var4 = new r45.n34();
                    if (bArr4 != null && bArr4.length > 0) {
                        n34Var4.parseFrom(bArr4);
                    }
                    np6Var.f381583m = n34Var4;
                }
                return 0;
            case 9:
                np6Var.f381584n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr5 != null && bArr5.length > 0) {
                        tw4Var3.parseFrom(bArr5);
                    }
                    np6Var.f381585o = tw4Var3;
                }
                return 0;
            case 11:
                np6Var.f381586p = aVar2.c(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.d70 d70Var3 = new r45.d70();
                    if (bArr6 != null && bArr6.length > 0) {
                        d70Var3.parseFrom(bArr6);
                    }
                    np6Var.f381587q = d70Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
