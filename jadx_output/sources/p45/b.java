package p45;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351879d;

    /* renamed from: e, reason: collision with root package name */
    public int f351880e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f351881f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f351882g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.b)) {
            return false;
        }
        p45.b bVar = (p45.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351879d), java.lang.Integer.valueOf(bVar.f351879d)) && n51.f.a(java.lang.Integer.valueOf(this.f351880e), java.lang.Integer.valueOf(bVar.f351880e)) && n51.f.a(this.f351881f, bVar.f351881f) && n51.f.a(java.lang.Integer.valueOf(this.f351882g), java.lang.Integer.valueOf(bVar.f351882g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f351881f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351879d);
            fVar.e(2, this.f351880e);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f351882g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f351879d) + 0 + b36.f.e(2, this.f351880e) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f351882g);
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
        p45.b bVar = (p45.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f351879d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bVar.f351880e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            bVar.f351882g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            p45.a aVar3 = new p45.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar3.parseFrom(bArr2);
            }
            bVar.f351881f.add(aVar3);
        }
        return 0;
    }
}
