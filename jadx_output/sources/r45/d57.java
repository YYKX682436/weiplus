package r45;

/* loaded from: classes7.dex */
public class d57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.a47 f372134d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372135e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372136f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372137g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d57)) {
            return false;
        }
        r45.d57 d57Var = (r45.d57) fVar;
        return n51.f.a(this.f372134d, d57Var.f372134d) && n51.f.a(this.f372135e, d57Var.f372135e) && n51.f.a(this.f372136f, d57Var.f372136f) && n51.f.a(this.f372137g, d57Var.f372137g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.a47 a47Var = this.f372134d;
            if (a47Var != null) {
                fVar.i(1, a47Var.computeSize());
                this.f372134d.writeFields(fVar);
            }
            java.lang.String str = this.f372135e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f372136f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f372137g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.a47 a47Var2 = this.f372134d;
            int i18 = a47Var2 != null ? 0 + b36.f.i(1, a47Var2.computeSize()) : 0;
            java.lang.String str4 = this.f372135e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f372136f;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f372137g;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        r45.d57 d57Var = (r45.d57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                d57Var.f372135e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                d57Var.f372136f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            d57Var.f372137g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.a47 a47Var3 = new r45.a47();
            if (bArr != null && bArr.length > 0) {
                a47Var3.parseFrom(bArr);
            }
            d57Var.f372134d = a47Var3;
        }
        return 0;
    }
}
