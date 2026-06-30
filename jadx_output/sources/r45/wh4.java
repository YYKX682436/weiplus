package r45;

/* loaded from: classes12.dex */
public class wh4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389159d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389160e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389161f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389162g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389163h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389164i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wh4)) {
            return false;
        }
        r45.wh4 wh4Var = (r45.wh4) fVar;
        return n51.f.a(this.BaseRequest, wh4Var.BaseRequest) && n51.f.a(this.f389159d, wh4Var.f389159d) && n51.f.a(this.f389160e, wh4Var.f389160e) && n51.f.a(this.f389161f, wh4Var.f389161f) && n51.f.a(this.f389162g, wh4Var.f389162g) && n51.f.a(this.f389163h, wh4Var.f389163h) && n51.f.a(this.f389164i, wh4Var.f389164i);
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
            java.lang.String str = this.f389159d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389160e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f389161f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f389162g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f389163h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f389164i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f389159d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f389160e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f389161f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f389162g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f389163h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f389164i;
            return str12 != null ? i18 + b36.f.j(7, str12) : i18;
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
        r45.wh4 wh4Var = (r45.wh4) objArr[1];
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
                    wh4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                wh4Var.f389159d = aVar2.k(intValue);
                return 0;
            case 3:
                wh4Var.f389160e = aVar2.k(intValue);
                return 0;
            case 4:
                wh4Var.f389161f = aVar2.k(intValue);
                return 0;
            case 5:
                wh4Var.f389162g = aVar2.k(intValue);
                return 0;
            case 6:
                wh4Var.f389163h = aVar2.k(intValue);
                return 0;
            case 7:
                wh4Var.f389164i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
