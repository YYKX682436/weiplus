package r45;

/* loaded from: classes4.dex */
public class yi3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391118d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391119e;

    /* renamed from: f, reason: collision with root package name */
    public int f391120f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391121g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f391122h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f391123i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391124m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391125n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yi3)) {
            return false;
        }
        r45.yi3 yi3Var = (r45.yi3) fVar;
        return n51.f.a(this.BaseRequest, yi3Var.BaseRequest) && n51.f.a(this.f391118d, yi3Var.f391118d) && n51.f.a(this.f391119e, yi3Var.f391119e) && n51.f.a(java.lang.Integer.valueOf(this.f391120f), java.lang.Integer.valueOf(yi3Var.f391120f)) && n51.f.a(this.f391121g, yi3Var.f391121g) && n51.f.a(this.f391122h, yi3Var.f391122h) && n51.f.a(this.f391123i, yi3Var.f391123i) && n51.f.a(this.f391124m, yi3Var.f391124m) && n51.f.a(this.f391125n, yi3Var.f391125n);
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
                    int i17 = 0;
                    switch (next.hashCode()) {
                        case -1966036000:
                            if (next.equals("channel_token_list")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -1613589672:
                            if (next.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1313747785:
                            if (next.equals("mobile_type")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1146830912:
                            if (next.equals("business")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1116517017:
                            if (next.equals("gateway_ticket")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 104192092:
                            if (next.equals("msgid")) {
                                c17 = 4;
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
                                c17 = 6;
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
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.BaseRequest = (r45.he) new r45.he().fromJson(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 1:
                            this.f391118d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f391119e = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt2, 0));
                                break;
                            }
                        case 3:
                            this.f391120f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 4:
                            this.f391121g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt3;
                                while (i17 < jSONArray.length()) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList = this.f391122h;
                                        r45.py pyVar = new r45.py();
                                        pyVar.fromJson(((org.json.JSONObject) obj).toString());
                                        linkedList.add(pyVar);
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case 6:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt4;
                                while (i17 < jSONArray2.length()) {
                                    this.f391123i.add((java.lang.String) jSONArray2.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 7:
                            this.f391124m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f391125n = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt5, 0));
                                break;
                            }
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
            java.lang.String str = this.f391118d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f391119e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f391120f);
            java.lang.String str2 = this.f391121g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, this.f391122h);
            fVar.g(7, 1, this.f391123i);
            java.lang.String str3 = this.f391124m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f391125n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f391118d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f391119e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int e17 = i18 + b36.f.e(4, this.f391120f);
            java.lang.String str5 = this.f391121g;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            int g17 = e17 + b36.f.g(6, 8, this.f391122h) + b36.f.g(7, 1, this.f391123i);
            java.lang.String str6 = this.f391124m;
            if (str6 != null) {
                g17 += b36.f.j(8, str6);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f391125n;
            return gVar4 != null ? g17 + b36.f.b(9, gVar4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f391122h.clear();
            this.f391123i.clear();
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
        r45.yi3 yi3Var = (r45.yi3) objArr[1];
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
                    yi3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                yi3Var.f391118d = aVar2.k(intValue);
                return 0;
            case 3:
                yi3Var.f391119e = aVar2.d(intValue);
                return 0;
            case 4:
                yi3Var.f391120f = aVar2.g(intValue);
                return 0;
            case 5:
                yi3Var.f391121g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.py pyVar = new r45.py();
                    if (bArr3 != null && bArr3.length > 0) {
                        pyVar.parseFrom(bArr3);
                    }
                    yi3Var.f391122h.add(pyVar);
                }
                return 0;
            case 7:
                yi3Var.f391123i.add(aVar2.k(intValue));
                return 0;
            case 8:
                yi3Var.f391124m = aVar2.k(intValue);
                return 0;
            case 9:
                yi3Var.f391125n = aVar2.d(intValue);
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
            eVar.d(jSONObject, "business", this.f391118d, false);
            eVar.d(jSONObject, "req_spam_info", this.f391119e, false);
            eVar.d(jSONObject, "mobile_type", java.lang.Integer.valueOf(this.f391120f), false);
            eVar.d(jSONObject, "msgid", this.f391121g, false);
            eVar.d(jSONObject, "channel_token_list", this.f391122h, false);
            eVar.d(jSONObject, "client_ips", this.f391123i, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, this.f391124m, false);
            eVar.d(jSONObject, "gateway_ticket", this.f391125n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
