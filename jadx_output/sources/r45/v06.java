package r45;

/* loaded from: classes11.dex */
public class v06 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public r45.w06 f387789h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f387785d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f387786e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f387787f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f387788g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f387790i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v06)) {
            return false;
        }
        r45.v06 v06Var = (r45.v06) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f387785d), java.lang.Boolean.valueOf(v06Var.f387785d)) && n51.f.a(java.lang.Boolean.valueOf(this.f387786e), java.lang.Boolean.valueOf(v06Var.f387786e)) && n51.f.a(this.f387787f, v06Var.f387787f) && n51.f.a(this.f387788g, v06Var.f387788g) && n51.f.a(this.f387789h, v06Var.f387789h) && n51.f.a(this.f387790i, v06Var.f387790i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387790i;
        java.util.LinkedList linkedList2 = this.f387788g;
        java.util.LinkedList linkedList3 = this.f387787f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f387785d);
            fVar.a(2, this.f387786e);
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 8, linkedList2);
            r45.w06 w06Var = this.f387789h;
            if (w06Var != null) {
                fVar.i(5, w06Var.computeSize());
                this.f387789h.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f387785d) + 0 + b36.f.a(2, this.f387786e) + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 8, linkedList2);
            r45.w06 w06Var2 = this.f387789h;
            if (w06Var2 != null) {
                a17 += b36.f.i(5, w06Var2.computeSize());
            }
            return a17 + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.v06 v06Var = (r45.v06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v06Var.f387785d = aVar2.c(intValue);
                return 0;
            case 2:
                v06Var.f387786e = aVar2.c(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.x06 x06Var = new r45.x06();
                    if (bArr2 != null && bArr2.length > 0) {
                        x06Var.parseFrom(bArr2);
                    }
                    v06Var.f387787f.add(x06Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.u06 u06Var = new r45.u06();
                    if (bArr3 != null && bArr3.length > 0) {
                        u06Var.parseFrom(bArr3);
                    }
                    v06Var.f387788g.add(u06Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.w06 w06Var3 = new r45.w06();
                    if (bArr4 != null && bArr4.length > 0) {
                        w06Var3.parseFrom(bArr4);
                    }
                    v06Var.f387789h = w06Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.z06 z06Var = new r45.z06();
                    if (bArr5 != null && bArr5.length > 0) {
                        z06Var.parseFrom(bArr5);
                    }
                    v06Var.f387790i.add(z06Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
