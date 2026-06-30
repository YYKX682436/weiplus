package r45;

/* loaded from: classes4.dex */
public class mf5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380446d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380447e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380448f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f380449g;

    /* renamed from: h, reason: collision with root package name */
    public int f380450h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380451i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f380452m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380453n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f380454o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f380455p;

    /* renamed from: q, reason: collision with root package name */
    public int f380456q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f380457r;

    /* renamed from: s, reason: collision with root package name */
    public int f380458s;

    /* renamed from: t, reason: collision with root package name */
    public int f380459t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mf5)) {
            return false;
        }
        r45.mf5 mf5Var = (r45.mf5) fVar;
        return n51.f.a(this.BaseRequest, mf5Var.BaseRequest) && n51.f.a(this.f380446d, mf5Var.f380446d) && n51.f.a(this.f380447e, mf5Var.f380447e) && n51.f.a(this.f380448f, mf5Var.f380448f) && n51.f.a(this.f380449g, mf5Var.f380449g) && n51.f.a(java.lang.Integer.valueOf(this.f380450h), java.lang.Integer.valueOf(mf5Var.f380450h)) && n51.f.a(this.f380451i, mf5Var.f380451i) && n51.f.a(this.f380452m, mf5Var.f380452m) && n51.f.a(this.f380453n, mf5Var.f380453n) && n51.f.a(this.f380454o, mf5Var.f380454o) && n51.f.a(this.f380455p, mf5Var.f380455p) && n51.f.a(java.lang.Integer.valueOf(this.f380456q), java.lang.Integer.valueOf(mf5Var.f380456q)) && n51.f.a(this.f380457r, mf5Var.f380457r) && n51.f.a(java.lang.Integer.valueOf(this.f380458s), java.lang.Integer.valueOf(mf5Var.f380458s)) && n51.f.a(java.lang.Integer.valueOf(this.f380459t), java.lang.Integer.valueOf(mf5Var.f380459t));
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
                        case -1957276818:
                            if (next.equals("OPCode")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -1548945544:
                            if (next.equals("Language")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case -1520513503:
                            if (next.equals("DeviceName")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1507001342:
                            if (next.equals("IsExpandAutoLoginExpireTime")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case -1486671871:
                            if (next.equals("RandomEncryKey")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -369756472:
                            if (next.equals("AutoAuthKey")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -202022634:
                            if (next.equals("UserName")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 770051678:
                            if (next.equals("BaseRequest")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 973052486:
                            if (next.equals("ClientID")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1015799504:
                            if (next.equals("MsgContextPubKey")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 1085759208:
                            if (next.equals("HardwareExtra")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1130419379:
                            if (next.equals("AutoLoginSwitchEnabled")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 1366812856:
                            if (next.equals("ExtSpamInfo")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1436864003:
                            if (next.equals("AutoAuthTicket")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1857236111:
                            if (next.equals("IsExpandOneClickLoginExpireTime")) {
                                c17 = 14;
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
                            this.f380446d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f380447e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f380448f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f380449g = (r45.cu5) new r45.cu5().fromJson(((org.json.JSONObject) opt2).toString());
                                break;
                            }
                        case 5:
                            this.f380450h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 6:
                            this.f380451i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f380452m = (r45.cu5) new r45.cu5().fromJson(((org.json.JSONObject) opt3).toString());
                                break;
                            }
                        case '\b':
                            this.f380453n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f380454o = (r45.cu5) new r45.cu5().fromJson(((org.json.JSONObject) opt4).toString());
                                break;
                            }
                        case '\n':
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f380455p = (r45.cu5) new r45.cu5().fromJson(((org.json.JSONObject) opt5).toString());
                                break;
                            }
                        case 11:
                            this.f380456q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            this.f380457r = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\r':
                            this.f380458s = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 14:
                            this.f380459t = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            java.lang.String str = this.f380446d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380447e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f380448f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.cu5 cu5Var = this.f380449g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f380449g.writeFields(fVar);
            }
            fVar.e(6, this.f380450h);
            java.lang.String str4 = this.f380451i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            r45.cu5 cu5Var2 = this.f380452m;
            if (cu5Var2 != null) {
                fVar.i(8, cu5Var2.computeSize());
                this.f380452m.writeFields(fVar);
            }
            java.lang.String str5 = this.f380453n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            r45.cu5 cu5Var3 = this.f380454o;
            if (cu5Var3 != null) {
                fVar.i(10, cu5Var3.computeSize());
                this.f380454o.writeFields(fVar);
            }
            r45.cu5 cu5Var4 = this.f380455p;
            if (cu5Var4 != null) {
                fVar.i(11, cu5Var4.computeSize());
                this.f380455p.writeFields(fVar);
            }
            fVar.e(12, this.f380456q);
            java.lang.String str6 = this.f380457r;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f380458s);
            fVar.e(15, this.f380459t);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str7 = this.f380446d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f380447e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f380448f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            r45.cu5 cu5Var5 = this.f380449g;
            if (cu5Var5 != null) {
                i18 += b36.f.i(5, cu5Var5.computeSize());
            }
            int e17 = i18 + b36.f.e(6, this.f380450h);
            java.lang.String str10 = this.f380451i;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            r45.cu5 cu5Var6 = this.f380452m;
            if (cu5Var6 != null) {
                e17 += b36.f.i(8, cu5Var6.computeSize());
            }
            java.lang.String str11 = this.f380453n;
            if (str11 != null) {
                e17 += b36.f.j(9, str11);
            }
            r45.cu5 cu5Var7 = this.f380454o;
            if (cu5Var7 != null) {
                e17 += b36.f.i(10, cu5Var7.computeSize());
            }
            r45.cu5 cu5Var8 = this.f380455p;
            if (cu5Var8 != null) {
                e17 += b36.f.i(11, cu5Var8.computeSize());
            }
            int e18 = e17 + b36.f.e(12, this.f380456q);
            java.lang.String str12 = this.f380457r;
            if (str12 != null) {
                e18 += b36.f.j(13, str12);
            }
            return e18 + b36.f.e(14, this.f380458s) + b36.f.e(15, this.f380459t);
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
        r45.mf5 mf5Var = (r45.mf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    mf5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                mf5Var.f380446d = aVar2.k(intValue);
                return 0;
            case 3:
                mf5Var.f380447e = aVar2.k(intValue);
                return 0;
            case 4:
                mf5Var.f380448f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var9.b(bArr2);
                    }
                    mf5Var.f380449g = cu5Var9;
                }
                return 0;
            case 6:
                mf5Var.f380450h = aVar2.g(intValue);
                return 0;
            case 7:
                mf5Var.f380451i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var10.b(bArr3);
                    }
                    mf5Var.f380452m = cu5Var10;
                }
                return 0;
            case 9:
                mf5Var.f380453n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var11.b(bArr4);
                    }
                    mf5Var.f380454o = cu5Var11;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var12.b(bArr5);
                    }
                    mf5Var.f380455p = cu5Var12;
                }
                return 0;
            case 12:
                mf5Var.f380456q = aVar2.g(intValue);
                return 0;
            case 13:
                mf5Var.f380457r = aVar2.k(intValue);
                return 0;
            case 14:
                mf5Var.f380458s = aVar2.g(intValue);
                return 0;
            case 15:
                mf5Var.f380459t = aVar2.g(intValue);
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
            eVar.d(jSONObject, "UserName", this.f380446d, false);
            eVar.d(jSONObject, "AutoAuthTicket", this.f380447e, false);
            eVar.d(jSONObject, "ClientID", this.f380448f, false);
            eVar.d(jSONObject, "RandomEncryKey", this.f380449g, false);
            eVar.d(jSONObject, "OPCode", java.lang.Integer.valueOf(this.f380450h), false);
            eVar.d(jSONObject, "DeviceName", this.f380451i, false);
            eVar.d(jSONObject, "AutoAuthKey", this.f380452m, false);
            eVar.d(jSONObject, "HardwareExtra", this.f380453n, false);
            eVar.d(jSONObject, "MsgContextPubKey", this.f380454o, false);
            eVar.d(jSONObject, "ExtSpamInfo", this.f380455p, false);
            eVar.d(jSONObject, "AutoLoginSwitchEnabled", java.lang.Integer.valueOf(this.f380456q), false);
            eVar.d(jSONObject, "Language", this.f380457r, false);
            eVar.d(jSONObject, "IsExpandAutoLoginExpireTime", java.lang.Integer.valueOf(this.f380458s), false);
            eVar.d(jSONObject, "IsExpandOneClickLoginExpireTime", java.lang.Integer.valueOf(this.f380459t), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
