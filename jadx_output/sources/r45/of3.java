package r45;

/* loaded from: classes8.dex */
public class of3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382217d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382218e;

    /* renamed from: f, reason: collision with root package name */
    public int f382219f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382220g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382221h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382222i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382223m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.of3)) {
            return false;
        }
        r45.of3 of3Var = (r45.of3) fVar;
        return n51.f.a(this.BaseResponse, of3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382217d), java.lang.Integer.valueOf(of3Var.f382217d)) && n51.f.a(this.f382218e, of3Var.f382218e) && n51.f.a(java.lang.Integer.valueOf(this.f382219f), java.lang.Integer.valueOf(of3Var.f382219f)) && n51.f.a(this.f382220g, of3Var.f382220g) && n51.f.a(this.f382221h, of3Var.f382221h) && n51.f.a(this.f382222i, of3Var.f382222i) && n51.f.a(this.f382223m, of3Var.f382223m);
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
            fVar.e(2, this.f382217d);
            java.lang.String str = this.f382218e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f382219f);
            java.lang.String str2 = this.f382220g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f382221h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f382222i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f382223m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382217d);
            java.lang.String str6 = this.f382218e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f382219f);
            java.lang.String str7 = this.f382220g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f382221h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f382222i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f382223m;
            return str10 != null ? e17 + b36.f.j(8, str10) : e17;
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
        r45.of3 of3Var = (r45.of3) objArr[1];
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
                    of3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                of3Var.f382217d = aVar2.g(intValue);
                return 0;
            case 3:
                of3Var.f382218e = aVar2.k(intValue);
                return 0;
            case 4:
                of3Var.f382219f = aVar2.g(intValue);
                return 0;
            case 5:
                of3Var.f382220g = aVar2.k(intValue);
                return 0;
            case 6:
                of3Var.f382221h = aVar2.k(intValue);
                return 0;
            case 7:
                of3Var.f382222i = aVar2.k(intValue);
                return 0;
            case 8:
                of3Var.f382223m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
