package p45;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351926d;

    /* renamed from: e, reason: collision with root package name */
    public int f351927e;

    /* renamed from: f, reason: collision with root package name */
    public int f351928f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f351929g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f351930h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.i)) {
            return false;
        }
        p45.i iVar = (p45.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351926d), java.lang.Integer.valueOf(iVar.f351926d)) && n51.f.a(java.lang.Integer.valueOf(this.f351927e), java.lang.Integer.valueOf(iVar.f351927e)) && n51.f.a(java.lang.Integer.valueOf(this.f351928f), java.lang.Integer.valueOf(iVar.f351928f)) && n51.f.a(this.f351929g, iVar.f351929g) && n51.f.a(this.f351930h, iVar.f351930h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f351929g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351926d);
            fVar.e(2, this.f351927e);
            fVar.e(3, this.f351928f);
            fVar.g(4, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f351930h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351926d) + 0 + b36.f.e(2, this.f351927e) + b36.f.e(3, this.f351928f) + b36.f.g(4, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f351930h;
            return gVar2 != null ? e17 + b36.f.b(5, gVar2) : e17;
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
        p45.i iVar = (p45.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f351926d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            iVar.f351927e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            iVar.f351928f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            iVar.f351930h = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            p45.e eVar = new p45.e();
            if (bArr2 != null && bArr2.length > 0) {
                eVar.parseFrom(bArr2);
            }
            iVar.f351929g.add(eVar);
        }
        return 0;
    }
}
