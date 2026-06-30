package r45;

/* loaded from: classes2.dex */
public class gj2 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public r45.dg4 f375295e;

    /* renamed from: g, reason: collision with root package name */
    public r45.qb1 f375297g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f375294d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f375296f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gj2)) {
            return false;
        }
        r45.gj2 gj2Var = (r45.gj2) fVar;
        return n51.f.a(this.f375294d, gj2Var.f375294d) && n51.f.a(this.f375295e, gj2Var.f375295e) && n51.f.a(this.f375296f, gj2Var.f375296f) && n51.f.a(this.f375297g, gj2Var.f375297g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375296f;
        java.util.LinkedList linkedList2 = this.f375294d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            r45.dg4 dg4Var = this.f375295e;
            if (dg4Var != null) {
                fVar.i(2, dg4Var.computeSize());
                this.f375295e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            r45.qb1 qb1Var = this.f375297g;
            if (qb1Var != null) {
                fVar.i(4, qb1Var.computeSize());
                this.f375297g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            r45.dg4 dg4Var2 = this.f375295e;
            if (dg4Var2 != null) {
                g17 += b36.f.i(2, dg4Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(3, 8, linkedList);
            r45.qb1 qb1Var2 = this.f375297g;
            return qb1Var2 != null ? g18 + b36.f.i(4, qb1Var2.computeSize()) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.gj2 gj2Var = (r45.gj2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ig4 ig4Var = new r45.ig4();
                if (bArr2 != null && bArr2.length > 0) {
                    ig4Var.parseFrom(bArr2);
                }
                gj2Var.f375294d.add(ig4Var);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.dg4 dg4Var3 = new r45.dg4();
                if (bArr3 != null && bArr3.length > 0) {
                    dg4Var3.parseFrom(bArr3);
                }
                gj2Var.f375295e = dg4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr4 = (byte[]) j19.get(i27);
                r45.dg4 dg4Var4 = new r45.dg4();
                if (bArr4 != null && bArr4.length > 0) {
                    dg4Var4.parseFrom(bArr4);
                }
                gj2Var.f375296f.add(dg4Var4);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr5 = (byte[]) j27.get(i28);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr5 != null && bArr5.length > 0) {
                qb1Var3.parseFrom(bArr5);
            }
            gj2Var.f375297g = qb1Var3;
        }
        return 0;
    }
}
