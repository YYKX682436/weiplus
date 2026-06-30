package r45;

/* loaded from: classes2.dex */
public class vr0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388454d;

    /* renamed from: e, reason: collision with root package name */
    public int f388455e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388456f;

    /* renamed from: g, reason: collision with root package name */
    public int f388457g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388458h;

    /* renamed from: i, reason: collision with root package name */
    public r45.j32 f388459i;

    /* renamed from: m, reason: collision with root package name */
    public int f388460m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vr0)) {
            return false;
        }
        r45.vr0 vr0Var = (r45.vr0) fVar;
        return n51.f.a(this.BaseResponse, vr0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f388454d), java.lang.Integer.valueOf(vr0Var.f388454d)) && n51.f.a(java.lang.Integer.valueOf(this.f388455e), java.lang.Integer.valueOf(vr0Var.f388455e)) && n51.f.a(this.f388456f, vr0Var.f388456f) && n51.f.a(java.lang.Integer.valueOf(this.f388457g), java.lang.Integer.valueOf(vr0Var.f388457g)) && n51.f.a(this.f388458h, vr0Var.f388458h) && n51.f.a(this.f388459i, vr0Var.f388459i) && n51.f.a(java.lang.Integer.valueOf(this.f388460m), java.lang.Integer.valueOf(vr0Var.f388460m));
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
            fVar.e(2, this.f388454d);
            fVar.e(3, this.f388455e);
            java.lang.String str = this.f388456f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f388457g);
            java.lang.String str2 = this.f388458h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.j32 j32Var = this.f388459i;
            if (j32Var != null) {
                fVar.i(7, j32Var.computeSize());
                this.f388459i.writeFields(fVar);
            }
            fVar.e(16, this.f388460m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f388454d) + b36.f.e(3, this.f388455e);
            java.lang.String str3 = this.f388456f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f388457g);
            java.lang.String str4 = this.f388458h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            r45.j32 j32Var2 = this.f388459i;
            if (j32Var2 != null) {
                e17 += b36.f.i(7, j32Var2.computeSize());
            }
            return e17 + b36.f.e(16, this.f388460m);
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
        r45.vr0 vr0Var = (r45.vr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 16) {
            vr0Var.f388460m = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    vr0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                vr0Var.f388454d = aVar2.g(intValue);
                return 0;
            case 3:
                vr0Var.f388455e = aVar2.g(intValue);
                return 0;
            case 4:
                vr0Var.f388456f = aVar2.k(intValue);
                return 0;
            case 5:
                vr0Var.f388457g = aVar2.g(intValue);
                return 0;
            case 6:
                vr0Var.f388458h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr2 != null && bArr2.length > 0) {
                        j32Var3.parseFrom(bArr2);
                    }
                    vr0Var.f388459i = j32Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
