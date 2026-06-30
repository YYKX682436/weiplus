package r45;

/* loaded from: classes2.dex */
public class g77 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374971d;

    /* renamed from: e, reason: collision with root package name */
    public int f374972e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374973f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374974g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g77)) {
            return false;
        }
        r45.g77 g77Var = (r45.g77) fVar;
        return n51.f.a(this.f374971d, g77Var.f374971d) && n51.f.a(java.lang.Integer.valueOf(this.f374972e), java.lang.Integer.valueOf(g77Var.f374972e)) && n51.f.a(this.f374973f, g77Var.f374973f) && n51.f.a(this.f374974g, g77Var.f374974g);
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
                        case -1815507339:
                            if (next.equals("data_buffer")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -102469055:
                            if (next.equals("version_type")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 3433509:
                            if (next.equals(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 93029116:
                            if (next.equals("appid")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f374971d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f374972e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof java.lang.String) {
                            this.f374973f = com.tencent.mm.protobuf.g.b(android.util.Base64.decode((java.lang.String) opt, 0));
                        }
                    } else if (c17 == 3) {
                        this.f374974g = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f374971d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f374972e);
            com.tencent.mm.protobuf.g gVar = this.f374973f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f374974g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f374971d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f374972e);
            com.tencent.mm.protobuf.g gVar2 = this.f374973f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f374974g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        r45.g77 g77Var = (r45.g77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g77Var.f374971d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            g77Var.f374972e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            g77Var.f374973f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        g77Var.f374974g = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f374971d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "appid", str, true);
            eVar.d(jSONObject, "version_type", java.lang.Integer.valueOf(this.f374972e), true);
            eVar.d(jSONObject, "data_buffer", this.f374973f, true);
            eVar.d(jSONObject, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f374974g, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
