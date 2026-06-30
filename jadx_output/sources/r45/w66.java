package r45;

/* loaded from: classes8.dex */
public class w66 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388908d;

    /* renamed from: e, reason: collision with root package name */
    public int f388909e;

    /* renamed from: f, reason: collision with root package name */
    public int f388910f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388911g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388912h;

    /* renamed from: i, reason: collision with root package name */
    public int f388913i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388914m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388915n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w66)) {
            return false;
        }
        r45.w66 w66Var = (r45.w66) fVar;
        return n51.f.a(this.BaseResponse, w66Var.BaseResponse) && n51.f.a(this.f388908d, w66Var.f388908d) && n51.f.a(java.lang.Integer.valueOf(this.f388909e), java.lang.Integer.valueOf(w66Var.f388909e)) && n51.f.a(java.lang.Integer.valueOf(this.f388910f), java.lang.Integer.valueOf(w66Var.f388910f)) && n51.f.a(this.f388911g, w66Var.f388911g) && n51.f.a(this.f388912h, w66Var.f388912h) && n51.f.a(java.lang.Integer.valueOf(this.f388913i), java.lang.Integer.valueOf(w66Var.f388913i)) && n51.f.a(this.f388914m, w66Var.f388914m) && n51.f.a(this.f388915n, w66Var.f388915n);
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
            java.lang.String str = this.f388908d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f388909e);
            fVar.e(4, this.f388910f);
            java.lang.String str2 = this.f388911g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f388912h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f388913i);
            java.lang.String str4 = this.f388914m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f388915n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str5 = this.f388908d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f388909e) + b36.f.e(4, this.f388910f);
            java.lang.String str6 = this.f388911g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f388912h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f388913i);
            java.lang.String str8 = this.f388914m;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388915n;
            return gVar2 != null ? e18 + b36.f.b(9, gVar2) : e18;
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
        r45.w66 w66Var = (r45.w66) objArr[1];
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
                    w66Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                w66Var.f388908d = aVar2.k(intValue);
                return 0;
            case 3:
                w66Var.f388909e = aVar2.g(intValue);
                return 0;
            case 4:
                w66Var.f388910f = aVar2.g(intValue);
                return 0;
            case 5:
                w66Var.f388911g = aVar2.k(intValue);
                return 0;
            case 6:
                w66Var.f388912h = aVar2.k(intValue);
                return 0;
            case 7:
                w66Var.f388913i = aVar2.g(intValue);
                return 0;
            case 8:
                w66Var.f388914m = aVar2.k(intValue);
                return 0;
            case 9:
                w66Var.f388915n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "PickedWord", this.f388908d, false);
            eVar.d(jSONObject, "PrefixOffset", java.lang.Integer.valueOf(this.f388909e), false);
            eVar.d(jSONObject, "SuffixOffset", java.lang.Integer.valueOf(this.f388910f), false);
            eVar.d(jSONObject, "PrefixText", this.f388911g, false);
            eVar.d(jSONObject, "SuffixText", this.f388912h, false);
            eVar.d(jSONObject, "PickedType", java.lang.Integer.valueOf(this.f388913i), false);
            eVar.d(jSONObject, "SearchId", this.f388914m, false);
            eVar.d(jSONObject, "ExtQueryInfo", this.f388915n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
