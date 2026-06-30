package r45;

/* loaded from: classes9.dex */
public class nm6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381518d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381519e;

    /* renamed from: f, reason: collision with root package name */
    public int f381520f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nm6)) {
            return false;
        }
        r45.nm6 nm6Var = (r45.nm6) fVar;
        return n51.f.a(this.f381518d, nm6Var.f381518d) && n51.f.a(this.f381519e, nm6Var.f381519e) && n51.f.a(java.lang.Integer.valueOf(this.f381520f), java.lang.Integer.valueOf(nm6Var.f381520f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381518d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381519e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f381520f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f381518d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f381519e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f381520f);
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
        r45.nm6 nm6Var = (r45.nm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nm6Var.f381518d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            nm6Var.f381519e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        nm6Var.f381520f = aVar2.g(intValue);
        return 0;
    }
}
