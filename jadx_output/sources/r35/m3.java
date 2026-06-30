package r35;

/* loaded from: classes9.dex */
public class m3 {

    /* renamed from: a, reason: collision with root package name */
    public int f369192a;

    /* renamed from: b, reason: collision with root package name */
    public int f369193b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f369194c;

    /* renamed from: d, reason: collision with root package name */
    public final int f369195d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f369196e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369197f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369198g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f369199h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369200i;

    /* renamed from: j, reason: collision with root package name */
    public int f369201j;

    /* renamed from: k, reason: collision with root package name */
    public int f369202k;

    /* renamed from: l, reason: collision with root package name */
    public int f369203l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369204m;

    /* renamed from: n, reason: collision with root package name */
    public int f369205n = 0;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f369206o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f369207p = 1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f369208q = null;

    public m3(int i17, int i18, java.lang.String str, int i19, java.lang.Object obj) {
        this.f369192a = i17;
        this.f369193b = i18;
        this.f369194c = str;
        this.f369195d = i19;
        this.f369196e = obj;
    }

    public int a() {
        return this.f369203l;
    }

    public java.lang.Object b(java.lang.Class cls) {
        if (cls.isInstance(this.f369196e)) {
            return cls.cast(this.f369196e);
        }
        return null;
    }

    public int c() {
        return this.f369202k;
    }

    public java.lang.String d() {
        java.lang.Object obj;
        int i17 = this.f369205n;
        if ((i17 != 2 && i17 != 5) || (obj = this.f369196e) == null || !(obj instanceof android.os.Bundle)) {
            return "";
        }
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (!bundle.containsKey("msgUsername")) {
            return "";
        }
        java.lang.String string = bundle.getString("msgUsername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return string == null ? "" : string;
    }

    public java.lang.String e() {
        java.lang.Object obj = this.f369196e;
        boolean z17 = obj instanceof android.os.Bundle;
        java.lang.String str = this.f369194c;
        if (z17) {
            java.lang.String string = ((android.os.Bundle) obj).getString("AppendURL_" + str);
            if (!android.text.TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return str;
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof r35.m3 ? hashCode() == ((r35.m3) obj).hashCode() : super.equals(obj);
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        java.lang.String str = this.f369194c;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            hashCode += str.hashCode();
        }
        int i17 = hashCode + this.f369195d + this.f369193b + this.f369192a;
        java.lang.Object obj = this.f369196e;
        return obj != null ? i17 + obj.hashCode() : i17;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("start: " + this.f369192a);
        sb6.append(", end: " + this.f369193b);
        java.lang.String str = this.f369194c;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            sb6.append(", url: " + str);
        }
        sb6.append(", type: " + this.f369195d);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f369197f)) {
            sb6.append(", username: " + this.f369197f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f369198g)) {
            sb6.append(", selfUsername: " + this.f369198g);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f369200i)) {
            sb6.append(", chatroomName: " + this.f369200i);
        }
        sb6.append(", sysMsgType: " + this.f369201j);
        sb6.append(", linkColor: " + this.f369202k);
        sb6.append(", backgroundColor: " + this.f369203l);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f369204m)) {
            sb6.append(", mSessionId: " + this.f369204m);
        }
        sb6.append(", fromScene: " + this.f369205n);
        return sb6.toString();
    }

    public m3(java.lang.String str, int i17, java.lang.Object obj) {
        this.f369194c = str;
        this.f369196e = obj;
        this.f369195d = i17;
    }
}
