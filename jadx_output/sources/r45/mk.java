package r45;

/* loaded from: classes10.dex */
public class mk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380596d;

    /* renamed from: e, reason: collision with root package name */
    public int f380597e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380598f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380599g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mk)) {
            return false;
        }
        r45.mk mkVar = (r45.mk) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380596d), java.lang.Integer.valueOf(mkVar.f380596d)) && n51.f.a(java.lang.Integer.valueOf(this.f380597e), java.lang.Integer.valueOf(mkVar.f380597e)) && n51.f.a(this.f380598f, mkVar.f380598f) && n51.f.a(this.f380599g, mkVar.f380599g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380596d);
            fVar.e(2, this.f380597e);
            java.lang.String str = this.f380598f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f380599g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380596d) + 0 + b36.f.e(2, this.f380597e);
            java.lang.String str3 = this.f380598f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f380599g;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.mk mkVar = (r45.mk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mkVar.f380596d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mkVar.f380597e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            mkVar.f380598f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mkVar.f380599g = aVar2.k(intValue);
        return 0;
    }
}
