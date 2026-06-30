package r45;

/* loaded from: classes4.dex */
public class zi3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.d66 f392091d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f392092e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fn4 f392093f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zi3)) {
            return false;
        }
        r45.zi3 zi3Var = (r45.zi3) fVar;
        return n51.f.a(this.BaseResponse, zi3Var.BaseResponse) && n51.f.a(this.f392091d, zi3Var.f392091d) && n51.f.a(this.f392092e, zi3Var.f392092e) && n51.f.a(this.f392093f, zi3Var.f392093f);
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
                        case -1728549842:
                            if (next.equals("logicresp")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1314086357:
                            if (next.equals("mobile_info")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -964944331:
                            if (next.equals("resp_spam_info")) {
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
                        if (opt2 instanceof org.json.JSONObject) {
                            r45.d66 d66Var = new r45.d66();
                            d66Var.fromJson(((org.json.JSONObject) opt2).toString());
                            this.f392091d = d66Var;
                        }
                    } else if (c17 == 2) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof java.lang.String) {
                            this.f392092e = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt3, 0));
                        }
                    } else if (c17 == 3) {
                        java.lang.Object opt4 = jSONObject.opt(next);
                        if (opt4 instanceof org.json.JSONObject) {
                            r45.fn4 fn4Var = new r45.fn4();
                            fn4Var.fromJson(((org.json.JSONObject) opt4).toString());
                            this.f392093f = fn4Var;
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
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.d66 d66Var = this.f392091d;
            if (d66Var != null) {
                fVar.i(2, d66Var.computeSize());
                this.f392091d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f392092e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.fn4 fn4Var = this.f392093f;
            if (fn4Var != null) {
                fVar.i(4, fn4Var.computeSize());
                this.f392093f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.d66 d66Var2 = this.f392091d;
            if (d66Var2 != null) {
                i18 += b36.f.i(2, d66Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f392092e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            r45.fn4 fn4Var2 = this.f392093f;
            return fn4Var2 != null ? i18 + b36.f.i(4, fn4Var2.computeSize()) : i18;
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
        r45.zi3 zi3Var = (r45.zi3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                zi3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.d66 d66Var3 = new r45.d66();
                if (bArr2 != null && bArr2.length > 0) {
                    d66Var3.parseFrom(bArr2);
                }
                zi3Var.f392091d = d66Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            zi3Var.f392092e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.fn4 fn4Var3 = new r45.fn4();
            if (bArr3 != null && bArr3.length > 0) {
                fn4Var3.parseFrom(bArr3);
            }
            zi3Var.f392093f = fn4Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "logicresp", this.f392091d, false);
            eVar.d(jSONObject, "resp_spam_info", this.f392092e, false);
            eVar.d(jSONObject, "mobile_info", this.f392093f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
