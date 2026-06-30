package pa3;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f353000a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f353001b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f353002c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f353003d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f353004e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f353005f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f353006g = null;

    public final pa3.s a(java.lang.String str) {
        if (str != null) {
            cl0.g gVar = new cl0.g(str);
            java.lang.String str2 = null;
            this.f353000a = gVar.optString("type", null);
            this.f353001b = gVar.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, null);
            this.f353002c = gVar.optString("desc", null);
            this.f353003d = gVar.optString("icon", null);
            this.f353004e = gVar.optString("thumbImg", null);
            this.f353005f = gVar.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, null);
            java.lang.String optString = gVar.optString("key", null);
            if (optString != null) {
                if (java.lang.Boolean.valueOf(optString.length() > 0).booleanValue()) {
                    str2 = optString;
                }
            }
            this.f353006g = str2;
        }
        return this;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa3.s)) {
            return false;
        }
        pa3.s sVar = (pa3.s) obj;
        return kotlin.jvm.internal.o.b(this.f353000a, sVar.f353000a) && kotlin.jvm.internal.o.b(this.f353001b, sVar.f353001b) && kotlin.jvm.internal.o.b(this.f353002c, sVar.f353002c) && kotlin.jvm.internal.o.b(this.f353003d, sVar.f353003d) && kotlin.jvm.internal.o.b(this.f353004e, sVar.f353004e) && kotlin.jvm.internal.o.b(this.f353005f, sVar.f353005f) && kotlin.jvm.internal.o.b(this.f353006g, sVar.f353006g);
    }

    public int hashCode() {
        java.lang.String str = this.f353000a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f353001b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f353002c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f353003d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f353004e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f353005f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f353006g;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LiteAppTasksParams(type=" + this.f353000a + ", title=" + this.f353001b + ", desc=" + this.f353002c + ", icon=" + this.f353003d + ", thumbImg=" + this.f353004e + ", extraData=" + this.f353005f + ", key=" + this.f353006g + ')';
    }
}
