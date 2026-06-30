package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class k0 extends r45.js5 {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.p0 f145364d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f145365e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f145366f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f145367g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f145368h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f145369i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.q0 f145370m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.j f145371n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f145372o;

    /* renamed from: p, reason: collision with root package name */
    public int f145373p;

    /* renamed from: q, reason: collision with root package name */
    public int f145374q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.j f145375r;

    /* renamed from: s, reason: collision with root package name */
    public int f145376s;

    /* renamed from: t, reason: collision with root package name */
    public int f145377t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.j f145378u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.q0 f145379v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f145380w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f145381x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f145382y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f145383z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.k0)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.k0 k0Var = (com.tencent.mm.plugin.luckymoney.model.k0) fVar;
        return n51.f.a(this.BaseResponse, k0Var.BaseResponse) && n51.f.a(this.f145364d, k0Var.f145364d) && n51.f.a(this.f145365e, k0Var.f145365e) && n51.f.a(this.f145366f, k0Var.f145366f) && n51.f.a(this.f145367g, k0Var.f145367g) && n51.f.a(java.lang.Boolean.valueOf(this.f145368h), java.lang.Boolean.valueOf(k0Var.f145368h)) && n51.f.a(java.lang.Boolean.valueOf(this.f145369i), java.lang.Boolean.valueOf(k0Var.f145369i)) && n51.f.a(this.f145370m, k0Var.f145370m) && n51.f.a(this.f145371n, k0Var.f145371n) && n51.f.a(this.f145372o, k0Var.f145372o) && n51.f.a(java.lang.Integer.valueOf(this.f145373p), java.lang.Integer.valueOf(k0Var.f145373p)) && n51.f.a(java.lang.Integer.valueOf(this.f145374q), java.lang.Integer.valueOf(k0Var.f145374q)) && n51.f.a(this.f145375r, k0Var.f145375r) && n51.f.a(java.lang.Integer.valueOf(this.f145376s), java.lang.Integer.valueOf(k0Var.f145376s)) && n51.f.a(java.lang.Integer.valueOf(this.f145377t), java.lang.Integer.valueOf(k0Var.f145377t)) && n51.f.a(this.f145378u, k0Var.f145378u) && n51.f.a(this.f145379v, k0Var.f145379v) && n51.f.a(this.f145380w, k0Var.f145380w) && n51.f.a(this.f145381x, k0Var.f145381x) && n51.f.a(this.f145382y, k0Var.f145382y) && n51.f.a(this.f145383z, k0Var.f145383z) && n51.f.a(this.A, k0Var.A);
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
            com.tencent.mm.plugin.luckymoney.model.p0 p0Var = this.f145364d;
            if (p0Var != null) {
                fVar.i(2, p0Var.computeSize());
                this.f145364d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f145365e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f145366f;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f145367g;
            if (gVar3 != null) {
                fVar.b(5, gVar3);
            }
            fVar.a(6, this.f145368h);
            fVar.a(7, this.f145369i);
            com.tencent.mm.plugin.luckymoney.model.q0 q0Var = this.f145370m;
            if (q0Var != null) {
                fVar.i(8, q0Var.computeSize());
                this.f145370m.writeFields(fVar);
            }
            com.tencent.mm.plugin.luckymoney.model.j jVar = this.f145371n;
            if (jVar != null) {
                fVar.i(9, jVar.computeSize());
                this.f145371n.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f145372o;
            if (gVar4 != null) {
                fVar.b(10, gVar4);
            }
            fVar.e(11, this.f145373p);
            fVar.e(12, this.f145374q);
            com.tencent.mm.plugin.luckymoney.model.j jVar2 = this.f145375r;
            if (jVar2 != null) {
                fVar.i(13, jVar2.computeSize());
                this.f145375r.writeFields(fVar);
            }
            fVar.e(14, this.f145376s);
            fVar.e(15, this.f145377t);
            com.tencent.mm.plugin.luckymoney.model.j jVar3 = this.f145378u;
            if (jVar3 != null) {
                fVar.i(16, jVar3.computeSize());
                this.f145378u.writeFields(fVar);
            }
            com.tencent.mm.plugin.luckymoney.model.q0 q0Var2 = this.f145379v;
            if (q0Var2 != null) {
                fVar.i(17, q0Var2.computeSize());
                this.f145379v.writeFields(fVar);
            }
            java.lang.String str = this.f145380w;
            if (str != null) {
                fVar.j(18, str);
            }
            java.lang.String str2 = this.f145381x;
            if (str2 != null) {
                fVar.j(19, str2);
            }
            java.lang.String str3 = this.f145382y;
            if (str3 != null) {
                fVar.j(20, str3);
            }
            java.lang.String str4 = this.f145383z;
            if (str4 != null) {
                fVar.j(21, str4);
            }
            java.lang.String str5 = this.A;
            if (str5 != null) {
                fVar.j(22, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            com.tencent.mm.plugin.luckymoney.model.p0 p0Var2 = this.f145364d;
            if (p0Var2 != null) {
                i18 += b36.f.i(2, p0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar5 = this.f145365e;
            if (gVar5 != null) {
                i18 += b36.f.b(3, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f145366f;
            if (gVar6 != null) {
                i18 += b36.f.b(4, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f145367g;
            if (gVar7 != null) {
                i18 += b36.f.b(5, gVar7);
            }
            int a17 = i18 + b36.f.a(6, this.f145368h) + b36.f.a(7, this.f145369i);
            com.tencent.mm.plugin.luckymoney.model.q0 q0Var3 = this.f145370m;
            if (q0Var3 != null) {
                a17 += b36.f.i(8, q0Var3.computeSize());
            }
            com.tencent.mm.plugin.luckymoney.model.j jVar4 = this.f145371n;
            if (jVar4 != null) {
                a17 += b36.f.i(9, jVar4.computeSize());
            }
            com.tencent.mm.protobuf.g gVar8 = this.f145372o;
            if (gVar8 != null) {
                a17 += b36.f.b(10, gVar8);
            }
            int e17 = a17 + b36.f.e(11, this.f145373p) + b36.f.e(12, this.f145374q);
            com.tencent.mm.plugin.luckymoney.model.j jVar5 = this.f145375r;
            if (jVar5 != null) {
                e17 += b36.f.i(13, jVar5.computeSize());
            }
            int e18 = e17 + b36.f.e(14, this.f145376s) + b36.f.e(15, this.f145377t);
            com.tencent.mm.plugin.luckymoney.model.j jVar6 = this.f145378u;
            if (jVar6 != null) {
                e18 += b36.f.i(16, jVar6.computeSize());
            }
            com.tencent.mm.plugin.luckymoney.model.q0 q0Var4 = this.f145379v;
            if (q0Var4 != null) {
                e18 += b36.f.i(17, q0Var4.computeSize());
            }
            java.lang.String str6 = this.f145380w;
            if (str6 != null) {
                e18 += b36.f.j(18, str6);
            }
            java.lang.String str7 = this.f145381x;
            if (str7 != null) {
                e18 += b36.f.j(19, str7);
            }
            java.lang.String str8 = this.f145382y;
            if (str8 != null) {
                e18 += b36.f.j(20, str8);
            }
            java.lang.String str9 = this.f145383z;
            if (str9 != null) {
                e18 += b36.f.j(21, str9);
            }
            java.lang.String str10 = this.A;
            return str10 != null ? e18 + b36.f.j(22, str10) : e18;
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
        com.tencent.mm.plugin.luckymoney.model.k0 k0Var = (com.tencent.mm.plugin.luckymoney.model.k0) objArr[1];
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
                    k0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mm.plugin.luckymoney.model.p0 p0Var3 = new com.tencent.mm.plugin.luckymoney.model.p0();
                    if (bArr2 != null && bArr2.length > 0) {
                        p0Var3.parseFrom(bArr2);
                    }
                    k0Var.f145364d = p0Var3;
                }
                return 0;
            case 3:
                k0Var.f145365e = aVar2.d(intValue);
                return 0;
            case 4:
                k0Var.f145366f = aVar2.d(intValue);
                return 0;
            case 5:
                k0Var.f145367g = aVar2.d(intValue);
                return 0;
            case 6:
                k0Var.f145368h = aVar2.c(intValue);
                return 0;
            case 7:
                k0Var.f145369i = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mm.plugin.luckymoney.model.q0 q0Var5 = new com.tencent.mm.plugin.luckymoney.model.q0();
                    if (bArr3 != null && bArr3.length > 0) {
                        q0Var5.parseFrom(bArr3);
                    }
                    k0Var.f145370m = q0Var5;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.mm.plugin.luckymoney.model.j jVar7 = new com.tencent.mm.plugin.luckymoney.model.j();
                    if (bArr4 != null && bArr4.length > 0) {
                        jVar7.parseFrom(bArr4);
                    }
                    k0Var.f145371n = jVar7;
                }
                return 0;
            case 10:
                k0Var.f145372o = aVar2.d(intValue);
                return 0;
            case 11:
                k0Var.f145373p = aVar2.g(intValue);
                return 0;
            case 12:
                k0Var.f145374q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.mm.plugin.luckymoney.model.j jVar8 = new com.tencent.mm.plugin.luckymoney.model.j();
                    if (bArr5 != null && bArr5.length > 0) {
                        jVar8.parseFrom(bArr5);
                    }
                    k0Var.f145375r = jVar8;
                }
                return 0;
            case 14:
                k0Var.f145376s = aVar2.g(intValue);
                return 0;
            case 15:
                k0Var.f145377t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.mm.plugin.luckymoney.model.j jVar9 = new com.tencent.mm.plugin.luckymoney.model.j();
                    if (bArr6 != null && bArr6.length > 0) {
                        jVar9.parseFrom(bArr6);
                    }
                    k0Var.f145378u = jVar9;
                }
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.mm.plugin.luckymoney.model.q0 q0Var6 = new com.tencent.mm.plugin.luckymoney.model.q0();
                    if (bArr7 != null && bArr7.length > 0) {
                        q0Var6.parseFrom(bArr7);
                    }
                    k0Var.f145379v = q0Var6;
                }
                return 0;
            case 18:
                k0Var.f145380w = aVar2.k(intValue);
                return 0;
            case 19:
                k0Var.f145381x = aVar2.k(intValue);
                return 0;
            case 20:
                k0Var.f145382y = aVar2.k(intValue);
                return 0;
            case 21:
                k0Var.f145383z = aVar2.k(intValue);
                return 0;
            case 22:
                k0Var.A = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
