package r45;

/* loaded from: classes11.dex */
public class j9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f377655d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f377656e;

    /* renamed from: f, reason: collision with root package name */
    public int f377657f;

    /* renamed from: g, reason: collision with root package name */
    public int f377658g;

    /* renamed from: h, reason: collision with root package name */
    public int f377659h;

    /* renamed from: i, reason: collision with root package name */
    public int f377660i;

    /* renamed from: m, reason: collision with root package name */
    public int f377661m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f377662n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f377663o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f377664p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j9)) {
            return false;
        }
        r45.j9 j9Var = (r45.j9) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f377655d), java.lang.Boolean.valueOf(j9Var.f377655d)) && n51.f.a(java.lang.Boolean.valueOf(this.f377656e), java.lang.Boolean.valueOf(j9Var.f377656e)) && n51.f.a(java.lang.Integer.valueOf(this.f377657f), java.lang.Integer.valueOf(j9Var.f377657f)) && n51.f.a(java.lang.Integer.valueOf(this.f377658g), java.lang.Integer.valueOf(j9Var.f377658g)) && n51.f.a(java.lang.Integer.valueOf(this.f377659h), java.lang.Integer.valueOf(j9Var.f377659h)) && n51.f.a(java.lang.Integer.valueOf(this.f377660i), java.lang.Integer.valueOf(j9Var.f377660i)) && n51.f.a(java.lang.Integer.valueOf(this.f377661m), java.lang.Integer.valueOf(j9Var.f377661m)) && n51.f.a(java.lang.Boolean.valueOf(this.f377662n), java.lang.Boolean.valueOf(j9Var.f377662n)) && n51.f.a(java.lang.Boolean.valueOf(this.f377663o), java.lang.Boolean.valueOf(j9Var.f377663o)) && n51.f.a(java.lang.Boolean.valueOf(this.f377664p), java.lang.Boolean.valueOf(j9Var.f377664p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f377655d);
            fVar.a(2, this.f377656e);
            fVar.e(3, this.f377657f);
            fVar.e(4, this.f377658g);
            fVar.e(5, this.f377659h);
            fVar.e(6, this.f377660i);
            fVar.e(7, this.f377661m);
            fVar.a(8, this.f377662n);
            fVar.a(9, this.f377663o);
            fVar.a(10, this.f377664p);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f377655d) + 0 + b36.f.a(2, this.f377656e) + b36.f.e(3, this.f377657f) + b36.f.e(4, this.f377658g) + b36.f.e(5, this.f377659h) + b36.f.e(6, this.f377660i) + b36.f.e(7, this.f377661m) + b36.f.a(8, this.f377662n) + b36.f.a(9, this.f377663o) + b36.f.a(10, this.f377664p);
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
        r45.j9 j9Var = (r45.j9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j9Var.f377655d = aVar2.c(intValue);
                return 0;
            case 2:
                j9Var.f377656e = aVar2.c(intValue);
                return 0;
            case 3:
                j9Var.f377657f = aVar2.g(intValue);
                return 0;
            case 4:
                j9Var.f377658g = aVar2.g(intValue);
                return 0;
            case 5:
                j9Var.f377659h = aVar2.g(intValue);
                return 0;
            case 6:
                j9Var.f377660i = aVar2.g(intValue);
                return 0;
            case 7:
                j9Var.f377661m = aVar2.g(intValue);
                return 0;
            case 8:
                j9Var.f377662n = aVar2.c(intValue);
                return 0;
            case 9:
                j9Var.f377663o = aVar2.c(intValue);
                return 0;
            case 10:
                j9Var.f377664p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
