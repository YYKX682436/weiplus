package r45;

/* loaded from: classes2.dex */
public class u96 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387158d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ac6 f387159e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bi5 f387160f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ad0 f387161g;

    /* renamed from: h, reason: collision with root package name */
    public r45.xb5 f387162h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u96)) {
            return false;
        }
        r45.u96 u96Var = (r45.u96) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387158d), java.lang.Integer.valueOf(u96Var.f387158d)) && n51.f.a(this.f387159e, u96Var.f387159e) && n51.f.a(this.f387160f, u96Var.f387160f) && n51.f.a(this.f387161g, u96Var.f387161g) && n51.f.a(this.f387162h, u96Var.f387162h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387158d);
            r45.ac6 ac6Var = this.f387159e;
            if (ac6Var != null) {
                fVar.i(2, ac6Var.computeSize());
                this.f387159e.writeFields(fVar);
            }
            r45.bi5 bi5Var = this.f387160f;
            if (bi5Var != null) {
                fVar.i(3, bi5Var.computeSize());
                this.f387160f.writeFields(fVar);
            }
            r45.ad0 ad0Var = this.f387161g;
            if (ad0Var != null) {
                fVar.i(4, ad0Var.computeSize());
                this.f387161g.writeFields(fVar);
            }
            r45.xb5 xb5Var = this.f387162h;
            if (xb5Var != null) {
                fVar.i(5, xb5Var.computeSize());
                this.f387162h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387158d) + 0;
            r45.ac6 ac6Var2 = this.f387159e;
            if (ac6Var2 != null) {
                e17 += b36.f.i(2, ac6Var2.computeSize());
            }
            r45.bi5 bi5Var2 = this.f387160f;
            if (bi5Var2 != null) {
                e17 += b36.f.i(3, bi5Var2.computeSize());
            }
            r45.ad0 ad0Var2 = this.f387161g;
            if (ad0Var2 != null) {
                e17 += b36.f.i(4, ad0Var2.computeSize());
            }
            r45.xb5 xb5Var2 = this.f387162h;
            return xb5Var2 != null ? e17 + b36.f.i(5, xb5Var2.computeSize()) : e17;
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
        r45.u96 u96Var = (r45.u96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u96Var.f387158d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ac6 ac6Var3 = new r45.ac6();
                if (bArr != null && bArr.length > 0) {
                    ac6Var3.parseFrom(bArr);
                }
                u96Var.f387159e = ac6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.bi5 bi5Var3 = new r45.bi5();
                if (bArr2 != null && bArr2.length > 0) {
                    bi5Var3.parseFrom(bArr2);
                }
                u96Var.f387160f = bi5Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                r45.ad0 ad0Var3 = new r45.ad0();
                if (bArr3 != null && bArr3.length > 0) {
                    ad0Var3.parseFrom(bArr3);
                }
                u96Var.f387161g = ad0Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            r45.xb5 xb5Var3 = new r45.xb5();
            if (bArr4 != null && bArr4.length > 0) {
                xb5Var3.parseFrom(bArr4);
            }
            u96Var.f387162h = xb5Var3;
        }
        return 0;
    }
}
