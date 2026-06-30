package r45;

/* loaded from: classes2.dex */
public class e90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373147d;

    /* renamed from: e, reason: collision with root package name */
    public r45.os5 f373148e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yt5 f373149f;

    /* renamed from: g, reason: collision with root package name */
    public r45.a50 f373150g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f373151h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e90)) {
            return false;
        }
        r45.e90 e90Var = (r45.e90) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373147d), java.lang.Integer.valueOf(e90Var.f373147d)) && n51.f.a(this.f373148e, e90Var.f373148e) && n51.f.a(this.f373149f, e90Var.f373149f) && n51.f.a(this.f373150g, e90Var.f373150g) && n51.f.a(this.f373151h, e90Var.f373151h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373151h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373147d);
            r45.os5 os5Var = this.f373148e;
            if (os5Var != null) {
                fVar.i(2, os5Var.computeSize());
                this.f373148e.writeFields(fVar);
            }
            r45.yt5 yt5Var = this.f373149f;
            if (yt5Var != null) {
                fVar.i(3, yt5Var.computeSize());
                this.f373149f.writeFields(fVar);
            }
            r45.a50 a50Var = this.f373150g;
            if (a50Var != null) {
                fVar.i(4, a50Var.computeSize());
                this.f373150g.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373147d) + 0;
            r45.os5 os5Var2 = this.f373148e;
            if (os5Var2 != null) {
                e17 += b36.f.i(2, os5Var2.computeSize());
            }
            r45.yt5 yt5Var2 = this.f373149f;
            if (yt5Var2 != null) {
                e17 += b36.f.i(3, yt5Var2.computeSize());
            }
            r45.a50 a50Var2 = this.f373150g;
            if (a50Var2 != null) {
                e17 += b36.f.i(4, a50Var2.computeSize());
            }
            return e17 + b36.f.g(5, 8, linkedList);
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
        r45.e90 e90Var = (r45.e90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e90Var.f373147d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.os5 os5Var3 = new r45.os5();
                if (bArr2 != null && bArr2.length > 0) {
                    os5Var3.parseFrom(bArr2);
                }
                e90Var.f373148e = os5Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.yt5 yt5Var3 = new r45.yt5();
                if (bArr3 != null && bArr3.length > 0) {
                    yt5Var3.parseFrom(bArr3);
                }
                e90Var.f373149f = yt5Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr4 = (byte[]) j19.get(i27);
                r45.a50 a50Var3 = new r45.a50();
                if (bArr4 != null && bArr4.length > 0) {
                    a50Var3.parseFrom(bArr4);
                }
                e90Var.f373150g = a50Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr5 = (byte[]) j27.get(i28);
            r45.a50 a50Var4 = new r45.a50();
            if (bArr5 != null && bArr5.length > 0) {
                a50Var4.parseFrom(bArr5);
            }
            e90Var.f373151h.add(a50Var4);
        }
        return 0;
    }
}
