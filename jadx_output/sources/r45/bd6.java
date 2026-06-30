package r45;

/* loaded from: classes8.dex */
public class bd6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b27 f370679d;

    /* renamed from: e, reason: collision with root package name */
    public int f370680e;

    /* renamed from: f, reason: collision with root package name */
    public int f370681f;

    /* renamed from: g, reason: collision with root package name */
    public int f370682g;

    /* renamed from: h, reason: collision with root package name */
    public int f370683h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bd6)) {
            return false;
        }
        r45.bd6 bd6Var = (r45.bd6) fVar;
        return n51.f.a(this.f370679d, bd6Var.f370679d) && n51.f.a(java.lang.Integer.valueOf(this.f370680e), java.lang.Integer.valueOf(bd6Var.f370680e)) && n51.f.a(java.lang.Integer.valueOf(this.f370681f), java.lang.Integer.valueOf(bd6Var.f370681f)) && n51.f.a(java.lang.Integer.valueOf(this.f370682g), java.lang.Integer.valueOf(bd6Var.f370682g)) && n51.f.a(java.lang.Integer.valueOf(this.f370683h), java.lang.Integer.valueOf(bd6Var.f370683h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b27 b27Var = this.f370679d;
            if (b27Var != null) {
                fVar.i(1, b27Var.computeSize());
                this.f370679d.writeFields(fVar);
            }
            fVar.e(2, this.f370680e);
            fVar.e(3, this.f370681f);
            fVar.e(4, this.f370682g);
            fVar.e(5, this.f370683h);
            return 0;
        }
        if (i17 == 1) {
            r45.b27 b27Var2 = this.f370679d;
            return (b27Var2 != null ? 0 + b36.f.i(1, b27Var2.computeSize()) : 0) + b36.f.e(2, this.f370680e) + b36.f.e(3, this.f370681f) + b36.f.e(4, this.f370682g) + b36.f.e(5, this.f370683h);
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
        r45.bd6 bd6Var = (r45.bd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.b27 b27Var3 = new r45.b27();
                if (bArr != null && bArr.length > 0) {
                    b27Var3.parseFrom(bArr);
                }
                bd6Var.f370679d = b27Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            bd6Var.f370680e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bd6Var.f370681f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            bd6Var.f370682g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        bd6Var.f370683h = aVar2.g(intValue);
        return 0;
    }
}
