package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145338d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145339e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145340f;

    /* renamed from: g, reason: collision with root package name */
    public int f145341g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145342h;

    /* renamed from: i, reason: collision with root package name */
    public int f145343i;

    /* renamed from: m, reason: collision with root package name */
    public int f145344m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.j)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.j jVar = (com.tencent.mm.plugin.luckymoney.model.j) fVar;
        return n51.f.a(this.f145338d, jVar.f145338d) && n51.f.a(this.f145339e, jVar.f145339e) && n51.f.a(this.f145340f, jVar.f145340f) && n51.f.a(java.lang.Integer.valueOf(this.f145341g), java.lang.Integer.valueOf(jVar.f145341g)) && n51.f.a(this.f145342h, jVar.f145342h) && n51.f.a(java.lang.Integer.valueOf(this.f145343i), java.lang.Integer.valueOf(jVar.f145343i)) && n51.f.a(java.lang.Integer.valueOf(this.f145344m), java.lang.Integer.valueOf(jVar.f145344m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f145338d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f145339e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f145340f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f145341g);
            java.lang.String str4 = this.f145342h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f145343i);
            fVar.e(7, this.f145344m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f145338d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f145339e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f145340f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f145341g);
            java.lang.String str8 = this.f145342h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f145343i) + b36.f.e(7, this.f145344m);
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
        com.tencent.mm.plugin.luckymoney.model.j jVar = (com.tencent.mm.plugin.luckymoney.model.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jVar.f145338d = aVar2.k(intValue);
                return 0;
            case 2:
                jVar.f145339e = aVar2.k(intValue);
                return 0;
            case 3:
                jVar.f145340f = aVar2.k(intValue);
                return 0;
            case 4:
                jVar.f145341g = aVar2.g(intValue);
                return 0;
            case 5:
                jVar.f145342h = aVar2.k(intValue);
                return 0;
            case 6:
                jVar.f145343i = aVar2.g(intValue);
                return 0;
            case 7:
                jVar.f145344m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
