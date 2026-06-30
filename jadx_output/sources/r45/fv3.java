package r45;

/* loaded from: classes11.dex */
public class fv3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374621d;

    /* renamed from: e, reason: collision with root package name */
    public int f374622e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f374623f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f374624g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fv3)) {
            return false;
        }
        r45.fv3 fv3Var = (r45.fv3) fVar;
        return n51.f.a(this.f374621d, fv3Var.f374621d) && n51.f.a(java.lang.Integer.valueOf(this.f374622e), java.lang.Integer.valueOf(fv3Var.f374622e)) && n51.f.a(this.f374623f, fv3Var.f374623f) && n51.f.a(this.f374624g, fv3Var.f374624g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f374621d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f374622e);
            fVar.g(3, 8, this.f374623f);
            fVar.g(4, 2, this.f374624g);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f374621d;
            return (gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0) + b36.f.e(2, this.f374622e) + b36.f.g(3, 8, this.f374623f) + b36.f.g(4, 2, this.f374624g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f374623f.clear();
            this.f374624g.clear();
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
        r45.fv3 fv3Var = (r45.fv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fv3Var.f374621d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            fv3Var.f374622e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            fv3Var.f374624g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.hv3 hv3Var = new r45.hv3();
            if (bArr2 != null && bArr2.length > 0) {
                hv3Var.parseFrom(bArr2);
            }
            fv3Var.f374623f.add(hv3Var);
        }
        return 0;
    }
}
