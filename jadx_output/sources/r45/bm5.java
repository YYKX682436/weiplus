package r45;

/* loaded from: classes9.dex */
public class bm5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370872d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370873e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rl6 f370874f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bm5)) {
            return false;
        }
        r45.bm5 bm5Var = (r45.bm5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370872d), java.lang.Integer.valueOf(bm5Var.f370872d)) && n51.f.a(this.f370873e, bm5Var.f370873e) && n51.f.a(this.f370874f, bm5Var.f370874f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370872d);
            java.lang.String str = this.f370873e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.rl6 rl6Var = this.f370874f;
            if (rl6Var != null) {
                fVar.i(3, rl6Var.computeSize());
                this.f370874f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370872d) + 0;
            java.lang.String str2 = this.f370873e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.rl6 rl6Var2 = this.f370874f;
            return rl6Var2 != null ? e17 + b36.f.i(3, rl6Var2.computeSize()) : e17;
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
        r45.bm5 bm5Var = (r45.bm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bm5Var.f370872d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bm5Var.f370873e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.rl6 rl6Var3 = new r45.rl6();
            if (bArr != null && bArr.length > 0) {
                rl6Var3.parseFrom(bArr);
            }
            bm5Var.f370874f = rl6Var3;
        }
        return 0;
    }
}
