package r45;

/* loaded from: classes2.dex */
public class hp2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.u56 f376374d;

    /* renamed from: e, reason: collision with root package name */
    public r45.u56 f376375e;

    /* renamed from: f, reason: collision with root package name */
    public long f376376f;

    /* renamed from: g, reason: collision with root package name */
    public r45.fp2 f376377g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hp2)) {
            return false;
        }
        r45.hp2 hp2Var = (r45.hp2) fVar;
        return n51.f.a(this.f376374d, hp2Var.f376374d) && n51.f.a(this.f376375e, hp2Var.f376375e) && n51.f.a(java.lang.Long.valueOf(this.f376376f), java.lang.Long.valueOf(hp2Var.f376376f)) && n51.f.a(this.f376377g, hp2Var.f376377g);
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
                        case -2069530047:
                            if (next.equals("card_show_info")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1215479629:
                            if (next.equals("display_tab_flag")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1663305917:
                            if (next.equals("bubble_show_info")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1794168423:
                            if (next.equals("display_timing")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            r45.u56 u56Var = new r45.u56();
                            u56Var.fromJson(((org.json.JSONObject) opt).toString());
                            this.f376374d = u56Var;
                        }
                    } else if (c17 == 1) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONObject) {
                            r45.u56 u56Var2 = new r45.u56();
                            u56Var2.fromJson(((org.json.JSONObject) opt2).toString());
                            this.f376375e = u56Var2;
                        }
                    } else if (c17 == 2) {
                        this.f376376f = jSONObject.optLong(next);
                    } else if (c17 == 3) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof org.json.JSONObject) {
                            r45.fp2 fp2Var = new r45.fp2();
                            fp2Var.fromJson(((org.json.JSONObject) opt3).toString());
                            this.f376377g = fp2Var;
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
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.u56 u56Var = this.f376374d;
            if (u56Var != null) {
                fVar.i(1, u56Var.computeSize());
                this.f376374d.writeFields(fVar);
            }
            r45.u56 u56Var2 = this.f376375e;
            if (u56Var2 != null) {
                fVar.i(2, u56Var2.computeSize());
                this.f376375e.writeFields(fVar);
            }
            fVar.h(3, this.f376376f);
            r45.fp2 fp2Var = this.f376377g;
            if (fp2Var != null) {
                fVar.i(4, fp2Var.computeSize());
                this.f376377g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.u56 u56Var3 = this.f376374d;
            int i18 = u56Var3 != null ? 0 + b36.f.i(1, u56Var3.computeSize()) : 0;
            r45.u56 u56Var4 = this.f376375e;
            if (u56Var4 != null) {
                i18 += b36.f.i(2, u56Var4.computeSize());
            }
            int h17 = i18 + b36.f.h(3, this.f376376f);
            r45.fp2 fp2Var2 = this.f376377g;
            return fp2Var2 != null ? h17 + b36.f.i(4, fp2Var2.computeSize()) : h17;
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
        r45.hp2 hp2Var = (r45.hp2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.u56 u56Var5 = new r45.u56();
                if (bArr != null && bArr.length > 0) {
                    u56Var5.parseFrom(bArr);
                }
                hp2Var.f376374d = u56Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.u56 u56Var6 = new r45.u56();
                if (bArr2 != null && bArr2.length > 0) {
                    u56Var6.parseFrom(bArr2);
                }
                hp2Var.f376375e = u56Var6;
            }
            return 0;
        }
        if (intValue == 3) {
            hp2Var.f376376f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.fp2 fp2Var3 = new r45.fp2();
            if (bArr3 != null && bArr3.length > 0) {
                fp2Var3.parseFrom(bArr3);
            }
            hp2Var.f376377g = fp2Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.u56 u56Var = this.f376374d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "card_show_info", u56Var, true);
            eVar.d(jSONObject, "bubble_show_info", this.f376375e, true);
            eVar.d(jSONObject, "display_tab_flag", java.lang.Long.valueOf(this.f376376f), true);
            eVar.d(jSONObject, "display_timing", this.f376377g, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
