package r45;

/* loaded from: classes9.dex */
public class p55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382770d;

    /* renamed from: e, reason: collision with root package name */
    public int f382771e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f382772f;

    /* renamed from: g, reason: collision with root package name */
    public int f382773g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f382774h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p55)) {
            return false;
        }
        r45.p55 p55Var = (r45.p55) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382770d), java.lang.Integer.valueOf(p55Var.f382770d)) && n51.f.a(java.lang.Integer.valueOf(this.f382771e), java.lang.Integer.valueOf(p55Var.f382771e)) && n51.f.a(this.f382772f, p55Var.f382772f) && n51.f.a(java.lang.Integer.valueOf(this.f382773g), java.lang.Integer.valueOf(p55Var.f382773g)) && n51.f.a(this.f382774h, p55Var.f382774h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382770d);
            fVar.e(2, this.f382771e);
            r45.cu5 cu5Var = this.f382772f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f382772f.writeFields(fVar);
            }
            fVar.e(4, this.f382773g);
            r45.cu5 cu5Var2 = this.f382774h;
            if (cu5Var2 != null) {
                fVar.i(5, cu5Var2.computeSize());
                this.f382774h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382770d) + 0 + b36.f.e(2, this.f382771e);
            r45.cu5 cu5Var3 = this.f382772f;
            if (cu5Var3 != null) {
                e17 += b36.f.i(3, cu5Var3.computeSize());
            }
            int e18 = e17 + b36.f.e(4, this.f382773g);
            r45.cu5 cu5Var4 = this.f382774h;
            return cu5Var4 != null ? e18 + b36.f.i(5, cu5Var4.computeSize()) : e18;
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
        r45.p55 p55Var = (r45.p55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p55Var.f382770d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p55Var.f382771e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.cu5 cu5Var5 = new r45.cu5();
                if (bArr != null && bArr.length > 0) {
                    cu5Var5.b(bArr);
                }
                p55Var.f382772f = cu5Var5;
            }
            return 0;
        }
        if (intValue == 4) {
            p55Var.f382773g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.cu5 cu5Var6 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var6.b(bArr2);
            }
            p55Var.f382774h = cu5Var6;
        }
        return 0;
    }
}
