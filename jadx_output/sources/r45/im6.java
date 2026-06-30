package r45;

/* loaded from: classes2.dex */
public class im6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377152d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377153e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377154f;

    /* renamed from: g, reason: collision with root package name */
    public long f377155g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.im6)) {
            return false;
        }
        r45.im6 im6Var = (r45.im6) fVar;
        return n51.f.a(this.f377152d, im6Var.f377152d) && n51.f.a(this.f377153e, im6Var.f377153e) && n51.f.a(this.f377154f, im6Var.f377154f) && n51.f.a(java.lang.Long.valueOf(this.f377155g), java.lang.Long.valueOf(im6Var.f377155g));
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
                        case -265713450:
                            if (next.equals(dm.i4.COL_USERNAME)) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 70690926:
                            if (next.equals("nickname")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 617736385:
                            if (next.equals("finder_uin")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 2027875547:
                            if (next.equals("logo_url")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f377152d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f377153e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f377154f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f377155g = jSONObject.optLong(next);
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
            java.lang.String str = this.f377152d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f377153e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f377154f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f377155g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f377152d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f377153e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f377154f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f377155g);
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
        r45.im6 im6Var = (r45.im6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            im6Var.f377152d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            im6Var.f377153e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            im6Var.f377154f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        im6Var.f377155g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f377152d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, dm.i4.COL_USERNAME, str, true);
            eVar.d(jSONObject, "nickname", this.f377153e, true);
            eVar.d(jSONObject, "logo_url", this.f377154f, true);
            eVar.d(jSONObject, "finder_uin", java.lang.Long.valueOf(this.f377155g), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
