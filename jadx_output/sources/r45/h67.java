package r45;

/* loaded from: classes9.dex */
public class h67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f375883d;

    /* renamed from: e, reason: collision with root package name */
    public float f375884e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375885f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375886g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375887h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375888i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375889m;

    /* renamed from: n, reason: collision with root package name */
    public long f375890n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375891o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h67)) {
            return false;
        }
        r45.h67 h67Var = (r45.h67) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f375883d), java.lang.Float.valueOf(h67Var.f375883d)) && n51.f.a(java.lang.Float.valueOf(this.f375884e), java.lang.Float.valueOf(h67Var.f375884e)) && n51.f.a(this.f375885f, h67Var.f375885f) && n51.f.a(this.f375886g, h67Var.f375886g) && n51.f.a(this.f375887h, h67Var.f375887h) && n51.f.a(this.f375888i, h67Var.f375888i) && n51.f.a(this.f375889m, h67Var.f375889m) && n51.f.a(java.lang.Long.valueOf(this.f375890n), java.lang.Long.valueOf(h67Var.f375890n)) && n51.f.a(this.f375891o, h67Var.f375891o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f375883d);
            fVar.d(2, this.f375884e);
            java.lang.String str = this.f375885f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f375886g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f375887h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f375888i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f375889m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f375890n);
            java.lang.String str6 = this.f375891o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f375883d) + 0 + b36.f.d(2, this.f375884e);
            java.lang.String str7 = this.f375885f;
            if (str7 != null) {
                d17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f375886g;
            if (str8 != null) {
                d17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f375887h;
            if (str9 != null) {
                d17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f375888i;
            if (str10 != null) {
                d17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f375889m;
            if (str11 != null) {
                d17 += b36.f.j(7, str11);
            }
            int h17 = d17 + b36.f.h(8, this.f375890n);
            java.lang.String str12 = this.f375891o;
            return str12 != null ? h17 + b36.f.j(9, str12) : h17;
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
        r45.h67 h67Var = (r45.h67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                h67Var.f375883d = aVar2.f(intValue);
                return 0;
            case 2:
                h67Var.f375884e = aVar2.f(intValue);
                return 0;
            case 3:
                h67Var.f375885f = aVar2.k(intValue);
                return 0;
            case 4:
                h67Var.f375886g = aVar2.k(intValue);
                return 0;
            case 5:
                h67Var.f375887h = aVar2.k(intValue);
                return 0;
            case 6:
                h67Var.f375888i = aVar2.k(intValue);
                return 0;
            case 7:
                h67Var.f375889m = aVar2.k(intValue);
                return 0;
            case 8:
                h67Var.f375890n = aVar2.i(intValue);
                return 0;
            case 9:
                h67Var.f375891o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
