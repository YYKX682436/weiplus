package com.tencent.mm.plugin.normsg.api;

/* loaded from: classes13.dex */
public class CameraStatus implements android.os.Parcelable, java.lang.Cloneable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.normsg.api.CameraStatus> CREATOR = new fo3.c();

    /* renamed from: d, reason: collision with root package name */
    public long f152408d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152409e;

    /* renamed from: f, reason: collision with root package name */
    public long f152410f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f152411g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152412h;

    /* renamed from: i, reason: collision with root package name */
    public long f152413i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f152414m;

    public CameraStatus() {
        this.f152408d = 0L;
        this.f152409e = "";
        this.f152410f = 0L;
        this.f152411g = new java.util.concurrent.ConcurrentHashMap();
        this.f152412h = "";
        this.f152413i = 0L;
        this.f152414m = new java.util.concurrent.ConcurrentHashMap();
    }

    public void a(com.tencent.mm.plugin.normsg.api.CameraStatus cameraStatus) {
        this.f152408d = cameraStatus.f152408d;
        this.f152409e = cameraStatus.f152409e;
        this.f152410f = cameraStatus.f152410f;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f152411g;
        concurrentHashMap.clear();
        concurrentHashMap.putAll(cameraStatus.f152411g);
        this.f152412h = cameraStatus.f152412h;
        this.f152413i = cameraStatus.f152413i;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f152414m;
        concurrentHashMap2.clear();
        concurrentHashMap2.putAll(cameraStatus.f152414m);
    }

    public final void b(android.os.Bundle bundle, java.lang.String str, java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList != null) {
            for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                concurrentHashMap.put(((com.tencent.mm.plugin.normsg.api.CameraAvailable) parcelableArrayList.get(i17)).f152405d, (com.tencent.mm.plugin.normsg.api.CameraAvailable) parcelableArrayList.get(i17));
            }
        }
    }

    public com.tencent.mm.normsg.e c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.plugin.normsg.api.CameraAvailable cameraAvailable : this.f152411g.values()) {
            arrayList.add(new com.tencent.mm.normsg.d(cameraAvailable.f152405d, cameraAvailable.f152406e, cameraAvailable.f152407f));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.tencent.mm.plugin.normsg.api.CameraAvailable cameraAvailable2 : this.f152414m.values()) {
            arrayList2.add(new com.tencent.mm.normsg.d(cameraAvailable2.f152405d, cameraAvailable2.f152406e, cameraAvailable2.f152407f));
        }
        return new com.tencent.mm.normsg.e(this.f152408d, this.f152409e, this.f152410f, arrayList, this.f152412h, this.f152413i, arrayList2);
    }

    public java.lang.Object clone() {
        com.tencent.mm.plugin.normsg.api.CameraStatus cameraStatus;
        synchronized (this) {
            cameraStatus = new com.tencent.mm.plugin.normsg.api.CameraStatus();
            cameraStatus.a(this);
        }
        return cameraStatus;
    }

    public void d(java.lang.String str, boolean z17) {
        synchronized (this) {
            this.f152412h = this.f152409e;
            this.f152413i = this.f152410f;
            this.f152414m.clear();
            this.f152414m.putAll(this.f152411g);
            this.f152409e = str;
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            this.f152410f = currentTimeMillis;
            this.f152411g.put(str, new com.tencent.mm.plugin.normsg.api.CameraAvailable(str, currentTimeMillis, z17));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f152408d);
        parcel.writeString(this.f152409e);
        parcel.writeLong(this.f152410f);
        parcel.writeString(this.f152412h);
        parcel.writeLong(this.f152413i);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("K_C_CS", new java.util.ArrayList<>(this.f152411g.values()));
        bundle.putParcelableArrayList("K_L_CS", new java.util.ArrayList<>(this.f152414m.values()));
        parcel.writeParcelable(bundle, i17);
    }

    public CameraStatus(android.os.Parcel parcel) {
        this.f152408d = 0L;
        this.f152409e = "";
        this.f152410f = 0L;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        this.f152411g = concurrentHashMap;
        this.f152412h = "";
        this.f152413i = 0L;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
        this.f152414m = concurrentHashMap2;
        try {
            this.f152408d = parcel.readLong();
            this.f152409e = parcel.readString();
            this.f152410f = parcel.readLong();
            this.f152412h = parcel.readString();
            this.f152413i = parcel.readLong();
            android.os.Bundle bundle = (android.os.Bundle) parcel.readParcelable(com.tencent.mm.sdk.platformtools.x2.f193071a.getClassLoader());
            bundle.setClassLoader(com.tencent.mm.sdk.platformtools.x2.f193071a.getClassLoader());
            b(bundle, "K_C_CS", concurrentHashMap);
            b(bundle, "K_L_CS", concurrentHashMap2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CS", "read from parcel error:" + th6);
        }
    }
}
