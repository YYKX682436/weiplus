package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class o0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145479d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145480e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145481f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f145482g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145483h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145484i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145485m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145486n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.o0)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.o0 o0Var = (com.tencent.mm.plugin.luckymoney.model.o0) fVar;
        return n51.f.a(this.f145479d, o0Var.f145479d) && n51.f.a(this.f145480e, o0Var.f145480e) && n51.f.a(this.f145481f, o0Var.f145481f) && n51.f.a(this.f145482g, o0Var.f145482g) && n51.f.a(this.f145483h, o0Var.f145483h) && n51.f.a(this.f145484i, o0Var.f145484i) && n51.f.a(this.f145485m, o0Var.f145485m) && n51.f.a(this.f145486n, o0Var.f145486n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f145479d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f145480e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f145481f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f145482g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f145483h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f145484i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f145485m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f145486n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f145479d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f145480e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f145481f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f145482g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f145483h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f145484i;
            if (str14 != null) {
                j17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f145485m;
            if (str15 != null) {
                j17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f145486n;
            return str16 != null ? j17 + b36.f.j(8, str16) : j17;
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
        com.tencent.mm.plugin.luckymoney.model.o0 o0Var = (com.tencent.mm.plugin.luckymoney.model.o0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o0Var.f145479d = aVar2.k(intValue);
                return 0;
            case 2:
                o0Var.f145480e = aVar2.k(intValue);
                return 0;
            case 3:
                o0Var.f145481f = aVar2.k(intValue);
                return 0;
            case 4:
                o0Var.f145482g = aVar2.k(intValue);
                return 0;
            case 5:
                o0Var.f145483h = aVar2.k(intValue);
                return 0;
            case 6:
                o0Var.f145484i = aVar2.k(intValue);
                return 0;
            case 7:
                o0Var.f145485m = aVar2.k(intValue);
                return 0;
            case 8:
                o0Var.f145486n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
