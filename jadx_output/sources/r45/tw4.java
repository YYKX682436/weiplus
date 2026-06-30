package r45;

/* loaded from: classes8.dex */
public class tw4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386832e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386833f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386834g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386835h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tw4)) {
            return false;
        }
        r45.tw4 tw4Var = (r45.tw4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386831d), java.lang.Integer.valueOf(tw4Var.f386831d)) && n51.f.a(this.f386832e, tw4Var.f386832e) && n51.f.a(this.f386833f, tw4Var.f386833f) && n51.f.a(this.f386834g, tw4Var.f386834g) && n51.f.a(this.f386835h, tw4Var.f386835h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386831d);
            java.lang.String str = this.f386832e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386833f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386834g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386835h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386831d) + 0;
            java.lang.String str5 = this.f386832e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f386833f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f386834g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f386835h;
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
        r45.tw4 tw4Var = (r45.tw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tw4Var.f386831d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            tw4Var.f386832e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            tw4Var.f386833f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            tw4Var.f386834g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        tw4Var.f386835h = aVar2.k(intValue);
        return 0;
    }
}
