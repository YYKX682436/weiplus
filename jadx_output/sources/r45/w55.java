package r45;

/* loaded from: classes8.dex */
public class w55 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388899d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388900e;

    /* renamed from: f, reason: collision with root package name */
    public int f388901f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388902g;

    /* renamed from: h, reason: collision with root package name */
    public r45.r1 f388903h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w55)) {
            return false;
        }
        r45.w55 w55Var = (r45.w55) fVar;
        return n51.f.a(this.BaseRequest, w55Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f388899d), java.lang.Integer.valueOf(w55Var.f388899d)) && n51.f.a(this.f388900e, w55Var.f388900e) && n51.f.a(java.lang.Integer.valueOf(this.f388901f), java.lang.Integer.valueOf(w55Var.f388901f)) && n51.f.a(this.f388902g, w55Var.f388902g) && n51.f.a(this.f388903h, w55Var.f388903h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f388899d);
            java.lang.String str = this.f388900e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f388901f);
            java.lang.String str2 = this.f388902g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.r1 r1Var = this.f388903h;
            if (r1Var != null) {
                fVar.i(6, r1Var.computeSize());
                this.f388903h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f388899d);
            java.lang.String str3 = this.f388900e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f388901f);
            java.lang.String str4 = this.f388902g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            r45.r1 r1Var2 = this.f388903h;
            return r1Var2 != null ? e17 + b36.f.i(6, r1Var2.computeSize()) : e17;
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
        r45.w55 w55Var = (r45.w55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    w55Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                w55Var.f388899d = aVar2.g(intValue);
                return 0;
            case 3:
                w55Var.f388900e = aVar2.k(intValue);
                return 0;
            case 4:
                w55Var.f388901f = aVar2.g(intValue);
                return 0;
            case 5:
                w55Var.f388902g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr2 != null && bArr2.length > 0) {
                        r1Var3.parseFrom(bArr2);
                    }
                    w55Var.f388903h = r1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
