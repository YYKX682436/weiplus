package r45;

/* loaded from: classes9.dex */
public class ff5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374280d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374281e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374282f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374283g;

    /* renamed from: h, reason: collision with root package name */
    public int f374284h;

    /* renamed from: i, reason: collision with root package name */
    public int f374285i;

    /* renamed from: m, reason: collision with root package name */
    public r45.na5 f374286m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ce4 f374287n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f374288o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ff5)) {
            return false;
        }
        r45.ff5 ff5Var = (r45.ff5) fVar;
        return n51.f.a(this.BaseResponse, ff5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f374280d), java.lang.Integer.valueOf(ff5Var.f374280d)) && n51.f.a(this.f374281e, ff5Var.f374281e) && n51.f.a(this.f374282f, ff5Var.f374282f) && n51.f.a(this.f374283g, ff5Var.f374283g) && n51.f.a(java.lang.Integer.valueOf(this.f374284h), java.lang.Integer.valueOf(ff5Var.f374284h)) && n51.f.a(java.lang.Integer.valueOf(this.f374285i), java.lang.Integer.valueOf(ff5Var.f374285i)) && n51.f.a(this.f374286m, ff5Var.f374286m) && n51.f.a(this.f374287n, ff5Var.f374287n) && n51.f.a(this.f374288o, ff5Var.f374288o);
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
            fVar.e(2, this.f374280d);
            java.lang.String str = this.f374281e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f374282f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f374283g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f374284h);
            fVar.e(7, this.f374285i);
            r45.na5 na5Var = this.f374286m;
            if (na5Var != null) {
                fVar.i(98, na5Var.computeSize());
                this.f374286m.writeFields(fVar);
            }
            r45.ce4 ce4Var = this.f374287n;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.computeSize());
                this.f374287n.writeFields(fVar);
            }
            java.lang.String str4 = this.f374288o;
            if (str4 != null) {
                fVar.j(100, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f374280d);
            java.lang.String str5 = this.f374281e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f374282f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f374283g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int e17 = i18 + b36.f.e(6, this.f374284h) + b36.f.e(7, this.f374285i);
            r45.na5 na5Var2 = this.f374286m;
            if (na5Var2 != null) {
                e17 += b36.f.i(98, na5Var2.computeSize());
            }
            r45.ce4 ce4Var2 = this.f374287n;
            if (ce4Var2 != null) {
                e17 += b36.f.i(99, ce4Var2.computeSize());
            }
            java.lang.String str8 = this.f374288o;
            return str8 != null ? e17 + b36.f.j(100, str8) : e17;
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
        r45.ff5 ff5Var = (r45.ff5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
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
                    ff5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ff5Var.f374280d = aVar2.g(intValue);
                return 0;
            case 3:
                ff5Var.f374281e = aVar2.k(intValue);
                return 0;
            case 4:
                ff5Var.f374282f = aVar2.k(intValue);
                return 0;
            case 5:
                ff5Var.f374283g = aVar2.k(intValue);
                return 0;
            case 6:
                ff5Var.f374284h = aVar2.g(intValue);
                return 0;
            case 7:
                ff5Var.f374285i = aVar2.g(intValue);
                return 0;
            default:
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
                            ff5Var.f374286m = na5Var3;
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
                            ff5Var.f374287n = ce4Var3;
                        }
                        return 0;
                    case 100:
                        ff5Var.f374288o = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
