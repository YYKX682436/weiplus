package r45;

/* loaded from: classes4.dex */
public class e2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372920d;

    /* renamed from: e, reason: collision with root package name */
    public int f372921e;

    /* renamed from: f, reason: collision with root package name */
    public int f372922f;

    /* renamed from: g, reason: collision with root package name */
    public int f372923g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e2)) {
            return false;
        }
        r45.e2 e2Var = (r45.e2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372920d), java.lang.Integer.valueOf(e2Var.f372920d)) && n51.f.a(java.lang.Integer.valueOf(this.f372921e), java.lang.Integer.valueOf(e2Var.f372921e)) && n51.f.a(java.lang.Integer.valueOf(this.f372922f), java.lang.Integer.valueOf(e2Var.f372922f)) && n51.f.a(java.lang.Integer.valueOf(this.f372923g), java.lang.Integer.valueOf(e2Var.f372923g));
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
                        case -1302045062:
                            if (next.equals("closeIncoColor")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1063571914:
                            if (next.equals("textColor")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -183470359:
                            if (next.equals("dynamicBgLayoutId")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1098450716:
                            if (next.equals("downArrowColor")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f372920d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        this.f372921e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        this.f372922f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f372923g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            fVar.e(1, this.f372920d);
            fVar.e(2, this.f372921e);
            fVar.e(3, this.f372922f);
            fVar.e(4, this.f372923g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f372920d) + 0 + b36.f.e(2, this.f372921e) + b36.f.e(3, this.f372922f) + b36.f.e(4, this.f372923g);
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
        r45.e2 e2Var = (r45.e2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e2Var.f372920d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            e2Var.f372921e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            e2Var.f372922f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e2Var.f372923g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f372920d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "dynamicBgLayoutId", valueOf, false);
            eVar.d(jSONObject, "textColor", java.lang.Integer.valueOf(this.f372921e), false);
            eVar.d(jSONObject, "downArrowColor", java.lang.Integer.valueOf(this.f372922f), false);
            eVar.d(jSONObject, "closeIncoColor", java.lang.Integer.valueOf(this.f372923g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
