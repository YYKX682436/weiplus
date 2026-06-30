package r45;

/* loaded from: classes9.dex */
public class ri3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384906d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384907e;

    /* renamed from: f, reason: collision with root package name */
    public int f384908f;

    /* renamed from: g, reason: collision with root package name */
    public int f384909g;

    /* renamed from: h, reason: collision with root package name */
    public r45.au f384910h;

    /* renamed from: i, reason: collision with root package name */
    public r45.eu f384911i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xt f384912m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384913n;

    /* renamed from: o, reason: collision with root package name */
    public int f384914o;

    /* renamed from: p, reason: collision with root package name */
    public int f384915p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ru f384916q;

    /* renamed from: r, reason: collision with root package name */
    public r45.du f384917r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ri3)) {
            return false;
        }
        r45.ri3 ri3Var = (r45.ri3) fVar;
        return n51.f.a(this.BaseResponse, ri3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384906d), java.lang.Integer.valueOf(ri3Var.f384906d)) && n51.f.a(this.f384907e, ri3Var.f384907e) && n51.f.a(java.lang.Integer.valueOf(this.f384908f), java.lang.Integer.valueOf(ri3Var.f384908f)) && n51.f.a(java.lang.Integer.valueOf(this.f384909g), java.lang.Integer.valueOf(ri3Var.f384909g)) && n51.f.a(this.f384910h, ri3Var.f384910h) && n51.f.a(this.f384911i, ri3Var.f384911i) && n51.f.a(this.f384912m, ri3Var.f384912m) && n51.f.a(this.f384913n, ri3Var.f384913n) && n51.f.a(java.lang.Integer.valueOf(this.f384914o), java.lang.Integer.valueOf(ri3Var.f384914o)) && n51.f.a(java.lang.Integer.valueOf(this.f384915p), java.lang.Integer.valueOf(ri3Var.f384915p)) && n51.f.a(this.f384916q, ri3Var.f384916q) && n51.f.a(this.f384917r, ri3Var.f384917r);
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
            fVar.e(2, this.f384906d);
            java.lang.String str = this.f384907e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f384908f);
            fVar.e(5, this.f384909g);
            r45.au auVar = this.f384910h;
            if (auVar != null) {
                fVar.i(6, auVar.computeSize());
                this.f384910h.writeFields(fVar);
            }
            r45.eu euVar = this.f384911i;
            if (euVar != null) {
                fVar.i(7, euVar.computeSize());
                this.f384911i.writeFields(fVar);
            }
            r45.xt xtVar = this.f384912m;
            if (xtVar != null) {
                fVar.i(8, xtVar.computeSize());
                this.f384912m.writeFields(fVar);
            }
            java.lang.String str2 = this.f384913n;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.e(11, this.f384914o);
            fVar.e(12, this.f384915p);
            r45.ru ruVar = this.f384916q;
            if (ruVar != null) {
                fVar.i(13, ruVar.computeSize());
                this.f384916q.writeFields(fVar);
            }
            r45.du duVar = this.f384917r;
            if (duVar == null) {
                return 0;
            }
            fVar.i(14, duVar.computeSize());
            this.f384917r.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384906d);
            java.lang.String str3 = this.f384907e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f384908f) + b36.f.e(5, this.f384909g);
            r45.au auVar2 = this.f384910h;
            if (auVar2 != null) {
                e17 += b36.f.i(6, auVar2.computeSize());
            }
            r45.eu euVar2 = this.f384911i;
            if (euVar2 != null) {
                e17 += b36.f.i(7, euVar2.computeSize());
            }
            r45.xt xtVar2 = this.f384912m;
            if (xtVar2 != null) {
                e17 += b36.f.i(8, xtVar2.computeSize());
            }
            java.lang.String str4 = this.f384913n;
            if (str4 != null) {
                e17 += b36.f.j(10, str4);
            }
            int e18 = e17 + b36.f.e(11, this.f384914o) + b36.f.e(12, this.f384915p);
            r45.ru ruVar2 = this.f384916q;
            if (ruVar2 != null) {
                e18 += b36.f.i(13, ruVar2.computeSize());
            }
            r45.du duVar2 = this.f384917r;
            return duVar2 != null ? e18 + b36.f.i(14, duVar2.computeSize()) : e18;
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
        r45.ri3 ri3Var = (r45.ri3) objArr[1];
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
                    ri3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ri3Var.f384906d = aVar2.g(intValue);
                return 0;
            case 3:
                ri3Var.f384907e = aVar2.k(intValue);
                return 0;
            case 4:
                ri3Var.f384908f = aVar2.g(intValue);
                return 0;
            case 5:
                ri3Var.f384909g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.au auVar3 = new r45.au();
                    if (bArr2 != null && bArr2.length > 0) {
                        auVar3.parseFrom(bArr2);
                    }
                    ri3Var.f384910h = auVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.eu euVar3 = new r45.eu();
                    if (bArr3 != null && bArr3.length > 0) {
                        euVar3.parseFrom(bArr3);
                    }
                    ri3Var.f384911i = euVar3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.xt xtVar3 = new r45.xt();
                    if (bArr4 != null && bArr4.length > 0) {
                        xtVar3.parseFrom(bArr4);
                    }
                    ri3Var.f384912m = xtVar3;
                }
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                ri3Var.f384913n = aVar2.k(intValue);
                return 0;
            case 11:
                ri3Var.f384914o = aVar2.g(intValue);
                return 0;
            case 12:
                ri3Var.f384915p = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.ru ruVar3 = new r45.ru();
                    if (bArr5 != null && bArr5.length > 0) {
                        ruVar3.parseFrom(bArr5);
                    }
                    ri3Var.f384916q = ruVar3;
                }
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.du duVar3 = new r45.du();
                    if (bArr6 != null && bArr6.length > 0) {
                        duVar3.parseFrom(bArr6);
                    }
                    ri3Var.f384917r = duVar3;
                }
                return 0;
        }
    }
}
