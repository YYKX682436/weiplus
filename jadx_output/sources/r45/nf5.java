package r45;

/* loaded from: classes4.dex */
public class nf5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381352d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f381353e;

    /* renamed from: f, reason: collision with root package name */
    public int f381354f;

    /* renamed from: g, reason: collision with root package name */
    public int f381355g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381356h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f381357i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381358m;

    /* renamed from: n, reason: collision with root package name */
    public int f381359n;

    /* renamed from: o, reason: collision with root package name */
    public int f381360o;

    /* renamed from: p, reason: collision with root package name */
    public int f381361p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f381362q;

    /* renamed from: r, reason: collision with root package name */
    public int f381363r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nf5)) {
            return false;
        }
        r45.nf5 nf5Var = (r45.nf5) fVar;
        return n51.f.a(this.BaseResponse, nf5Var.BaseResponse) && n51.f.a(this.f381352d, nf5Var.f381352d) && n51.f.a(this.f381353e, nf5Var.f381353e) && n51.f.a(java.lang.Integer.valueOf(this.f381354f), java.lang.Integer.valueOf(nf5Var.f381354f)) && n51.f.a(java.lang.Integer.valueOf(this.f381355g), java.lang.Integer.valueOf(nf5Var.f381355g)) && n51.f.a(this.f381356h, nf5Var.f381356h) && n51.f.a(this.f381357i, nf5Var.f381357i) && n51.f.a(this.f381358m, nf5Var.f381358m) && n51.f.a(java.lang.Integer.valueOf(this.f381359n), java.lang.Integer.valueOf(nf5Var.f381359n)) && n51.f.a(java.lang.Integer.valueOf(this.f381360o), java.lang.Integer.valueOf(nf5Var.f381360o)) && n51.f.a(java.lang.Integer.valueOf(this.f381361p), java.lang.Integer.valueOf(nf5Var.f381361p)) && n51.f.a(this.f381362q, nf5Var.f381362q) && n51.f.a(java.lang.Integer.valueOf(this.f381363r), java.lang.Integer.valueOf(nf5Var.f381363r));
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
                        case -1892415531:
                            if (next.equals("CheckTime")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1845267886:
                            if (next.equals("BaseResponse")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1140125618:
                            if (next.equals("BlueToothBroadCastUUID")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -388923850:
                            if (next.equals("NotifyKey")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -381010447:
                            if (next.equals("WebFileHelperUrl")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -64004164:
                            if (next.equals("AlertWording")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 2192268:
                            if (next.equals("Flag")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 2616251:
                            if (next.equals("UUID")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 79702124:
                            if (next.equals("Scene")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 541048137:
                            if (next.equals("AlertCode")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1103952614:
                            if (next.equals("BlueToothBroadCastContent")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1575353202:
                            if (next.equals("ExpiredTime")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1624812116:
                            if (next.equals("AbandonedPushLoginUrl")) {
                                c17 = '\f';
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
                                this.BaseResponse = (r45.ie) new r45.ie().fromJson(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 1:
                            this.f381352d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f381353e = (r45.cu5) new r45.cu5().fromJson(((org.json.JSONObject) opt2).toString());
                                break;
                            }
                        case 3:
                            this.f381354f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 4:
                            this.f381355g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f381356h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f381357i = (r45.cu5) new r45.cu5().fromJson(((org.json.JSONObject) opt3).toString());
                                break;
                            }
                        case 7:
                            this.f381358m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f381359n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f381360o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f381361p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 11:
                            this.f381362q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\f':
                            this.f381363r = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f381352d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f381353e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f381353e.writeFields(fVar);
            }
            fVar.e(4, this.f381354f);
            fVar.e(5, this.f381355g);
            java.lang.String str2 = this.f381356h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.cu5 cu5Var2 = this.f381357i;
            if (cu5Var2 != null) {
                fVar.i(7, cu5Var2.computeSize());
                this.f381357i.writeFields(fVar);
            }
            java.lang.String str3 = this.f381358m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f381359n);
            fVar.e(10, this.f381360o);
            fVar.e(11, this.f381361p);
            java.lang.String str4 = this.f381362q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f381363r);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str5 = this.f381352d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            r45.cu5 cu5Var3 = this.f381353e;
            if (cu5Var3 != null) {
                i18 += b36.f.i(3, cu5Var3.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f381354f) + b36.f.e(5, this.f381355g);
            java.lang.String str6 = this.f381356h;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            r45.cu5 cu5Var4 = this.f381357i;
            if (cu5Var4 != null) {
                e17 += b36.f.i(7, cu5Var4.computeSize());
            }
            java.lang.String str7 = this.f381358m;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            int e18 = e17 + b36.f.e(9, this.f381359n) + b36.f.e(10, this.f381360o) + b36.f.e(11, this.f381361p);
            java.lang.String str8 = this.f381362q;
            if (str8 != null) {
                e18 += b36.f.j(12, str8);
            }
            return e18 + b36.f.e(13, this.f381363r);
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
        r45.nf5 nf5Var = (r45.nf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    nf5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                nf5Var.f381352d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    nf5Var.f381353e = cu5Var5;
                }
                return 0;
            case 4:
                nf5Var.f381354f = aVar2.g(intValue);
                return 0;
            case 5:
                nf5Var.f381355g = aVar2.g(intValue);
                return 0;
            case 6:
                nf5Var.f381356h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    nf5Var.f381357i = cu5Var6;
                }
                return 0;
            case 8:
                nf5Var.f381358m = aVar2.k(intValue);
                return 0;
            case 9:
                nf5Var.f381359n = aVar2.g(intValue);
                return 0;
            case 10:
                nf5Var.f381360o = aVar2.g(intValue);
                return 0;
            case 11:
                nf5Var.f381361p = aVar2.g(intValue);
                return 0;
            case 12:
                nf5Var.f381362q = aVar2.k(intValue);
                return 0;
            case 13:
                nf5Var.f381363r = aVar2.g(intValue);
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
            eVar.d(jSONObject, "UUID", this.f381352d, false);
            eVar.d(jSONObject, "NotifyKey", this.f381353e, false);
            eVar.d(jSONObject, "CheckTime", java.lang.Integer.valueOf(this.f381354f), false);
            eVar.d(jSONObject, "ExpiredTime", java.lang.Integer.valueOf(this.f381355g), false);
            eVar.d(jSONObject, "BlueToothBroadCastUUID", this.f381356h, false);
            eVar.d(jSONObject, "BlueToothBroadCastContent", this.f381357i, false);
            eVar.d(jSONObject, "WebFileHelperUrl", this.f381358m, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f381359n), false);
            eVar.d(jSONObject, "Flag", java.lang.Integer.valueOf(this.f381360o), false);
            eVar.d(jSONObject, "AlertCode", java.lang.Integer.valueOf(this.f381361p), false);
            eVar.d(jSONObject, "AlertWording", this.f381362q, false);
            eVar.d(jSONObject, "AbandonedPushLoginUrl", java.lang.Integer.valueOf(this.f381363r), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
