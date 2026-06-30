package r45;

/* loaded from: classes2.dex */
public class t50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386149d;

    /* renamed from: e, reason: collision with root package name */
    public r45.dr0 f386150e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f386151f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t50)) {
            return false;
        }
        r45.t50 t50Var = (r45.t50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386149d), java.lang.Integer.valueOf(t50Var.f386149d)) && n51.f.a(this.f386150e, t50Var.f386150e) && n51.f.a(this.f386151f, t50Var.f386151f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386149d);
            r45.dr0 dr0Var = this.f386150e;
            if (dr0Var != null) {
                fVar.i(2, dr0Var.computeSize());
                this.f386150e.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f386151f;
            if (finderObject != null) {
                fVar.i(3, finderObject.computeSize());
                this.f386151f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386149d) + 0;
            r45.dr0 dr0Var2 = this.f386150e;
            if (dr0Var2 != null) {
                e17 += b36.f.i(2, dr0Var2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f386151f;
            return finderObject2 != null ? e17 + b36.f.i(3, finderObject2.computeSize()) : e17;
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
        r45.t50 t50Var = (r45.t50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t50Var.f386149d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.dr0 dr0Var3 = new r45.dr0();
                if (bArr != null && bArr.length > 0) {
                    dr0Var3.parseFrom(bArr);
                }
                t50Var.f386150e = dr0Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = new com.tencent.mm.protocal.protobuf.FinderObject();
            if (bArr2 != null && bArr2.length > 0) {
                finderObject3.parseFrom(bArr2);
            }
            t50Var.f386151f = finderObject3;
        }
        return 0;
    }
}
