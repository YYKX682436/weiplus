package m53;

/* loaded from: classes7.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f324079d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324080e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324081f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324082g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.u)) {
            return false;
        }
        m53.u uVar = (m53.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f324079d), java.lang.Integer.valueOf(uVar.f324079d)) && n51.f.a(this.f324080e, uVar.f324080e) && n51.f.a(this.f324081f, uVar.f324081f) && n51.f.a(this.f324082g, uVar.f324082g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f324079d);
            java.lang.String str = this.f324080e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f324081f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f324082g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f324079d) + 0;
            java.lang.String str4 = this.f324080e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f324081f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f324082g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        m53.u uVar = (m53.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uVar.f324079d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            uVar.f324080e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            uVar.f324081f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        uVar.f324082g = aVar2.k(intValue);
        return 0;
    }
}
