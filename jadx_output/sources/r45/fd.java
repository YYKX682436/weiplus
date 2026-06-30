package r45;

/* loaded from: classes11.dex */
public class fd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374218d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f374219e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fd)) {
            return false;
        }
        r45.fd fdVar = (r45.fd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374218d), java.lang.Integer.valueOf(fdVar.f374218d)) && n51.f.a(this.f374219e, fdVar.f374219e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374218d);
            fVar.g(2, 8, this.f374219e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f374218d) + 0 + b36.f.g(2, 8, this.f374219e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f374219e.clear();
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
        r45.fd fdVar = (r45.fd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fdVar.f374218d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ed edVar = new r45.ed();
            if (bArr2 != null && bArr2.length > 0) {
                edVar.parseFrom(bArr2);
            }
            fdVar.f374219e.add(edVar);
        }
        return 0;
    }
}
