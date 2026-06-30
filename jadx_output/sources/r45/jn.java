package r45;

/* loaded from: classes8.dex */
public class jn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f377956d;

    /* renamed from: e, reason: collision with root package name */
    public long f377957e;

    /* renamed from: f, reason: collision with root package name */
    public long f377958f;

    /* renamed from: g, reason: collision with root package name */
    public long f377959g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377960h;

    /* renamed from: i, reason: collision with root package name */
    public long f377961i;

    /* renamed from: m, reason: collision with root package name */
    public long f377962m;

    /* renamed from: n, reason: collision with root package name */
    public long f377963n;

    /* renamed from: o, reason: collision with root package name */
    public long f377964o;

    /* renamed from: p, reason: collision with root package name */
    public long f377965p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jn)) {
            return false;
        }
        r45.jn jnVar = (r45.jn) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f377956d), java.lang.Long.valueOf(jnVar.f377956d)) && n51.f.a(java.lang.Long.valueOf(this.f377957e), java.lang.Long.valueOf(jnVar.f377957e)) && n51.f.a(java.lang.Long.valueOf(this.f377958f), java.lang.Long.valueOf(jnVar.f377958f)) && n51.f.a(java.lang.Long.valueOf(this.f377959g), java.lang.Long.valueOf(jnVar.f377959g)) && n51.f.a(this.f377960h, jnVar.f377960h) && n51.f.a(java.lang.Long.valueOf(this.f377961i), java.lang.Long.valueOf(jnVar.f377961i)) && n51.f.a(java.lang.Long.valueOf(this.f377962m), java.lang.Long.valueOf(jnVar.f377962m)) && n51.f.a(java.lang.Long.valueOf(this.f377963n), java.lang.Long.valueOf(jnVar.f377963n)) && n51.f.a(java.lang.Long.valueOf(this.f377964o), java.lang.Long.valueOf(jnVar.f377964o)) && n51.f.a(java.lang.Long.valueOf(this.f377965p), java.lang.Long.valueOf(jnVar.f377965p));
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
                        case -2129294769:
                            if (next.equals("startTime")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1556159969:
                            if (next.equals("patchMergeCount")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -867717901:
                            if (next.equals("startPatchTime")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -708751081:
                            if (next.equals("noticeCount")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -579272421:
                            if (next.equals("patchloadTime")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -295915613:
                            if (next.equals("updateType")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 5877095:
                            if (next.equals("downloadCount")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1109068661:
                            if (next.equals("downloadTime")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1922277623:
                            if (next.equals("startDownloadTime")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 2009367604:
                            if (next.equals("installCount")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f377956d = jSONObject.optLong(next);
                            break;
                        case 1:
                            this.f377957e = jSONObject.optLong(next);
                            break;
                        case 2:
                            this.f377958f = jSONObject.optLong(next);
                            break;
                        case 3:
                            this.f377959g = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f377960h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f377961i = jSONObject.optLong(next);
                            break;
                        case 6:
                            this.f377962m = jSONObject.optLong(next);
                            break;
                        case 7:
                            this.f377963n = jSONObject.optLong(next);
                            break;
                        case '\b':
                            this.f377964o = jSONObject.optLong(next);
                            break;
                        case '\t':
                            this.f377965p = jSONObject.optLong(next);
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
            fVar.h(1, this.f377956d);
            fVar.h(2, this.f377957e);
            fVar.h(3, this.f377958f);
            fVar.h(4, this.f377959g);
            java.lang.String str = this.f377960h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.h(6, this.f377961i);
            fVar.h(7, this.f377962m);
            fVar.h(8, this.f377963n);
            fVar.h(9, this.f377964o);
            fVar.h(10, this.f377965p);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f377956d) + 0 + b36.f.h(2, this.f377957e) + b36.f.h(3, this.f377958f) + b36.f.h(4, this.f377959g);
            java.lang.String str2 = this.f377960h;
            if (str2 != null) {
                h17 += b36.f.j(5, str2);
            }
            return h17 + b36.f.h(6, this.f377961i) + b36.f.h(7, this.f377962m) + b36.f.h(8, this.f377963n) + b36.f.h(9, this.f377964o) + b36.f.h(10, this.f377965p);
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
        r45.jn jnVar = (r45.jn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jnVar.f377956d = aVar2.i(intValue);
                return 0;
            case 2:
                jnVar.f377957e = aVar2.i(intValue);
                return 0;
            case 3:
                jnVar.f377958f = aVar2.i(intValue);
                return 0;
            case 4:
                jnVar.f377959g = aVar2.i(intValue);
                return 0;
            case 5:
                jnVar.f377960h = aVar2.k(intValue);
                return 0;
            case 6:
                jnVar.f377961i = aVar2.i(intValue);
                return 0;
            case 7:
                jnVar.f377962m = aVar2.i(intValue);
                return 0;
            case 8:
                jnVar.f377963n = aVar2.i(intValue);
                return 0;
            case 9:
                jnVar.f377964o = aVar2.i(intValue);
                return 0;
            case 10:
                jnVar.f377965p = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f377956d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "downloadCount", valueOf, false);
            eVar.d(jSONObject, "noticeCount", java.lang.Long.valueOf(this.f377957e), false);
            eVar.d(jSONObject, "patchMergeCount", java.lang.Long.valueOf(this.f377958f), false);
            eVar.d(jSONObject, "installCount", java.lang.Long.valueOf(this.f377959g), false);
            eVar.d(jSONObject, "updateType", this.f377960h, false);
            eVar.d(jSONObject, "downloadTime", java.lang.Long.valueOf(this.f377961i), false);
            eVar.d(jSONObject, "patchloadTime", java.lang.Long.valueOf(this.f377962m), false);
            eVar.d(jSONObject, "startTime", java.lang.Long.valueOf(this.f377963n), false);
            eVar.d(jSONObject, "startDownloadTime", java.lang.Long.valueOf(this.f377964o), false);
            eVar.d(jSONObject, "startPatchTime", java.lang.Long.valueOf(this.f377965p), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
