package r45;

/* loaded from: classes2.dex */
public class g05 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374784d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374785e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374786f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374787g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374788h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g05)) {
            return false;
        }
        r45.g05 g05Var = (r45.g05) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374784d), java.lang.Integer.valueOf(g05Var.f374784d)) && n51.f.a(this.f374785e, g05Var.f374785e) && n51.f.a(this.f374786f, g05Var.f374786f) && n51.f.a(this.f374787g, g05Var.f374787g) && n51.f.a(this.f374788h, g05Var.f374788h);
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
                        case -141651711:
                            if (next.equals("export_username")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 109254796:
                            if (next.equals(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1353942442:
                            if (next.equals("finder_joinlive_trace_buffer")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1804799183:
                            if (next.equals("finder_username")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1988152982:
                            if (next.equals("finder_context")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f374784d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        this.f374785e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f374786f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f374787g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f374788h = (java.lang.String) jSONObject.opt(next);
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
            fVar.e(1, this.f374784d);
            java.lang.String str = this.f374785e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374786f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374787g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f374788h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374784d) + 0;
            java.lang.String str5 = this.f374785e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f374786f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f374787g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f374788h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.g05 g05Var = (r45.g05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g05Var.f374784d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            g05Var.f374785e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            g05Var.f374786f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            g05Var.f374787g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        g05Var.f374788h = aVar2.k(intValue);
        return 0;
    }
}
