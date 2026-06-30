package r45;

/* loaded from: classes9.dex */
public class c70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371343d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371344e;

    /* renamed from: f, reason: collision with root package name */
    public int f371345f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371346g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371347h;

    /* renamed from: i, reason: collision with root package name */
    public int f371348i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c70)) {
            return false;
        }
        r45.c70 c70Var = (r45.c70) fVar;
        return n51.f.a(this.f371343d, c70Var.f371343d) && n51.f.a(this.f371344e, c70Var.f371344e) && n51.f.a(java.lang.Integer.valueOf(this.f371345f), java.lang.Integer.valueOf(c70Var.f371345f)) && n51.f.a(this.f371346g, c70Var.f371346g) && n51.f.a(this.f371347h, c70Var.f371347h) && n51.f.a(java.lang.Integer.valueOf(this.f371348i), java.lang.Integer.valueOf(c70Var.f371348i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371343d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371344e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f371345f);
            java.lang.String str3 = this.f371346g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f371347h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f371348i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f371343d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f371344e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f371345f);
            java.lang.String str7 = this.f371346g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f371347h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f371348i);
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
        r45.c70 c70Var = (r45.c70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c70Var.f371343d = aVar2.k(intValue);
                return 0;
            case 2:
                c70Var.f371344e = aVar2.k(intValue);
                return 0;
            case 3:
                c70Var.f371345f = aVar2.g(intValue);
                return 0;
            case 4:
                c70Var.f371346g = aVar2.k(intValue);
                return 0;
            case 5:
                c70Var.f371347h = aVar2.k(intValue);
                return 0;
            case 6:
                c70Var.f371348i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
