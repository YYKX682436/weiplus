package r45;

/* loaded from: classes7.dex */
public class vv0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ug4 f388599d;

    /* renamed from: e, reason: collision with root package name */
    public int f388600e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f388601f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f388602g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f388603h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vv0)) {
            return false;
        }
        r45.vv0 vv0Var = (r45.vv0) fVar;
        return n51.f.a(this.f388599d, vv0Var.f388599d) && n51.f.a(java.lang.Integer.valueOf(this.f388600e), java.lang.Integer.valueOf(vv0Var.f388600e)) && n51.f.a(this.f388601f, vv0Var.f388601f) && n51.f.a(java.lang.Boolean.valueOf(this.f388602g), java.lang.Boolean.valueOf(vv0Var.f388602g)) && n51.f.a(java.lang.Boolean.valueOf(this.f388603h), java.lang.Boolean.valueOf(vv0Var.f388603h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ug4 ug4Var = this.f388599d;
            if (ug4Var != null) {
                fVar.i(1, ug4Var.computeSize());
                this.f388599d.writeFields(fVar);
            }
            fVar.e(2, this.f388600e);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f388601f;
            if (finderObject != null) {
                fVar.i(3, finderObject.computeSize());
                this.f388601f.writeFields(fVar);
            }
            fVar.a(4, this.f388602g);
            fVar.a(5, this.f388603h);
            return 0;
        }
        if (i17 == 1) {
            r45.ug4 ug4Var2 = this.f388599d;
            int i18 = (ug4Var2 != null ? 0 + b36.f.i(1, ug4Var2.computeSize()) : 0) + b36.f.e(2, this.f388600e);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f388601f;
            if (finderObject2 != null) {
                i18 += b36.f.i(3, finderObject2.computeSize());
            }
            return i18 + b36.f.a(4, this.f388602g) + b36.f.a(5, this.f388603h);
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
        r45.vv0 vv0Var = (r45.vv0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ug4 ug4Var3 = new r45.ug4();
                if (bArr != null && bArr.length > 0) {
                    ug4Var3.parseFrom(bArr);
                }
                vv0Var.f388599d = ug4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            vv0Var.f388600e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                vv0Var.f388602g = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            vv0Var.f388603h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = new com.tencent.mm.protocal.protobuf.FinderObject();
            if (bArr2 != null && bArr2.length > 0) {
                finderObject3.parseFrom(bArr2);
            }
            vv0Var.f388601f = finderObject3;
        }
        return 0;
    }
}
