package r45;

/* loaded from: classes2.dex */
public class lx0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f379918d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379919e;

    /* renamed from: f, reason: collision with root package name */
    public long f379920f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx0)) {
            return false;
        }
        r45.lx0 lx0Var = (r45.lx0) fVar;
        return n51.f.a(this.BaseResponse, lx0Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f379918d), java.lang.Long.valueOf(lx0Var.f379918d)) && n51.f.a(this.f379919e, lx0Var.f379919e) && n51.f.a(java.lang.Long.valueOf(this.f379920f), java.lang.Long.valueOf(lx0Var.f379920f));
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
                        case -1490206402:
                            if (next.equals("qrcode_url")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -1438342585:
                            if (next.equals("invitation_expire_time")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 851453825:
                            if (next.equals("invitation_id")) {
                                c17 = 1;
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
                        this.f379918d = jSONObject.optLong(next);
                    } else if (c17 == 2) {
                        this.f379919e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f379920f = jSONObject.optLong(next);
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
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.h(2, this.f379918d);
            java.lang.String str = this.f379919e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f379920f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f379918d);
            java.lang.String str2 = this.f379919e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.h(4, this.f379920f);
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
        r45.lx0 lx0Var = (r45.lx0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                lx0Var.f379918d = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 3) {
                lx0Var.f379919e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            lx0Var.f379920f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            lx0Var.BaseResponse = ieVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, true);
            eVar.d(jSONObject, "invitation_id", java.lang.Long.valueOf(this.f379918d), true);
            eVar.d(jSONObject, "qrcode_url", this.f379919e, true);
            eVar.d(jSONObject, "invitation_expire_time", java.lang.Long.valueOf(this.f379920f), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
