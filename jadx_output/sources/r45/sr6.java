package r45;

/* loaded from: classes12.dex */
public class sr6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385951d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xb f385952e;

    /* renamed from: f, reason: collision with root package name */
    public r45.i1 f385953f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vt4 f385954g;

    /* renamed from: h, reason: collision with root package name */
    public r45.wc f385955h;

    /* renamed from: i, reason: collision with root package name */
    public r45.jx3 f385956i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ys f385957m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f385958n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sr6)) {
            return false;
        }
        r45.sr6 sr6Var = (r45.sr6) fVar;
        return n51.f.a(this.BaseResponse, sr6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385951d), java.lang.Integer.valueOf(sr6Var.f385951d)) && n51.f.a(this.f385952e, sr6Var.f385952e) && n51.f.a(this.f385953f, sr6Var.f385953f) && n51.f.a(this.f385954g, sr6Var.f385954g) && n51.f.a(this.f385955h, sr6Var.f385955h) && n51.f.a(this.f385956i, sr6Var.f385956i) && n51.f.a(this.f385957m, sr6Var.f385957m) && n51.f.a(this.f385958n, sr6Var.f385958n);
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
            fVar.e(2, this.f385951d);
            r45.xb xbVar = this.f385952e;
            if (xbVar != null) {
                fVar.i(3, xbVar.computeSize());
                this.f385952e.writeFields(fVar);
            }
            r45.i1 i1Var = this.f385953f;
            if (i1Var != null) {
                fVar.i(4, i1Var.computeSize());
                this.f385953f.writeFields(fVar);
            }
            r45.vt4 vt4Var = this.f385954g;
            if (vt4Var != null) {
                fVar.i(5, vt4Var.computeSize());
                this.f385954g.writeFields(fVar);
            }
            r45.wc wcVar = this.f385955h;
            if (wcVar != null) {
                fVar.i(6, wcVar.computeSize());
                this.f385955h.writeFields(fVar);
            }
            r45.jx3 jx3Var = this.f385956i;
            if (jx3Var != null) {
                fVar.i(7, jx3Var.computeSize());
                this.f385956i.writeFields(fVar);
            }
            r45.ys ysVar = this.f385957m;
            if (ysVar != null) {
                fVar.i(8, ysVar.computeSize());
                this.f385957m.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f385958n;
            if (cu5Var != null) {
                fVar.i(9, cu5Var.computeSize());
                this.f385958n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385951d);
            r45.xb xbVar2 = this.f385952e;
            if (xbVar2 != null) {
                i18 += b36.f.i(3, xbVar2.computeSize());
            }
            r45.i1 i1Var2 = this.f385953f;
            if (i1Var2 != null) {
                i18 += b36.f.i(4, i1Var2.computeSize());
            }
            r45.vt4 vt4Var2 = this.f385954g;
            if (vt4Var2 != null) {
                i18 += b36.f.i(5, vt4Var2.computeSize());
            }
            r45.wc wcVar2 = this.f385955h;
            if (wcVar2 != null) {
                i18 += b36.f.i(6, wcVar2.computeSize());
            }
            r45.jx3 jx3Var2 = this.f385956i;
            if (jx3Var2 != null) {
                i18 += b36.f.i(7, jx3Var2.computeSize());
            }
            r45.ys ysVar2 = this.f385957m;
            if (ysVar2 != null) {
                i18 += b36.f.i(8, ysVar2.computeSize());
            }
            r45.cu5 cu5Var2 = this.f385958n;
            return cu5Var2 != null ? i18 + b36.f.i(9, cu5Var2.computeSize()) : i18;
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
        r45.sr6 sr6Var = (r45.sr6) objArr[1];
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
                    sr6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                sr6Var.f385951d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.xb xbVar3 = new r45.xb();
                    if (bArr2 != null && bArr2.length > 0) {
                        xbVar3.parseFrom(bArr2);
                    }
                    sr6Var.f385952e = xbVar3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.i1 i1Var3 = new r45.i1();
                    if (bArr3 != null && bArr3.length > 0) {
                        i1Var3.parseFrom(bArr3);
                    }
                    sr6Var.f385953f = i1Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.vt4 vt4Var3 = new r45.vt4();
                    if (bArr4 != null && bArr4.length > 0) {
                        vt4Var3.parseFrom(bArr4);
                    }
                    sr6Var.f385954g = vt4Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.wc wcVar3 = new r45.wc();
                    if (bArr5 != null && bArr5.length > 0) {
                        wcVar3.parseFrom(bArr5);
                    }
                    sr6Var.f385955h = wcVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.jx3 jx3Var3 = new r45.jx3();
                    if (bArr6 != null && bArr6.length > 0) {
                        jx3Var3.parseFrom(bArr6);
                    }
                    sr6Var.f385956i = jx3Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.ys ysVar3 = new r45.ys();
                    if (bArr7 != null && bArr7.length > 0) {
                        ysVar3.parseFrom(bArr7);
                    }
                    sr6Var.f385957m = ysVar3;
                }
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var3.b(bArr8);
                    }
                    sr6Var.f385958n = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
