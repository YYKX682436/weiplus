package r45;

/* loaded from: classes4.dex */
public class n80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381149d;

    /* renamed from: e, reason: collision with root package name */
    public int f381150e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tn4 f381151f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n80)) {
            return false;
        }
        r45.n80 n80Var = (r45.n80) fVar;
        return n51.f.a(this.f381149d, n80Var.f381149d) && n51.f.a(java.lang.Integer.valueOf(this.f381150e), java.lang.Integer.valueOf(n80Var.f381150e)) && n51.f.a(this.f381151f, n80Var.f381151f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381149d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f381150e);
            r45.tn4 tn4Var = this.f381151f;
            if (tn4Var != null) {
                fVar.i(3, tn4Var.computeSize());
                this.f381151f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f381149d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f381150e);
            r45.tn4 tn4Var2 = this.f381151f;
            return tn4Var2 != null ? j17 + b36.f.i(3, tn4Var2.computeSize()) : j17;
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
        r45.n80 n80Var = (r45.n80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n80Var.f381149d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            n80Var.f381150e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.tn4 tn4Var3 = new r45.tn4();
            if (bArr != null && bArr.length > 0) {
                tn4Var3.parseFrom(bArr);
            }
            n80Var.f381151f = tn4Var3;
        }
        return 0;
    }
}
