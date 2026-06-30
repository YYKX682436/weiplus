package r45;

/* loaded from: classes8.dex */
public class s24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385441d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385442e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385443f;

    /* renamed from: g, reason: collision with root package name */
    public int f385444g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385445h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385446i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s24)) {
            return false;
        }
        r45.s24 s24Var = (r45.s24) fVar;
        return n51.f.a(this.BaseRequest, s24Var.BaseRequest) && n51.f.a(this.f385441d, s24Var.f385441d) && n51.f.a(this.f385442e, s24Var.f385442e) && n51.f.a(this.f385443f, s24Var.f385443f) && n51.f.a(java.lang.Integer.valueOf(this.f385444g), java.lang.Integer.valueOf(s24Var.f385444g)) && n51.f.a(this.f385445h, s24Var.f385445h) && n51.f.a(this.f385446i, s24Var.f385446i);
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
            java.lang.String str = this.f385441d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f385442e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f385443f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f385444g);
            java.lang.String str4 = this.f385445h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f385446i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f385441d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f385442e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f385443f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            int e17 = i18 + b36.f.e(5, this.f385444g);
            java.lang.String str9 = this.f385445h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f385446i;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.s24 s24Var = (r45.s24) objArr[1];
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
                    s24Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                s24Var.f385441d = aVar2.k(intValue);
                return 0;
            case 3:
                s24Var.f385442e = aVar2.k(intValue);
                return 0;
            case 4:
                s24Var.f385443f = aVar2.k(intValue);
                return 0;
            case 5:
                s24Var.f385444g = aVar2.g(intValue);
                return 0;
            case 6:
                s24Var.f385445h = aVar2.k(intValue);
                return 0;
            case 7:
                s24Var.f385446i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
