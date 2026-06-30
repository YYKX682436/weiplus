package r45;

/* loaded from: classes4.dex */
public class tr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386719d;

    /* renamed from: e, reason: collision with root package name */
    public int f386720e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386721f;

    /* renamed from: g, reason: collision with root package name */
    public int f386722g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tr)) {
            return false;
        }
        r45.tr trVar = (r45.tr) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386719d), java.lang.Integer.valueOf(trVar.f386719d)) && n51.f.a(java.lang.Integer.valueOf(this.f386720e), java.lang.Integer.valueOf(trVar.f386720e)) && n51.f.a(this.f386721f, trVar.f386721f) && n51.f.a(java.lang.Integer.valueOf(this.f386722g), java.lang.Integer.valueOf(trVar.f386722g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386719d);
            fVar.e(2, this.f386720e);
            com.tencent.mm.protobuf.g gVar = this.f386721f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f386722g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386719d) + 0 + b36.f.e(2, this.f386720e);
            com.tencent.mm.protobuf.g gVar2 = this.f386721f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            return e17 + b36.f.e(4, this.f386722g);
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
        r45.tr trVar = (r45.tr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            trVar.f386719d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            trVar.f386720e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            trVar.f386721f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        trVar.f386722g = aVar2.g(intValue);
        return 0;
    }
}
