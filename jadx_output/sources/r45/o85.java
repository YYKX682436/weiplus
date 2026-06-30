package r45;

/* loaded from: classes8.dex */
public class o85 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382029d;

    /* renamed from: e, reason: collision with root package name */
    public long f382030e;

    /* renamed from: f, reason: collision with root package name */
    public int f382031f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382032g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o85)) {
            return false;
        }
        r45.o85 o85Var = (r45.o85) fVar;
        return n51.f.a(this.f382029d, o85Var.f382029d) && n51.f.a(java.lang.Long.valueOf(this.f382030e), java.lang.Long.valueOf(o85Var.f382030e)) && n51.f.a(java.lang.Integer.valueOf(this.f382031f), java.lang.Integer.valueOf(o85Var.f382031f)) && n51.f.a(this.f382032g, o85Var.f382032g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382029d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f382030e);
            fVar.e(3, this.f382031f);
            java.lang.String str2 = this.f382032g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f382029d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f382030e) + b36.f.e(3, this.f382031f);
            java.lang.String str4 = this.f382032g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        r45.o85 o85Var = (r45.o85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o85Var.f382029d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            o85Var.f382030e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            o85Var.f382031f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        o85Var.f382032g = aVar2.k(intValue);
        return 0;
    }
}
