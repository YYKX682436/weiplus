package r45;

/* loaded from: classes9.dex */
public class k64 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378434d = 0;

    /* renamed from: e, reason: collision with root package name */
    public r45.du4 f378435e;

    /* renamed from: f, reason: collision with root package name */
    public r45.m64 f378436f;

    /* renamed from: g, reason: collision with root package name */
    public int f378437g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k64)) {
            return false;
        }
        r45.k64 k64Var = (r45.k64) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378434d), java.lang.Integer.valueOf(k64Var.f378434d)) && n51.f.a(this.f378435e, k64Var.f378435e) && n51.f.a(this.f378436f, k64Var.f378436f) && n51.f.a(java.lang.Integer.valueOf(this.f378437g), java.lang.Integer.valueOf(k64Var.f378437g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378434d);
            r45.du4 du4Var = this.f378435e;
            if (du4Var != null) {
                fVar.i(2, du4Var.computeSize());
                this.f378435e.writeFields(fVar);
            }
            r45.m64 m64Var = this.f378436f;
            if (m64Var != null) {
                fVar.i(3, m64Var.computeSize());
                this.f378436f.writeFields(fVar);
            }
            fVar.e(4, this.f378437g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378434d) + 0;
            r45.du4 du4Var2 = this.f378435e;
            if (du4Var2 != null) {
                e17 += b36.f.i(2, du4Var2.computeSize());
            }
            r45.m64 m64Var2 = this.f378436f;
            if (m64Var2 != null) {
                e17 += b36.f.i(3, m64Var2.computeSize());
            }
            return e17 + b36.f.e(4, this.f378437g);
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
        r45.k64 k64Var = (r45.k64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k64Var.f378434d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.du4 du4Var3 = new r45.du4();
                if (bArr != null && bArr.length > 0) {
                    du4Var3.parseFrom(bArr);
                }
                k64Var.f378435e = du4Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            k64Var.f378437g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.m64 m64Var3 = new r45.m64();
            if (bArr2 != null && bArr2.length > 0) {
                m64Var3.parseFrom(bArr2);
            }
            k64Var.f378436f = m64Var3;
        }
        return 0;
    }
}
