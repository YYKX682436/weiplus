package r45;

/* loaded from: classes11.dex */
public class ph0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383042d;

    /* renamed from: e, reason: collision with root package name */
    public int f383043e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383044f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f383045g;

    /* renamed from: h, reason: collision with root package name */
    public int f383046h;

    /* renamed from: i, reason: collision with root package name */
    public int f383047i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f383048m;

    /* renamed from: n, reason: collision with root package name */
    public int f383049n;

    /* renamed from: o, reason: collision with root package name */
    public int f383050o;

    /* renamed from: p, reason: collision with root package name */
    public int f383051p;

    /* renamed from: q, reason: collision with root package name */
    public int f383052q;

    /* renamed from: r, reason: collision with root package name */
    public int f383053r;

    /* renamed from: s, reason: collision with root package name */
    public int f383054s;

    /* renamed from: t, reason: collision with root package name */
    public int f383055t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ph0)) {
            return false;
        }
        r45.ph0 ph0Var = (r45.ph0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383042d), java.lang.Integer.valueOf(ph0Var.f383042d)) && n51.f.a(java.lang.Integer.valueOf(this.f383043e), java.lang.Integer.valueOf(ph0Var.f383043e)) && n51.f.a(this.f383044f, ph0Var.f383044f) && n51.f.a(java.lang.Boolean.valueOf(this.f383045g), java.lang.Boolean.valueOf(ph0Var.f383045g)) && n51.f.a(java.lang.Integer.valueOf(this.f383046h), java.lang.Integer.valueOf(ph0Var.f383046h)) && n51.f.a(java.lang.Integer.valueOf(this.f383047i), java.lang.Integer.valueOf(ph0Var.f383047i)) && n51.f.a(java.lang.Boolean.valueOf(this.f383048m), java.lang.Boolean.valueOf(ph0Var.f383048m)) && n51.f.a(java.lang.Integer.valueOf(this.f383049n), java.lang.Integer.valueOf(ph0Var.f383049n)) && n51.f.a(java.lang.Integer.valueOf(this.f383050o), java.lang.Integer.valueOf(ph0Var.f383050o)) && n51.f.a(java.lang.Integer.valueOf(this.f383051p), java.lang.Integer.valueOf(ph0Var.f383051p)) && n51.f.a(java.lang.Integer.valueOf(this.f383052q), java.lang.Integer.valueOf(ph0Var.f383052q)) && n51.f.a(java.lang.Integer.valueOf(this.f383053r), java.lang.Integer.valueOf(ph0Var.f383053r)) && n51.f.a(java.lang.Integer.valueOf(this.f383054s), java.lang.Integer.valueOf(ph0Var.f383054s)) && n51.f.a(java.lang.Integer.valueOf(this.f383055t), java.lang.Integer.valueOf(ph0Var.f383055t));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383042d);
            fVar.e(2, this.f383043e);
            java.lang.String str = this.f383044f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f383045g);
            fVar.e(5, this.f383046h);
            fVar.e(6, this.f383047i);
            fVar.a(7, this.f383048m);
            fVar.e(8, this.f383049n);
            fVar.e(10, this.f383050o);
            fVar.e(11, this.f383051p);
            fVar.e(12, this.f383052q);
            fVar.e(13, this.f383053r);
            fVar.e(16, this.f383054s);
            fVar.e(17, this.f383055t);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383042d) + 0 + b36.f.e(2, this.f383043e);
            java.lang.String str2 = this.f383044f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.a(4, this.f383045g) + b36.f.e(5, this.f383046h) + b36.f.e(6, this.f383047i) + b36.f.a(7, this.f383048m) + b36.f.e(8, this.f383049n) + b36.f.e(10, this.f383050o) + b36.f.e(11, this.f383051p) + b36.f.e(12, this.f383052q) + b36.f.e(13, this.f383053r) + b36.f.e(16, this.f383054s) + b36.f.e(17, this.f383055t);
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
        r45.ph0 ph0Var = (r45.ph0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ph0Var.f383042d = aVar2.g(intValue);
                return 0;
            case 2:
                ph0Var.f383043e = aVar2.g(intValue);
                return 0;
            case 3:
                ph0Var.f383044f = aVar2.k(intValue);
                return 0;
            case 4:
                ph0Var.f383045g = aVar2.c(intValue);
                return 0;
            case 5:
                ph0Var.f383046h = aVar2.g(intValue);
                return 0;
            case 6:
                ph0Var.f383047i = aVar2.g(intValue);
                return 0;
            case 7:
                ph0Var.f383048m = aVar2.c(intValue);
                return 0;
            case 8:
                ph0Var.f383049n = aVar2.g(intValue);
                return 0;
            case 9:
            case 14:
            case 15:
            default:
                return -1;
            case 10:
                ph0Var.f383050o = aVar2.g(intValue);
                return 0;
            case 11:
                ph0Var.f383051p = aVar2.g(intValue);
                return 0;
            case 12:
                ph0Var.f383052q = aVar2.g(intValue);
                return 0;
            case 13:
                ph0Var.f383053r = aVar2.g(intValue);
                return 0;
            case 16:
                ph0Var.f383054s = aVar2.g(intValue);
                return 0;
            case 17:
                ph0Var.f383055t = aVar2.g(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f383042d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ui_version", valueOf, false);
            eVar.d(jSONObject, "subscribe_count_lower_limit", java.lang.Integer.valueOf(this.f383043e), false);
            eVar.d(jSONObject, "comment_page_query", this.f383044f, false);
            eVar.d(jSONObject, "open_subscribe", java.lang.Boolean.valueOf(this.f383045g), false);
            eVar.d(jSONObject, "request_frequency_time", java.lang.Integer.valueOf(this.f383046h), false);
            eVar.d(jSONObject, "notify_request_frequency_time", java.lang.Integer.valueOf(this.f383047i), false);
            eVar.d(jSONObject, "live_autoplay", java.lang.Boolean.valueOf(this.f383048m), false);
            eVar.d(jSONObject, "request_mass_msg_count", java.lang.Integer.valueOf(this.f383049n), false);
            eVar.d(jSONObject, "notify_msg_request_frequency_time", java.lang.Integer.valueOf(this.f383050o), false);
            eVar.d(jSONObject, "main_tab_request_frequency_time", java.lang.Integer.valueOf(this.f383051p), false);
            eVar.d(jSONObject, "poi_report_frequency_time", java.lang.Integer.valueOf(this.f383052q), false);
            eVar.d(jSONObject, "reliable_notify_request_frequency_time", java.lang.Integer.valueOf(this.f383053r), false);
            eVar.d(jSONObject, "masonry_pre_loadmore_cnt", java.lang.Integer.valueOf(this.f383054s), false);
            eVar.d(jSONObject, "ecs_getrecommendfeeds_cgi_max_buffer_size", java.lang.Integer.valueOf(this.f383055t), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
