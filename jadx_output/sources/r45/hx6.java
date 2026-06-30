package r45;

/* loaded from: classes8.dex */
public class hx6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376543d;

    /* renamed from: e, reason: collision with root package name */
    public long f376544e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f376545f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376546g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376547h;

    /* renamed from: i, reason: collision with root package name */
    public int f376548i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hx6)) {
            return false;
        }
        r45.hx6 hx6Var = (r45.hx6) fVar;
        return n51.f.a(this.BaseRequest, hx6Var.BaseRequest) && n51.f.a(this.f376543d, hx6Var.f376543d) && n51.f.a(java.lang.Long.valueOf(this.f376544e), java.lang.Long.valueOf(hx6Var.f376544e)) && n51.f.a(this.f376545f, hx6Var.f376545f) && n51.f.a(this.f376546g, hx6Var.f376546g) && n51.f.a(this.f376547h, hx6Var.f376547h) && n51.f.a(java.lang.Integer.valueOf(this.f376548i), java.lang.Integer.valueOf(hx6Var.f376548i));
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
            java.lang.String str = this.f376543d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f376544e);
            r45.cu5 cu5Var = this.f376545f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f376545f.writeFields(fVar);
            }
            java.lang.String str2 = this.f376546g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f376547h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f376548i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f376543d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int h17 = i18 + b36.f.h(3, this.f376544e);
            r45.cu5 cu5Var2 = this.f376545f;
            if (cu5Var2 != null) {
                h17 += b36.f.i(4, cu5Var2.computeSize());
            }
            java.lang.String str5 = this.f376546g;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f376547h;
            if (str6 != null) {
                h17 += b36.f.j(6, str6);
            }
            return h17 + b36.f.e(7, this.f376548i);
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
        r45.hx6 hx6Var = (r45.hx6) objArr[1];
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
                    hx6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                hx6Var.f376543d = aVar2.k(intValue);
                return 0;
            case 3:
                hx6Var.f376544e = aVar2.i(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    hx6Var.f376545f = cu5Var3;
                }
                return 0;
            case 5:
                hx6Var.f376546g = aVar2.k(intValue);
                return 0;
            case 6:
                hx6Var.f376547h = aVar2.k(intValue);
                return 0;
            case 7:
                hx6Var.f376548i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
