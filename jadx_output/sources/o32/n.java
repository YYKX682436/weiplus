package o32;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public o32.c f342720d;

    /* renamed from: e, reason: collision with root package name */
    public int f342721e;

    /* renamed from: f, reason: collision with root package name */
    public int f342722f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o32.n)) {
            return false;
        }
        o32.n nVar = (o32.n) fVar;
        return n51.f.a(this.f342720d, nVar.f342720d) && n51.f.a(java.lang.Integer.valueOf(this.f342721e), java.lang.Integer.valueOf(nVar.f342721e)) && n51.f.a(java.lang.Integer.valueOf(this.f342722f), java.lang.Integer.valueOf(nVar.f342722f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.c cVar = this.f342720d;
            if (cVar != null) {
                fVar.i(1, cVar.computeSize());
                this.f342720d.writeFields(fVar);
            }
            fVar.e(2, this.f342721e);
            fVar.e(3, this.f342722f);
            return 0;
        }
        if (i17 == 1) {
            o32.c cVar2 = this.f342720d;
            return (cVar2 != null ? 0 + b36.f.i(1, cVar2.computeSize()) : 0) + b36.f.e(2, this.f342721e) + b36.f.e(3, this.f342722f);
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
        o32.n nVar = (o32.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                nVar.f342721e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            nVar.f342722f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            o32.c cVar3 = new o32.c();
            if (bArr != null && bArr.length > 0) {
                cVar3.parseFrom(bArr);
            }
            nVar.f342720d = cVar3;
        }
        return 0;
    }
}
