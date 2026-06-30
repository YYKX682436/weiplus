package p33;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351599d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351600e;

    /* renamed from: f, reason: collision with root package name */
    public int f351601f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.k)) {
            return false;
        }
        p33.k kVar = (p33.k) fVar;
        return n51.f.a(this.f351599d, kVar.f351599d) && n51.f.a(this.f351600e, kVar.f351600e) && n51.f.a(java.lang.Integer.valueOf(this.f351601f), java.lang.Integer.valueOf(kVar.f351601f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f351599d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f351600e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f351601f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f351599d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f351600e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f351601f);
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
        p33.k kVar = (p33.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kVar.f351599d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            kVar.f351600e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        kVar.f351601f = aVar2.g(intValue);
        return 0;
    }
}
