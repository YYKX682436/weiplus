package r45;

/* loaded from: classes4.dex */
public class zn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392215d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392216e;

    /* renamed from: f, reason: collision with root package name */
    public int f392217f;

    /* renamed from: g, reason: collision with root package name */
    public int f392218g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zn)) {
            return false;
        }
        r45.zn znVar = (r45.zn) fVar;
        return n51.f.a(this.f392215d, znVar.f392215d) && n51.f.a(this.f392216e, znVar.f392216e) && n51.f.a(java.lang.Integer.valueOf(this.f392217f), java.lang.Integer.valueOf(znVar.f392217f)) && n51.f.a(java.lang.Integer.valueOf(this.f392218g), java.lang.Integer.valueOf(znVar.f392218g));
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
                        case -666241892:
                            if (next.equals("badge_icon_width")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -551767632:
                            if (next.equals("badge_icon_url_dark")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -94549563:
                            if (next.equals("badge_icon_url")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 388343057:
                            if (next.equals("badge_icon_height")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f392215d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f392216e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f392217f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f392218g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            java.lang.String str = this.f392215d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f392216e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f392217f);
            fVar.e(4, this.f392218g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f392215d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f392216e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f392217f) + b36.f.e(4, this.f392218g);
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
        r45.zn znVar = (r45.zn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            znVar.f392215d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            znVar.f392216e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            znVar.f392217f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        znVar.f392218g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f392215d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "badge_icon_url", str, false);
            eVar.d(jSONObject, "badge_icon_url_dark", this.f392216e, false);
            eVar.d(jSONObject, "badge_icon_width", java.lang.Integer.valueOf(this.f392217f), false);
            eVar.d(jSONObject, "badge_icon_height", java.lang.Integer.valueOf(this.f392218g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
