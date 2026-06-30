package r45;

/* loaded from: classes8.dex */
public class nc6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381247d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381248e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381249f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381250g;

    /* renamed from: h, reason: collision with root package name */
    public int f381251h;

    /* renamed from: i, reason: collision with root package name */
    public int f381252i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nc6)) {
            return false;
        }
        r45.nc6 nc6Var = (r45.nc6) fVar;
        return n51.f.a(this.BaseRequest, nc6Var.BaseRequest) && n51.f.a(this.f381247d, nc6Var.f381247d) && n51.f.a(this.f381248e, nc6Var.f381248e) && n51.f.a(this.f381249f, nc6Var.f381249f) && n51.f.a(this.f381250g, nc6Var.f381250g) && n51.f.a(java.lang.Integer.valueOf(this.f381251h), java.lang.Integer.valueOf(nc6Var.f381251h)) && n51.f.a(java.lang.Integer.valueOf(this.f381252i), java.lang.Integer.valueOf(nc6Var.f381252i));
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
            java.lang.String str = this.f381247d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381248e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f381249f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f381250g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f381251h);
            fVar.e(7, this.f381252i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f381247d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f381248e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f381249f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f381250g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            return i18 + b36.f.e(6, this.f381251h) + b36.f.e(7, this.f381252i);
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
        r45.nc6 nc6Var = (r45.nc6) objArr[1];
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
                    nc6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                nc6Var.f381247d = aVar2.k(intValue);
                return 0;
            case 3:
                nc6Var.f381248e = aVar2.k(intValue);
                return 0;
            case 4:
                nc6Var.f381249f = aVar2.k(intValue);
                return 0;
            case 5:
                nc6Var.f381250g = aVar2.k(intValue);
                return 0;
            case 6:
                nc6Var.f381251h = aVar2.g(intValue);
                return 0;
            case 7:
                nc6Var.f381252i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
