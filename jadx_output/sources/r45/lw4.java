package r45;

/* loaded from: classes9.dex */
public class lw4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379885d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379886e;

    /* renamed from: f, reason: collision with root package name */
    public long f379887f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379888g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lw4)) {
            return false;
        }
        r45.lw4 lw4Var = (r45.lw4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379885d), java.lang.Integer.valueOf(lw4Var.f379885d)) && n51.f.a(this.f379886e, lw4Var.f379886e) && n51.f.a(java.lang.Long.valueOf(this.f379887f), java.lang.Long.valueOf(lw4Var.f379887f)) && n51.f.a(this.f379888g, lw4Var.f379888g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379885d);
            java.lang.String str = this.f379886e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f379887f);
            java.lang.String str2 = this.f379888g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379885d) + 0;
            java.lang.String str3 = this.f379886e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int h17 = e17 + b36.f.h(3, this.f379887f);
            java.lang.String str4 = this.f379888g;
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
        r45.lw4 lw4Var = (r45.lw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lw4Var.f379885d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            lw4Var.f379886e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            lw4Var.f379887f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        lw4Var.f379888g = aVar2.k(intValue);
        return 0;
    }
}
