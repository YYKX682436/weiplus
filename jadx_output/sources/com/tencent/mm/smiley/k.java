package com.tencent.mm.smiley;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f193294d;

    /* renamed from: e, reason: collision with root package name */
    public int f193295e;

    /* renamed from: f, reason: collision with root package name */
    public int f193296f;

    /* renamed from: g, reason: collision with root package name */
    public int f193297g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f193298h;

    /* renamed from: i, reason: collision with root package name */
    public int f193299i;

    /* renamed from: m, reason: collision with root package name */
    public int f193300m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.smiley.k)) {
            return false;
        }
        com.tencent.mm.smiley.k kVar = (com.tencent.mm.smiley.k) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f193294d), java.lang.Integer.valueOf(kVar.f193294d)) && n51.f.a(java.lang.Integer.valueOf(this.f193295e), java.lang.Integer.valueOf(kVar.f193295e)) && n51.f.a(java.lang.Integer.valueOf(this.f193296f), java.lang.Integer.valueOf(kVar.f193296f)) && n51.f.a(java.lang.Integer.valueOf(this.f193297g), java.lang.Integer.valueOf(kVar.f193297g)) && n51.f.a(java.lang.Integer.valueOf(this.f193298h), java.lang.Integer.valueOf(kVar.f193298h)) && n51.f.a(java.lang.Integer.valueOf(this.f193299i), java.lang.Integer.valueOf(kVar.f193299i)) && n51.f.a(java.lang.Integer.valueOf(this.f193300m), java.lang.Integer.valueOf(kVar.f193300m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f193294d);
            fVar.e(2, this.f193295e);
            fVar.e(3, this.f193296f);
            fVar.e(41, this.f193297g);
            fVar.e(5, this.f193298h);
            fVar.e(6, this.f193299i);
            fVar.e(7, this.f193300m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f193294d) + 0 + b36.f.e(2, this.f193295e) + b36.f.e(3, this.f193296f) + b36.f.e(41, this.f193297g) + b36.f.e(5, this.f193298h) + b36.f.e(6, this.f193299i) + b36.f.e(7, this.f193300m);
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
        com.tencent.mm.smiley.k kVar = (com.tencent.mm.smiley.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kVar.f193294d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            kVar.f193295e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            kVar.f193296f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            kVar.f193298h = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 6) {
            kVar.f193299i = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 7) {
            kVar.f193300m = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 41) {
            return -1;
        }
        kVar.f193297g = aVar2.g(intValue);
        return 0;
    }
}
