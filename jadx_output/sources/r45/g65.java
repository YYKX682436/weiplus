package r45;

/* loaded from: classes4.dex */
public class g65 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374923d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374924e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374925f;

    /* renamed from: g, reason: collision with root package name */
    public int f374926g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374927h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374928i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g65)) {
            return false;
        }
        r45.g65 g65Var = (r45.g65) fVar;
        return n51.f.a(this.BaseResponse, g65Var.BaseResponse) && n51.f.a(this.f374923d, g65Var.f374923d) && n51.f.a(this.f374924e, g65Var.f374924e) && n51.f.a(this.f374925f, g65Var.f374925f) && n51.f.a(java.lang.Integer.valueOf(this.f374926g), java.lang.Integer.valueOf(g65Var.f374926g)) && n51.f.a(this.f374927h, g65Var.f374927h) && n51.f.a(this.f374928i, g65Var.f374928i);
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
            java.lang.String str = this.f374923d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374924e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374925f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f374926g);
            java.lang.String str4 = this.f374927h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f374928i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str6 = this.f374923d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f374924e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f374925f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            int e17 = i18 + b36.f.e(5, this.f374926g);
            java.lang.String str9 = this.f374927h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f374928i;
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
        r45.g65 g65Var = (r45.g65) objArr[1];
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
                    g65Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                g65Var.f374923d = aVar2.k(intValue);
                return 0;
            case 3:
                g65Var.f374924e = aVar2.k(intValue);
                return 0;
            case 4:
                g65Var.f374925f = aVar2.k(intValue);
                return 0;
            case 5:
                g65Var.f374926g = aVar2.g(intValue);
                return 0;
            case 6:
                g65Var.f374927h = aVar2.k(intValue);
                return 0;
            case 7:
                g65Var.f374928i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
