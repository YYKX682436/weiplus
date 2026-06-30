package r45;

/* loaded from: classes2.dex */
public class gk4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f375315d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f375316e;

    /* renamed from: f, reason: collision with root package name */
    public int f375317f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375318g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gk4)) {
            return false;
        }
        r45.gk4 gk4Var = (r45.gk4) fVar;
        return n51.f.a(this.f375315d, gk4Var.f375315d) && n51.f.a(java.lang.Integer.valueOf(this.f375316e), java.lang.Integer.valueOf(gk4Var.f375316e)) && n51.f.a(java.lang.Integer.valueOf(this.f375317f), java.lang.Integer.valueOf(gk4Var.f375317f)) && n51.f.a(this.f375318g, gk4Var.f375318g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375315d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f375316e);
            fVar.e(3, this.f375317f);
            com.tencent.mm.protobuf.g gVar = this.f375318g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f375316e) + b36.f.e(3, this.f375317f);
            com.tencent.mm.protobuf.g gVar2 = this.f375318g;
            return gVar2 != null ? g17 + b36.f.b(4, gVar2) : g17;
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
        r45.gk4 gk4Var = (r45.gk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                gk4Var.f375316e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                gk4Var.f375317f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            gk4Var.f375318g = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.vx0 vx0Var = new r45.vx0();
            if (bArr2 != null && bArr2.length > 0) {
                vx0Var.parseFrom(bArr2);
            }
            gk4Var.f375315d.add(vx0Var);
        }
        return 0;
    }
}
