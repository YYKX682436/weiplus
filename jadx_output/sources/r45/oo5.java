package r45;

/* loaded from: classes9.dex */
public class oo5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382398d;

    /* renamed from: e, reason: collision with root package name */
    public r45.n34 f382399e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n34 f382400f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oo5)) {
            return false;
        }
        r45.oo5 oo5Var = (r45.oo5) fVar;
        return n51.f.a(this.f382398d, oo5Var.f382398d) && n51.f.a(this.f382399e, oo5Var.f382399e) && n51.f.a(this.f382400f, oo5Var.f382400f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382398d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.n34 n34Var = this.f382399e;
            if (n34Var != null) {
                fVar.i(2, n34Var.computeSize());
                this.f382399e.writeFields(fVar);
            }
            r45.n34 n34Var2 = this.f382400f;
            if (n34Var2 != null) {
                fVar.i(3, n34Var2.computeSize());
                this.f382400f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f382398d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.n34 n34Var3 = this.f382399e;
            if (n34Var3 != null) {
                j17 += b36.f.i(2, n34Var3.computeSize());
            }
            r45.n34 n34Var4 = this.f382400f;
            return n34Var4 != null ? j17 + b36.f.i(3, n34Var4.computeSize()) : j17;
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
        r45.oo5 oo5Var = (r45.oo5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            oo5Var.f382398d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.n34 n34Var5 = new r45.n34();
                if (bArr != null && bArr.length > 0) {
                    n34Var5.parseFrom(bArr);
                }
                oo5Var.f382399e = n34Var5;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.n34 n34Var6 = new r45.n34();
            if (bArr2 != null && bArr2.length > 0) {
                n34Var6.parseFrom(bArr2);
            }
            oo5Var.f382400f = n34Var6;
        }
        return 0;
    }
}
