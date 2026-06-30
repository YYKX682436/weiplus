package r45;

/* loaded from: classes4.dex */
public class nw4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381710d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381711e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381712f;

    /* renamed from: g, reason: collision with root package name */
    public int f381713g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nw4)) {
            return false;
        }
        r45.nw4 nw4Var = (r45.nw4) fVar;
        return n51.f.a(this.f381710d, nw4Var.f381710d) && n51.f.a(this.f381711e, nw4Var.f381711e) && n51.f.a(this.f381712f, nw4Var.f381712f) && n51.f.a(java.lang.Integer.valueOf(this.f381713g), java.lang.Integer.valueOf(nw4Var.f381713g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381710d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381711e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381712f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f381713g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f381710d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f381711e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f381712f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f381713g);
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
        r45.nw4 nw4Var = (r45.nw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nw4Var.f381710d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            nw4Var.f381711e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nw4Var.f381712f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        nw4Var.f381713g = aVar2.g(intValue);
        return 0;
    }
}
