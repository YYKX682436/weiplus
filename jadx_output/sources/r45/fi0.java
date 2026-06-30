package r45;

/* loaded from: classes10.dex */
public class fi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374374d;

    /* renamed from: e, reason: collision with root package name */
    public int f374375e;

    /* renamed from: f, reason: collision with root package name */
    public int f374376f;

    /* renamed from: g, reason: collision with root package name */
    public int f374377g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fi0)) {
            return false;
        }
        r45.fi0 fi0Var = (r45.fi0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374374d), java.lang.Integer.valueOf(fi0Var.f374374d)) && n51.f.a(java.lang.Integer.valueOf(this.f374375e), java.lang.Integer.valueOf(fi0Var.f374375e)) && n51.f.a(java.lang.Integer.valueOf(this.f374376f), java.lang.Integer.valueOf(fi0Var.f374376f)) && n51.f.a(java.lang.Integer.valueOf(this.f374377g), java.lang.Integer.valueOf(fi0Var.f374377g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374374d);
            fVar.e(2, this.f374375e);
            fVar.e(3, this.f374376f);
            fVar.e(4, this.f374377g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f374374d) + 0 + b36.f.e(2, this.f374375e) + b36.f.e(3, this.f374376f) + b36.f.e(4, this.f374377g);
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
        r45.fi0 fi0Var = (r45.fi0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fi0Var.f374374d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fi0Var.f374375e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            fi0Var.f374376f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        fi0Var.f374377g = aVar2.g(intValue);
        return 0;
    }
}
