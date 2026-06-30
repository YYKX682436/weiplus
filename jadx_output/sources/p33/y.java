package p33;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351668d;

    /* renamed from: e, reason: collision with root package name */
    public int f351669e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f351670f;

    /* renamed from: g, reason: collision with root package name */
    public int f351671g;

    /* renamed from: h, reason: collision with root package name */
    public int f351672h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.y)) {
            return false;
        }
        p33.y yVar = (p33.y) fVar;
        return n51.f.a(this.f351668d, yVar.f351668d) && n51.f.a(java.lang.Integer.valueOf(this.f351669e), java.lang.Integer.valueOf(yVar.f351669e)) && n51.f.a(this.f351670f, yVar.f351670f) && n51.f.a(java.lang.Integer.valueOf(this.f351671g), java.lang.Integer.valueOf(yVar.f351671g)) && n51.f.a(java.lang.Integer.valueOf(this.f351672h), java.lang.Integer.valueOf(yVar.f351672h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f351668d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f351669e);
            java.lang.String str2 = this.f351670f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f351671g);
            fVar.e(5, this.f351672h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f351668d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f351669e);
            java.lang.String str4 = this.f351670f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f351671g) + b36.f.e(5, this.f351672h);
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
        p33.y yVar = (p33.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yVar.f351668d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yVar.f351669e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            yVar.f351670f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            yVar.f351671g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        yVar.f351672h = aVar2.g(intValue);
        return 0;
    }
}
