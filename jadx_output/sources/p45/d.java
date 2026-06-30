package p45;

/* loaded from: classes14.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351890d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f351891e;

    /* renamed from: f, reason: collision with root package name */
    public int f351892f;

    /* renamed from: g, reason: collision with root package name */
    public int f351893g;

    /* renamed from: h, reason: collision with root package name */
    public int f351894h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.d)) {
            return false;
        }
        p45.d dVar = (p45.d) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351890d), java.lang.Integer.valueOf(dVar.f351890d)) && n51.f.a(this.f351891e, dVar.f351891e) && n51.f.a(java.lang.Integer.valueOf(this.f351892f), java.lang.Integer.valueOf(dVar.f351892f)) && n51.f.a(java.lang.Integer.valueOf(this.f351893g), java.lang.Integer.valueOf(dVar.f351893g)) && n51.f.a(java.lang.Integer.valueOf(this.f351894h), java.lang.Integer.valueOf(dVar.f351894h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351890d);
            com.tencent.mm.protobuf.g gVar = this.f351891e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f351892f);
            fVar.e(4, this.f351893g);
            fVar.e(5, this.f351894h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351890d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f351891e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.e(3, this.f351892f) + b36.f.e(4, this.f351893g) + b36.f.e(5, this.f351894h);
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
        p45.d dVar = (p45.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dVar.f351890d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            dVar.f351891e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            dVar.f351892f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            dVar.f351893g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        dVar.f351894h = aVar2.g(intValue);
        return 0;
    }
}
