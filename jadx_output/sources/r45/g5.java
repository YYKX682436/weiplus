package r45;

/* loaded from: classes4.dex */
public class g5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.f76 f374885d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f374886e;

    /* renamed from: f, reason: collision with root package name */
    public int f374887f;

    /* renamed from: g, reason: collision with root package name */
    public r45.mo5 f374888g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g5)) {
            return false;
        }
        r45.g5 g5Var = (r45.g5) fVar;
        return n51.f.a(this.f374885d, g5Var.f374885d) && n51.f.a(this.f374886e, g5Var.f374886e) && n51.f.a(java.lang.Integer.valueOf(this.f374887f), java.lang.Integer.valueOf(g5Var.f374887f)) && n51.f.a(this.f374888g, g5Var.f374888g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.f76 f76Var = this.f374885d;
            if (f76Var != null) {
                fVar.i(1, f76Var.computeSize());
                this.f374885d.writeFields(fVar);
            }
            r45.du5 du5Var = this.f374886e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f374886e.writeFields(fVar);
            }
            fVar.e(3, this.f374887f);
            r45.mo5 mo5Var = this.f374888g;
            if (mo5Var != null) {
                fVar.i(4, mo5Var.computeSize());
                this.f374888g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.f76 f76Var2 = this.f374885d;
            int i18 = f76Var2 != null ? 0 + b36.f.i(1, f76Var2.computeSize()) : 0;
            r45.du5 du5Var2 = this.f374886e;
            if (du5Var2 != null) {
                i18 += b36.f.i(2, du5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f374887f);
            r45.mo5 mo5Var2 = this.f374888g;
            return mo5Var2 != null ? e17 + b36.f.i(4, mo5Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.g5 g5Var = (r45.g5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.f76 f76Var3 = new r45.f76();
                if (bArr != null && bArr.length > 0) {
                    f76Var3.parseFrom(bArr);
                }
                g5Var.f374885d = f76Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.du5 du5Var3 = new r45.du5();
                if (bArr2 != null && bArr2.length > 0) {
                    du5Var3.b(bArr2);
                }
                g5Var.f374886e = du5Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            g5Var.f374887f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.mo5 mo5Var3 = new r45.mo5();
            if (bArr3 != null && bArr3.length > 0) {
                mo5Var3.parseFrom(bArr3);
            }
            g5Var.f374888g = mo5Var3;
        }
        return 0;
    }
}
