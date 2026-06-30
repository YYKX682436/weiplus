package r45;

/* loaded from: classes2.dex */
public class o25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.pc5 f381848d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f381849e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381850f;

    /* renamed from: g, reason: collision with root package name */
    public r45.rl6 f381851g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o25)) {
            return false;
        }
        r45.o25 o25Var = (r45.o25) fVar;
        return n51.f.a(this.f381848d, o25Var.f381848d) && n51.f.a(this.f381849e, o25Var.f381849e) && n51.f.a(this.f381850f, o25Var.f381850f) && n51.f.a(this.f381851g, o25Var.f381851g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381849e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.pc5 pc5Var = this.f381848d;
            if (pc5Var != null) {
                fVar.i(1, pc5Var.computeSize());
                this.f381848d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f381850f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.rl6 rl6Var = this.f381851g;
            if (rl6Var != null) {
                fVar.i(4, rl6Var.computeSize());
                this.f381851g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.pc5 pc5Var2 = this.f381848d;
            int i18 = (pc5Var2 != null ? 0 + b36.f.i(1, pc5Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f381850f;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.rl6 rl6Var2 = this.f381851g;
            return rl6Var2 != null ? i18 + b36.f.i(4, rl6Var2.computeSize()) : i18;
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
        r45.o25 o25Var = (r45.o25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.pc5 pc5Var3 = new r45.pc5();
                if (bArr2 != null && bArr2.length > 0) {
                    pc5Var3.parseFrom(bArr2);
                }
                o25Var.f381848d = pc5Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.o66 o66Var = new r45.o66();
                if (bArr3 != null && bArr3.length > 0) {
                    o66Var.parseFrom(bArr3);
                }
                o25Var.f381849e.add(o66Var);
            }
            return 0;
        }
        if (intValue == 3) {
            o25Var.f381850f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.rl6 rl6Var3 = new r45.rl6();
            if (bArr4 != null && bArr4.length > 0) {
                rl6Var3.parseFrom(bArr4);
            }
            o25Var.f381851g = rl6Var3;
        }
        return 0;
    }
}
