package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public class v extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f158312d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158313e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f158314f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f158315g;

    /* renamed from: h, reason: collision with root package name */
    public int f158316h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f158317i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.service.v)) {
            return false;
        }
        com.tencent.mm.plugin.report.service.v vVar = (com.tencent.mm.plugin.report.service.v) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f158312d), java.lang.Integer.valueOf(vVar.f158312d)) && n51.f.a(this.f158313e, vVar.f158313e) && n51.f.a(java.lang.Boolean.valueOf(this.f158314f), java.lang.Boolean.valueOf(vVar.f158314f)) && n51.f.a(java.lang.Boolean.valueOf(this.f158315g), java.lang.Boolean.valueOf(vVar.f158315g)) && n51.f.a(java.lang.Integer.valueOf(this.f158316h), java.lang.Integer.valueOf(vVar.f158316h)) && n51.f.a(java.lang.Boolean.valueOf(this.f158317i), java.lang.Boolean.valueOf(vVar.f158317i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f158312d);
            java.lang.String str = this.f158313e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f158314f);
            fVar.a(4, this.f158315g);
            fVar.e(5, this.f158316h);
            fVar.a(6, this.f158317i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f158312d) + 0;
            java.lang.String str2 = this.f158313e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.a(3, this.f158314f) + b36.f.a(4, this.f158315g) + b36.f.e(5, this.f158316h) + b36.f.a(6, this.f158317i);
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
        com.tencent.mm.plugin.report.service.v vVar = (com.tencent.mm.plugin.report.service.v) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vVar.f158312d = aVar2.g(intValue);
                return 0;
            case 2:
                vVar.f158313e = aVar2.k(intValue);
                return 0;
            case 3:
                vVar.f158314f = aVar2.c(intValue);
                return 0;
            case 4:
                vVar.f158315g = aVar2.c(intValue);
                return 0;
            case 5:
                vVar.f158316h = aVar2.g(intValue);
                return 0;
            case 6:
                vVar.f158317i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
