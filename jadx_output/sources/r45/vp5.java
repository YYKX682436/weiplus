package r45;

/* loaded from: classes8.dex */
public class vp5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388425d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388426e;

    /* renamed from: f, reason: collision with root package name */
    public int f388427f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388428g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388429h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vp5)) {
            return false;
        }
        r45.vp5 vp5Var = (r45.vp5) fVar;
        return n51.f.a(this.BaseRequest, vp5Var.BaseRequest) && n51.f.a(this.f388425d, vp5Var.f388425d) && n51.f.a(this.f388426e, vp5Var.f388426e) && n51.f.a(java.lang.Integer.valueOf(this.f388427f), java.lang.Integer.valueOf(vp5Var.f388427f)) && n51.f.a(this.f388428g, vp5Var.f388428g) && n51.f.a(this.f388429h, vp5Var.f388429h);
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
            java.lang.String str = this.f388425d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f388426e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f388427f);
            java.lang.String str3 = this.f388428g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f388429h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f388425d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f388426e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f388427f);
            java.lang.String str7 = this.f388428g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f388429h;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        r45.vp5 vp5Var = (r45.vp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    vp5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                vp5Var.f388425d = aVar2.k(intValue);
                return 0;
            case 3:
                vp5Var.f388426e = aVar2.k(intValue);
                return 0;
            case 4:
                vp5Var.f388427f = aVar2.g(intValue);
                return 0;
            case 5:
                vp5Var.f388428g = aVar2.k(intValue);
                return 0;
            case 6:
                vp5Var.f388429h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
