package com.tencent.mm.plugin.scanner.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/scanner/model/OfflineScanContext;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/scanner/model/i0", "scan-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class OfflineScanContext implements android.os.Parcelable {
    public static final com.tencent.mm.plugin.scanner.model.i0 CREATOR = new com.tencent.mm.plugin.scanner.model.i0(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f158760d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f158761e;

    /* renamed from: f, reason: collision with root package name */
    public final int f158762f;

    /* renamed from: g, reason: collision with root package name */
    public final int f158763g;

    /* renamed from: h, reason: collision with root package name */
    public final int f158764h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Bundle f158765i;

    /* renamed from: m, reason: collision with root package name */
    public final long f158766m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f158767n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f158768o;

    /* renamed from: p, reason: collision with root package name */
    public final int f158769p;

    /* renamed from: q, reason: collision with root package name */
    public final long f158770q;

    public OfflineScanContext(java.lang.String str, android.app.Activity activity, int i17, java.lang.String qBarString, int i18, int i19, int i27, java.lang.String typeName, boolean z17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(qBarString, "qBarString");
        kotlin.jvm.internal.o.g(typeName, "typeName");
        this.f158761e = "";
        this.f158768o = "";
        this.f158770q = str != null ? java.lang.Long.parseLong(str) : 0L;
        this.f158769p = i17;
        this.f158761e = qBarString;
        this.f158762f = i18;
        this.f158763g = i19;
        this.f158764h = i27;
        this.f158768o = typeName;
        this.f158765i = bundle;
        this.f158766m = java.lang.System.currentTimeMillis();
        this.f158767n = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("codeString: ");
        sb6.append(this.f158761e);
        sb6.append(", source: ");
        sb6.append(this.f158762f);
        sb6.append(", codeType: ");
        sb6.append(this.f158763g);
        sb6.append(", codeVersion");
        sb6.append(this.f158764h);
        sb6.append(", statObj: ");
        android.os.Bundle bundle = this.f158765i;
        sb6.append(bundle != null ? bundle.toString() : null);
        sb6.append(", time: ");
        sb6.append(this.f158766m);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f158760d);
        parcel.writeString(this.f158761e);
        parcel.writeInt(this.f158762f);
        parcel.writeInt(this.f158763g);
        parcel.writeInt(this.f158764h);
        parcel.writeString(this.f158768o);
        parcel.writeBundle(this.f158765i);
        parcel.writeLong(this.f158766m);
        parcel.writeByte(this.f158767n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f158769p);
        parcel.writeLong(this.f158770q);
    }

    public OfflineScanContext(java.lang.String str, android.app.Activity activity, int i17, java.lang.String qBarString, int i18, int i19, java.lang.String typeName, boolean z17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(qBarString, "qBarString");
        kotlin.jvm.internal.o.g(typeName, "typeName");
        this.f158761e = "";
        this.f158768o = "";
        this.f158770q = str != null ? java.lang.Long.parseLong(str) : 0L;
        this.f158769p = i17;
        this.f158761e = qBarString;
        this.f158763g = i18;
        this.f158764h = i19;
        this.f158768o = typeName;
        this.f158765i = bundle;
        this.f158766m = java.lang.System.currentTimeMillis();
        this.f158767n = z17;
    }

    public OfflineScanContext(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f158761e = "";
        this.f158768o = "";
        this.f158760d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        this.f158761e = readString == null ? "" : readString;
        this.f158762f = parcel.readInt();
        this.f158763g = parcel.readInt();
        this.f158764h = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        this.f158768o = readString2 != null ? readString2 : "";
        this.f158765i = parcel.readBundle(android.os.Bundle.class.getClassLoader());
        this.f158766m = parcel.readLong();
        this.f158767n = parcel.readByte() != 0;
        this.f158769p = parcel.readInt();
        this.f158770q = parcel.readLong();
    }
}
