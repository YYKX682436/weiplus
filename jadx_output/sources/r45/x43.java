package r45;

/* loaded from: classes2.dex */
public class x43 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f389763d;

    /* renamed from: e, reason: collision with root package name */
    public int f389764e;

    /* renamed from: f, reason: collision with root package name */
    public double f389765f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389766g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389767h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389768i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x43)) {
            return false;
        }
        r45.x43 x43Var = (r45.x43) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f389763d), java.lang.Long.valueOf(x43Var.f389763d)) && n51.f.a(java.lang.Integer.valueOf(this.f389764e), java.lang.Integer.valueOf(x43Var.f389764e)) && n51.f.a(java.lang.Double.valueOf(this.f389765f), java.lang.Double.valueOf(x43Var.f389765f)) && n51.f.a(this.f389766g, x43Var.f389766g) && n51.f.a(this.f389767h, x43Var.f389767h) && n51.f.a(this.f389768i, x43Var.f389768i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f389763d);
            fVar.e(2, this.f389764e);
            fVar.c(3, this.f389765f);
            java.lang.String str = this.f389766g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f389767h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f389768i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f389763d) + 0 + b36.f.e(2, this.f389764e) + b36.f.c(3, this.f389765f);
            java.lang.String str4 = this.f389766g;
            if (str4 != null) {
                h17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f389767h;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f389768i;
            return str6 != null ? h17 + b36.f.j(6, str6) : h17;
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
        r45.x43 x43Var = (r45.x43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x43Var.f389763d = aVar2.i(intValue);
                return 0;
            case 2:
                x43Var.f389764e = aVar2.g(intValue);
                return 0;
            case 3:
                x43Var.f389765f = aVar2.e(intValue);
                return 0;
            case 4:
                x43Var.f389766g = aVar2.k(intValue);
                return 0;
            case 5:
                x43Var.f389767h = aVar2.k(intValue);
                return 0;
            case 6:
                x43Var.f389768i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
