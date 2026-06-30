package r45;

/* loaded from: classes2.dex */
public class lp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379685d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zo5 f379686e;

    /* renamed from: f, reason: collision with root package name */
    public float f379687f;

    /* renamed from: g, reason: collision with root package name */
    public r45.kn f379688g;

    /* renamed from: h, reason: collision with root package name */
    public r45.xm5 f379689h;

    /* renamed from: i, reason: collision with root package name */
    public int f379690i;

    /* renamed from: m, reason: collision with root package name */
    public r45.uy3 f379691m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f379692n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lp)) {
            return false;
        }
        r45.lp lpVar = (r45.lp) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379685d), java.lang.Integer.valueOf(lpVar.f379685d)) && n51.f.a(this.f379686e, lpVar.f379686e) && n51.f.a(java.lang.Float.valueOf(this.f379687f), java.lang.Float.valueOf(lpVar.f379687f)) && n51.f.a(this.f379688g, lpVar.f379688g) && n51.f.a(this.f379689h, lpVar.f379689h) && n51.f.a(java.lang.Integer.valueOf(this.f379690i), java.lang.Integer.valueOf(lpVar.f379690i)) && n51.f.a(this.f379691m, lpVar.f379691m) && n51.f.a(java.lang.Boolean.valueOf(this.f379692n), java.lang.Boolean.valueOf(lpVar.f379692n));
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
                        case -2117277325:
                            if (next.equals("text_align")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -1842502844:
                            if (next.equals("disable_bracket_render")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1390460921:
                            if (next.equals("icon_size")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1383304148:
                            if (next.equals("border")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1332194002:
                            if (next.equals("background")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -938578798:
                            if (next.equals("radius")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1474965877:
                            if (next.equals("reddot_pendant")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 2024311912:
                            if (next.equals("font_weight")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f379685d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.zo5 zo5Var = new r45.zo5();
                                zo5Var.fromJson(((org.json.JSONObject) opt).toString());
                                this.f379686e = zo5Var;
                                break;
                            }
                        case 2:
                            this.f379687f = (float) jSONObject.optDouble(next);
                            break;
                        case 3:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.kn knVar = new r45.kn();
                                knVar.fromJson(((org.json.JSONObject) opt2).toString());
                                this.f379688g = knVar;
                                break;
                            }
                        case 4:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.xm5 xm5Var = new r45.xm5();
                                xm5Var.fromJson(((org.json.JSONObject) opt3).toString());
                                this.f379689h = xm5Var;
                                break;
                            }
                        case 5:
                            this.f379690i = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 6:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.uy3 uy3Var = new r45.uy3();
                                uy3Var.fromJson(((org.json.JSONObject) opt4).toString());
                                this.f379691m = uy3Var;
                                break;
                            }
                        case 7:
                            this.f379692n = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
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
            fVar.e(1, this.f379685d);
            r45.zo5 zo5Var = this.f379686e;
            if (zo5Var != null) {
                fVar.i(2, zo5Var.computeSize());
                this.f379686e.writeFields(fVar);
            }
            fVar.d(3, this.f379687f);
            r45.kn knVar = this.f379688g;
            if (knVar != null) {
                fVar.i(4, knVar.computeSize());
                this.f379688g.writeFields(fVar);
            }
            r45.xm5 xm5Var = this.f379689h;
            if (xm5Var != null) {
                fVar.i(5, xm5Var.computeSize());
                this.f379689h.writeFields(fVar);
            }
            fVar.e(6, this.f379690i);
            r45.uy3 uy3Var = this.f379691m;
            if (uy3Var != null) {
                fVar.i(7, uy3Var.computeSize());
                this.f379691m.writeFields(fVar);
            }
            fVar.a(8, this.f379692n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379685d) + 0;
            r45.zo5 zo5Var2 = this.f379686e;
            if (zo5Var2 != null) {
                e17 += b36.f.i(2, zo5Var2.computeSize());
            }
            int d17 = e17 + b36.f.d(3, this.f379687f);
            r45.kn knVar2 = this.f379688g;
            if (knVar2 != null) {
                d17 += b36.f.i(4, knVar2.computeSize());
            }
            r45.xm5 xm5Var2 = this.f379689h;
            if (xm5Var2 != null) {
                d17 += b36.f.i(5, xm5Var2.computeSize());
            }
            int e18 = d17 + b36.f.e(6, this.f379690i);
            r45.uy3 uy3Var2 = this.f379691m;
            if (uy3Var2 != null) {
                e18 += b36.f.i(7, uy3Var2.computeSize());
            }
            return e18 + b36.f.a(8, this.f379692n);
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
        r45.lp lpVar = (r45.lp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lpVar.f379685d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.zo5 zo5Var3 = new r45.zo5();
                    if (bArr != null && bArr.length > 0) {
                        zo5Var3.parseFrom(bArr);
                    }
                    lpVar.f379686e = zo5Var3;
                }
                return 0;
            case 3:
                lpVar.f379687f = aVar2.f(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.kn knVar3 = new r45.kn();
                    if (bArr2 != null && bArr2.length > 0) {
                        knVar3.parseFrom(bArr2);
                    }
                    lpVar.f379688g = knVar3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.xm5 xm5Var3 = new r45.xm5();
                    if (bArr3 != null && bArr3.length > 0) {
                        xm5Var3.parseFrom(bArr3);
                    }
                    lpVar.f379689h = xm5Var3;
                }
                return 0;
            case 6:
                lpVar.f379690i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.uy3 uy3Var3 = new r45.uy3();
                    if (bArr4 != null && bArr4.length > 0) {
                        uy3Var3.parseFrom(bArr4);
                    }
                    lpVar.f379691m = uy3Var3;
                }
                return 0;
            case 8:
                lpVar.f379692n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f379685d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "font_weight", valueOf, true);
            eVar.d(jSONObject, "background", this.f379686e, true);
            eVar.d(jSONObject, "radius", java.lang.Float.valueOf(this.f379687f), true);
            eVar.d(jSONObject, "border", this.f379688g, true);
            eVar.d(jSONObject, "reddot_pendant", this.f379689h, true);
            eVar.d(jSONObject, "text_align", java.lang.Integer.valueOf(this.f379690i), true);
            eVar.d(jSONObject, "icon_size", this.f379691m, true);
            eVar.d(jSONObject, "disable_bracket_render", java.lang.Boolean.valueOf(this.f379692n), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
