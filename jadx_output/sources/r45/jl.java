package r45;

/* loaded from: classes9.dex */
public class jl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377906d;

    /* renamed from: e, reason: collision with root package name */
    public int f377907e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377908f;

    /* renamed from: g, reason: collision with root package name */
    public int f377909g;

    /* renamed from: h, reason: collision with root package name */
    public long f377910h;

    /* renamed from: i, reason: collision with root package name */
    public int f377911i;

    /* renamed from: m, reason: collision with root package name */
    public int f377912m;

    /* renamed from: n, reason: collision with root package name */
    public int f377913n;

    /* renamed from: o, reason: collision with root package name */
    public int f377914o;

    /* renamed from: p, reason: collision with root package name */
    public int f377915p;

    /* renamed from: q, reason: collision with root package name */
    public int f377916q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jl)) {
            return false;
        }
        r45.jl jlVar = (r45.jl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377906d), java.lang.Integer.valueOf(jlVar.f377906d)) && n51.f.a(java.lang.Integer.valueOf(this.f377907e), java.lang.Integer.valueOf(jlVar.f377907e)) && n51.f.a(this.f377908f, jlVar.f377908f) && n51.f.a(java.lang.Integer.valueOf(this.f377909g), java.lang.Integer.valueOf(jlVar.f377909g)) && n51.f.a(java.lang.Long.valueOf(this.f377910h), java.lang.Long.valueOf(jlVar.f377910h)) && n51.f.a(java.lang.Integer.valueOf(this.f377911i), java.lang.Integer.valueOf(jlVar.f377911i)) && n51.f.a(java.lang.Integer.valueOf(this.f377912m), java.lang.Integer.valueOf(jlVar.f377912m)) && n51.f.a(java.lang.Integer.valueOf(this.f377913n), java.lang.Integer.valueOf(jlVar.f377913n)) && n51.f.a(java.lang.Integer.valueOf(this.f377914o), java.lang.Integer.valueOf(jlVar.f377914o)) && n51.f.a(java.lang.Integer.valueOf(this.f377915p), java.lang.Integer.valueOf(jlVar.f377915p)) && n51.f.a(java.lang.Integer.valueOf(this.f377916q), java.lang.Integer.valueOf(jlVar.f377916q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377906d);
            fVar.e(5, this.f377907e);
            java.lang.String str = this.f377908f;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f377909g);
            fVar.h(8, this.f377910h);
            fVar.e(9, this.f377911i);
            fVar.e(10, this.f377912m);
            fVar.e(11, this.f377913n);
            fVar.e(12, this.f377914o);
            fVar.e(13, this.f377915p);
            fVar.e(14, this.f377916q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377906d) + 0 + b36.f.e(5, this.f377907e);
            java.lang.String str2 = this.f377908f;
            if (str2 != null) {
                e17 += b36.f.j(6, str2);
            }
            return e17 + b36.f.e(7, this.f377909g) + b36.f.h(8, this.f377910h) + b36.f.e(9, this.f377911i) + b36.f.e(10, this.f377912m) + b36.f.e(11, this.f377913n) + b36.f.e(12, this.f377914o) + b36.f.e(13, this.f377915p) + b36.f.e(14, this.f377916q);
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
        r45.jl jlVar = (r45.jl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jlVar.f377906d = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 5:
                jlVar.f377907e = aVar2.g(intValue);
                return 0;
            case 6:
                jlVar.f377908f = aVar2.k(intValue);
                return 0;
            case 7:
                jlVar.f377909g = aVar2.g(intValue);
                return 0;
            case 8:
                jlVar.f377910h = aVar2.i(intValue);
                return 0;
            case 9:
                jlVar.f377911i = aVar2.g(intValue);
                return 0;
            case 10:
                jlVar.f377912m = aVar2.g(intValue);
                return 0;
            case 11:
                jlVar.f377913n = aVar2.g(intValue);
                return 0;
            case 12:
                jlVar.f377914o = aVar2.g(intValue);
                return 0;
            case 13:
                jlVar.f377915p = aVar2.g(intValue);
                return 0;
            case 14:
                jlVar.f377916q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
