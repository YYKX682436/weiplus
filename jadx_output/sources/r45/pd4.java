package r45;

/* loaded from: classes4.dex */
public class pd4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382959d;

    /* renamed from: e, reason: collision with root package name */
    public int f382960e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382961f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382962g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382963h;

    /* renamed from: i, reason: collision with root package name */
    public int f382964i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382965m;

    /* renamed from: n, reason: collision with root package name */
    public int f382966n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382967o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pd4)) {
            return false;
        }
        r45.pd4 pd4Var = (r45.pd4) fVar;
        return n51.f.a(this.f382959d, pd4Var.f382959d) && n51.f.a(java.lang.Integer.valueOf(this.f382960e), java.lang.Integer.valueOf(pd4Var.f382960e)) && n51.f.a(this.f382961f, pd4Var.f382961f) && n51.f.a(this.f382962g, pd4Var.f382962g) && n51.f.a(this.f382963h, pd4Var.f382963h) && n51.f.a(java.lang.Integer.valueOf(this.f382964i), java.lang.Integer.valueOf(pd4Var.f382964i)) && n51.f.a(this.f382965m, pd4Var.f382965m) && n51.f.a(java.lang.Integer.valueOf(this.f382966n), java.lang.Integer.valueOf(pd4Var.f382966n)) && n51.f.a(this.f382967o, pd4Var.f382967o);
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
                        case -1808614382:
                            if (next.equals("Status")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1129667380:
                            if (next.equals("HeadImgURL")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -202022634:
                            if (next.equals("UserName")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 80669:
                            if (next.equals("Pwd")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 2616251:
                            if (next.equals("UUID")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 134381742:
                            if (next.equals("NickName")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1018119815:
                            if (next.equals("AuthUrl")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1469887698:
                            if (next.equals("PushLoginURLExpiredTime")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1575353202:
                            if (next.equals("ExpiredTime")) {
                                c17 = 7;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f382959d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f382960e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f382961f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f382962g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f382963h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f382964i = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 6:
                            this.f382965m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f382966n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            this.f382967o = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f382959d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f382960e);
            java.lang.String str2 = this.f382961f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382962g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f382963h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f382964i);
            java.lang.String str5 = this.f382965m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f382966n);
            java.lang.String str6 = this.f382967o;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f382959d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f382960e);
            java.lang.String str8 = this.f382961f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f382962g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f382963h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            int e17 = j17 + b36.f.e(6, this.f382964i);
            java.lang.String str11 = this.f382965m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f382966n);
            java.lang.String str12 = this.f382967o;
            return str12 != null ? e18 + b36.f.j(15, str12) : e18;
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
        r45.pd4 pd4Var = (r45.pd4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 15) {
            pd4Var.f382967o = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                pd4Var.f382959d = aVar2.k(intValue);
                return 0;
            case 2:
                pd4Var.f382960e = aVar2.g(intValue);
                return 0;
            case 3:
                pd4Var.f382961f = aVar2.k(intValue);
                return 0;
            case 4:
                pd4Var.f382962g = aVar2.k(intValue);
                return 0;
            case 5:
                pd4Var.f382963h = aVar2.k(intValue);
                return 0;
            case 6:
                pd4Var.f382964i = aVar2.g(intValue);
                return 0;
            case 7:
                pd4Var.f382965m = aVar2.k(intValue);
                return 0;
            case 8:
                pd4Var.f382966n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f382959d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "UUID", str, false);
            eVar.d(jSONObject, "Status", java.lang.Integer.valueOf(this.f382960e), false);
            eVar.d(jSONObject, "UserName", this.f382961f, false);
            eVar.d(jSONObject, "Pwd", this.f382962g, false);
            eVar.d(jSONObject, "HeadImgURL", this.f382963h, false);
            eVar.d(jSONObject, "PushLoginURLExpiredTime", java.lang.Integer.valueOf(this.f382964i), false);
            eVar.d(jSONObject, "NickName", this.f382965m, false);
            eVar.d(jSONObject, "ExpiredTime", java.lang.Integer.valueOf(this.f382966n), false);
            eVar.d(jSONObject, "AuthUrl", this.f382967o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
