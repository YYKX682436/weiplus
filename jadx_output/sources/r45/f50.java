package r45;

/* loaded from: classes4.dex */
public class f50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f374013d;

    /* renamed from: e, reason: collision with root package name */
    public int f374014e;

    /* renamed from: f, reason: collision with root package name */
    public int f374015f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f374016g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f374017h;

    /* renamed from: i, reason: collision with root package name */
    public long f374018i;

    /* renamed from: m, reason: collision with root package name */
    public int f374019m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374020n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f50)) {
            return false;
        }
        r45.f50 f50Var = (r45.f50) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f374013d), java.lang.Long.valueOf(f50Var.f374013d)) && n51.f.a(java.lang.Integer.valueOf(this.f374014e), java.lang.Integer.valueOf(f50Var.f374014e)) && n51.f.a(java.lang.Integer.valueOf(this.f374015f), java.lang.Integer.valueOf(f50Var.f374015f)) && n51.f.a(this.f374016g, f50Var.f374016g) && n51.f.a(this.f374017h, f50Var.f374017h) && n51.f.a(java.lang.Long.valueOf(this.f374018i), java.lang.Long.valueOf(f50Var.f374018i)) && n51.f.a(java.lang.Integer.valueOf(this.f374019m), java.lang.Integer.valueOf(f50Var.f374019m)) && n51.f.a(this.f374020n, f50Var.f374020n);
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
                        case -1490206402:
                            if (next.equals("qrcode_url")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1438342585:
                            if (next.equals("invitation_expire_time")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -559170823:
                            if (next.equals("settlement_mode")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 3506294:
                            if (next.equals("role")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 294537048:
                            if (next.equals("invitation_status")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 589164048:
                            if (next.equals("initiator_contact")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 783410305:
                            if (next.equals("invitee_list")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 851453825:
                            if (next.equals("invitation_id")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f374013d = jSONObject.optLong(next);
                            break;
                        case 1:
                            this.f374014e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f374015f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        this.f374016g.add((com.tencent.mm.protocal.protobuf.FinderContact) new com.tencent.mm.protocal.protobuf.FinderContact().fromJson(((org.json.JSONObject) obj).toString()));
                                    }
                                }
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (opt2 instanceof org.json.JSONObject) {
                                this.f374017h = (com.tencent.mm.protocal.protobuf.FinderContact) new com.tencent.mm.protocal.protobuf.FinderContact().fromJson(((org.json.JSONObject) opt2).toString());
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            this.f374018i = jSONObject.optLong(next);
                            break;
                        case 6:
                            this.f374019m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f374020n = (java.lang.String) jSONObject.opt(next);
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
        java.util.LinkedList linkedList = this.f374016g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f374013d);
            fVar.e(2, this.f374014e);
            fVar.e(3, this.f374015f);
            fVar.g(4, 8, linkedList);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f374017h;
            if (finderContact != null) {
                fVar.i(5, finderContact.computeSize());
                this.f374017h.writeFields(fVar);
            }
            fVar.h(6, this.f374018i);
            fVar.e(7, this.f374019m);
            java.lang.String str = this.f374020n;
            if (str != null) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f374013d) + 0 + b36.f.e(2, this.f374014e) + b36.f.e(3, this.f374015f) + b36.f.g(4, 8, linkedList);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.f374017h;
            if (finderContact2 != null) {
                h17 += b36.f.i(5, finderContact2.computeSize());
            }
            int h18 = h17 + b36.f.h(6, this.f374018i) + b36.f.e(7, this.f374019m);
            java.lang.String str2 = this.f374020n;
            return str2 != null ? h18 + b36.f.j(8, str2) : h18;
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
        r45.f50 f50Var = (r45.f50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f50Var.f374013d = aVar2.i(intValue);
                return 0;
            case 2:
                f50Var.f374014e = aVar2.g(intValue);
                return 0;
            case 3:
                f50Var.f374015f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = new com.tencent.mm.protocal.protobuf.FinderContact();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderContact3.parseFrom(bArr2);
                    }
                    f50Var.f374016g.add(finderContact3);
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = new com.tencent.mm.protocal.protobuf.FinderContact();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderContact4.parseFrom(bArr3);
                    }
                    f50Var.f374017h = finderContact4;
                }
                return 0;
            case 6:
                f50Var.f374018i = aVar2.i(intValue);
                return 0;
            case 7:
                f50Var.f374019m = aVar2.g(intValue);
                return 0;
            case 8:
                f50Var.f374020n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f374013d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "invitation_id", valueOf, true);
            eVar.d(jSONObject, "invitation_status", java.lang.Integer.valueOf(this.f374014e), true);
            eVar.d(jSONObject, "settlement_mode", java.lang.Integer.valueOf(this.f374015f), true);
            eVar.d(jSONObject, "invitee_list", this.f374016g, true);
            eVar.d(jSONObject, "initiator_contact", this.f374017h, true);
            eVar.d(jSONObject, "invitation_expire_time", java.lang.Long.valueOf(this.f374018i), true);
            eVar.d(jSONObject, "role", java.lang.Integer.valueOf(this.f374019m), true);
            eVar.d(jSONObject, "qrcode_url", this.f374020n, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
