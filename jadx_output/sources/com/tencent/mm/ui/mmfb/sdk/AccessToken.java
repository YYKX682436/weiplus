package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes12.dex */
public final class AccessToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ui.mmfb.sdk.AccessToken> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Date f209154d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f209155e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f209156f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f209157g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f209158h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Date f209159i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f209160m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f209161n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Date f209162o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f209163p;

    static {
        new java.util.Date(com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        new java.util.Date();
        CREATOR = new com.tencent.mm.ui.mmfb.sdk.a();
    }

    public AccessToken(android.os.Parcel parcel) {
        this.f209154d = new java.util.Date(parcel.readLong());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readStringList(arrayList);
        this.f209155e = java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f209156f = java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f209157g = java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList));
        this.f209158h = parcel.readString();
        this.f209159i = new java.util.Date(parcel.readLong());
        this.f209160m = parcel.readString();
        this.f209161n = parcel.readString();
        this.f209162o = new java.util.Date(parcel.readLong());
        this.f209163p = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.mmfb.sdk.AccessToken)) {
            return false;
        }
        com.tencent.mm.ui.mmfb.sdk.AccessToken accessToken = (com.tencent.mm.ui.mmfb.sdk.AccessToken) obj;
        if (this.f209154d.equals(accessToken.f209154d) && this.f209155e.equals(accessToken.f209155e) && this.f209156f.equals(accessToken.f209156f) && this.f209157g.equals(accessToken.f209157g) && this.f209158h.equals(accessToken.f209158h) && this.f209159i.equals(accessToken.f209159i)) {
            java.lang.String str = accessToken.f209160m;
            java.lang.String str2 = this.f209160m;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f209161n.equals(accessToken.f209161n) && this.f209162o.equals(accessToken.f209162o)) {
                    java.lang.String str3 = accessToken.f209163p;
                    java.lang.String str4 = this.f209163p;
                    if (str4 == null) {
                        if (str3 == null) {
                            return true;
                        }
                    } else if (str4.equals(str3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f209154d.hashCode()) * 31) + this.f209155e.hashCode()) * 31) + this.f209156f.hashCode()) * 31) + this.f209157g.hashCode()) * 31) + this.f209158h.hashCode()) * 31) + this.f209159i.hashCode()) * 31;
        java.lang.String str = this.f209160m;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f209161n.hashCode()) * 31) + this.f209162o.hashCode()) * 31;
        java.lang.String str2 = this.f209163p;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{AccessToken token:null permissions:");
        java.util.Set set = this.f209155e;
        if (set == null) {
            sb6.append("null");
        } else {
            sb6.append("[");
            sb6.append(android.text.TextUtils.join(", ", set));
            sb6.append("]");
        }
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f209154d.getTime());
        parcel.writeStringList(new java.util.ArrayList(this.f209155e));
        parcel.writeStringList(new java.util.ArrayList(this.f209156f));
        parcel.writeStringList(new java.util.ArrayList(this.f209157g));
        parcel.writeString(this.f209158h);
        parcel.writeLong(this.f209159i.getTime());
        parcel.writeString(this.f209160m);
        parcel.writeString(this.f209161n);
        parcel.writeLong(this.f209162o.getTime());
        parcel.writeString(this.f209163p);
    }
}
