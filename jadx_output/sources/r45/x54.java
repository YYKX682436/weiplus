package r45;

/* loaded from: classes4.dex */
public class x54 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389791d;

    /* renamed from: e, reason: collision with root package name */
    public long f389792e;

    /* renamed from: f, reason: collision with root package name */
    public long f389793f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f389794g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x54)) {
            return false;
        }
        r45.x54 x54Var = (r45.x54) fVar;
        return n51.f.a(this.f389791d, x54Var.f389791d) && n51.f.a(java.lang.Long.valueOf(this.f389792e), java.lang.Long.valueOf(x54Var.f389792e)) && n51.f.a(java.lang.Long.valueOf(this.f389793f), java.lang.Long.valueOf(x54Var.f389793f)) && n51.f.a(java.lang.Boolean.valueOf(this.f389794g), java.lang.Boolean.valueOf(x54Var.f389794g));
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
                        case -1300607287:
                            if (next.equals("layer_id")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1023149599:
                            if (next.equals("controlled_by_lua")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -41370263:
                            if (next.equals("first_render_timestamp_ms")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1493405263:
                            if (next.equals("last_render_timestamp_ms")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f389791d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f389792e = jSONObject.optLong(next);
                    } else if (c17 == 2) {
                        this.f389793f = jSONObject.optLong(next);
                    } else if (c17 == 3) {
                        this.f389794g = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
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
            java.lang.String str = this.f389791d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f389792e);
            fVar.h(3, this.f389793f);
            fVar.a(4, this.f389794g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f389791d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f389792e) + b36.f.h(3, this.f389793f) + b36.f.a(4, this.f389794g);
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
        r45.x54 x54Var = (r45.x54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x54Var.f389791d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x54Var.f389792e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            x54Var.f389793f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        x54Var.f389794g = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f389791d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "layer_id", str, false);
            eVar.d(jSONObject, "first_render_timestamp_ms", java.lang.Long.valueOf(this.f389792e), false);
            eVar.d(jSONObject, "last_render_timestamp_ms", java.lang.Long.valueOf(this.f389793f), false);
            eVar.d(jSONObject, "controlled_by_lua", java.lang.Boolean.valueOf(this.f389794g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
