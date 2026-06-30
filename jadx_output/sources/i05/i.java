package i05;

/* loaded from: classes4.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f286576d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f286577e;

    /* renamed from: f, reason: collision with root package name */
    public long f286578f;

    /* renamed from: g, reason: collision with root package name */
    public long f286579g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof i05.i)) {
            return false;
        }
        i05.i iVar = (i05.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f286576d), java.lang.Integer.valueOf(iVar.f286576d)) && n51.f.a(this.f286577e, iVar.f286577e) && n51.f.a(java.lang.Long.valueOf(this.f286578f), java.lang.Long.valueOf(iVar.f286578f)) && n51.f.a(java.lang.Long.valueOf(this.f286579g), java.lang.Long.valueOf(iVar.f286579g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f286576d);
            java.lang.String str = this.f286577e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f286578f);
            fVar.h(4, this.f286579g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f286576d) + 0;
            java.lang.String str2 = this.f286577e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f286578f) + b36.f.h(4, this.f286579g);
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
        i05.i iVar = (i05.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f286576d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            iVar.f286577e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            iVar.f286578f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        iVar.f286579g = aVar2.i(intValue);
        return 0;
    }
}
