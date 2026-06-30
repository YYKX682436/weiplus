package r45;

/* loaded from: classes4.dex */
public class rj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384940d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384941e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rj)) {
            return false;
        }
        r45.rj rjVar = (r45.rj) fVar;
        return n51.f.a(this.f384940d, rjVar.f384940d) && n51.f.a(this.f384941e, rjVar.f384941e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384940d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384941e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f384940d;
            int j17 = str3 != null ? 0 + b36.f.j(2, str3) : 0;
            java.lang.String str4 = this.f384941e;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        r45.rj rjVar = (r45.rj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 2) {
            rjVar.f384940d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        rjVar.f384941e = aVar2.k(intValue);
        return 0;
    }
}
