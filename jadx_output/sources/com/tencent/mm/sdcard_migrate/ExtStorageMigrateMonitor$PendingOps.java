package com.tencent.mm.sdcard_migrate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class ExtStorageMigrateMonitor$PendingOps implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps> CREATOR = new com.tencent.mm.sdcard_migrate.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f192337d = java.util.Collections.synchronizedList(new java.util.ArrayList(16));

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f192338e = java.util.Collections.synchronizedList(new java.util.ArrayList(32));

    public ExtStorageMigrateMonitor$PendingOps(com.tencent.mm.sdcard_migrate.a aVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(-33554431);
        java.util.List<com.tencent.mm.sdcard_migrate.e> list = this.f192337d;
        parcel.writeInt(list.size());
        for (com.tencent.mm.sdcard_migrate.e eVar : list) {
            parcel.writeLong(eVar.f192339a);
            parcel.writeLong(eVar.f192340b);
            parcel.writeLong(eVar.f192341c);
        }
        java.util.List<com.tencent.mm.sdcard_migrate.f> list2 = this.f192338e;
        parcel.writeInt(list2.size());
        for (com.tencent.mm.sdcard_migrate.f fVar : list2) {
            parcel.writeInt(fVar.f192342a);
            parcel.writeString(fVar.f192343b);
            parcel.writeString(fVar.f192344c);
        }
    }
}
