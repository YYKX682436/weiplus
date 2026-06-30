package ks3;

/* loaded from: classes8.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f311749d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f311750e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f311751f;

    /* renamed from: g, reason: collision with root package name */
    public int f311752g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f311753h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.u)) {
            return false;
        }
        ks3.u uVar = (ks3.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f311749d), java.lang.Integer.valueOf(uVar.f311749d)) && n51.f.a(this.f311750e, uVar.f311750e) && n51.f.a(this.f311751f, uVar.f311751f) && n51.f.a(java.lang.Integer.valueOf(this.f311752g), java.lang.Integer.valueOf(uVar.f311752g)) && n51.f.a(this.f311753h, uVar.f311753h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f311749d);
            java.lang.String str = this.f311750e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f311751f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f311752g);
            java.lang.String str3 = this.f311753h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f311749d) + 0;
            java.lang.String str4 = this.f311750e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f311751f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f311752g);
            java.lang.String str6 = this.f311753h;
            return str6 != null ? e18 + b36.f.j(5, str6) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        ks3.u uVar = (ks3.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            uVar.f311749d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            uVar.f311750e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            uVar.f311751f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            uVar.f311752g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        uVar.f311753h = aVar2.k(intValue);
        return 0;
    }
}
