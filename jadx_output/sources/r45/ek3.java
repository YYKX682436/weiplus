package r45;

/* loaded from: classes8.dex */
public class ek3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373578d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373579e;

    /* renamed from: f, reason: collision with root package name */
    public int f373580f;

    /* renamed from: g, reason: collision with root package name */
    public int f373581g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ek3)) {
            return false;
        }
        r45.ek3 ek3Var = (r45.ek3) fVar;
        return n51.f.a(this.f373578d, ek3Var.f373578d) && n51.f.a(this.f373579e, ek3Var.f373579e) && n51.f.a(java.lang.Integer.valueOf(this.f373580f), java.lang.Integer.valueOf(ek3Var.f373580f)) && n51.f.a(java.lang.Integer.valueOf(this.f373581g), java.lang.Integer.valueOf(ek3Var.f373581g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373578d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373579e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f373580f);
            fVar.e(4, this.f373581g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f373578d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f373579e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f373580f) + b36.f.e(4, this.f373581g);
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
        r45.ek3 ek3Var = (r45.ek3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ek3Var.f373578d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ek3Var.f373579e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ek3Var.f373580f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ek3Var.f373581g = aVar2.g(intValue);
        return 0;
    }
}
