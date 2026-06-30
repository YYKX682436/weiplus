package r45;

/* loaded from: classes4.dex */
public class e44 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373007d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373008e;

    /* renamed from: f, reason: collision with root package name */
    public int f373009f;

    /* renamed from: g, reason: collision with root package name */
    public int f373010g;

    /* renamed from: h, reason: collision with root package name */
    public int f373011h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e44)) {
            return false;
        }
        r45.e44 e44Var = (r45.e44) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373007d), java.lang.Integer.valueOf(e44Var.f373007d)) && n51.f.a(this.f373008e, e44Var.f373008e) && n51.f.a(java.lang.Integer.valueOf(this.f373009f), java.lang.Integer.valueOf(e44Var.f373009f)) && n51.f.a(java.lang.Integer.valueOf(this.f373010g), java.lang.Integer.valueOf(e44Var.f373010g)) && n51.f.a(java.lang.Integer.valueOf(this.f373011h), java.lang.Integer.valueOf(e44Var.f373011h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373007d);
            com.tencent.mm.protobuf.g gVar = this.f373008e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f373009f);
            fVar.e(4, this.f373010g);
            fVar.e(5, this.f373011h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373007d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f373008e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.e(3, this.f373009f) + b36.f.e(4, this.f373010g) + b36.f.e(5, this.f373011h);
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
        r45.e44 e44Var = (r45.e44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e44Var.f373007d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            e44Var.f373008e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            e44Var.f373009f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            e44Var.f373010g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        e44Var.f373011h = aVar2.g(intValue);
        return 0;
    }
}
