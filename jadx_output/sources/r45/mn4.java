package r45;

/* loaded from: classes8.dex */
public class mn4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380691d;

    /* renamed from: e, reason: collision with root package name */
    public int f380692e;

    /* renamed from: f, reason: collision with root package name */
    public int f380693f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mn4)) {
            return false;
        }
        r45.mn4 mn4Var = (r45.mn4) fVar;
        return n51.f.a(this.f380691d, mn4Var.f380691d) && n51.f.a(java.lang.Integer.valueOf(this.f380692e), java.lang.Integer.valueOf(mn4Var.f380692e)) && n51.f.a(java.lang.Integer.valueOf(this.f380693f), java.lang.Integer.valueOf(mn4Var.f380693f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380691d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f380692e);
            fVar.e(3, this.f380693f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f380691d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f380692e) + b36.f.e(3, this.f380693f);
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
        r45.mn4 mn4Var = (r45.mn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mn4Var.f380691d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            mn4Var.f380692e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        mn4Var.f380693f = aVar2.g(intValue);
        return 0;
    }
}
