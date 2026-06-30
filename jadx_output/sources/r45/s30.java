package r45;

/* loaded from: classes8.dex */
public class s30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f385458d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385459e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f385460f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f385461g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s30)) {
            return false;
        }
        r45.s30 s30Var = (r45.s30) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f385458d), java.lang.Boolean.valueOf(s30Var.f385458d)) && n51.f.a(this.f385459e, s30Var.f385459e) && n51.f.a(this.f385460f, s30Var.f385460f) && n51.f.a(this.f385461g, s30Var.f385461g);
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
                    int i17 = 0;
                    switch (next.hashCode()) {
                        case -1354792126:
                            if (next.equals("config")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1298848381:
                            if (next.equals("enable")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1220066020:
                            if (next.equals("clear_ctrl_type")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 64241494:
                            if (next.equals("clear_tab_type")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f385458d = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                    } else if (c17 == 1) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                            while (i17 < jSONArray.length()) {
                                this.f385459e.add(java.lang.Integer.valueOf(((java.lang.Integer) jSONArray.get(i17)).intValue()));
                                i17++;
                            }
                        }
                    } else if (c17 == 2) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt2;
                            while (i17 < jSONArray2.length()) {
                                this.f385460f.add(java.lang.Integer.valueOf(((java.lang.Integer) jSONArray2.get(i17)).intValue()));
                                i17++;
                            }
                        }
                    } else if (c17 == 3) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray3 = (org.json.JSONArray) opt3;
                            while (i17 < jSONArray3.length()) {
                                java.lang.Object obj = jSONArray3.get(i17);
                                if (obj instanceof org.json.JSONObject) {
                                    java.util.LinkedList linkedList = this.f385461g;
                                    r45.r30 r30Var = new r45.r30();
                                    r30Var.fromJson(((org.json.JSONObject) obj).toString());
                                    linkedList.add(r30Var);
                                }
                                i17++;
                            }
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385461g;
        java.util.LinkedList linkedList2 = this.f385460f;
        java.util.LinkedList linkedList3 = this.f385459e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f385458d);
            fVar.g(2, 2, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f385458d) + 0 + b36.f.g(2, 2, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.s30 s30Var = (r45.s30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s30Var.f385458d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            s30Var.f385459e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 3) {
            s30Var.f385460f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.r30 r30Var = new r45.r30();
            if (bArr2 != null && bArr2.length > 0) {
                r30Var.parseFrom(bArr2);
            }
            s30Var.f385461g.add(r30Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f385458d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "enable", valueOf, true);
            eVar.d(jSONObject, "clear_tab_type", this.f385459e, true);
            eVar.d(jSONObject, "clear_ctrl_type", this.f385460f, true);
            eVar.d(jSONObject, "config", this.f385461g, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
