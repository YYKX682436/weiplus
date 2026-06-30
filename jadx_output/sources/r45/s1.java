package r45;

/* loaded from: classes15.dex */
public class s1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385374d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385375e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385376f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385377g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s1)) {
            return false;
        }
        r45.s1 s1Var = (r45.s1) fVar;
        return n51.f.a(this.f385374d, s1Var.f385374d) && n51.f.a(this.f385375e, s1Var.f385375e) && n51.f.a(this.f385376f, s1Var.f385376f) && n51.f.a(this.f385377g, s1Var.f385377g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385374d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385375e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385376f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f385377g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f385374d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f385375e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f385376f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f385377g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        r45.s1 s1Var = (r45.s1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s1Var.f385374d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            s1Var.f385375e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s1Var.f385376f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        s1Var.f385377g = aVar2.k(intValue);
        return 0;
    }
}
