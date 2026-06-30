package r45;

/* loaded from: classes4.dex */
public class zp5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f392277d;

    /* renamed from: e, reason: collision with root package name */
    public double f392278e;

    /* renamed from: f, reason: collision with root package name */
    public int f392279f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392280g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392281h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp5)) {
            return false;
        }
        r45.zp5 zp5Var = (r45.zp5) fVar;
        return n51.f.a(this.BaseRequest, zp5Var.BaseRequest) && n51.f.a(java.lang.Double.valueOf(this.f392277d), java.lang.Double.valueOf(zp5Var.f392277d)) && n51.f.a(java.lang.Double.valueOf(this.f392278e), java.lang.Double.valueOf(zp5Var.f392278e)) && n51.f.a(java.lang.Integer.valueOf(this.f392279f), java.lang.Integer.valueOf(zp5Var.f392279f)) && n51.f.a(this.f392280g, zp5Var.f392280g) && n51.f.a(this.f392281h, zp5Var.f392281h);
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
            fVar.c(2, this.f392277d);
            fVar.c(3, this.f392278e);
            fVar.e(4, this.f392279f);
            java.lang.String str = this.f392280g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f392281h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.c(2, this.f392277d) + b36.f.c(3, this.f392278e) + b36.f.e(4, this.f392279f);
            java.lang.String str3 = this.f392280g;
            if (str3 != null) {
                i18 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f392281h;
            return str4 != null ? i18 + b36.f.j(6, str4) : i18;
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
        r45.zp5 zp5Var = (r45.zp5) objArr[1];
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
                    zp5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                zp5Var.f392277d = aVar2.e(intValue);
                return 0;
            case 3:
                zp5Var.f392278e = aVar2.e(intValue);
                return 0;
            case 4:
                zp5Var.f392279f = aVar2.g(intValue);
                return 0;
            case 5:
                zp5Var.f392280g = aVar2.k(intValue);
                return 0;
            case 6:
                zp5Var.f392281h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
