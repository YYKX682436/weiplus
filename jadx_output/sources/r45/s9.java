package r45;

/* loaded from: classes2.dex */
public class s9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385569d;

    /* renamed from: e, reason: collision with root package name */
    public long f385570e;

    /* renamed from: f, reason: collision with root package name */
    public int f385571f;

    /* renamed from: g, reason: collision with root package name */
    public int f385572g;

    /* renamed from: h, reason: collision with root package name */
    public int f385573h;

    /* renamed from: i, reason: collision with root package name */
    public long f385574i;

    /* renamed from: m, reason: collision with root package name */
    public int f385575m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385576n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s9)) {
            return false;
        }
        r45.s9 s9Var = (r45.s9) fVar;
        return n51.f.a(this.f385569d, s9Var.f385569d) && n51.f.a(java.lang.Long.valueOf(this.f385570e), java.lang.Long.valueOf(s9Var.f385570e)) && n51.f.a(java.lang.Integer.valueOf(this.f385571f), java.lang.Integer.valueOf(s9Var.f385571f)) && n51.f.a(java.lang.Integer.valueOf(this.f385572g), java.lang.Integer.valueOf(s9Var.f385572g)) && n51.f.a(java.lang.Integer.valueOf(this.f385573h), java.lang.Integer.valueOf(s9Var.f385573h)) && n51.f.a(java.lang.Long.valueOf(this.f385574i), java.lang.Long.valueOf(s9Var.f385574i)) && n51.f.a(java.lang.Integer.valueOf(this.f385575m), java.lang.Integer.valueOf(s9Var.f385575m)) && n51.f.a(this.f385576n, s9Var.f385576n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385569d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f385570e);
            fVar.e(3, this.f385571f);
            fVar.e(4, this.f385572g);
            fVar.e(5, this.f385573h);
            fVar.h(6, this.f385574i);
            fVar.e(7, this.f385575m);
            java.lang.String str2 = this.f385576n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f385569d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f385570e) + b36.f.e(3, this.f385571f) + b36.f.e(4, this.f385572g) + b36.f.e(5, this.f385573h) + b36.f.h(6, this.f385574i) + b36.f.e(7, this.f385575m);
            java.lang.String str4 = this.f385576n;
            return str4 != null ? j17 + b36.f.j(8, str4) : j17;
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
        r45.s9 s9Var = (r45.s9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s9Var.f385569d = aVar2.k(intValue);
                return 0;
            case 2:
                s9Var.f385570e = aVar2.i(intValue);
                return 0;
            case 3:
                s9Var.f385571f = aVar2.g(intValue);
                return 0;
            case 4:
                s9Var.f385572g = aVar2.g(intValue);
                return 0;
            case 5:
                s9Var.f385573h = aVar2.g(intValue);
                return 0;
            case 6:
                s9Var.f385574i = aVar2.i(intValue);
                return 0;
            case 7:
                s9Var.f385575m = aVar2.g(intValue);
                return 0;
            case 8:
                s9Var.f385576n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
