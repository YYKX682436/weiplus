package r45;

/* loaded from: classes8.dex */
public class lq0 extends com.tencent.mm.protobuf.f implements r45.k66 {

    /* renamed from: d, reason: collision with root package name */
    public int f379716d;

    /* renamed from: e, reason: collision with root package name */
    public r45.c50 f379717e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f379718f;

    /* renamed from: g, reason: collision with root package name */
    public int f379719g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lq0)) {
            return false;
        }
        r45.lq0 lq0Var = (r45.lq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379716d), java.lang.Integer.valueOf(lq0Var.f379716d)) && n51.f.a(this.f379717e, lq0Var.f379717e) && n51.f.a(this.f379718f, lq0Var.f379718f) && n51.f.a(java.lang.Integer.valueOf(this.f379719g), java.lang.Integer.valueOf(lq0Var.f379719g));
    }

    @Override // r45.k66
    public final int getRet() {
        return this.f379716d;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379716d);
            r45.c50 c50Var = this.f379717e;
            if (c50Var != null) {
                fVar.i(2, c50Var.computeSize());
                this.f379717e.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f379718f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f379718f.writeFields(fVar);
            }
            fVar.e(4, this.f379719g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379716d) + 0;
            r45.c50 c50Var2 = this.f379717e;
            if (c50Var2 != null) {
                e17 += b36.f.i(2, c50Var2.computeSize());
            }
            r45.cu5 cu5Var2 = this.f379718f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(3, cu5Var2.computeSize());
            }
            return e17 + b36.f.e(4, this.f379719g);
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
        r45.lq0 lq0Var = (r45.lq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lq0Var.f379716d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.c50 c50Var3 = new r45.c50();
                if (bArr != null && bArr.length > 0) {
                    c50Var3.parseFrom(bArr);
                }
                lq0Var.f379717e = c50Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            lq0Var.f379719g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            lq0Var.f379718f = cu5Var3;
        }
        return 0;
    }
}
