package r45;

/* loaded from: classes11.dex */
public class i53 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376740d = 7;

    /* renamed from: e, reason: collision with root package name */
    public long f376741e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f376742f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376743g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f376744h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f376745i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f376746m = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i53)) {
            return false;
        }
        r45.i53 i53Var = (r45.i53) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376740d), java.lang.Integer.valueOf(i53Var.f376740d)) && n51.f.a(java.lang.Long.valueOf(this.f376741e), java.lang.Long.valueOf(i53Var.f376741e)) && n51.f.a(java.lang.Integer.valueOf(this.f376742f), java.lang.Integer.valueOf(i53Var.f376742f)) && n51.f.a(this.f376743g, i53Var.f376743g) && n51.f.a(java.lang.Integer.valueOf(this.f376744h), java.lang.Integer.valueOf(i53Var.f376744h)) && n51.f.a(java.lang.Integer.valueOf(this.f376745i), java.lang.Integer.valueOf(i53Var.f376745i)) && n51.f.a(java.lang.Boolean.valueOf(this.f376746m), java.lang.Boolean.valueOf(i53Var.f376746m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376740d);
            fVar.h(2, this.f376741e);
            fVar.e(3, this.f376742f);
            java.lang.String str = this.f376743g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f376744h);
            fVar.e(6, this.f376745i);
            fVar.a(7, this.f376746m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376740d) + 0 + b36.f.h(2, this.f376741e) + b36.f.e(3, this.f376742f);
            java.lang.String str2 = this.f376743g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            return e17 + b36.f.e(5, this.f376744h) + b36.f.e(6, this.f376745i) + b36.f.a(7, this.f376746m);
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
        r45.i53 i53Var = (r45.i53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i53Var.f376740d = aVar2.g(intValue);
                return 0;
            case 2:
                i53Var.f376741e = aVar2.i(intValue);
                return 0;
            case 3:
                i53Var.f376742f = aVar2.g(intValue);
                return 0;
            case 4:
                i53Var.f376743g = aVar2.k(intValue);
                return 0;
            case 5:
                i53Var.f376744h = aVar2.g(intValue);
                return 0;
            case 6:
                i53Var.f376745i = aVar2.g(intValue);
                return 0;
            case 7:
                i53Var.f376746m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
