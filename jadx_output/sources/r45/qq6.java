package r45;

/* loaded from: classes4.dex */
public class qq6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384212d;

    /* renamed from: e, reason: collision with root package name */
    public int f384213e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rq6 f384214f;

    /* renamed from: g, reason: collision with root package name */
    public int f384215g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qq6)) {
            return false;
        }
        r45.qq6 qq6Var = (r45.qq6) fVar;
        return n51.f.a(this.f384212d, qq6Var.f384212d) && n51.f.a(java.lang.Integer.valueOf(this.f384213e), java.lang.Integer.valueOf(qq6Var.f384213e)) && n51.f.a(this.f384214f, qq6Var.f384214f) && n51.f.a(java.lang.Integer.valueOf(this.f384215g), java.lang.Integer.valueOf(qq6Var.f384215g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384212d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f384213e);
            r45.rq6 rq6Var = this.f384214f;
            if (rq6Var != null) {
                fVar.i(3, rq6Var.computeSize());
                this.f384214f.writeFields(fVar);
            }
            fVar.e(4, this.f384215g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f384212d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f384213e);
            r45.rq6 rq6Var2 = this.f384214f;
            if (rq6Var2 != null) {
                j17 += b36.f.i(3, rq6Var2.computeSize());
            }
            return j17 + b36.f.e(4, this.f384215g);
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
        r45.qq6 qq6Var = (r45.qq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qq6Var.f384212d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qq6Var.f384213e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            qq6Var.f384215g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.rq6 rq6Var3 = new r45.rq6();
            if (bArr != null && bArr.length > 0) {
                rq6Var3.parseFrom(bArr);
            }
            qq6Var.f384214f = rq6Var3;
        }
        return 0;
    }
}
