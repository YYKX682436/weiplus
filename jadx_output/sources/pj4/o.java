package pj4;

/* loaded from: classes4.dex */
public class o extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355208d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f355209e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355210f;

    /* renamed from: g, reason: collision with root package name */
    public long f355211g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355212h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.o)) {
            return false;
        }
        pj4.o oVar = (pj4.o) fVar;
        return n51.f.a(this.BaseRequest, oVar.BaseRequest) && n51.f.a(this.f355208d, oVar.f355208d) && n51.f.a(this.f355209e, oVar.f355209e) && n51.f.a(this.f355210f, oVar.f355210f) && n51.f.a(java.lang.Long.valueOf(this.f355211g), java.lang.Long.valueOf(oVar.f355211g)) && n51.f.a(this.f355212h, oVar.f355212h);
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
            java.lang.String str = this.f355208d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f355209e);
            java.lang.String str2 = this.f355210f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f355211g);
            java.lang.String str3 = this.f355212h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f355208d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f355209e);
            java.lang.String str5 = this.f355210f;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            int h17 = g17 + b36.f.h(5, this.f355211g);
            java.lang.String str6 = this.f355212h;
            return str6 != null ? h17 + b36.f.j(6, str6) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f355209e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        pj4.o oVar = (pj4.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    oVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                oVar.f355208d = aVar2.k(intValue);
                return 0;
            case 3:
                oVar.f355209e.add(aVar2.k(intValue));
                return 0;
            case 4:
                oVar.f355210f = aVar2.k(intValue);
                return 0;
            case 5:
                oVar.f355211g = aVar2.i(intValue);
                return 0;
            case 6:
                oVar.f355212h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "text_status_ext_info", this.f355208d, false);
            eVar.d(jSONObject, "blacklist_usernames", this.f355209e, false);
            eVar.d(jSONObject, "text_status_id", this.f355210f, false);
            eVar.d(jSONObject, "mod_status_option", java.lang.Long.valueOf(this.f355211g), false);
            eVar.d(jSONObject, "private_info", this.f355212h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
