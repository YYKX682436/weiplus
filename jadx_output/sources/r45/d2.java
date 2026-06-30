package r45;

/* loaded from: classes4.dex */
public class d2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f371998d;

    /* renamed from: e, reason: collision with root package name */
    public long f371999e;

    /* renamed from: f, reason: collision with root package name */
    public float f372000f;

    /* renamed from: g, reason: collision with root package name */
    public long f372001g;

    /* renamed from: h, reason: collision with root package name */
    public long f372002h;

    /* renamed from: i, reason: collision with root package name */
    public r45.j2 f372003i;

    /* renamed from: m, reason: collision with root package name */
    public long f372004m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d2)) {
            return false;
        }
        r45.d2 d2Var = (r45.d2) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f371998d), java.lang.Long.valueOf(d2Var.f371998d)) && n51.f.a(java.lang.Long.valueOf(this.f371999e), java.lang.Long.valueOf(d2Var.f371999e)) && n51.f.a(java.lang.Float.valueOf(this.f372000f), java.lang.Float.valueOf(d2Var.f372000f)) && n51.f.a(java.lang.Long.valueOf(this.f372001g), java.lang.Long.valueOf(d2Var.f372001g)) && n51.f.a(java.lang.Long.valueOf(this.f372002h), java.lang.Long.valueOf(d2Var.f372002h)) && n51.f.a(this.f372003i, d2Var.f372003i) && n51.f.a(java.lang.Long.valueOf(this.f372004m), java.lang.Long.valueOf(d2Var.f372004m));
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
                        case -1607243192:
                            if (next.equals("endTime")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1072839914:
                            if (next.equals("beginTime")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 3560248:
                            if (next.equals("tips")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 91555442:
                            if (next.equals("maxDisplayDuration")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 420524750:
                            if (next.equals("maasEventType")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1112015495:
                            if (next.equals("maxDisplayTimesPerDay")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1405936373:
                            if (next.equals("minDisplayInterval")) {
                                c17 = 4;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f371998d = jSONObject.optLong(next);
                            break;
                        case 1:
                            this.f371999e = jSONObject.optLong(next);
                            break;
                        case 2:
                            this.f372000f = (float) jSONObject.optDouble(next);
                            break;
                        case 3:
                            this.f372001g = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f372002h = jSONObject.optLong(next);
                            break;
                        case 5:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.j2 j2Var = new r45.j2();
                                j2Var.fromJson(((org.json.JSONObject) opt).toString());
                                this.f372003i = j2Var;
                                break;
                            }
                        case 6:
                            this.f372004m = jSONObject.optLong(next);
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
            fVar.h(1, this.f371998d);
            fVar.h(2, this.f371999e);
            fVar.d(3, this.f372000f);
            fVar.h(4, this.f372001g);
            fVar.h(5, this.f372002h);
            r45.j2 j2Var = this.f372003i;
            if (j2Var != null) {
                fVar.i(6, j2Var.computeSize());
                this.f372003i.writeFields(fVar);
            }
            fVar.h(7, this.f372004m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f371998d) + 0 + b36.f.h(2, this.f371999e) + b36.f.d(3, this.f372000f) + b36.f.h(4, this.f372001g) + b36.f.h(5, this.f372002h);
            r45.j2 j2Var2 = this.f372003i;
            if (j2Var2 != null) {
                h17 += b36.f.i(6, j2Var2.computeSize());
            }
            return h17 + b36.f.h(7, this.f372004m);
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
        r45.d2 d2Var = (r45.d2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d2Var.f371998d = aVar2.i(intValue);
                return 0;
            case 2:
                d2Var.f371999e = aVar2.i(intValue);
                return 0;
            case 3:
                d2Var.f372000f = aVar2.f(intValue);
                return 0;
            case 4:
                d2Var.f372001g = aVar2.i(intValue);
                return 0;
            case 5:
                d2Var.f372002h = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.j2 j2Var3 = new r45.j2();
                    if (bArr != null && bArr.length > 0) {
                        j2Var3.parseFrom(bArr);
                    }
                    d2Var.f372003i = j2Var3;
                }
                return 0;
            case 7:
                d2Var.f372004m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f371998d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "beginTime", valueOf, false);
            eVar.d(jSONObject, "endTime", java.lang.Long.valueOf(this.f371999e), false);
            eVar.d(jSONObject, "maxDisplayDuration", java.lang.Float.valueOf(this.f372000f), false);
            eVar.d(jSONObject, "maxDisplayTimesPerDay", java.lang.Long.valueOf(this.f372001g), false);
            eVar.d(jSONObject, "minDisplayInterval", java.lang.Long.valueOf(this.f372002h), false);
            eVar.d(jSONObject, "tips", this.f372003i, false);
            eVar.d(jSONObject, "maasEventType", java.lang.Long.valueOf(this.f372004m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
