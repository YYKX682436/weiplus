package r45;

/* loaded from: classes4.dex */
public class u40 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387004d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387005e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ce4 f387006f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387007g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u40)) {
            return false;
        }
        r45.u40 u40Var = (r45.u40) fVar;
        return n51.f.a(this.BaseResponse, u40Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387004d), java.lang.Integer.valueOf(u40Var.f387004d)) && n51.f.a(this.f387005e, u40Var.f387005e) && n51.f.a(this.f387006f, u40Var.f387006f) && n51.f.a(this.f387007g, u40Var.f387007g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f387004d);
            java.lang.String str = this.f387005e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.ce4 ce4Var = this.f387006f;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.computeSize());
                this.f387006f.writeFields(fVar);
            }
            java.lang.String str2 = this.f387007g;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387004d);
            java.lang.String str3 = this.f387005e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.ce4 ce4Var2 = this.f387006f;
            if (ce4Var2 != null) {
                i18 += b36.f.i(99, ce4Var2.computeSize());
            }
            java.lang.String str4 = this.f387007g;
            return str4 != null ? i18 + b36.f.j(100, str4) : i18;
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
        r45.u40 u40Var = (r45.u40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                u40Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            u40Var.f387004d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            u40Var.f387005e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 99) {
            if (intValue != 100) {
                return -1;
            }
            u40Var.f387007g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ce4 ce4Var3 = new r45.ce4();
            if (bArr2 != null && bArr2.length > 0) {
                ce4Var3.parseFrom(bArr2);
            }
            u40Var.f387006f = ce4Var3;
        }
        return 0;
    }
}
