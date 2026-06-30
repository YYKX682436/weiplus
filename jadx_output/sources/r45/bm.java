package r45;

/* loaded from: classes4.dex */
public class bm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370861d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370862e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f370863f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f370864g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bm)) {
            return false;
        }
        r45.bm bmVar = (r45.bm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370861d), java.lang.Integer.valueOf(bmVar.f370861d)) && n51.f.a(this.f370862e, bmVar.f370862e) && n51.f.a(this.f370863f, bmVar.f370863f) && n51.f.a(java.lang.Long.valueOf(this.f370864g), java.lang.Long.valueOf(bmVar.f370864g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370861d);
            com.tencent.mm.protobuf.g gVar = this.f370862e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.g(3, 8, this.f370863f);
            fVar.h(4, this.f370864g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370861d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f370862e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.g(3, 8, this.f370863f) + b36.f.h(4, this.f370864g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f370863f.clear();
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
        r45.bm bmVar = (r45.bm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bmVar.f370861d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bmVar.f370862e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            bmVar.f370864g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.fi5 fi5Var = new r45.fi5();
            if (bArr2 != null && bArr2.length > 0) {
                fi5Var.parseFrom(bArr2);
            }
            bmVar.f370863f.add(fi5Var);
        }
        return 0;
    }
}
