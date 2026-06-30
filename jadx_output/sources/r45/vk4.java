package r45;

/* loaded from: classes8.dex */
public class vk4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388317d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388318e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388319f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388320g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388321h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388322i;

    /* renamed from: m, reason: collision with root package name */
    public int f388323m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vk4)) {
            return false;
        }
        r45.vk4 vk4Var = (r45.vk4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388317d), java.lang.Integer.valueOf(vk4Var.f388317d)) && n51.f.a(this.f388318e, vk4Var.f388318e) && n51.f.a(this.f388319f, vk4Var.f388319f) && n51.f.a(this.f388320g, vk4Var.f388320g) && n51.f.a(this.f388321h, vk4Var.f388321h) && n51.f.a(this.f388322i, vk4Var.f388322i) && n51.f.a(java.lang.Integer.valueOf(this.f388323m), java.lang.Integer.valueOf(vk4Var.f388323m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388317d);
            java.lang.String str = this.f388318e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f388319f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f388320g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f388321h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f388322i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f388323m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388317d) + 0;
            java.lang.String str6 = this.f388318e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f388319f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f388320g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f388321h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f388322i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f388323m);
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
        r45.vk4 vk4Var = (r45.vk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vk4Var.f388317d = aVar2.g(intValue);
                return 0;
            case 2:
                vk4Var.f388318e = aVar2.k(intValue);
                return 0;
            case 3:
                vk4Var.f388319f = aVar2.k(intValue);
                return 0;
            case 4:
                vk4Var.f388320g = aVar2.k(intValue);
                return 0;
            case 5:
                vk4Var.f388321h = aVar2.k(intValue);
                return 0;
            case 6:
                vk4Var.f388322i = aVar2.k(intValue);
                return 0;
            case 7:
                vk4Var.f388323m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
