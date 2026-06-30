package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class MaintenanceGroup implements com.tencent.mm.vfs.FileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.MaintenanceGroup> CREATOR = new com.tencent.mm.vfs.q3();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.i1 f212715d;

    public MaintenanceGroup(com.tencent.mm.vfs.a0... a0VarArr) {
        this.f212715d = new com.tencent.mm.vfs.i1(a0VarArr);
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.tencent.mm.vfs.r3(this, this.f212715d.a(map));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.MaintenanceGroup) {
            if (this.f212715d.equals(((com.tencent.mm.vfs.MaintenanceGroup) obj).f212715d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.tencent.mm.vfs.MaintenanceGroup.class.hashCode() ^ this.f212715d.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append("maintenanceGroup:");
        com.tencent.mm.vfs.i1 i1Var = this.f212715d;
        i1Var.getClass();
        for (com.tencent.mm.vfs.a0 a0Var : i1Var.f212990a) {
            sb6.append('\n');
            sb6.append("  ");
            sb6.append(a0Var);
        }
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.MaintenanceGroup.class, 3);
        this.f212715d.b(parcel);
    }

    public MaintenanceGroup(java.util.Collection collection) {
        this.f212715d = new com.tencent.mm.vfs.i1(collection);
    }

    public MaintenanceGroup(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.MaintenanceGroup.class, 3);
        this.f212715d = new com.tencent.mm.vfs.i1(parcel);
    }
}
