package r45;

/* loaded from: classes4.dex */
public class g67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374930d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374931e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374932f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374933g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g67)) {
            return false;
        }
        r45.g67 g67Var = (r45.g67) fVar;
        return n51.f.a(this.f374930d, g67Var.f374930d) && n51.f.a(this.f374931e, g67Var.f374931e) && n51.f.a(this.f374932f, g67Var.f374932f) && n51.f.a(this.f374933g, g67Var.f374933g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374930d;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f374931e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str2 = this.f374932f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374933g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f374930d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f374931e;
            if (gVar2 != null) {
                j17 += b36.f.b(2, gVar2);
            }
            java.lang.String str5 = this.f374932f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f374933g;
            return str6 != null ? j17 + b36.f.j(4, str6) : j17;
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
        r45.g67 g67Var = (r45.g67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g67Var.f374930d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            g67Var.f374931e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            g67Var.f374932f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        g67Var.f374933g = aVar2.k(intValue);
        return 0;
    }
}
