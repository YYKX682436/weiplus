package r45;

/* loaded from: classes7.dex */
public class xs3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ud7 f390374d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vd7 f390375e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rd7 f390376f;

    /* renamed from: g, reason: collision with root package name */
    public r45.bg7 f390377g;

    /* renamed from: h, reason: collision with root package name */
    public r45.dg7 f390378h;

    /* renamed from: i, reason: collision with root package name */
    public r45.td7 f390379i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xs3)) {
            return false;
        }
        r45.xs3 xs3Var = (r45.xs3) fVar;
        return n51.f.a(this.BaseResponse, xs3Var.BaseResponse) && n51.f.a(this.f390374d, xs3Var.f390374d) && n51.f.a(this.f390375e, xs3Var.f390375e) && n51.f.a(this.f390376f, xs3Var.f390376f) && n51.f.a(this.f390377g, xs3Var.f390377g) && n51.f.a(this.f390378h, xs3Var.f390378h) && n51.f.a(this.f390379i, xs3Var.f390379i);
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
            r45.ud7 ud7Var = this.f390374d;
            if (ud7Var != null) {
                fVar.i(2, ud7Var.computeSize());
                this.f390374d.writeFields(fVar);
            }
            r45.vd7 vd7Var = this.f390375e;
            if (vd7Var != null) {
                fVar.i(3, vd7Var.computeSize());
                this.f390375e.writeFields(fVar);
            }
            r45.rd7 rd7Var = this.f390376f;
            if (rd7Var != null) {
                fVar.i(4, rd7Var.computeSize());
                this.f390376f.writeFields(fVar);
            }
            r45.bg7 bg7Var = this.f390377g;
            if (bg7Var != null) {
                fVar.i(5, bg7Var.computeSize());
                this.f390377g.writeFields(fVar);
            }
            r45.dg7 dg7Var = this.f390378h;
            if (dg7Var != null) {
                fVar.i(6, dg7Var.computeSize());
                this.f390378h.writeFields(fVar);
            }
            r45.td7 td7Var = this.f390379i;
            if (td7Var != null) {
                fVar.i(7, td7Var.computeSize());
                this.f390379i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.ud7 ud7Var2 = this.f390374d;
            if (ud7Var2 != null) {
                i18 += b36.f.i(2, ud7Var2.computeSize());
            }
            r45.vd7 vd7Var2 = this.f390375e;
            if (vd7Var2 != null) {
                i18 += b36.f.i(3, vd7Var2.computeSize());
            }
            r45.rd7 rd7Var2 = this.f390376f;
            if (rd7Var2 != null) {
                i18 += b36.f.i(4, rd7Var2.computeSize());
            }
            r45.bg7 bg7Var2 = this.f390377g;
            if (bg7Var2 != null) {
                i18 += b36.f.i(5, bg7Var2.computeSize());
            }
            r45.dg7 dg7Var2 = this.f390378h;
            if (dg7Var2 != null) {
                i18 += b36.f.i(6, dg7Var2.computeSize());
            }
            r45.td7 td7Var2 = this.f390379i;
            return td7Var2 != null ? i18 + b36.f.i(7, td7Var2.computeSize()) : i18;
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
        r45.xs3 xs3Var = (r45.xs3) objArr[1];
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
                    xs3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ud7 ud7Var3 = new r45.ud7();
                    if (bArr2 != null && bArr2.length > 0) {
                        ud7Var3.parseFrom(bArr2);
                    }
                    xs3Var.f390374d = ud7Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.vd7 vd7Var3 = new r45.vd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        vd7Var3.parseFrom(bArr3);
                    }
                    xs3Var.f390375e = vd7Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.rd7 rd7Var3 = new r45.rd7();
                    if (bArr4 != null && bArr4.length > 0) {
                        rd7Var3.parseFrom(bArr4);
                    }
                    xs3Var.f390376f = rd7Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.bg7 bg7Var3 = new r45.bg7();
                    if (bArr5 != null && bArr5.length > 0) {
                        bg7Var3.parseFrom(bArr5);
                    }
                    xs3Var.f390377g = bg7Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.dg7 dg7Var3 = new r45.dg7();
                    if (bArr6 != null && bArr6.length > 0) {
                        dg7Var3.parseFrom(bArr6);
                    }
                    xs3Var.f390378h = dg7Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.td7 td7Var3 = new r45.td7();
                    if (bArr7 != null && bArr7.length > 0) {
                        td7Var3.parseFrom(bArr7);
                    }
                    xs3Var.f390379i = td7Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
