package m53;

/* loaded from: classes8.dex */
public class a2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public m53.z0 f323551d;

    /* renamed from: e, reason: collision with root package name */
    public m53.c1 f323552e;

    /* renamed from: f, reason: collision with root package name */
    public m53.d1 f323553f;

    /* renamed from: g, reason: collision with root package name */
    public m53.j3 f323554g;

    /* renamed from: h, reason: collision with root package name */
    public m53.w5 f323555h;

    /* renamed from: i, reason: collision with root package name */
    public m53.h1 f323556i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.a2)) {
            return false;
        }
        m53.a2 a2Var = (m53.a2) fVar;
        return n51.f.a(this.BaseResponse, a2Var.BaseResponse) && n51.f.a(this.f323551d, a2Var.f323551d) && n51.f.a(this.f323552e, a2Var.f323552e) && n51.f.a(this.f323553f, a2Var.f323553f) && n51.f.a(this.f323554g, a2Var.f323554g) && n51.f.a(this.f323555h, a2Var.f323555h) && n51.f.a(this.f323556i, a2Var.f323556i);
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
            m53.z0 z0Var = this.f323551d;
            if (z0Var != null) {
                fVar.i(3, z0Var.computeSize());
                this.f323551d.writeFields(fVar);
            }
            m53.c1 c1Var = this.f323552e;
            if (c1Var != null) {
                fVar.i(4, c1Var.computeSize());
                this.f323552e.writeFields(fVar);
            }
            m53.d1 d1Var = this.f323553f;
            if (d1Var != null) {
                fVar.i(5, d1Var.computeSize());
                this.f323553f.writeFields(fVar);
            }
            m53.j3 j3Var = this.f323554g;
            if (j3Var != null) {
                fVar.i(6, j3Var.computeSize());
                this.f323554g.writeFields(fVar);
            }
            m53.w5 w5Var = this.f323555h;
            if (w5Var != null) {
                fVar.i(8, w5Var.computeSize());
                this.f323555h.writeFields(fVar);
            }
            m53.h1 h1Var = this.f323556i;
            if (h1Var != null) {
                fVar.i(9, h1Var.computeSize());
                this.f323556i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            m53.z0 z0Var2 = this.f323551d;
            if (z0Var2 != null) {
                i18 += b36.f.i(3, z0Var2.computeSize());
            }
            m53.c1 c1Var2 = this.f323552e;
            if (c1Var2 != null) {
                i18 += b36.f.i(4, c1Var2.computeSize());
            }
            m53.d1 d1Var2 = this.f323553f;
            if (d1Var2 != null) {
                i18 += b36.f.i(5, d1Var2.computeSize());
            }
            m53.j3 j3Var2 = this.f323554g;
            if (j3Var2 != null) {
                i18 += b36.f.i(6, j3Var2.computeSize());
            }
            m53.w5 w5Var2 = this.f323555h;
            if (w5Var2 != null) {
                i18 += b36.f.i(8, w5Var2.computeSize());
            }
            m53.h1 h1Var2 = this.f323556i;
            return h1Var2 != null ? i18 + b36.f.i(9, h1Var2.computeSize()) : i18;
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
        m53.a2 a2Var = (m53.a2) objArr[1];
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
                a2Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                m53.z0 z0Var3 = new m53.z0();
                if (bArr2 != null && bArr2.length > 0) {
                    z0Var3.parseFrom(bArr2);
                }
                a2Var.f323551d = z0Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                m53.c1 c1Var3 = new m53.c1();
                if (bArr3 != null && bArr3.length > 0) {
                    c1Var3.parseFrom(bArr3);
                }
                a2Var.f323552e = c1Var3;
            }
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                m53.d1 d1Var3 = new m53.d1();
                if (bArr4 != null && bArr4.length > 0) {
                    d1Var3.parseFrom(bArr4);
                }
                a2Var.f323553f = d1Var3;
            }
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j28 = aVar2.j(intValue);
            int size5 = j28.size();
            for (int i37 = 0; i37 < size5; i37++) {
                byte[] bArr5 = (byte[]) j28.get(i37);
                m53.j3 j3Var3 = new m53.j3();
                if (bArr5 != null && bArr5.length > 0) {
                    j3Var3.parseFrom(bArr5);
                }
                a2Var.f323554g = j3Var3;
            }
            return 0;
        }
        if (intValue == 8) {
            java.util.LinkedList j29 = aVar2.j(intValue);
            int size6 = j29.size();
            for (int i38 = 0; i38 < size6; i38++) {
                byte[] bArr6 = (byte[]) j29.get(i38);
                m53.w5 w5Var3 = new m53.w5();
                if (bArr6 != null && bArr6.length > 0) {
                    w5Var3.parseFrom(bArr6);
                }
                a2Var.f323555h = w5Var3;
            }
            return 0;
        }
        if (intValue != 9) {
            return -1;
        }
        java.util.LinkedList j37 = aVar2.j(intValue);
        int size7 = j37.size();
        for (int i39 = 0; i39 < size7; i39++) {
            byte[] bArr7 = (byte[]) j37.get(i39);
            m53.h1 h1Var3 = new m53.h1();
            if (bArr7 != null && bArr7.length > 0) {
                h1Var3.parseFrom(bArr7);
            }
            a2Var.f323556i = h1Var3;
        }
        return 0;
    }
}
