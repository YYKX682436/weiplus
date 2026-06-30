package r45;

/* loaded from: classes9.dex */
public class dn5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372598d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372599e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372600f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372601g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372602h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dn5)) {
            return false;
        }
        r45.dn5 dn5Var = (r45.dn5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372598d), java.lang.Integer.valueOf(dn5Var.f372598d)) && n51.f.a(this.f372599e, dn5Var.f372599e) && n51.f.a(this.f372600f, dn5Var.f372600f) && n51.f.a(this.f372601g, dn5Var.f372601g) && n51.f.a(this.f372602h, dn5Var.f372602h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372598d);
            java.lang.String str = this.f372599e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f372600f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f372601g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f372602h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372598d) + 0;
            java.lang.String str5 = this.f372599e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f372600f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f372601g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f372602h;
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
        r45.dn5 dn5Var = (r45.dn5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dn5Var.f372598d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            dn5Var.f372599e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            dn5Var.f372600f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            dn5Var.f372601g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        dn5Var.f372602h = aVar2.k(intValue);
        return 0;
    }
}
