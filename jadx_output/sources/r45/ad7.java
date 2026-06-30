package r45;

/* loaded from: classes7.dex */
public class ad7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369949d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f369950e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369951f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369952g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ad7)) {
            return false;
        }
        r45.ad7 ad7Var = (r45.ad7) fVar;
        return n51.f.a(this.f369949d, ad7Var.f369949d) && n51.f.a(this.f369950e, ad7Var.f369950e) && n51.f.a(this.f369951f, ad7Var.f369951f) && n51.f.a(this.f369952g, ad7Var.f369952g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369949d;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f369950e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str2 = this.f369951f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f369952g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f369949d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f369950e;
            if (gVar2 != null) {
                j17 += b36.f.b(2, gVar2);
            }
            java.lang.String str5 = this.f369951f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f369952g;
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
        r45.ad7 ad7Var = (r45.ad7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ad7Var.f369949d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ad7Var.f369950e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            ad7Var.f369951f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ad7Var.f369952g = aVar2.k(intValue);
        return 0;
    }
}
