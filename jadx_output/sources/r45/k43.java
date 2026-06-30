package r45;

/* loaded from: classes8.dex */
public class k43 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378356d;

    /* renamed from: e, reason: collision with root package name */
    public int f378357e;

    /* renamed from: f, reason: collision with root package name */
    public int f378358f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378359g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378360h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378361i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378362m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k43)) {
            return false;
        }
        r45.k43 k43Var = (r45.k43) fVar;
        return n51.f.a(this.f378356d, k43Var.f378356d) && n51.f.a(java.lang.Integer.valueOf(this.f378357e), java.lang.Integer.valueOf(k43Var.f378357e)) && n51.f.a(java.lang.Integer.valueOf(this.f378358f), java.lang.Integer.valueOf(k43Var.f378358f)) && n51.f.a(this.f378359g, k43Var.f378359g) && n51.f.a(this.f378360h, k43Var.f378360h) && n51.f.a(this.f378361i, k43Var.f378361i) && n51.f.a(this.f378362m, k43Var.f378362m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378356d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f378357e);
            fVar.e(3, this.f378358f);
            java.lang.String str2 = this.f378359g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f378360h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378361i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f378362m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f378356d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f378357e) + b36.f.e(3, this.f378358f);
            java.lang.String str7 = this.f378359g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f378360h;
            if (str8 != null) {
                j17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f378361i;
            if (str9 != null) {
                j17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f378362m;
            return str10 != null ? j17 + b36.f.j(7, str10) : j17;
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
        r45.k43 k43Var = (r45.k43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k43Var.f378356d = aVar2.k(intValue);
                return 0;
            case 2:
                k43Var.f378357e = aVar2.g(intValue);
                return 0;
            case 3:
                k43Var.f378358f = aVar2.g(intValue);
                return 0;
            case 4:
                k43Var.f378359g = aVar2.k(intValue);
                return 0;
            case 5:
                k43Var.f378360h = aVar2.k(intValue);
                return 0;
            case 6:
                k43Var.f378361i = aVar2.k(intValue);
                return 0;
            case 7:
                k43Var.f378362m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
