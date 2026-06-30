package r45;

/* loaded from: classes4.dex */
public class dj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372523d;

    /* renamed from: e, reason: collision with root package name */
    public int f372524e;

    /* renamed from: f, reason: collision with root package name */
    public int f372525f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372526g;

    /* renamed from: h, reason: collision with root package name */
    public int f372527h;

    /* renamed from: i, reason: collision with root package name */
    public long f372528i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dj0)) {
            return false;
        }
        r45.dj0 dj0Var = (r45.dj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372523d), java.lang.Integer.valueOf(dj0Var.f372523d)) && n51.f.a(java.lang.Integer.valueOf(this.f372524e), java.lang.Integer.valueOf(dj0Var.f372524e)) && n51.f.a(java.lang.Integer.valueOf(this.f372525f), java.lang.Integer.valueOf(dj0Var.f372525f)) && n51.f.a(this.f372526g, dj0Var.f372526g) && n51.f.a(java.lang.Integer.valueOf(this.f372527h), java.lang.Integer.valueOf(dj0Var.f372527h)) && n51.f.a(java.lang.Long.valueOf(this.f372528i), java.lang.Long.valueOf(dj0Var.f372528i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372523d);
            fVar.e(2, this.f372524e);
            fVar.e(3, this.f372525f);
            java.lang.String str = this.f372526g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f372527h);
            fVar.h(6, this.f372528i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372523d) + 0 + b36.f.e(2, this.f372524e) + b36.f.e(3, this.f372525f);
            java.lang.String str2 = this.f372526g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            return e17 + b36.f.e(5, this.f372527h) + b36.f.h(6, this.f372528i);
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
        r45.dj0 dj0Var = (r45.dj0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dj0Var.f372523d = aVar2.g(intValue);
                return 0;
            case 2:
                dj0Var.f372524e = aVar2.g(intValue);
                return 0;
            case 3:
                dj0Var.f372525f = aVar2.g(intValue);
                return 0;
            case 4:
                dj0Var.f372526g = aVar2.k(intValue);
                return 0;
            case 5:
                dj0Var.f372527h = aVar2.g(intValue);
                return 0;
            case 6:
                dj0Var.f372528i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
