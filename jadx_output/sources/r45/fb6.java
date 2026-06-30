package r45;

/* loaded from: classes2.dex */
public class fb6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374181d;

    /* renamed from: e, reason: collision with root package name */
    public int f374182e;

    /* renamed from: f, reason: collision with root package name */
    public int f374183f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374184g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374185h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374186i;

    /* renamed from: m, reason: collision with root package name */
    public int f374187m;

    /* renamed from: n, reason: collision with root package name */
    public int f374188n;

    /* renamed from: o, reason: collision with root package name */
    public int f374189o;

    /* renamed from: p, reason: collision with root package name */
    public int f374190p;

    /* renamed from: q, reason: collision with root package name */
    public long f374191q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fb6)) {
            return false;
        }
        r45.fb6 fb6Var = (r45.fb6) fVar;
        return n51.f.a(this.f374181d, fb6Var.f374181d) && n51.f.a(java.lang.Integer.valueOf(this.f374182e), java.lang.Integer.valueOf(fb6Var.f374182e)) && n51.f.a(java.lang.Integer.valueOf(this.f374183f), java.lang.Integer.valueOf(fb6Var.f374183f)) && n51.f.a(this.f374184g, fb6Var.f374184g) && n51.f.a(this.f374185h, fb6Var.f374185h) && n51.f.a(this.f374186i, fb6Var.f374186i) && n51.f.a(java.lang.Integer.valueOf(this.f374187m), java.lang.Integer.valueOf(fb6Var.f374187m)) && n51.f.a(java.lang.Integer.valueOf(this.f374188n), java.lang.Integer.valueOf(fb6Var.f374188n)) && n51.f.a(java.lang.Integer.valueOf(this.f374189o), java.lang.Integer.valueOf(fb6Var.f374189o)) && n51.f.a(java.lang.Integer.valueOf(this.f374190p), java.lang.Integer.valueOf(fb6Var.f374190p)) && n51.f.a(java.lang.Long.valueOf(this.f374191q), java.lang.Long.valueOf(fb6Var.f374191q));
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
                        case -1840815538:
                            if (next.equals("key_frame_image_file_size")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -1831711143:
                            if (next.equals("key_frame_image_url")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1178105356:
                            if (next.equals("video_signature")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -324368021:
                            if (next.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_HEIGHT)) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 549079586:
                            if (next.equals("key_frame_image_signature")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 664008090:
                            if (next.equals("video_duration_millisecond")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 706299096:
                            if (next.equals("video_duration")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1333285803:
                            if (next.equals("video_url")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1388977410:
                            if (next.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_WIDTH)) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1969983049:
                            if (next.equals("media_file_size")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1981145670:
                            if (next.equals("sns_video_id")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f374181d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f374182e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f374183f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f374184g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f374185h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f374186i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f374187m = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f374188n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            this.f374189o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f374190p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f374191q = jSONObject.optLong(next);
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
            java.lang.String str = this.f374181d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f374182e);
            fVar.e(3, this.f374183f);
            java.lang.String str2 = this.f374184g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f374185h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f374186i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f374187m);
            fVar.e(8, this.f374188n);
            fVar.e(9, this.f374189o);
            fVar.e(10, this.f374190p);
            fVar.h(11, this.f374191q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f374181d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f374182e) + b36.f.e(3, this.f374183f);
            java.lang.String str6 = this.f374184g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f374185h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f374186i;
            if (str8 != null) {
                j17 += b36.f.j(6, str8);
            }
            return j17 + b36.f.e(7, this.f374187m) + b36.f.e(8, this.f374188n) + b36.f.e(9, this.f374189o) + b36.f.e(10, this.f374190p) + b36.f.h(11, this.f374191q);
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
        r45.fb6 fb6Var = (r45.fb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fb6Var.f374181d = aVar2.k(intValue);
                return 0;
            case 2:
                fb6Var.f374182e = aVar2.g(intValue);
                return 0;
            case 3:
                fb6Var.f374183f = aVar2.g(intValue);
                return 0;
            case 4:
                fb6Var.f374184g = aVar2.k(intValue);
                return 0;
            case 5:
                fb6Var.f374185h = aVar2.k(intValue);
                return 0;
            case 6:
                fb6Var.f374186i = aVar2.k(intValue);
                return 0;
            case 7:
                fb6Var.f374187m = aVar2.g(intValue);
                return 0;
            case 8:
                fb6Var.f374188n = aVar2.g(intValue);
                return 0;
            case 9:
                fb6Var.f374189o = aVar2.g(intValue);
                return 0;
            case 10:
                fb6Var.f374190p = aVar2.g(intValue);
                return 0;
            case 11:
                fb6Var.f374191q = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f374181d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "key_frame_image_url", str, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_HEIGHT, java.lang.Integer.valueOf(this.f374182e), false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_WIDTH, java.lang.Integer.valueOf(this.f374183f), false);
            eVar.d(jSONObject, "video_url", this.f374184g, false);
            eVar.d(jSONObject, "key_frame_image_signature", this.f374185h, false);
            eVar.d(jSONObject, "video_signature", this.f374186i, false);
            eVar.d(jSONObject, "video_duration", java.lang.Integer.valueOf(this.f374187m), false);
            eVar.d(jSONObject, "video_duration_millisecond", java.lang.Integer.valueOf(this.f374188n), false);
            eVar.d(jSONObject, "media_file_size", java.lang.Integer.valueOf(this.f374189o), false);
            eVar.d(jSONObject, "key_frame_image_file_size", java.lang.Integer.valueOf(this.f374190p), false);
            eVar.d(jSONObject, "sns_video_id", java.lang.Long.valueOf(this.f374191q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
