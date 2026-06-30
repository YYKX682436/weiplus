package r45;

/* loaded from: classes7.dex */
public class p54 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382765d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382766e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382767f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382768g;

    /* renamed from: h, reason: collision with root package name */
    public int f382769h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p54)) {
            return false;
        }
        r45.p54 p54Var = (r45.p54) fVar;
        return n51.f.a(this.BaseRequest, p54Var.BaseRequest) && n51.f.a(this.f382765d, p54Var.f382765d) && n51.f.a(this.f382766e, p54Var.f382766e) && n51.f.a(this.f382767f, p54Var.f382767f) && n51.f.a(this.f382768g, p54Var.f382768g) && n51.f.a(java.lang.Integer.valueOf(this.f382769h), java.lang.Integer.valueOf(p54Var.f382769h));
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
            java.lang.String str = this.f382765d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382766e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382767f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f382768g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f382769h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f382765d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f382766e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f382767f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f382768g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            return i18 + b36.f.e(6, this.f382769h);
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
        r45.p54 p54Var = (r45.p54) objArr[1];
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
                    p54Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                p54Var.f382765d = aVar2.k(intValue);
                return 0;
            case 3:
                p54Var.f382766e = aVar2.k(intValue);
                return 0;
            case 4:
                p54Var.f382767f = aVar2.k(intValue);
                return 0;
            case 5:
                p54Var.f382768g = aVar2.k(intValue);
                return 0;
            case 6:
                p54Var.f382769h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
