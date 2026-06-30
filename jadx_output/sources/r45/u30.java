package r45;

/* loaded from: classes12.dex */
public class u30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386978d;

    /* renamed from: e, reason: collision with root package name */
    public int f386979e;

    /* renamed from: f, reason: collision with root package name */
    public int f386980f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f386981g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386982h;

    /* renamed from: i, reason: collision with root package name */
    public r45.fw3 f386983i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u30)) {
            return false;
        }
        r45.u30 u30Var = (r45.u30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386978d), java.lang.Integer.valueOf(u30Var.f386978d)) && n51.f.a(java.lang.Integer.valueOf(this.f386979e), java.lang.Integer.valueOf(u30Var.f386979e)) && n51.f.a(java.lang.Integer.valueOf(this.f386980f), java.lang.Integer.valueOf(u30Var.f386980f)) && n51.f.a(this.f386981g, u30Var.f386981g) && n51.f.a(this.f386982h, u30Var.f386982h) && n51.f.a(this.f386983i, u30Var.f386983i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386981g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386978d);
            fVar.e(2, this.f386979e);
            fVar.e(3, this.f386980f);
            fVar.g(4, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f386982h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            r45.fw3 fw3Var = this.f386983i;
            if (fw3Var != null) {
                fVar.i(6, fw3Var.computeSize());
                this.f386983i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386978d) + 0 + b36.f.e(2, this.f386979e) + b36.f.e(3, this.f386980f) + b36.f.g(4, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f386982h;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            r45.fw3 fw3Var2 = this.f386983i;
            return fw3Var2 != null ? e17 + b36.f.i(6, fw3Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.u30 u30Var = (r45.u30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                u30Var.f386978d = aVar2.g(intValue);
                return 0;
            case 2:
                u30Var.f386979e = aVar2.g(intValue);
                return 0;
            case 3:
                u30Var.f386980f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.t30 t30Var = new r45.t30();
                    if (bArr2 != null && bArr2.length > 0) {
                        t30Var.parseFrom(bArr2);
                    }
                    u30Var.f386981g.add(t30Var);
                }
                return 0;
            case 5:
                u30Var.f386982h = aVar2.d(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.fw3 fw3Var3 = new r45.fw3();
                    if (bArr3 != null && bArr3.length > 0) {
                        fw3Var3.parseFrom(bArr3);
                    }
                    u30Var.f386983i = fw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
