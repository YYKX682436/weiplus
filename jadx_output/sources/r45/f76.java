package r45;

/* loaded from: classes4.dex */
public class f76 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f374076d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f374077e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f374078f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f374079g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f374080h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f76)) {
            return false;
        }
        r45.f76 f76Var = (r45.f76) fVar;
        return n51.f.a(this.f374076d, f76Var.f374076d) && n51.f.a(this.f374077e, f76Var.f374077e) && n51.f.a(this.f374078f, f76Var.f374078f) && n51.f.a(this.f374079g, f76Var.f374079g) && n51.f.a(this.f374080h, f76Var.f374080h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f374076d;
            if (snsObject != null) {
                fVar.i(1, snsObject.computeSize());
                this.f374076d.writeFields(fVar);
            }
            r45.du5 du5Var = this.f374077e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f374077e.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f374078f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.computeSize());
                this.f374078f.writeFields(fVar);
            }
            r45.du5 du5Var3 = this.f374079g;
            if (du5Var3 != null) {
                fVar.i(4, du5Var3.computeSize());
                this.f374079g.writeFields(fVar);
            }
            r45.du5 du5Var4 = this.f374080h;
            if (du5Var4 != null) {
                fVar.i(5, du5Var4.computeSize());
                this.f374080h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = this.f374076d;
            int i18 = snsObject2 != null ? 0 + b36.f.i(1, snsObject2.computeSize()) : 0;
            r45.du5 du5Var5 = this.f374077e;
            if (du5Var5 != null) {
                i18 += b36.f.i(2, du5Var5.computeSize());
            }
            r45.du5 du5Var6 = this.f374078f;
            if (du5Var6 != null) {
                i18 += b36.f.i(3, du5Var6.computeSize());
            }
            r45.du5 du5Var7 = this.f374079g;
            if (du5Var7 != null) {
                i18 += b36.f.i(4, du5Var7.computeSize());
            }
            r45.du5 du5Var8 = this.f374080h;
            return du5Var8 != null ? i18 + b36.f.i(5, du5Var8.computeSize()) : i18;
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
        r45.f76 f76Var = (r45.f76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.mm.protocal.protobuf.SnsObject snsObject3 = new com.tencent.mm.protocal.protobuf.SnsObject();
                if (bArr != null && bArr.length > 0) {
                    snsObject3.parseFrom(bArr);
                }
                f76Var.f374076d = snsObject3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.du5 du5Var9 = new r45.du5();
                if (bArr2 != null && bArr2.length > 0) {
                    du5Var9.b(bArr2);
                }
                f76Var.f374077e = du5Var9;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.du5 du5Var10 = new r45.du5();
                if (bArr3 != null && bArr3.length > 0) {
                    du5Var10.b(bArr3);
                }
                f76Var.f374078f = du5Var10;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.du5 du5Var11 = new r45.du5();
                if (bArr4 != null && bArr4.length > 0) {
                    du5Var11.b(bArr4);
                }
                f76Var.f374079g = du5Var11;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.du5 du5Var12 = new r45.du5();
            if (bArr5 != null && bArr5.length > 0) {
                du5Var12.b(bArr5);
            }
            f76Var.f374080h = du5Var12;
        }
        return 0;
    }
}
