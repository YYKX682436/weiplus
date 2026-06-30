package r45;

/* loaded from: classes4.dex */
public class qg3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.d66 f383960d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383961e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383962f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f383963g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public r45.am0 f383964h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383965i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qg3)) {
            return false;
        }
        r45.qg3 qg3Var = (r45.qg3) fVar;
        return n51.f.a(this.BaseResponse, qg3Var.BaseResponse) && n51.f.a(this.f383960d, qg3Var.f383960d) && n51.f.a(this.f383961e, qg3Var.f383961e) && n51.f.a(this.f383962f, qg3Var.f383962f) && n51.f.a(this.f383963g, qg3Var.f383963g) && n51.f.a(this.f383964h, qg3Var.f383964h) && n51.f.a(this.f383965i, qg3Var.f383965i);
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
                        case -1980299928:
                            if (next.equals("uplink_url_info")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1845267886:
                            if (next.equals("BaseResponse")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1786037690:
                            if (next.equals("expired_time_info")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -1728549842:
                            if (next.equals("logicresp")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1116517017:
                            if (next.equals("gateway_ticket")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -964944331:
                            if (next.equals("resp_spam_info")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 104192092:
                            if (next.equals("msgid")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONObject) {
                                this.BaseResponse = (r45.ie) new r45.ie().fromJson(((org.json.JSONObject) opt).toString());
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (opt2 instanceof org.json.JSONObject) {
                                r45.d66 d66Var = new r45.d66();
                                d66Var.fromJson(((org.json.JSONObject) opt2).toString());
                                this.f383960d = d66Var;
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (opt3 instanceof java.lang.String) {
                                this.f383961e = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt3, 0));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            this.f383962f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (opt4 instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt4;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList = this.f383963g;
                                        r45.ot6 ot6Var = new r45.ot6();
                                        ot6Var.fromJson(((org.json.JSONObject) obj).toString());
                                        linkedList.add(ot6Var);
                                    }
                                }
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (opt5 instanceof org.json.JSONObject) {
                                r45.am0 am0Var = new r45.am0();
                                am0Var.fromJson(((org.json.JSONObject) opt5).toString());
                                this.f383964h = am0Var;
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (opt6 instanceof java.lang.String) {
                                this.f383965i = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt6, 0));
                                break;
                            } else {
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
        java.util.LinkedList linkedList = this.f383963g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.d66 d66Var = this.f383960d;
            if (d66Var != null) {
                fVar.i(2, d66Var.computeSize());
                this.f383960d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f383961e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f383962f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 8, linkedList);
            r45.am0 am0Var = this.f383964h;
            if (am0Var != null) {
                fVar.i(6, am0Var.computeSize());
                this.f383964h.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f383965i;
            if (gVar2 != null) {
                fVar.b(7, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.d66 d66Var2 = this.f383960d;
            if (d66Var2 != null) {
                i18 += b36.f.i(2, d66Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f383961e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            java.lang.String str2 = this.f383962f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList);
            r45.am0 am0Var2 = this.f383964h;
            if (am0Var2 != null) {
                g17 += b36.f.i(6, am0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f383965i;
            return gVar4 != null ? g17 + b36.f.b(7, gVar4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.qg3 qg3Var = (r45.qg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    qg3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.d66 d66Var3 = new r45.d66();
                    if (bArr3 != null && bArr3.length > 0) {
                        d66Var3.parseFrom(bArr3);
                    }
                    qg3Var.f383960d = d66Var3;
                }
                return 0;
            case 3:
                qg3Var.f383961e = aVar2.d(intValue);
                return 0;
            case 4:
                qg3Var.f383962f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ot6 ot6Var = new r45.ot6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ot6Var.parseFrom(bArr4);
                    }
                    qg3Var.f383963g.add(ot6Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.am0 am0Var3 = new r45.am0();
                    if (bArr5 != null && bArr5.length > 0) {
                        am0Var3.parseFrom(bArr5);
                    }
                    qg3Var.f383964h = am0Var3;
                }
                return 0;
            case 7:
                qg3Var.f383965i = aVar2.d(intValue);
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
            eVar.d(jSONObject, "logicresp", this.f383960d, false);
            eVar.d(jSONObject, "resp_spam_info", this.f383961e, false);
            eVar.d(jSONObject, "msgid", this.f383962f, false);
            eVar.d(jSONObject, "uplink_url_info", this.f383963g, false);
            eVar.d(jSONObject, "expired_time_info", this.f383964h, false);
            eVar.d(jSONObject, "gateway_ticket", this.f383965i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
