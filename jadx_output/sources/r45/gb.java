package r45;

/* loaded from: classes2.dex */
public class gb extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f375065d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375066e;

    /* renamed from: f, reason: collision with root package name */
    public float f375067f;

    /* renamed from: g, reason: collision with root package name */
    public float f375068g;

    /* renamed from: h, reason: collision with root package name */
    public long f375069h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gb)) {
            return false;
        }
        r45.gb gbVar = (r45.gb) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f375065d), java.lang.Float.valueOf(gbVar.f375065d)) && n51.f.a(this.f375066e, gbVar.f375066e) && n51.f.a(java.lang.Float.valueOf(this.f375067f), java.lang.Float.valueOf(gbVar.f375067f)) && n51.f.a(java.lang.Float.valueOf(this.f375068g), java.lang.Float.valueOf(gbVar.f375068g)) && n51.f.a(java.lang.Long.valueOf(this.f375069h), java.lang.Long.valueOf(gbVar.f375069h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f375065d);
            com.tencent.mm.protobuf.g gVar = this.f375066e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.d(3, this.f375067f);
            fVar.d(4, this.f375068g);
            fVar.h(5, this.f375069h);
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f375065d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f375066e;
            if (gVar2 != null) {
                d17 += b36.f.b(2, gVar2);
            }
            return d17 + b36.f.d(3, this.f375067f) + b36.f.d(4, this.f375068g) + b36.f.h(5, this.f375069h);
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
        r45.gb gbVar = (r45.gb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gbVar.f375065d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            gbVar.f375066e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            gbVar.f375067f = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            gbVar.f375068g = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        gbVar.f375069h = aVar2.i(intValue);
        return 0;
    }
}
