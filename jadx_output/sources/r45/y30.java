package r45;

/* loaded from: classes8.dex */
public class y30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f390735d;

    /* renamed from: e, reason: collision with root package name */
    public int f390736e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390737f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390738g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y30)) {
            return false;
        }
        r45.y30 y30Var = (r45.y30) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f390735d), java.lang.Long.valueOf(y30Var.f390735d)) && n51.f.a(java.lang.Integer.valueOf(this.f390736e), java.lang.Integer.valueOf(y30Var.f390736e)) && n51.f.a(this.f390737f, y30Var.f390737f) && n51.f.a(this.f390738g, y30Var.f390738g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f390735d);
            fVar.e(2, this.f390736e);
            java.lang.String str = this.f390737f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f390738g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f390735d) + 0 + b36.f.e(2, this.f390736e);
            java.lang.String str3 = this.f390737f;
            if (str3 != null) {
                h17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f390738g;
            return str4 != null ? h17 + b36.f.j(4, str4) : h17;
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
        r45.y30 y30Var = (r45.y30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y30Var.f390735d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            y30Var.f390736e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            y30Var.f390737f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        y30Var.f390738g = aVar2.k(intValue);
        return 0;
    }
}
