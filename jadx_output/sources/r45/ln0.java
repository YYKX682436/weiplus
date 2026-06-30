package r45;

/* loaded from: classes9.dex */
public class ln0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f379649d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379650e;

    /* renamed from: f, reason: collision with root package name */
    public long f379651f;

    /* renamed from: g, reason: collision with root package name */
    public long f379652g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379653h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379654i;

    /* renamed from: m, reason: collision with root package name */
    public int f379655m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379656n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f379657o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ln0)) {
            return false;
        }
        r45.ln0 ln0Var = (r45.ln0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f379649d), java.lang.Long.valueOf(ln0Var.f379649d)) && n51.f.a(this.f379650e, ln0Var.f379650e) && n51.f.a(java.lang.Long.valueOf(this.f379651f), java.lang.Long.valueOf(ln0Var.f379651f)) && n51.f.a(java.lang.Long.valueOf(this.f379652g), java.lang.Long.valueOf(ln0Var.f379652g)) && n51.f.a(this.f379653h, ln0Var.f379653h) && n51.f.a(this.f379654i, ln0Var.f379654i) && n51.f.a(java.lang.Integer.valueOf(this.f379655m), java.lang.Integer.valueOf(ln0Var.f379655m)) && n51.f.a(this.f379656n, ln0Var.f379656n) && n51.f.a(java.lang.Boolean.valueOf(this.f379657o), java.lang.Boolean.valueOf(ln0Var.f379657o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(5, this.f379649d);
            java.lang.String str = this.f379650e;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.h(10, this.f379651f);
            fVar.h(11, this.f379652g);
            java.lang.String str2 = this.f379653h;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            java.lang.String str3 = this.f379654i;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            fVar.e(16, this.f379655m);
            java.lang.String str4 = this.f379656n;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            fVar.a(18, this.f379657o);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(5, this.f379649d) + 0;
            java.lang.String str5 = this.f379650e;
            if (str5 != null) {
                h17 += b36.f.j(6, str5);
            }
            int h18 = h17 + b36.f.h(10, this.f379651f) + b36.f.h(11, this.f379652g);
            java.lang.String str6 = this.f379653h;
            if (str6 != null) {
                h18 += b36.f.j(12, str6);
            }
            java.lang.String str7 = this.f379654i;
            if (str7 != null) {
                h18 += b36.f.j(13, str7);
            }
            int e17 = h18 + b36.f.e(16, this.f379655m);
            java.lang.String str8 = this.f379656n;
            if (str8 != null) {
                e17 += b36.f.j(17, str8);
            }
            return e17 + b36.f.a(18, this.f379657o);
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
        r45.ln0 ln0Var = (r45.ln0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 5:
                ln0Var.f379649d = aVar2.i(intValue);
                return 0;
            case 6:
                ln0Var.f379650e = aVar2.k(intValue);
                return 0;
            case 7:
            case 8:
            case 9:
            case 14:
            case 15:
            default:
                return -1;
            case 10:
                ln0Var.f379651f = aVar2.i(intValue);
                return 0;
            case 11:
                ln0Var.f379652g = aVar2.i(intValue);
                return 0;
            case 12:
                ln0Var.f379653h = aVar2.k(intValue);
                return 0;
            case 13:
                ln0Var.f379654i = aVar2.k(intValue);
                return 0;
            case 16:
                ln0Var.f379655m = aVar2.g(intValue);
                return 0;
            case 17:
                ln0Var.f379656n = aVar2.k(intValue);
                return 0;
            case 18:
                ln0Var.f379657o = aVar2.c(intValue);
                return 0;
        }
    }
}
