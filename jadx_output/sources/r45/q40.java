package r45;

/* loaded from: classes8.dex */
public class q40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383656d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383657e;

    /* renamed from: f, reason: collision with root package name */
    public long f383658f;

    /* renamed from: g, reason: collision with root package name */
    public long f383659g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f383660h;

    /* renamed from: i, reason: collision with root package name */
    public long f383661i;

    /* renamed from: m, reason: collision with root package name */
    public long f383662m;

    /* renamed from: n, reason: collision with root package name */
    public long f383663n;

    /* renamed from: o, reason: collision with root package name */
    public long f383664o;

    /* renamed from: p, reason: collision with root package name */
    public int f383665p;

    /* renamed from: q, reason: collision with root package name */
    public int f383666q;

    /* renamed from: r, reason: collision with root package name */
    public long f383667r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q40)) {
            return false;
        }
        r45.q40 q40Var = (r45.q40) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383656d), java.lang.Integer.valueOf(q40Var.f383656d)) && n51.f.a(this.f383657e, q40Var.f383657e) && n51.f.a(java.lang.Long.valueOf(this.f383658f), java.lang.Long.valueOf(q40Var.f383658f)) && n51.f.a(java.lang.Long.valueOf(this.f383659g), java.lang.Long.valueOf(q40Var.f383659g)) && n51.f.a(java.lang.Boolean.valueOf(this.f383660h), java.lang.Boolean.valueOf(q40Var.f383660h)) && n51.f.a(java.lang.Long.valueOf(this.f383661i), java.lang.Long.valueOf(q40Var.f383661i)) && n51.f.a(java.lang.Long.valueOf(this.f383662m), java.lang.Long.valueOf(q40Var.f383662m)) && n51.f.a(java.lang.Long.valueOf(this.f383663n), java.lang.Long.valueOf(q40Var.f383663n)) && n51.f.a(java.lang.Long.valueOf(this.f383664o), java.lang.Long.valueOf(q40Var.f383664o)) && n51.f.a(java.lang.Integer.valueOf(this.f383665p), java.lang.Integer.valueOf(q40Var.f383665p)) && n51.f.a(java.lang.Integer.valueOf(this.f383666q), java.lang.Integer.valueOf(q40Var.f383666q)) && n51.f.a(java.lang.Long.valueOf(this.f383667r), java.lang.Long.valueOf(q40Var.f383667r));
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
                        case -1903565834:
                            if (next.equals("show_line")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1552680137:
                            if (next.equals("last_expose_interval")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -1349100711:
                            if (next.equals("first_expose_time")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -620329246:
                            if (next.equals("had_sync_for_cold_time")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case -1118504:
                            if (next.equals("had_sync_cold_time")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 110210:
                            if (next.equals("oob")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 405808723:
                            if (next.equals("last_report_time_stamp")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 690196215:
                            if (next.equals("rece_time")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 785900756:
                            if (next.equals("expose_count")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 947760579:
                            if (next.equals("last_expose_time_stamp")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 957051455:
                            if (next.equals("last_expose_time")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 1845231328:
                            if (next.equals("expose_interval")) {
                                c17 = 7;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f383656d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f383657e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f383658f = jSONObject.optLong(next);
                            break;
                        case 3:
                            this.f383659g = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f383660h = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case 5:
                            this.f383661i = jSONObject.optLong(next);
                            break;
                        case 6:
                            this.f383662m = jSONObject.optLong(next);
                            break;
                        case 7:
                            this.f383663n = jSONObject.optLong(next);
                            break;
                        case '\b':
                            this.f383664o = jSONObject.optLong(next);
                            break;
                        case '\t':
                            this.f383665p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f383666q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 11:
                            this.f383667r = jSONObject.optLong(next);
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
            fVar.e(1, this.f383656d);
            java.lang.String str = this.f383657e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f383658f);
            fVar.h(4, this.f383659g);
            fVar.a(5, this.f383660h);
            fVar.h(6, this.f383661i);
            fVar.h(7, this.f383662m);
            fVar.h(8, this.f383663n);
            fVar.h(9, this.f383664o);
            fVar.e(10, this.f383665p);
            fVar.e(100, this.f383666q);
            fVar.h(101, this.f383667r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383656d) + 0;
            java.lang.String str2 = this.f383657e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f383658f) + b36.f.h(4, this.f383659g) + b36.f.a(5, this.f383660h) + b36.f.h(6, this.f383661i) + b36.f.h(7, this.f383662m) + b36.f.h(8, this.f383663n) + b36.f.h(9, this.f383664o) + b36.f.e(10, this.f383665p) + b36.f.e(100, this.f383666q) + b36.f.h(101, this.f383667r);
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
        r45.q40 q40Var = (r45.q40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            q40Var.f383666q = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 101) {
            q40Var.f383667r = aVar2.i(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                q40Var.f383656d = aVar2.g(intValue);
                return 0;
            case 2:
                q40Var.f383657e = aVar2.k(intValue);
                return 0;
            case 3:
                q40Var.f383658f = aVar2.i(intValue);
                return 0;
            case 4:
                q40Var.f383659g = aVar2.i(intValue);
                return 0;
            case 5:
                q40Var.f383660h = aVar2.c(intValue);
                return 0;
            case 6:
                q40Var.f383661i = aVar2.i(intValue);
                return 0;
            case 7:
                q40Var.f383662m = aVar2.i(intValue);
                return 0;
            case 8:
                q40Var.f383663n = aVar2.i(intValue);
                return 0;
            case 9:
                q40Var.f383664o = aVar2.i(intValue);
                return 0;
            case 10:
                q40Var.f383665p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f383656d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "expose_count", valueOf, true);
            eVar.d(jSONObject, "oob", this.f383657e, true);
            eVar.d(jSONObject, "first_expose_time", java.lang.Long.valueOf(this.f383658f), true);
            eVar.d(jSONObject, "rece_time", java.lang.Long.valueOf(this.f383659g), true);
            eVar.d(jSONObject, "had_sync_cold_time", java.lang.Boolean.valueOf(this.f383660h), true);
            eVar.d(jSONObject, "last_expose_time_stamp", java.lang.Long.valueOf(this.f383661i), true);
            eVar.d(jSONObject, "last_report_time_stamp", java.lang.Long.valueOf(this.f383662m), true);
            eVar.d(jSONObject, "expose_interval", java.lang.Long.valueOf(this.f383663n), true);
            eVar.d(jSONObject, "last_expose_interval", java.lang.Long.valueOf(this.f383664o), true);
            eVar.d(jSONObject, "show_line", java.lang.Integer.valueOf(this.f383665p), true);
            eVar.d(jSONObject, "had_sync_for_cold_time", java.lang.Integer.valueOf(this.f383666q), true);
            eVar.d(jSONObject, "last_expose_time", java.lang.Long.valueOf(this.f383667r), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
