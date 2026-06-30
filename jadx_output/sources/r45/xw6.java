package r45;

/* loaded from: classes4.dex */
public class xw6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390563d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390564e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f390565f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f390566g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xw6)) {
            return false;
        }
        r45.xw6 xw6Var = (r45.xw6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390563d), java.lang.Integer.valueOf(xw6Var.f390563d)) && n51.f.a(this.f390564e, xw6Var.f390564e) && n51.f.a(this.f390565f, xw6Var.f390565f) && n51.f.a(this.f390566g, xw6Var.f390566g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390563d);
            java.lang.String str = this.f390564e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f390565f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f390565f.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f390566g;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.computeSize());
                this.f390566g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390563d) + 0;
            java.lang.String str2 = this.f390564e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.cu5 cu5Var3 = this.f390565f;
            if (cu5Var3 != null) {
                e17 += b36.f.i(3, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f390566g;
            return cu5Var4 != null ? e17 + b36.f.i(4, cu5Var4.computeSize()) : e17;
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
        r45.xw6 xw6Var = (r45.xw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xw6Var.f390563d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xw6Var.f390564e = aVar2.k(intValue);
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
                xw6Var.f390565f = cu5Var5;
            }
            return 0;
        }
        if (intValue != 4) {
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
            xw6Var.f390566g = cu5Var6;
        }
        return 0;
    }
}
