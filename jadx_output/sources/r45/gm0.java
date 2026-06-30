package r45;

/* loaded from: classes2.dex */
public class gm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375361d;

    /* renamed from: e, reason: collision with root package name */
    public int f375362e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375363f;

    /* renamed from: g, reason: collision with root package name */
    public int f375364g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gm0)) {
            return false;
        }
        r45.gm0 gm0Var = (r45.gm0) fVar;
        return n51.f.a(this.f375361d, gm0Var.f375361d) && n51.f.a(java.lang.Integer.valueOf(this.f375362e), java.lang.Integer.valueOf(gm0Var.f375362e)) && n51.f.a(this.f375363f, gm0Var.f375363f) && n51.f.a(java.lang.Integer.valueOf(this.f375364g), java.lang.Integer.valueOf(gm0Var.f375364g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375361d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f375362e);
            java.lang.String str2 = this.f375363f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f375364g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f375361d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f375362e);
            java.lang.String str4 = this.f375363f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f375364g);
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
        r45.gm0 gm0Var = (r45.gm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gm0Var.f375361d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gm0Var.f375362e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            gm0Var.f375363f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gm0Var.f375364g = aVar2.g(intValue);
        return 0;
    }
}
