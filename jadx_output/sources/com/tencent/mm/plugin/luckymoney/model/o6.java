package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class o6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f145517d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145518e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145519f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f145520g;

    /* renamed from: h, reason: collision with root package name */
    public int f145521h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145522i;

    /* renamed from: m, reason: collision with root package name */
    public int f145523m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.o6)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.o6 o6Var = (com.tencent.mm.plugin.luckymoney.model.o6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f145517d), java.lang.Integer.valueOf(o6Var.f145517d)) && n51.f.a(this.f145518e, o6Var.f145518e) && n51.f.a(this.f145519f, o6Var.f145519f) && n51.f.a(this.f145520g, o6Var.f145520g) && n51.f.a(java.lang.Integer.valueOf(this.f145521h), java.lang.Integer.valueOf(o6Var.f145521h)) && n51.f.a(this.f145522i, o6Var.f145522i) && n51.f.a(java.lang.Integer.valueOf(this.f145523m), java.lang.Integer.valueOf(o6Var.f145523m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f145517d);
            java.lang.String str = this.f145518e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f145519f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f145520g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f145521h);
            java.lang.String str4 = this.f145522i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f145523m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f145517d) + 0;
            java.lang.String str5 = this.f145518e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f145519f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f145520g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f145521h);
            java.lang.String str8 = this.f145522i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            return e18 + b36.f.e(7, this.f145523m);
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
        com.tencent.mm.plugin.luckymoney.model.o6 o6Var = (com.tencent.mm.plugin.luckymoney.model.o6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o6Var.f145517d = aVar2.g(intValue);
                return 0;
            case 2:
                o6Var.f145518e = aVar2.k(intValue);
                return 0;
            case 3:
                o6Var.f145519f = aVar2.k(intValue);
                return 0;
            case 4:
                o6Var.f145520g = aVar2.k(intValue);
                return 0;
            case 5:
                o6Var.f145521h = aVar2.g(intValue);
                return 0;
            case 6:
                o6Var.f145522i = aVar2.k(intValue);
                return 0;
            case 7:
                o6Var.f145523m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
