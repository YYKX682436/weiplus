package r45;

/* loaded from: classes2.dex */
public class d96 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372253d;

    /* renamed from: e, reason: collision with root package name */
    public int f372254e;

    /* renamed from: f, reason: collision with root package name */
    public int f372255f;

    /* renamed from: g, reason: collision with root package name */
    public int f372256g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372257h;

    /* renamed from: i, reason: collision with root package name */
    public long f372258i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d96)) {
            return false;
        }
        r45.d96 d96Var = (r45.d96) fVar;
        return n51.f.a(this.f372253d, d96Var.f372253d) && n51.f.a(java.lang.Integer.valueOf(this.f372254e), java.lang.Integer.valueOf(d96Var.f372254e)) && n51.f.a(java.lang.Integer.valueOf(this.f372255f), java.lang.Integer.valueOf(d96Var.f372255f)) && n51.f.a(java.lang.Integer.valueOf(this.f372256g), java.lang.Integer.valueOf(d96Var.f372256g)) && n51.f.a(this.f372257h, d96Var.f372257h) && n51.f.a(java.lang.Long.valueOf(this.f372258i), java.lang.Long.valueOf(d96Var.f372258i));
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
                        case -1785553152:
                            if (next.equals("image_file_size")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1773565470:
                            if (next.equals("image_width")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -877823861:
                            if (next.equals("image_url")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -29843098:
                            if (next.equals("sns_image_id")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 421050507:
                            if (next.equals("image_height")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 604341972:
                            if (next.equals("image_signature")) {
                                c17 = 4;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f372253d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f372254e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        this.f372255f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f372256g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 4) {
                        this.f372257h = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 5) {
                        this.f372258i = jSONObject.optLong(next);
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
            java.lang.String str = this.f372253d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f372254e);
            fVar.e(3, this.f372255f);
            fVar.e(4, this.f372256g);
            java.lang.String str2 = this.f372257h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f372258i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f372253d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f372254e) + b36.f.e(3, this.f372255f) + b36.f.e(4, this.f372256g);
            java.lang.String str4 = this.f372257h;
            if (str4 != null) {
                j17 += b36.f.j(5, str4);
            }
            return j17 + b36.f.h(6, this.f372258i);
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
        r45.d96 d96Var = (r45.d96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d96Var.f372253d = aVar2.k(intValue);
                return 0;
            case 2:
                d96Var.f372254e = aVar2.g(intValue);
                return 0;
            case 3:
                d96Var.f372255f = aVar2.g(intValue);
                return 0;
            case 4:
                d96Var.f372256g = aVar2.g(intValue);
                return 0;
            case 5:
                d96Var.f372257h = aVar2.k(intValue);
                return 0;
            case 6:
                d96Var.f372258i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f372253d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "image_url", str, false);
            eVar.d(jSONObject, "image_width", java.lang.Integer.valueOf(this.f372254e), false);
            eVar.d(jSONObject, "image_height", java.lang.Integer.valueOf(this.f372255f), false);
            eVar.d(jSONObject, "image_file_size", java.lang.Integer.valueOf(this.f372256g), false);
            eVar.d(jSONObject, "image_signature", this.f372257h, false);
            eVar.d(jSONObject, "sns_image_id", java.lang.Long.valueOf(this.f372258i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
