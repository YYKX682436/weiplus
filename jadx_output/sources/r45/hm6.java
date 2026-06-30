package r45;

/* loaded from: classes2.dex */
public class hm6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376295d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376296e;

    /* renamed from: f, reason: collision with root package name */
    public int f376297f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376298g;

    /* renamed from: h, reason: collision with root package name */
    public int f376299h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376300i;

    /* renamed from: m, reason: collision with root package name */
    public int f376301m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f376302n;

    /* renamed from: o, reason: collision with root package name */
    public r45.g77 f376303o;

    /* renamed from: p, reason: collision with root package name */
    public long f376304p;

    /* renamed from: q, reason: collision with root package name */
    public int f376305q;

    /* renamed from: r, reason: collision with root package name */
    public r45.im6 f376306r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hm6)) {
            return false;
        }
        r45.hm6 hm6Var = (r45.hm6) fVar;
        return n51.f.a(this.f376295d, hm6Var.f376295d) && n51.f.a(this.f376296e, hm6Var.f376296e) && n51.f.a(java.lang.Integer.valueOf(this.f376297f), java.lang.Integer.valueOf(hm6Var.f376297f)) && n51.f.a(this.f376298g, hm6Var.f376298g) && n51.f.a(java.lang.Integer.valueOf(this.f376299h), java.lang.Integer.valueOf(hm6Var.f376299h)) && n51.f.a(this.f376300i, hm6Var.f376300i) && n51.f.a(java.lang.Integer.valueOf(this.f376301m), java.lang.Integer.valueOf(hm6Var.f376301m)) && n51.f.a(java.lang.Boolean.valueOf(this.f376302n), java.lang.Boolean.valueOf(hm6Var.f376302n)) && n51.f.a(this.f376303o, hm6Var.f376303o) && n51.f.a(java.lang.Long.valueOf(this.f376304p), java.lang.Long.valueOf(hm6Var.f376304p)) && n51.f.a(java.lang.Integer.valueOf(this.f376305q), java.lang.Integer.valueOf(hm6Var.f376305q)) && n51.f.a(this.f376306r, hm6Var.f376306r);
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
                        case -1008929860:
                            if (next.equals("finder_green_dot_time_stamp")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -898481431:
                            if (next.equals("bizusername")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -791592328:
                            if (next.equals("weight")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -673896098:
                            if (next.equals("finder_feed_export_id")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -182716453:
                            if (next.equals("use_weapp")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 3145580:
                            if (next.equals("flag")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1212992377:
                            if (next.equals("live_scene")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1387772886:
                            if (next.equals("weapp_data")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1816824233:
                            if (next.equals("refresh_interval")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1969605927:
                            if (next.equals("finder_info")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 2027875547:
                            if (next.equals("logo_url")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f376295d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f376296e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f376297f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f376298g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f376299h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f376300i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f376301m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f376302n = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case '\b':
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.g77 g77Var = new r45.g77();
                                g77Var.fromJson(((org.json.JSONObject) opt).toString());
                                this.f376303o = g77Var;
                                break;
                            }
                        case '\t':
                            this.f376304p = jSONObject.optLong(next);
                            break;
                        case '\n':
                            this.f376305q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 11:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.im6 im6Var = new r45.im6();
                                im6Var.fromJson(((org.json.JSONObject) opt2).toString());
                                this.f376306r = im6Var;
                                break;
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
            java.lang.String str = this.f376295d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376296e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f376297f);
            java.lang.String str3 = this.f376298g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f376299h);
            java.lang.String str4 = this.f376300i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f376301m);
            fVar.a(8, this.f376302n);
            r45.g77 g77Var = this.f376303o;
            if (g77Var != null) {
                fVar.i(9, g77Var.computeSize());
                this.f376303o.writeFields(fVar);
            }
            fVar.h(10, this.f376304p);
            fVar.e(11, this.f376305q);
            r45.im6 im6Var = this.f376306r;
            if (im6Var != null) {
                fVar.i(12, im6Var.computeSize());
                this.f376306r.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f376295d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f376296e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f376297f);
            java.lang.String str7 = this.f376298g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f376299h);
            java.lang.String str8 = this.f376300i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            int e19 = e18 + b36.f.e(7, this.f376301m) + b36.f.a(8, this.f376302n);
            r45.g77 g77Var2 = this.f376303o;
            if (g77Var2 != null) {
                e19 += b36.f.i(9, g77Var2.computeSize());
            }
            int h17 = e19 + b36.f.h(10, this.f376304p) + b36.f.e(11, this.f376305q);
            r45.im6 im6Var2 = this.f376306r;
            return im6Var2 != null ? h17 + b36.f.i(12, im6Var2.computeSize()) : h17;
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
        r45.hm6 hm6Var = (r45.hm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hm6Var.f376295d = aVar2.k(intValue);
                return 0;
            case 2:
                hm6Var.f376296e = aVar2.k(intValue);
                return 0;
            case 3:
                hm6Var.f376297f = aVar2.g(intValue);
                return 0;
            case 4:
                hm6Var.f376298g = aVar2.k(intValue);
                return 0;
            case 5:
                hm6Var.f376299h = aVar2.g(intValue);
                return 0;
            case 6:
                hm6Var.f376300i = aVar2.k(intValue);
                return 0;
            case 7:
                hm6Var.f376301m = aVar2.g(intValue);
                return 0;
            case 8:
                hm6Var.f376302n = aVar2.c(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.g77 g77Var3 = new r45.g77();
                    if (bArr != null && bArr.length > 0) {
                        g77Var3.parseFrom(bArr);
                    }
                    hm6Var.f376303o = g77Var3;
                }
                return 0;
            case 10:
                hm6Var.f376304p = aVar2.i(intValue);
                return 0;
            case 11:
                hm6Var.f376305q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.im6 im6Var3 = new r45.im6();
                    if (bArr2 != null && bArr2.length > 0) {
                        im6Var3.parseFrom(bArr2);
                    }
                    hm6Var.f376306r = im6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f376295d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "bizusername", str, true);
            eVar.d(jSONObject, "logo_url", this.f376296e, true);
            eVar.d(jSONObject, "weight", java.lang.Integer.valueOf(this.f376297f), true);
            eVar.d(jSONObject, "finder_feed_export_id", this.f376298g, true);
            eVar.d(jSONObject, "refresh_interval", java.lang.Integer.valueOf(this.f376299h), true);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f376300i, true);
            eVar.d(jSONObject, "live_scene", java.lang.Integer.valueOf(this.f376301m), true);
            eVar.d(jSONObject, "use_weapp", java.lang.Boolean.valueOf(this.f376302n), true);
            eVar.d(jSONObject, "weapp_data", this.f376303o, true);
            eVar.d(jSONObject, "finder_green_dot_time_stamp", java.lang.Long.valueOf(this.f376304p), true);
            eVar.d(jSONObject, "flag", java.lang.Integer.valueOf(this.f376305q), true);
            eVar.d(jSONObject, "finder_info", this.f376306r, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
