package uq;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f430132d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f430133e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f430134f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof uq.d)) {
            return false;
        }
        uq.d dVar = (uq.d) fVar;
        return n51.f.a(this.f430132d, dVar.f430132d) && n51.f.a(this.f430133e, dVar.f430133e) && n51.f.a(this.f430134f, dVar.f430134f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f430132d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f430133e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f430134f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f430132d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f430133e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f430134f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        uq.d dVar = (uq.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dVar.f430132d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dVar.f430133e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        dVar.f430134f = aVar2.k(intValue);
        return 0;
    }
}
