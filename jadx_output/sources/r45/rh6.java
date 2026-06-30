package r45;

/* loaded from: classes8.dex */
public class rh6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384876d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384877e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384878f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384879g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384880h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rh6)) {
            return false;
        }
        r45.rh6 rh6Var = (r45.rh6) fVar;
        return n51.f.a(this.BaseRequest, rh6Var.BaseRequest) && n51.f.a(this.f384876d, rh6Var.f384876d) && n51.f.a(this.f384877e, rh6Var.f384877e) && n51.f.a(this.f384878f, rh6Var.f384878f) && n51.f.a(this.f384879g, rh6Var.f384879g) && n51.f.a(this.f384880h, rh6Var.f384880h);
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
            java.lang.String str = this.f384876d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384877e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f384878f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f384879g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f384880h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f384876d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f384877e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f384878f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f384879g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f384880h;
            return str10 != null ? i18 + b36.f.j(6, str10) : i18;
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
        r45.rh6 rh6Var = (r45.rh6) objArr[1];
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
                    rh6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                rh6Var.f384876d = aVar2.k(intValue);
                return 0;
            case 3:
                rh6Var.f384877e = aVar2.k(intValue);
                return 0;
            case 4:
                rh6Var.f384878f = aVar2.k(intValue);
                return 0;
            case 5:
                rh6Var.f384879g = aVar2.k(intValue);
                return 0;
            case 6:
                rh6Var.f384880h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
