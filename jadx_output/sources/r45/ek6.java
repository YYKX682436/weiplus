package r45;

/* loaded from: classes4.dex */
public class ek6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f373584d;

    /* renamed from: e, reason: collision with root package name */
    public int f373585e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373586f;

    /* renamed from: g, reason: collision with root package name */
    public long f373587g;

    /* renamed from: h, reason: collision with root package name */
    public int f373588h;

    /* renamed from: i, reason: collision with root package name */
    public int f373589i;

    /* renamed from: m, reason: collision with root package name */
    public int f373590m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ek6)) {
            return false;
        }
        r45.ek6 ek6Var = (r45.ek6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f373584d), java.lang.Long.valueOf(ek6Var.f373584d)) && n51.f.a(java.lang.Integer.valueOf(this.f373585e), java.lang.Integer.valueOf(ek6Var.f373585e)) && n51.f.a(this.f373586f, ek6Var.f373586f) && n51.f.a(java.lang.Long.valueOf(this.f373587g), java.lang.Long.valueOf(ek6Var.f373587g)) && n51.f.a(java.lang.Integer.valueOf(this.f373588h), java.lang.Integer.valueOf(ek6Var.f373588h)) && n51.f.a(java.lang.Integer.valueOf(this.f373589i), java.lang.Integer.valueOf(ek6Var.f373589i)) && n51.f.a(java.lang.Integer.valueOf(this.f373590m), java.lang.Integer.valueOf(ek6Var.f373590m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f373584d);
            fVar.e(2, this.f373585e);
            java.lang.String str = this.f373586f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f373587g);
            fVar.e(5, this.f373588h);
            fVar.e(6, this.f373589i);
            fVar.e(7, this.f373590m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f373584d) + 0 + b36.f.e(2, this.f373585e);
            java.lang.String str2 = this.f373586f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.h(4, this.f373587g) + b36.f.e(5, this.f373588h) + b36.f.e(6, this.f373589i) + b36.f.e(7, this.f373590m);
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
        r45.ek6 ek6Var = (r45.ek6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ek6Var.f373584d = aVar2.i(intValue);
                return 0;
            case 2:
                ek6Var.f373585e = aVar2.g(intValue);
                return 0;
            case 3:
                ek6Var.f373586f = aVar2.k(intValue);
                return 0;
            case 4:
                ek6Var.f373587g = aVar2.i(intValue);
                return 0;
            case 5:
                ek6Var.f373588h = aVar2.g(intValue);
                return 0;
            case 6:
                ek6Var.f373589i = aVar2.g(intValue);
                return 0;
            case 7:
                ek6Var.f373590m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
