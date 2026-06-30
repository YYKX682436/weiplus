package r45;

/* loaded from: classes11.dex */
public class hl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f376251d;

    /* renamed from: e, reason: collision with root package name */
    public int f376252e;

    /* renamed from: f, reason: collision with root package name */
    public int f376253f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f376254g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f376255h;

    /* renamed from: i, reason: collision with root package name */
    public int f376256i;

    /* renamed from: m, reason: collision with root package name */
    public int f376257m;

    /* renamed from: n, reason: collision with root package name */
    public int f376258n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hl)) {
            return false;
        }
        r45.hl hlVar = (r45.hl) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f376251d), java.lang.Boolean.valueOf(hlVar.f376251d)) && n51.f.a(java.lang.Integer.valueOf(this.f376252e), java.lang.Integer.valueOf(hlVar.f376252e)) && n51.f.a(java.lang.Integer.valueOf(this.f376253f), java.lang.Integer.valueOf(hlVar.f376253f)) && n51.f.a(java.lang.Boolean.valueOf(this.f376254g), java.lang.Boolean.valueOf(hlVar.f376254g)) && n51.f.a(java.lang.Boolean.valueOf(this.f376255h), java.lang.Boolean.valueOf(hlVar.f376255h)) && n51.f.a(java.lang.Integer.valueOf(this.f376256i), java.lang.Integer.valueOf(hlVar.f376256i)) && n51.f.a(java.lang.Integer.valueOf(this.f376257m), java.lang.Integer.valueOf(hlVar.f376257m)) && n51.f.a(java.lang.Integer.valueOf(this.f376258n), java.lang.Integer.valueOf(hlVar.f376258n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f376251d);
            fVar.e(2, this.f376252e);
            fVar.e(3, this.f376253f);
            fVar.a(4, this.f376254g);
            fVar.a(5, this.f376255h);
            fVar.e(6, this.f376256i);
            fVar.e(7, this.f376257m);
            fVar.e(8, this.f376258n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f376251d) + 0 + b36.f.e(2, this.f376252e) + b36.f.e(3, this.f376253f) + b36.f.a(4, this.f376254g) + b36.f.a(5, this.f376255h) + b36.f.e(6, this.f376256i) + b36.f.e(7, this.f376257m) + b36.f.e(8, this.f376258n);
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
        r45.hl hlVar = (r45.hl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hlVar.f376251d = aVar2.c(intValue);
                return 0;
            case 2:
                hlVar.f376252e = aVar2.g(intValue);
                return 0;
            case 3:
                hlVar.f376253f = aVar2.g(intValue);
                return 0;
            case 4:
                hlVar.f376254g = aVar2.c(intValue);
                return 0;
            case 5:
                hlVar.f376255h = aVar2.c(intValue);
                return 0;
            case 6:
                hlVar.f376256i = aVar2.g(intValue);
                return 0;
            case 7:
                hlVar.f376257m = aVar2.g(intValue);
                return 0;
            case 8:
                hlVar.f376258n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
