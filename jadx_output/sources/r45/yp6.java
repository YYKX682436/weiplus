package r45;

/* loaded from: classes9.dex */
public class yp6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391276d;

    /* renamed from: e, reason: collision with root package name */
    public int f391277e;

    /* renamed from: f, reason: collision with root package name */
    public r45.w04 f391278f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f391279g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391280h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391281i;

    /* renamed from: m, reason: collision with root package name */
    public r45.sv5 f391282m;

    /* renamed from: n, reason: collision with root package name */
    public int f391283n;

    /* renamed from: o, reason: collision with root package name */
    public r45.qa f391284o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yp6)) {
            return false;
        }
        r45.yp6 yp6Var = (r45.yp6) fVar;
        return n51.f.a(this.BaseRequest, yp6Var.BaseRequest) && n51.f.a(this.f391276d, yp6Var.f391276d) && n51.f.a(java.lang.Integer.valueOf(this.f391277e), java.lang.Integer.valueOf(yp6Var.f391277e)) && n51.f.a(this.f391278f, yp6Var.f391278f) && n51.f.a(this.f391279g, yp6Var.f391279g) && n51.f.a(this.f391280h, yp6Var.f391280h) && n51.f.a(this.f391281i, yp6Var.f391281i) && n51.f.a(this.f391282m, yp6Var.f391282m) && n51.f.a(java.lang.Integer.valueOf(this.f391283n), java.lang.Integer.valueOf(yp6Var.f391283n)) && n51.f.a(this.f391284o, yp6Var.f391284o);
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
            java.lang.String str = this.f391276d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f391277e);
            r45.w04 w04Var = this.f391278f;
            if (w04Var != null) {
                fVar.i(4, w04Var.computeSize());
                this.f391278f.writeFields(fVar);
            }
            fVar.g(5, 8, this.f391279g);
            java.lang.String str2 = this.f391280h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f391281i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.sv5 sv5Var = this.f391282m;
            if (sv5Var != null) {
                fVar.i(10, sv5Var.computeSize());
                this.f391282m.writeFields(fVar);
            }
            fVar.e(11, this.f391283n);
            r45.qa qaVar = this.f391284o;
            if (qaVar != null) {
                fVar.i(12, qaVar.computeSize());
                this.f391284o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f391276d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f391277e);
            r45.w04 w04Var2 = this.f391278f;
            if (w04Var2 != null) {
                e17 += b36.f.i(4, w04Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(5, 8, this.f391279g);
            java.lang.String str5 = this.f391280h;
            if (str5 != null) {
                g17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f391281i;
            if (str6 != null) {
                g17 += b36.f.j(7, str6);
            }
            r45.sv5 sv5Var2 = this.f391282m;
            if (sv5Var2 != null) {
                g17 += b36.f.i(10, sv5Var2.computeSize());
            }
            int e18 = g17 + b36.f.e(11, this.f391283n);
            r45.qa qaVar2 = this.f391284o;
            return qaVar2 != null ? e18 + b36.f.i(12, qaVar2.computeSize()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f391279g.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.yp6 yp6Var = (r45.yp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    yp6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                yp6Var.f391276d = aVar2.k(intValue);
                return 0;
            case 3:
                yp6Var.f391277e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.w04 w04Var3 = new r45.w04();
                    if (bArr3 != null && bArr3.length > 0) {
                        w04Var3.parseFrom(bArr3);
                    }
                    yp6Var.f391278f = w04Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.y7 y7Var = new r45.y7();
                    if (bArr4 != null && bArr4.length > 0) {
                        y7Var.parseFrom(bArr4);
                    }
                    yp6Var.f391279g.add(y7Var);
                }
                return 0;
            case 6:
                yp6Var.f391280h = aVar2.k(intValue);
                return 0;
            case 7:
                yp6Var.f391281i = aVar2.k(intValue);
                return 0;
            case 8:
            case 9:
            default:
                return -1;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.sv5 sv5Var3 = new r45.sv5();
                    if (bArr5 != null && bArr5.length > 0) {
                        sv5Var3.parseFrom(bArr5);
                    }
                    yp6Var.f391282m = sv5Var3;
                }
                return 0;
            case 11:
                yp6Var.f391283n = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.qa qaVar3 = new r45.qa();
                    if (bArr6 != null && bArr6.length > 0) {
                        qaVar3.parseFrom(bArr6);
                    }
                    yp6Var.f391284o = qaVar3;
                }
                return 0;
        }
    }
}
