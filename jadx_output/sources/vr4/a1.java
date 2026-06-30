package vr4;

/* loaded from: classes9.dex */
public class a1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f439675d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f439676e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f439677f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f439678g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f439679h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.a1)) {
            return false;
        }
        vr4.a1 a1Var = (vr4.a1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f439675d), java.lang.Integer.valueOf(a1Var.f439675d)) && n51.f.a(this.f439676e, a1Var.f439676e) && n51.f.a(this.f439677f, a1Var.f439677f) && n51.f.a(this.f439678g, a1Var.f439678g) && n51.f.a(this.f439679h, a1Var.f439679h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f439675d);
            java.lang.String str = this.f439676e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f439677f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f439678g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f439679h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f439675d) + 0;
            java.lang.String str5 = this.f439676e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f439677f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f439678g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f439679h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        vr4.a1 a1Var = (vr4.a1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a1Var.f439675d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            a1Var.f439676e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            a1Var.f439677f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            a1Var.f439678g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        a1Var.f439679h = aVar2.k(intValue);
        return 0;
    }
}
