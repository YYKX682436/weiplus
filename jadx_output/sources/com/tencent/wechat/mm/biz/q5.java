package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public class q5 extends com.tencent.mm.protobuf.f {

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.q5 f218495v = new com.tencent.wechat.mm.biz.q5();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.biz.u f218496d = new com.tencent.wechat.iam.biz.u();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218497e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218498f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218499g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f218500h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218501i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218502m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f218503n = false;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.r5 f218504o = new com.tencent.wechat.mm.biz.r5();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218505p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f218506q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f218507r = "";

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.p5 f218508s = new com.tencent.wechat.mm.biz.p5();

    /* renamed from: t, reason: collision with root package name */
    public int f218509t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f218510u = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.q5)) {
            return false;
        }
        com.tencent.wechat.mm.biz.q5 q5Var = (com.tencent.wechat.mm.biz.q5) fVar;
        return n51.f.a(this.f218496d, q5Var.f218496d) && n51.f.a(this.f218497e, q5Var.f218497e) && n51.f.a(this.f218498f, q5Var.f218498f) && n51.f.a(this.f218499g, q5Var.f218499g) && n51.f.a(java.lang.Integer.valueOf(this.f218500h), java.lang.Integer.valueOf(q5Var.f218500h)) && n51.f.a(this.f218501i, q5Var.f218501i) && n51.f.a(this.f218502m, q5Var.f218502m) && n51.f.a(java.lang.Boolean.valueOf(this.f218503n), java.lang.Boolean.valueOf(q5Var.f218503n)) && n51.f.a(this.f218504o, q5Var.f218504o) && n51.f.a(this.f218505p, q5Var.f218505p) && n51.f.a(this.f218506q, q5Var.f218506q) && n51.f.a(this.f218507r, q5Var.f218507r) && n51.f.a(this.f218508s, q5Var.f218508s) && n51.f.a(java.lang.Integer.valueOf(this.f218509t), java.lang.Integer.valueOf(q5Var.f218509t)) && n51.f.a(java.lang.Boolean.valueOf(this.f218510u), java.lang.Boolean.valueOf(q5Var.f218510u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.q5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.biz.u uVar = this.f218496d;
            if (uVar != null) {
                fVar.i(1, uVar.computeSize());
                this.f218496d.writeFields(fVar);
            }
            java.lang.String str = this.f218497e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f218498f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f218499g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f218500h);
            java.lang.String str4 = this.f218501i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f218502m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.a(8, this.f218503n);
            com.tencent.wechat.mm.biz.r5 r5Var = this.f218504o;
            if (r5Var != null) {
                fVar.i(9, r5Var.computeSize());
                this.f218504o.writeFields(fVar);
            }
            java.lang.String str6 = this.f218505p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f218506q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f218507r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            com.tencent.wechat.mm.biz.p5 p5Var = this.f218508s;
            if (p5Var != null) {
                fVar.i(13, p5Var.computeSize());
                this.f218508s.writeFields(fVar);
            }
            fVar.e(14, this.f218509t);
            fVar.a(15, this.f218510u);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.biz.u uVar2 = this.f218496d;
            int i18 = uVar2 != null ? b36.f.i(1, uVar2.computeSize()) + 0 : 0;
            java.lang.String str9 = this.f218497e;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f218498f;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f218499g;
            if (str11 != null) {
                i18 += b36.f.j(4, str11);
            }
            int e17 = i18 + b36.f.e(5, this.f218500h);
            java.lang.String str12 = this.f218501i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f218502m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            int a17 = e17 + b36.f.a(8, this.f218503n);
            com.tencent.wechat.mm.biz.r5 r5Var2 = this.f218504o;
            if (r5Var2 != null) {
                a17 += b36.f.i(9, r5Var2.computeSize());
            }
            java.lang.String str14 = this.f218505p;
            if (str14 != null) {
                a17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f218506q;
            if (str15 != null) {
                a17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f218507r;
            if (str16 != null) {
                a17 += b36.f.j(12, str16);
            }
            com.tencent.wechat.mm.biz.p5 p5Var2 = this.f218508s;
            if (p5Var2 != null) {
                a17 += b36.f.i(13, p5Var2.computeSize());
            }
            return a17 + b36.f.e(14, this.f218509t) + b36.f.a(15, this.f218510u);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.iam.biz.u uVar3 = new com.tencent.wechat.iam.biz.u();
                    if (bArr != null && bArr.length > 0) {
                        uVar3.parseFrom(bArr);
                    }
                    this.f218496d = uVar3;
                }
                return 0;
            case 2:
                this.f218497e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f218498f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f218499g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f218500h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f218501i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f218502m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f218503n = aVar2.c(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.biz.r5 r5Var3 = new com.tencent.wechat.mm.biz.r5();
                    if (bArr2 != null && bArr2.length > 0) {
                        r5Var3.parseFrom(bArr2);
                    }
                    this.f218504o = r5Var3;
                }
                return 0;
            case 10:
                this.f218505p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f218506q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f218507r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.mm.biz.p5 p5Var3 = new com.tencent.wechat.mm.biz.p5();
                    if (bArr3 != null && bArr3.length > 0) {
                        p5Var3.parseFrom(bArr3);
                    }
                    this.f218508s = p5Var3;
                }
                return 0;
            case 14:
                this.f218509t = aVar2.g(intValue);
                return 0;
            case 15:
                this.f218510u = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.q5) super.parseFrom(bArr);
    }
}
