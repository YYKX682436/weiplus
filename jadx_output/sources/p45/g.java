package p45;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351914d;

    /* renamed from: e, reason: collision with root package name */
    public int f351915e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f351916f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f351917g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.g)) {
            return false;
        }
        p45.g gVar = (p45.g) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351914d), java.lang.Integer.valueOf(gVar.f351914d)) && n51.f.a(java.lang.Integer.valueOf(this.f351915e), java.lang.Integer.valueOf(gVar.f351915e)) && n51.f.a(this.f351916f, gVar.f351916f) && n51.f.a(this.f351917g, gVar.f351917g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f351916f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351914d);
            fVar.e(2, this.f351915e);
            fVar.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f351917g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351914d) + 0 + b36.f.e(2, this.f351915e) + b36.f.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f351917g;
            return gVar2 != null ? e17 + b36.f.b(4, gVar2) : e17;
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
        p45.g gVar3 = (p45.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gVar3.f351914d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gVar3.f351915e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            gVar3.f351917g = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            p45.b bVar = new p45.b();
            if (bArr2 != null && bArr2.length > 0) {
                bVar.parseFrom(bArr2);
            }
            gVar3.f351916f.add(bVar);
        }
        return 0;
    }
}
