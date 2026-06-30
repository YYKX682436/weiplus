package m53;

/* loaded from: classes8.dex */
public class i2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public m53.t3 f323781d;

    /* renamed from: e, reason: collision with root package name */
    public int f323782e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323783f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323784g;

    /* renamed from: h, reason: collision with root package name */
    public m53.l2 f323785h;

    /* renamed from: i, reason: collision with root package name */
    public m53.u2 f323786i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.i2)) {
            return false;
        }
        m53.i2 i2Var = (m53.i2) fVar;
        return n51.f.a(this.BaseResponse, i2Var.BaseResponse) && n51.f.a(this.f323781d, i2Var.f323781d) && n51.f.a(java.lang.Integer.valueOf(this.f323782e), java.lang.Integer.valueOf(i2Var.f323782e)) && n51.f.a(this.f323783f, i2Var.f323783f) && n51.f.a(this.f323784g, i2Var.f323784g) && n51.f.a(this.f323785h, i2Var.f323785h) && n51.f.a(this.f323786i, i2Var.f323786i);
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
            m53.t3 t3Var = this.f323781d;
            if (t3Var != null) {
                fVar.i(2, t3Var.computeSize());
                this.f323781d.writeFields(fVar);
            }
            fVar.e(3, this.f323782e);
            java.lang.String str = this.f323783f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f323784g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            m53.l2 l2Var = this.f323785h;
            if (l2Var != null) {
                fVar.i(6, l2Var.computeSize());
                this.f323785h.writeFields(fVar);
            }
            m53.u2 u2Var = this.f323786i;
            if (u2Var != null) {
                fVar.i(7, u2Var.computeSize());
                this.f323786i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            m53.t3 t3Var2 = this.f323781d;
            if (t3Var2 != null) {
                i18 += b36.f.i(2, t3Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f323782e);
            java.lang.String str3 = this.f323783f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f323784g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            m53.l2 l2Var2 = this.f323785h;
            if (l2Var2 != null) {
                e17 += b36.f.i(6, l2Var2.computeSize());
            }
            m53.u2 u2Var2 = this.f323786i;
            return u2Var2 != null ? e17 + b36.f.i(7, u2Var2.computeSize()) : e17;
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
        m53.i2 i2Var = (m53.i2) objArr[1];
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
                    i2Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    m53.t3 t3Var3 = new m53.t3();
                    if (bArr2 != null && bArr2.length > 0) {
                        t3Var3.parseFrom(bArr2);
                    }
                    i2Var.f323781d = t3Var3;
                }
                return 0;
            case 3:
                i2Var.f323782e = aVar2.g(intValue);
                return 0;
            case 4:
                i2Var.f323783f = aVar2.k(intValue);
                return 0;
            case 5:
                i2Var.f323784g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    m53.l2 l2Var3 = new m53.l2();
                    if (bArr3 != null && bArr3.length > 0) {
                        l2Var3.parseFrom(bArr3);
                    }
                    i2Var.f323785h = l2Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    m53.u2 u2Var3 = new m53.u2();
                    if (bArr4 != null && bArr4.length > 0) {
                        u2Var3.parseFrom(bArr4);
                    }
                    i2Var.f323786i = u2Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
