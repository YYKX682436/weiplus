package r45;

/* loaded from: classes9.dex */
public class sx3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386004d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386005e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386006f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386007g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386008h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sx3)) {
            return false;
        }
        r45.sx3 sx3Var = (r45.sx3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386004d), java.lang.Integer.valueOf(sx3Var.f386004d)) && n51.f.a(this.f386005e, sx3Var.f386005e) && n51.f.a(this.f386006f, sx3Var.f386006f) && n51.f.a(this.f386007g, sx3Var.f386007g) && n51.f.a(this.f386008h, sx3Var.f386008h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386004d);
            java.lang.String str = this.f386005e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386006f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386007g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386008h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386004d) + 0;
            java.lang.String str5 = this.f386005e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f386006f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f386007g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f386008h;
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
        r45.sx3 sx3Var = (r45.sx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sx3Var.f386004d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            sx3Var.f386005e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            sx3Var.f386006f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            sx3Var.f386007g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        sx3Var.f386008h = aVar2.k(intValue);
        return 0;
    }
}
