package r45;

/* loaded from: classes9.dex */
public class b80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f370622d;

    /* renamed from: e, reason: collision with root package name */
    public long f370623e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f370624f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f370625g;

    /* renamed from: h, reason: collision with root package name */
    public int f370626h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b80)) {
            return false;
        }
        r45.b80 b80Var = (r45.b80) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f370622d), java.lang.Long.valueOf(b80Var.f370622d)) && n51.f.a(java.lang.Long.valueOf(this.f370623e), java.lang.Long.valueOf(b80Var.f370623e)) && n51.f.a(this.f370624f, b80Var.f370624f) && n51.f.a(java.lang.Integer.valueOf(this.f370625g), java.lang.Integer.valueOf(b80Var.f370625g)) && n51.f.a(java.lang.Integer.valueOf(this.f370626h), java.lang.Integer.valueOf(b80Var.f370626h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370624f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f370622d);
            fVar.h(2, this.f370623e);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f370625g);
            fVar.e(5, this.f370626h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f370622d) + 0 + b36.f.h(2, this.f370623e) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f370625g) + b36.f.e(5, this.f370626h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.b80 b80Var = (r45.b80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b80Var.f370622d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            b80Var.f370623e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                b80Var.f370625g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            b80Var.f370626h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.a80 a80Var = new r45.a80();
            if (bArr2 != null && bArr2.length > 0) {
                a80Var.parseFrom(bArr2);
            }
            b80Var.f370624f.add(a80Var);
        }
        return 0;
    }
}
