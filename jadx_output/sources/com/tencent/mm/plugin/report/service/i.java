package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f158276d;

    /* renamed from: e, reason: collision with root package name */
    public int f158277e;

    /* renamed from: f, reason: collision with root package name */
    public int f158278f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f158279g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158280h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.service.i)) {
            return false;
        }
        com.tencent.mm.plugin.report.service.i iVar = (com.tencent.mm.plugin.report.service.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f158276d), java.lang.Integer.valueOf(iVar.f158276d)) && n51.f.a(java.lang.Integer.valueOf(this.f158277e), java.lang.Integer.valueOf(iVar.f158277e)) && n51.f.a(java.lang.Integer.valueOf(this.f158278f), java.lang.Integer.valueOf(iVar.f158278f)) && n51.f.a(java.lang.Boolean.valueOf(this.f158279g), java.lang.Boolean.valueOf(iVar.f158279g)) && n51.f.a(java.lang.Boolean.valueOf(this.f158280h), java.lang.Boolean.valueOf(iVar.f158280h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f158276d);
            fVar.e(2, this.f158277e);
            fVar.e(3, this.f158278f);
            fVar.a(4, this.f158279g);
            fVar.a(5, this.f158280h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f158276d) + 0 + b36.f.e(2, this.f158277e) + b36.f.e(3, this.f158278f) + b36.f.a(4, this.f158279g) + b36.f.a(5, this.f158280h);
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
        com.tencent.mm.plugin.report.service.i iVar = (com.tencent.mm.plugin.report.service.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f158276d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            iVar.f158277e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            iVar.f158278f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            iVar.f158279g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        iVar.f158280h = aVar2.c(intValue);
        return 0;
    }
}
