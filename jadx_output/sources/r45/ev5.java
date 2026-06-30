package r45;

/* loaded from: classes9.dex */
public class ev5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f373743d;

    /* renamed from: e, reason: collision with root package name */
    public int f373744e;

    /* renamed from: f, reason: collision with root package name */
    public long f373745f;

    /* renamed from: g, reason: collision with root package name */
    public int f373746g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f373747h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f373748i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public r45.vi f373749m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ti f373750n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ui f373751o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ev5)) {
            return false;
        }
        r45.ev5 ev5Var = (r45.ev5) fVar;
        return n51.f.a(this.BaseRequest, ev5Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f373743d), java.lang.Long.valueOf(ev5Var.f373743d)) && n51.f.a(java.lang.Integer.valueOf(this.f373744e), java.lang.Integer.valueOf(ev5Var.f373744e)) && n51.f.a(java.lang.Long.valueOf(this.f373745f), java.lang.Long.valueOf(ev5Var.f373745f)) && n51.f.a(java.lang.Integer.valueOf(this.f373746g), java.lang.Integer.valueOf(ev5Var.f373746g)) && n51.f.a(java.lang.Boolean.valueOf(this.f373747h), java.lang.Boolean.valueOf(ev5Var.f373747h)) && n51.f.a(this.f373748i, ev5Var.f373748i) && n51.f.a(this.f373749m, ev5Var.f373749m) && n51.f.a(this.f373750n, ev5Var.f373750n) && n51.f.a(this.f373751o, ev5Var.f373751o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373748i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.h(2, this.f373743d);
            fVar.e(5, this.f373744e);
            fVar.h(7, this.f373745f);
            fVar.e(9, this.f373746g);
            fVar.a(10, this.f373747h);
            fVar.g(8, 8, linkedList);
            r45.vi viVar = this.f373749m;
            if (viVar != null) {
                fVar.i(101, viVar.computeSize());
                this.f373749m.writeFields(fVar);
            }
            r45.ti tiVar = this.f373750n;
            if (tiVar != null) {
                fVar.i(102, tiVar.computeSize());
                this.f373750n.writeFields(fVar);
            }
            r45.ui uiVar = this.f373751o;
            if (uiVar != null) {
                fVar.i(103, uiVar.computeSize());
                this.f373751o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f373743d) + b36.f.e(5, this.f373744e) + b36.f.h(7, this.f373745f) + b36.f.e(9, this.f373746g) + b36.f.a(10, this.f373747h) + b36.f.g(8, 8, linkedList);
            r45.vi viVar2 = this.f373749m;
            if (viVar2 != null) {
                i18 += b36.f.i(101, viVar2.computeSize());
            }
            r45.ti tiVar2 = this.f373750n;
            if (tiVar2 != null) {
                i18 += b36.f.i(102, tiVar2.computeSize());
            }
            r45.ui uiVar2 = this.f373751o;
            return uiVar2 != null ? i18 + b36.f.i(103, uiVar2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.ev5 ev5Var = (r45.ev5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                ev5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ev5Var.f373743d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 5) {
            ev5Var.f373744e = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 7:
                ev5Var.f373745f = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.dv5 dv5Var = new r45.dv5();
                    if (bArr3 != null && bArr3.length > 0) {
                        dv5Var.parseFrom(bArr3);
                    }
                    ev5Var.f373748i.add(dv5Var);
                }
                return 0;
            case 9:
                ev5Var.f373746g = aVar2.g(intValue);
                return 0;
            case 10:
                ev5Var.f373747h = aVar2.c(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 101:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            byte[] bArr4 = (byte[]) j19.get(i28);
                            r45.vi viVar3 = new r45.vi();
                            if (bArr4 != null && bArr4.length > 0) {
                                viVar3.parseFrom(bArr4);
                            }
                            ev5Var.f373749m = viVar3;
                        }
                        return 0;
                    case 102:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            byte[] bArr5 = (byte[]) j27.get(i29);
                            r45.ti tiVar3 = new r45.ti();
                            if (bArr5 != null && bArr5.length > 0) {
                                tiVar3.parseFrom(bArr5);
                            }
                            ev5Var.f373750n = tiVar3;
                        }
                        return 0;
                    case 103:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr6 = (byte[]) j28.get(i37);
                            r45.ui uiVar3 = new r45.ui();
                            if (bArr6 != null && bArr6.length > 0) {
                                uiVar3.parseFrom(bArr6);
                            }
                            ev5Var.f373751o = uiVar3;
                        }
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
