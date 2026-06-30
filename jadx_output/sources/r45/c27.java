package r45;

/* loaded from: classes8.dex */
public class c27 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371249d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f371250e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c27)) {
            return false;
        }
        r45.c27 c27Var = (r45.c27) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371249d), java.lang.Integer.valueOf(c27Var.f371249d)) && n51.f.a(this.f371250e, c27Var.f371250e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371249d);
            fVar.g(2, 8, this.f371250e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f371249d) + 0 + b36.f.g(2, 8, this.f371250e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371250e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.c27 c27Var = (r45.c27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c27Var.f371249d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.b27 b27Var = new r45.b27();
            if (bArr2 != null && bArr2.length > 0) {
                b27Var.parseFrom(bArr2);
            }
            c27Var.f371250e.add(b27Var);
        }
        return 0;
    }
}
