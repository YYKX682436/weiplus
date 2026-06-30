package r45;

/* loaded from: classes4.dex */
public class ks0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378915d;

    /* renamed from: e, reason: collision with root package name */
    public int f378916e;

    /* renamed from: f, reason: collision with root package name */
    public int f378917f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378918g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ks0)) {
            return false;
        }
        r45.ks0 ks0Var = (r45.ks0) fVar;
        return n51.f.a(this.f378915d, ks0Var.f378915d) && n51.f.a(java.lang.Integer.valueOf(this.f378916e), java.lang.Integer.valueOf(ks0Var.f378916e)) && n51.f.a(java.lang.Integer.valueOf(this.f378917f), java.lang.Integer.valueOf(ks0Var.f378917f)) && n51.f.a(this.f378918g, ks0Var.f378918g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378915d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f378916e);
            fVar.e(3, this.f378917f);
            java.lang.String str2 = this.f378918g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f378915d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f378916e) + b36.f.e(3, this.f378917f);
            java.lang.String str4 = this.f378918g;
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
        r45.ks0 ks0Var = (r45.ks0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ks0Var.f378915d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ks0Var.f378916e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ks0Var.f378917f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ks0Var.f378918g = aVar2.k(intValue);
        return 0;
    }
}
