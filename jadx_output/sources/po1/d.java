package po1;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final po1.c f357294i = new po1.c(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f357295a;

    /* renamed from: b, reason: collision with root package name */
    public po1.g f357296b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f357297c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f357298d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f357299e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f357300f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f357301g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f357302h;

    public d(java.lang.String deviceId, po1.g deviceType, java.lang.String deviceNickname, java.lang.String deviceRemark, java.lang.String devicePath, java.lang.String deviceUUID, java.lang.String uriPath) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(deviceType, "deviceType");
        kotlin.jvm.internal.o.g(deviceNickname, "deviceNickname");
        kotlin.jvm.internal.o.g(deviceRemark, "deviceRemark");
        kotlin.jvm.internal.o.g(devicePath, "devicePath");
        kotlin.jvm.internal.o.g(deviceUUID, "deviceUUID");
        kotlin.jvm.internal.o.g(uriPath, "uriPath");
        this.f357295a = deviceId;
        this.f357296b = deviceType;
        this.f357297c = deviceNickname;
        this.f357298d = deviceRemark;
        this.f357299e = devicePath;
        this.f357300f = deviceUUID;
        this.f357301g = uriPath;
    }

    public static po1.d a(po1.d dVar, java.lang.String deviceId, po1.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            deviceId = dVar.f357295a;
        }
        if ((i17 & 2) != 0) {
            gVar = dVar.f357296b;
        }
        po1.g deviceType = gVar;
        if ((i17 & 4) != 0) {
            str = dVar.f357297c;
        }
        java.lang.String deviceNickname = str;
        if ((i17 & 8) != 0) {
            str2 = dVar.f357298d;
        }
        java.lang.String deviceRemark = str2;
        if ((i17 & 16) != 0) {
            str3 = dVar.f357299e;
        }
        java.lang.String devicePath = str3;
        if ((i17 & 32) != 0) {
            str4 = dVar.f357300f;
        }
        java.lang.String deviceUUID = str4;
        if ((i17 & 64) != 0) {
            str5 = dVar.f357301g;
        }
        java.lang.String uriPath = str5;
        dVar.getClass();
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(deviceType, "deviceType");
        kotlin.jvm.internal.o.g(deviceNickname, "deviceNickname");
        kotlin.jvm.internal.o.g(deviceRemark, "deviceRemark");
        kotlin.jvm.internal.o.g(devicePath, "devicePath");
        kotlin.jvm.internal.o.g(deviceUUID, "deviceUUID");
        kotlin.jvm.internal.o.g(uriPath, "uriPath");
        return new po1.d(deviceId, deviceType, deviceNickname, deviceRemark, devicePath, deviceUUID, uriPath);
    }

    public final java.lang.String b() {
        java.lang.String str = this.f357298d;
        return str.length() == 0 ? this.f357297c : str;
    }

    public final java.lang.String c() {
        java.lang.String jSONObject = new org.json.JSONObject().put("deviceId", this.f357295a).put("deviceType", this.f357296b.h()).put("deviceNickname", this.f357297c).put("deviceRemark", this.f357298d).put("devicePath", this.f357299e).put("deviceUUID", this.f357300f).put("uriPath", this.f357301g).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final void d(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f357299e = str;
    }

    public final com.tencent.wechat.aff.affroam.q0 e() {
        com.tencent.wechat.aff.affroam.q0 q0Var = new com.tencent.wechat.aff.affroam.q0();
        q0Var.f215956d = this.f357296b.h();
        q0Var.f215957e = this.f357295a;
        q0Var.f215958f = this.f357299e;
        q0Var.f215959g = this.f357297c;
        q0Var.f215960h = this.f357300f;
        q0Var.f215961i = this.f357301g;
        q0Var.f215962m = this.f357298d;
        q0Var.f215963n = this.f357302h;
        return q0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po1.d)) {
            return false;
        }
        po1.d dVar = (po1.d) obj;
        return kotlin.jvm.internal.o.b(this.f357295a, dVar.f357295a) && this.f357296b == dVar.f357296b && kotlin.jvm.internal.o.b(this.f357297c, dVar.f357297c) && kotlin.jvm.internal.o.b(this.f357298d, dVar.f357298d) && kotlin.jvm.internal.o.b(this.f357299e, dVar.f357299e) && kotlin.jvm.internal.o.b(this.f357300f, dVar.f357300f) && kotlin.jvm.internal.o.b(this.f357301g, dVar.f357301g);
    }

    public int hashCode() {
        return (((((((((((this.f357295a.hashCode() * 31) + this.f357296b.hashCode()) * 31) + this.f357297c.hashCode()) * 31) + this.f357298d.hashCode()) * 31) + this.f357299e.hashCode()) * 31) + this.f357300f.hashCode()) * 31) + this.f357301g.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = "UnifyDeviceInfo@" + hashCode() + "(deviceId: " + this.f357295a + ", deviceType: " + this.f357296b + ", deviceNickname: " + this.f357297c + ", deviceRemark: " + this.f357298d + ", devicePath: " + this.f357299e + ", deviceUUID: " + this.f357300f + ", uriPath: " + this.f357301g + ')';
        kotlin.jvm.internal.o.f(str, "toString(...)");
        return str;
    }
}
