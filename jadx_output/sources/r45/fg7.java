package r45;

/* loaded from: classes2.dex */
public class fg7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374326d;

    /* renamed from: e, reason: collision with root package name */
    public int f374327e;

    /* renamed from: f, reason: collision with root package name */
    public int f374328f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374329g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fg7)) {
            return false;
        }
        r45.fg7 fg7Var = (r45.fg7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374326d), java.lang.Integer.valueOf(fg7Var.f374326d)) && n51.f.a(java.lang.Integer.valueOf(this.f374327e), java.lang.Integer.valueOf(fg7Var.f374327e)) && n51.f.a(java.lang.Integer.valueOf(this.f374328f), java.lang.Integer.valueOf(fg7Var.f374328f)) && n51.f.a(this.f374329g, fg7Var.f374329g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374326d);
            fVar.e(2, this.f374327e);
            fVar.e(3, this.f374328f);
            java.lang.String str = this.f374329g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374326d) + 0 + b36.f.e(2, this.f374327e) + b36.f.e(3, this.f374328f);
            java.lang.String str2 = this.f374329g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        r45.fg7 fg7Var = (r45.fg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fg7Var.f374326d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fg7Var.f374327e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            fg7Var.f374328f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        fg7Var.f374329g = aVar2.k(intValue);
        return 0;
    }
}
