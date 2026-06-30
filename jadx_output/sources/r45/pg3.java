package r45;

/* loaded from: classes4.dex */
public class pg3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383012d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383013e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f383014f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383015g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383016h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383017i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pg3)) {
            return false;
        }
        r45.pg3 pg3Var = (r45.pg3) fVar;
        return n51.f.a(this.BaseRequest, pg3Var.BaseRequest) && n51.f.a(this.f383012d, pg3Var.f383012d) && n51.f.a(this.f383013e, pg3Var.f383013e) && n51.f.a(this.f383014f, pg3Var.f383014f) && n51.f.a(this.f383015g, pg3Var.f383015g) && n51.f.a(this.f383016h, pg3Var.f383016h) && n51.f.a(this.f383017i, pg3Var.f383017i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f fromJson(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case -1613589672:
                            if (next.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1146830912:
                            if (next.equals("business")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 36848094:
                            if (next.equals("time_zone")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 229628405:
                            if (next.equals("real_country")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 770051678:
                            if (next.equals("BaseRequest")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1102765496:
                            if (next.equals("client_ips")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 2005750147:
                            if (next.equals("req_spam_info")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONObject) {
                                this.BaseRequest = (r45.he) new r45.he().fromJson(((org.json.JSONObject) opt).toString());
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            this.f383012d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (opt2 instanceof java.lang.String) {
                                this.f383013e = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt2, 0));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (opt3 instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt3;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    this.f383014f.add((java.lang.String) jSONArray.get(i17));
                                }
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            this.f383015g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f383016h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f383017i = (java.lang.String) jSONObject.opt(next);
                            break;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
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
            java.lang.String str = this.f383012d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f383013e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 1, this.f383014f);
            java.lang.String str2 = this.f383015g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f383016h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f383017i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f383012d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f383013e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int g17 = i18 + b36.f.g(4, 1, this.f383014f);
            java.lang.String str6 = this.f383015g;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f383016h;
            if (str7 != null) {
                g17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f383017i;
            return str8 != null ? g17 + b36.f.j(7, str8) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f383014f.clear();
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
        r45.pg3 pg3Var = (r45.pg3) objArr[1];
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
                    pg3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                pg3Var.f383012d = aVar2.k(intValue);
                return 0;
            case 3:
                pg3Var.f383013e = aVar2.d(intValue);
                return 0;
            case 4:
                pg3Var.f383014f.add(aVar2.k(intValue));
                return 0;
            case 5:
                pg3Var.f383015g = aVar2.k(intValue);
                return 0;
            case 6:
                pg3Var.f383016h = aVar2.k(intValue);
                return 0;
            case 7:
                pg3Var.f383017i = aVar2.k(intValue);
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
            eVar.d(jSONObject, "business", this.f383012d, false);
            eVar.d(jSONObject, "req_spam_info", this.f383013e, false);
            eVar.d(jSONObject, "client_ips", this.f383014f, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.f383015g, false);
            eVar.d(jSONObject, "time_zone", this.f383016h, false);
            eVar.d(jSONObject, "real_country", this.f383017i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
