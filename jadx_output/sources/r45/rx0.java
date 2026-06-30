package r45;

/* loaded from: classes2.dex */
public class rx0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f385265d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f50 f385266e;

    /* renamed from: f, reason: collision with root package name */
    public long f385267f;

    /* renamed from: g, reason: collision with root package name */
    public int f385268g;

    /* renamed from: h, reason: collision with root package name */
    public long f385269h;

    /* renamed from: i, reason: collision with root package name */
    public long f385270i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rx0)) {
            return false;
        }
        r45.rx0 rx0Var = (r45.rx0) fVar;
        return n51.f.a(this.BaseResponse, rx0Var.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f385265d), java.lang.Boolean.valueOf(rx0Var.f385265d)) && n51.f.a(this.f385266e, rx0Var.f385266e) && n51.f.a(java.lang.Long.valueOf(this.f385267f), java.lang.Long.valueOf(rx0Var.f385267f)) && n51.f.a(java.lang.Integer.valueOf(this.f385268g), java.lang.Integer.valueOf(rx0Var.f385268g)) && n51.f.a(java.lang.Long.valueOf(this.f385269h), java.lang.Long.valueOf(rx0Var.f385269h)) && n51.f.a(java.lang.Long.valueOf(this.f385270i), java.lang.Long.valueOf(rx0Var.f385270i));
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
                        case -2057608690:
                            if (next.equals("has_update")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1845267886:
                            if (next.equals("BaseResponse")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1489595877:
                            if (next.equals("object_id")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -78058784:
                            if (next.equals("poll_interval_ms")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 184289614:
                            if (next.equals("live_id")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 351608024:
                            if (next.equals("version")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1808692788:
                            if (next.equals("co_live_invitation_info")) {
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
                                this.BaseResponse = (r45.ie) new r45.ie().fromJson(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 1:
                            this.f385265d = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case 2:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.f50 f50Var = new r45.f50();
                                f50Var.fromJson(((org.json.JSONObject) opt2).toString());
                                this.f385266e = f50Var;
                                break;
                            }
                        case 3:
                            this.f385267f = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f385268g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f385269h = jSONObject.optLong(next);
                            break;
                        case 6:
                            this.f385270i = jSONObject.optLong(next);
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
            fVar.a(2, this.f385265d);
            r45.f50 f50Var = this.f385266e;
            if (f50Var != null) {
                fVar.i(3, f50Var.computeSize());
                this.f385266e.writeFields(fVar);
            }
            fVar.h(4, this.f385267f);
            fVar.e(5, this.f385268g);
            fVar.h(6, this.f385269h);
            fVar.h(7, this.f385270i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.a(2, this.f385265d);
            r45.f50 f50Var2 = this.f385266e;
            if (f50Var2 != null) {
                i18 += b36.f.i(3, f50Var2.computeSize());
            }
            return i18 + b36.f.h(4, this.f385267f) + b36.f.e(5, this.f385268g) + b36.f.h(6, this.f385269h) + b36.f.h(7, this.f385270i);
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
        r45.rx0 rx0Var = (r45.rx0) objArr[1];
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
                    rx0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                rx0Var.f385265d = aVar2.c(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.f50 f50Var3 = new r45.f50();
                    if (bArr2 != null && bArr2.length > 0) {
                        f50Var3.parseFrom(bArr2);
                    }
                    rx0Var.f385266e = f50Var3;
                }
                return 0;
            case 4:
                rx0Var.f385267f = aVar2.i(intValue);
                return 0;
            case 5:
                rx0Var.f385268g = aVar2.g(intValue);
                return 0;
            case 6:
                rx0Var.f385269h = aVar2.i(intValue);
                return 0;
            case 7:
                rx0Var.f385270i = aVar2.i(intValue);
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
            eVar.d(jSONObject, "BaseResponse", ieVar, true);
            eVar.d(jSONObject, "has_update", java.lang.Boolean.valueOf(this.f385265d), true);
            eVar.d(jSONObject, "co_live_invitation_info", this.f385266e, true);
            eVar.d(jSONObject, "version", java.lang.Long.valueOf(this.f385267f), true);
            eVar.d(jSONObject, "poll_interval_ms", java.lang.Integer.valueOf(this.f385268g), true);
            eVar.d(jSONObject, "object_id", java.lang.Long.valueOf(this.f385269h), true);
            eVar.d(jSONObject, "live_id", java.lang.Long.valueOf(this.f385270i), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
