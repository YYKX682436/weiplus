package r45;

/* loaded from: classes2.dex */
public class e14 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f372903d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372904e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.rl6 f372905f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372906g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e14)) {
            return false;
        }
        r45.e14 e14Var = (r45.e14) fVar;
        return n51.f.a(this.f372903d, e14Var.f372903d) && n51.f.a(this.f372904e, e14Var.f372904e) && n51.f.a(this.f372905f, e14Var.f372905f) && n51.f.a(this.f372906g, e14Var.f372906g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372904e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f372903d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.computeSize());
                this.f372903d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.rl6 rl6Var2 = this.f372905f;
            if (rl6Var2 != null) {
                fVar.i(3, rl6Var2.computeSize());
                this.f372905f.writeFields(fVar);
            }
            java.lang.String str = this.f372906g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var3 = this.f372903d;
            int i18 = (rl6Var3 != null ? 0 + b36.f.i(1, rl6Var3.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            r45.rl6 rl6Var4 = this.f372905f;
            if (rl6Var4 != null) {
                i18 += b36.f.i(3, rl6Var4.computeSize());
            }
            java.lang.String str2 = this.f372906g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.e14 e14Var = (r45.e14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.rl6 rl6Var5 = new r45.rl6();
                if (bArr2 != null && bArr2.length > 0) {
                    rl6Var5.parseFrom(bArr2);
                }
                e14Var.f372903d = rl6Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.xj6 xj6Var = new r45.xj6();
                if (bArr3 != null && bArr3.length > 0) {
                    xj6Var.parseFrom(bArr3);
                }
                e14Var.f372904e.add(xj6Var);
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            e14Var.f372906g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.rl6 rl6Var6 = new r45.rl6();
            if (bArr4 != null && bArr4.length > 0) {
                rl6Var6.parseFrom(bArr4);
            }
            e14Var.f372905f = rl6Var6;
        }
        return 0;
    }
}
