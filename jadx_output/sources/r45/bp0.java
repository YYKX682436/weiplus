package r45;

/* loaded from: classes9.dex */
public class bp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du4 f370941d;

    /* renamed from: e, reason: collision with root package name */
    public int f370942e;

    /* renamed from: f, reason: collision with root package name */
    public int f370943f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bp0)) {
            return false;
        }
        r45.bp0 bp0Var = (r45.bp0) fVar;
        return n51.f.a(this.f370941d, bp0Var.f370941d) && n51.f.a(java.lang.Integer.valueOf(this.f370942e), java.lang.Integer.valueOf(bp0Var.f370942e)) && n51.f.a(java.lang.Integer.valueOf(this.f370943f), java.lang.Integer.valueOf(bp0Var.f370943f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du4 du4Var = this.f370941d;
            if (du4Var != null) {
                fVar.i(1, du4Var.computeSize());
                this.f370941d.writeFields(fVar);
            }
            fVar.e(2, this.f370942e);
            fVar.e(3, this.f370943f);
            return 0;
        }
        if (i17 == 1) {
            r45.du4 du4Var2 = this.f370941d;
            return (du4Var2 != null ? 0 + b36.f.i(1, du4Var2.computeSize()) : 0) + b36.f.e(2, this.f370942e) + b36.f.e(3, this.f370943f);
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
        r45.bp0 bp0Var = (r45.bp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                bp0Var.f370942e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            bp0Var.f370943f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.du4 du4Var3 = new r45.du4();
            if (bArr != null && bArr.length > 0) {
                du4Var3.parseFrom(bArr);
            }
            bp0Var.f370941d = du4Var3;
        }
        return 0;
    }
}
