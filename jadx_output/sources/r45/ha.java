package r45;

/* loaded from: classes4.dex */
public class ha extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375971d;

    /* renamed from: e, reason: collision with root package name */
    public int f375972e;

    /* renamed from: f, reason: collision with root package name */
    public int f375973f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ia f375974g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ha)) {
            return false;
        }
        r45.ha haVar = (r45.ha) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375971d), java.lang.Integer.valueOf(haVar.f375971d)) && n51.f.a(java.lang.Integer.valueOf(this.f375972e), java.lang.Integer.valueOf(haVar.f375972e)) && n51.f.a(java.lang.Integer.valueOf(this.f375973f), java.lang.Integer.valueOf(haVar.f375973f)) && n51.f.a(this.f375974g, haVar.f375974g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375971d);
            fVar.e(2, this.f375972e);
            fVar.e(3, this.f375973f);
            r45.ia iaVar = this.f375974g;
            if (iaVar != null) {
                fVar.i(4, iaVar.computeSize());
                this.f375974g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375971d) + 0 + b36.f.e(2, this.f375972e) + b36.f.e(3, this.f375973f);
            r45.ia iaVar2 = this.f375974g;
            return iaVar2 != null ? e17 + b36.f.i(4, iaVar2.computeSize()) : e17;
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
        r45.ha haVar = (r45.ha) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            haVar.f375971d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            haVar.f375972e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            haVar.f375973f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ia iaVar3 = new r45.ia();
            if (bArr != null && bArr.length > 0) {
                iaVar3.parseFrom(bArr);
            }
            haVar.f375974g = iaVar3;
        }
        return 0;
    }
}
