package r45;

/* loaded from: classes9.dex */
public class bh3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370758d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370759e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bv3 f370760f;

    /* renamed from: g, reason: collision with root package name */
    public r45.bs f370761g;

    /* renamed from: h, reason: collision with root package name */
    public r45.di4 f370762h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zu3 f370763i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cx3 f370764m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bh3)) {
            return false;
        }
        r45.bh3 bh3Var = (r45.bh3) fVar;
        return n51.f.a(this.BaseResponse, bh3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370758d), java.lang.Integer.valueOf(bh3Var.f370758d)) && n51.f.a(this.f370759e, bh3Var.f370759e) && n51.f.a(this.f370760f, bh3Var.f370760f) && n51.f.a(this.f370761g, bh3Var.f370761g) && n51.f.a(this.f370762h, bh3Var.f370762h) && n51.f.a(this.f370763i, bh3Var.f370763i) && n51.f.a(this.f370764m, bh3Var.f370764m);
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
            fVar.e(2, this.f370758d);
            java.lang.String str = this.f370759e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.bv3 bv3Var = this.f370760f;
            if (bv3Var != null) {
                fVar.i(4, bv3Var.computeSize());
                this.f370760f.writeFields(fVar);
            }
            r45.bs bsVar = this.f370761g;
            if (bsVar != null) {
                fVar.i(8, bsVar.computeSize());
                this.f370761g.writeFields(fVar);
            }
            r45.di4 di4Var = this.f370762h;
            if (di4Var != null) {
                fVar.i(9, di4Var.computeSize());
                this.f370762h.writeFields(fVar);
            }
            r45.zu3 zu3Var = this.f370763i;
            if (zu3Var != null) {
                fVar.i(10, zu3Var.computeSize());
                this.f370763i.writeFields(fVar);
            }
            r45.cx3 cx3Var = this.f370764m;
            if (cx3Var != null) {
                fVar.i(11, cx3Var.computeSize());
                this.f370764m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f370758d);
            java.lang.String str2 = this.f370759e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.bv3 bv3Var2 = this.f370760f;
            if (bv3Var2 != null) {
                i18 += b36.f.i(4, bv3Var2.computeSize());
            }
            r45.bs bsVar2 = this.f370761g;
            if (bsVar2 != null) {
                i18 += b36.f.i(8, bsVar2.computeSize());
            }
            r45.di4 di4Var2 = this.f370762h;
            if (di4Var2 != null) {
                i18 += b36.f.i(9, di4Var2.computeSize());
            }
            r45.zu3 zu3Var2 = this.f370763i;
            if (zu3Var2 != null) {
                i18 += b36.f.i(10, zu3Var2.computeSize());
            }
            r45.cx3 cx3Var2 = this.f370764m;
            return cx3Var2 != null ? i18 + b36.f.i(11, cx3Var2.computeSize()) : i18;
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
        r45.bh3 bh3Var = (r45.bh3) objArr[1];
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
                bh3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bh3Var.f370758d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bh3Var.f370759e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.bv3 bv3Var3 = new r45.bv3();
                if (bArr2 != null && bArr2.length > 0) {
                    bv3Var3.parseFrom(bArr2);
                }
                bh3Var.f370760f = bv3Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.bs bsVar3 = new r45.bs();
                    if (bArr3 != null && bArr3.length > 0) {
                        bsVar3.parseFrom(bArr3);
                    }
                    bh3Var.f370761g = bsVar3;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.di4 di4Var3 = new r45.di4();
                    if (bArr4 != null && bArr4.length > 0) {
                        di4Var3.parseFrom(bArr4);
                    }
                    bh3Var.f370762h = di4Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.zu3 zu3Var3 = new r45.zu3();
                    if (bArr5 != null && bArr5.length > 0) {
                        zu3Var3.parseFrom(bArr5);
                    }
                    bh3Var.f370763i = zu3Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cx3 cx3Var3 = new r45.cx3();
                    if (bArr6 != null && bArr6.length > 0) {
                        cx3Var3.parseFrom(bArr6);
                    }
                    bh3Var.f370764m = cx3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
