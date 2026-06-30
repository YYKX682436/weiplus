package r45;

/* loaded from: classes9.dex */
public class qb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383803d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383804e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383805f;

    /* renamed from: g, reason: collision with root package name */
    public r45.na5 f383806g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ce4 f383807h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383808i;

    /* renamed from: m, reason: collision with root package name */
    public r45.oe0 f383809m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qb5)) {
            return false;
        }
        r45.qb5 qb5Var = (r45.qb5) fVar;
        return n51.f.a(this.BaseResponse, qb5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383803d), java.lang.Integer.valueOf(qb5Var.f383803d)) && n51.f.a(this.f383804e, qb5Var.f383804e) && n51.f.a(this.f383805f, qb5Var.f383805f) && n51.f.a(this.f383806g, qb5Var.f383806g) && n51.f.a(this.f383807h, qb5Var.f383807h) && n51.f.a(this.f383808i, qb5Var.f383808i) && n51.f.a(this.f383809m, qb5Var.f383809m);
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
            fVar.e(2, this.f383803d);
            java.lang.String str = this.f383804e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383805f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.na5 na5Var = this.f383806g;
            if (na5Var != null) {
                fVar.i(98, na5Var.computeSize());
                this.f383806g.writeFields(fVar);
            }
            r45.ce4 ce4Var = this.f383807h;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.computeSize());
                this.f383807h.writeFields(fVar);
            }
            java.lang.String str3 = this.f383808i;
            if (str3 != null) {
                fVar.j(100, str3);
            }
            r45.oe0 oe0Var = this.f383809m;
            if (oe0Var != null) {
                fVar.i(101, oe0Var.computeSize());
                this.f383809m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383803d);
            java.lang.String str4 = this.f383804e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f383805f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            r45.na5 na5Var2 = this.f383806g;
            if (na5Var2 != null) {
                i18 += b36.f.i(98, na5Var2.computeSize());
            }
            r45.ce4 ce4Var2 = this.f383807h;
            if (ce4Var2 != null) {
                i18 += b36.f.i(99, ce4Var2.computeSize());
            }
            java.lang.String str6 = this.f383808i;
            if (str6 != null) {
                i18 += b36.f.j(100, str6);
            }
            r45.oe0 oe0Var2 = this.f383809m;
            return oe0Var2 != null ? i18 + b36.f.i(101, oe0Var2.computeSize()) : i18;
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
        r45.qb5 qb5Var = (r45.qb5) objArr[1];
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
                qb5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qb5Var.f383803d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            qb5Var.f383804e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            qb5Var.f383805f = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 98:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.na5 na5Var3 = new r45.na5();
                    if (bArr2 != null && bArr2.length > 0) {
                        na5Var3.parseFrom(bArr2);
                    }
                    qb5Var.f383806g = na5Var3;
                }
                return 0;
            case 99:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ce4 ce4Var3 = new r45.ce4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ce4Var3.parseFrom(bArr3);
                    }
                    qb5Var.f383807h = ce4Var3;
                }
                return 0;
            case 100:
                qb5Var.f383808i = aVar2.k(intValue);
                return 0;
            case 101:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.oe0 oe0Var3 = new r45.oe0();
                    if (bArr4 != null && bArr4.length > 0) {
                        oe0Var3.parseFrom(bArr4);
                    }
                    qb5Var.f383809m = oe0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
