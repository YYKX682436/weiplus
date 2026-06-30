package m53;

/* loaded from: classes8.dex */
public class u1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324085d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324086e;

    /* renamed from: f, reason: collision with root package name */
    public int f324087f;

    /* renamed from: g, reason: collision with root package name */
    public m53.g f324088g;

    /* renamed from: h, reason: collision with root package name */
    public int f324089h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.u1)) {
            return false;
        }
        m53.u1 u1Var = (m53.u1) fVar;
        return n51.f.a(this.BaseRequest, u1Var.BaseRequest) && n51.f.a(this.f324085d, u1Var.f324085d) && n51.f.a(this.f324086e, u1Var.f324086e) && n51.f.a(java.lang.Integer.valueOf(this.f324087f), java.lang.Integer.valueOf(u1Var.f324087f)) && n51.f.a(this.f324088g, u1Var.f324088g) && n51.f.a(java.lang.Integer.valueOf(this.f324089h), java.lang.Integer.valueOf(u1Var.f324089h));
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
            java.lang.String str = this.f324085d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f324086e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f324087f);
            m53.g gVar = this.f324088g;
            if (gVar != null) {
                fVar.i(5, gVar.computeSize());
                this.f324088g.writeFields(fVar);
            }
            fVar.e(7, this.f324089h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f324085d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f324086e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f324087f);
            m53.g gVar2 = this.f324088g;
            if (gVar2 != null) {
                e17 += b36.f.i(5, gVar2.computeSize());
            }
            return e17 + b36.f.e(7, this.f324089h);
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
        m53.u1 u1Var = (m53.u1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                u1Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            u1Var.f324085d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            u1Var.f324086e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            u1Var.f324087f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            if (intValue != 7) {
                return -1;
            }
            u1Var.f324089h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            m53.g gVar3 = new m53.g();
            if (bArr2 != null && bArr2.length > 0) {
                gVar3.parseFrom(bArr2);
            }
            u1Var.f324088g = gVar3;
        }
        return 0;
    }
}
