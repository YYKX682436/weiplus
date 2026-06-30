package r45;

/* loaded from: classes9.dex */
public class io0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377206d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377207e;

    /* renamed from: f, reason: collision with root package name */
    public long f377208f;

    /* renamed from: g, reason: collision with root package name */
    public long f377209g;

    /* renamed from: h, reason: collision with root package name */
    public long f377210h;

    /* renamed from: i, reason: collision with root package name */
    public int f377211i;

    /* renamed from: m, reason: collision with root package name */
    public long f377212m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.io0)) {
            return false;
        }
        r45.io0 io0Var = (r45.io0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377206d), java.lang.Integer.valueOf(io0Var.f377206d)) && n51.f.a(this.f377207e, io0Var.f377207e) && n51.f.a(java.lang.Long.valueOf(this.f377208f), java.lang.Long.valueOf(io0Var.f377208f)) && n51.f.a(java.lang.Long.valueOf(this.f377209g), java.lang.Long.valueOf(io0Var.f377209g)) && n51.f.a(java.lang.Long.valueOf(this.f377210h), java.lang.Long.valueOf(io0Var.f377210h)) && n51.f.a(java.lang.Integer.valueOf(this.f377211i), java.lang.Integer.valueOf(io0Var.f377211i)) && n51.f.a(java.lang.Long.valueOf(this.f377212m), java.lang.Long.valueOf(io0Var.f377212m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377206d);
            java.lang.String str = this.f377207e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f377208f);
            fVar.h(4, this.f377209g);
            fVar.h(5, this.f377210h);
            fVar.e(6, this.f377211i);
            fVar.h(7, this.f377212m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377206d) + 0;
            java.lang.String str2 = this.f377207e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f377208f) + b36.f.h(4, this.f377209g) + b36.f.h(5, this.f377210h) + b36.f.e(6, this.f377211i) + b36.f.h(7, this.f377212m);
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
        r45.io0 io0Var = (r45.io0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                io0Var.f377206d = aVar2.g(intValue);
                return 0;
            case 2:
                io0Var.f377207e = aVar2.k(intValue);
                return 0;
            case 3:
                io0Var.f377208f = aVar2.i(intValue);
                return 0;
            case 4:
                io0Var.f377209g = aVar2.i(intValue);
                return 0;
            case 5:
                io0Var.f377210h = aVar2.i(intValue);
                return 0;
            case 6:
                io0Var.f377211i = aVar2.g(intValue);
                return 0;
            case 7:
                io0Var.f377212m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
