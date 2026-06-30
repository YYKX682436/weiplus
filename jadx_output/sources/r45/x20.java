package r45;

/* loaded from: classes7.dex */
public class x20 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389690d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389691e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389692f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389693g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389694h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389695i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x20)) {
            return false;
        }
        r45.x20 x20Var = (r45.x20) fVar;
        return n51.f.a(this.BaseResponse, x20Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f389690d), java.lang.Integer.valueOf(x20Var.f389690d)) && n51.f.a(this.f389691e, x20Var.f389691e) && n51.f.a(this.f389692f, x20Var.f389692f) && n51.f.a(this.f389693g, x20Var.f389693g) && n51.f.a(this.f389694h, x20Var.f389694h) && n51.f.a(this.f389695i, x20Var.f389695i);
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
            fVar.e(2, this.f389690d);
            java.lang.String str = this.f389691e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f389692f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f389693g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f389694h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f389695i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f389690d);
            java.lang.String str6 = this.f389691e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f389692f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f389693g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f389694h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f389695i;
            return str10 != null ? i18 + b36.f.j(7, str10) : i18;
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
        r45.x20 x20Var = (r45.x20) objArr[1];
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
                    x20Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                x20Var.f389690d = aVar2.g(intValue);
                return 0;
            case 3:
                x20Var.f389691e = aVar2.k(intValue);
                return 0;
            case 4:
                x20Var.f389692f = aVar2.k(intValue);
                return 0;
            case 5:
                x20Var.f389693g = aVar2.k(intValue);
                return 0;
            case 6:
                x20Var.f389694h = aVar2.k(intValue);
                return 0;
            case 7:
                x20Var.f389695i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
