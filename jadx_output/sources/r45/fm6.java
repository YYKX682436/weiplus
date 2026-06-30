package r45;

/* loaded from: classes2.dex */
public class fm6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f374454d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f374455e;

    /* renamed from: f, reason: collision with root package name */
    public int f374456f;

    /* renamed from: g, reason: collision with root package name */
    public int f374457g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f374458h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fm6)) {
            return false;
        }
        r45.fm6 fm6Var = (r45.fm6) fVar;
        return n51.f.a(this.BaseResponse, fm6Var.BaseResponse) && n51.f.a(this.f374454d, fm6Var.f374454d) && n51.f.a(java.lang.Integer.valueOf(this.f374455e), java.lang.Integer.valueOf(fm6Var.f374455e)) && n51.f.a(java.lang.Integer.valueOf(this.f374456f), java.lang.Integer.valueOf(fm6Var.f374456f)) && n51.f.a(java.lang.Integer.valueOf(this.f374457g), java.lang.Integer.valueOf(fm6Var.f374457g)) && n51.f.a(java.lang.Boolean.valueOf(this.f374458h), java.lang.Boolean.valueOf(fm6Var.f374458h));
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
                        case -1845267886:
                            if (next.equals("BaseResponse")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -200294621:
                            if (next.equals("show_finder_live")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 688560782:
                            if (next.equals("green_point_stay_time_in_sec")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1537817955:
                            if (next.equals("biz_info_list")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1628361114:
                            if (next.equals("server_rank_often_read_biz")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 2071153027:
                            if (next.equals("display_ctrl_flag")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            this.BaseResponse = (r45.ie) new r45.ie().fromJson(((org.json.JSONObject) opt).toString());
                        }
                    } else if (c17 == 1) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) opt2;
                            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                java.lang.Object obj = jSONArray.get(i17);
                                if (obj instanceof org.json.JSONObject) {
                                    java.util.LinkedList linkedList = this.f374454d;
                                    r45.hm6 hm6Var = new r45.hm6();
                                    hm6Var.fromJson(((org.json.JSONObject) obj).toString());
                                    linkedList.add(hm6Var);
                                }
                            }
                        }
                    } else if (c17 == 2) {
                        this.f374455e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f374456f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 4) {
                        this.f374457g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 5) {
                        this.f374458h = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374454d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f374455e);
            fVar.e(4, this.f374456f);
            fVar.e(5, this.f374457g);
            fVar.a(9, this.f374458h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f374455e) + b36.f.e(4, this.f374456f) + b36.f.e(5, this.f374457g) + b36.f.a(9, this.f374458h);
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
        r45.fm6 fm6Var = (r45.fm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                fm6Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.hm6 hm6Var = new r45.hm6();
                if (bArr3 != null && bArr3.length > 0) {
                    hm6Var.parseFrom(bArr3);
                }
                fm6Var.f374454d.add(hm6Var);
            }
            return 0;
        }
        if (intValue == 3) {
            fm6Var.f374455e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            fm6Var.f374456f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            fm6Var.f374457g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 9) {
            return -1;
        }
        fm6Var.f374458h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, true);
            eVar.d(jSONObject, "biz_info_list", this.f374454d, true);
            eVar.d(jSONObject, "display_ctrl_flag", java.lang.Integer.valueOf(this.f374455e), true);
            eVar.d(jSONObject, "server_rank_often_read_biz", java.lang.Integer.valueOf(this.f374456f), true);
            eVar.d(jSONObject, "green_point_stay_time_in_sec", java.lang.Integer.valueOf(this.f374457g), true);
            eVar.d(jSONObject, "show_finder_live", java.lang.Boolean.valueOf(this.f374458h), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
