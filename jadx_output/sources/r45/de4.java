package r45;

/* loaded from: classes9.dex */
public class de4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372349d;

    /* renamed from: e, reason: collision with root package name */
    public int f372350e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372351f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372352g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372353h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.de4)) {
            return false;
        }
        r45.de4 de4Var = (r45.de4) fVar;
        return n51.f.a(this.f372349d, de4Var.f372349d) && n51.f.a(java.lang.Integer.valueOf(this.f372350e), java.lang.Integer.valueOf(de4Var.f372350e)) && n51.f.a(this.f372351f, de4Var.f372351f) && n51.f.a(this.f372352g, de4Var.f372352g) && n51.f.a(this.f372353h, de4Var.f372353h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372349d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f372350e);
            java.lang.String str2 = this.f372351f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f372352g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f372353h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f372349d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f372350e);
            java.lang.String str6 = this.f372351f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f372352g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f372353h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.de4 de4Var = (r45.de4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            de4Var.f372349d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            de4Var.f372350e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            de4Var.f372351f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            de4Var.f372352g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        de4Var.f372353h = aVar2.k(intValue);
        return 0;
    }
}
