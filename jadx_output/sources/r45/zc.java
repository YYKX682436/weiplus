package r45;

/* loaded from: classes4.dex */
public class zc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391899d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391900e;

    /* renamed from: f, reason: collision with root package name */
    public int f391901f;

    /* renamed from: g, reason: collision with root package name */
    public int f391902g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zc)) {
            return false;
        }
        r45.zc zcVar = (r45.zc) fVar;
        return n51.f.a(this.f391899d, zcVar.f391899d) && n51.f.a(this.f391900e, zcVar.f391900e) && n51.f.a(java.lang.Integer.valueOf(this.f391901f), java.lang.Integer.valueOf(zcVar.f391901f)) && n51.f.a(java.lang.Integer.valueOf(this.f391902g), java.lang.Integer.valueOf(zcVar.f391902g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391899d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391900e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f391901f);
            fVar.e(4, this.f391902g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f391899d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f391900e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f391901f) + b36.f.e(4, this.f391902g);
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
        r45.zc zcVar = (r45.zc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zcVar.f391899d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zcVar.f391900e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zcVar.f391901f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zcVar.f391902g = aVar2.g(intValue);
        return 0;
    }
}
