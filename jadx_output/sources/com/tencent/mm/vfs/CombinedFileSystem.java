package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class CombinedFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.CombinedFileSystem> CREATOR = new com.tencent.mm.vfs.x();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem[] f212698e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.vfs.y[] f212699f;

    public CombinedFileSystem(android.os.Parcel parcel, com.tencent.mm.vfs.x xVar) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.CombinedFileSystem.class, 1);
        int readInt = parcel.readInt();
        this.f212698e = new com.tencent.mm.vfs.FileSystem[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
            if (fileSystem == null) {
                throw new android.os.ParcelFormatException();
            }
            this.f212698e[i17] = fileSystem;
        }
        int readInt2 = parcel.readInt();
        this.f212699f = new com.tencent.mm.vfs.y[readInt2];
        for (int i18 = 0; i18 < readInt2; i18++) {
            java.lang.String readString = parcel.readString();
            this.f212699f[i18] = new com.tencent.mm.vfs.y(readString == null ? null : java.util.regex.Pattern.compile(readString), parcel.readInt());
        }
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        com.tencent.mm.vfs.FileSystem[] fileSystemArr = this.f212698e;
        int length = fileSystemArr.length;
        com.tencent.mm.vfs.q2[] q2VarArr = new com.tencent.mm.vfs.q2[length];
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) fileSystemArr[i18].b(map);
            i17 |= q2Var.o();
            q2VarArr[i18] = q2Var;
        }
        return new com.tencent.mm.vfs.z(this, q2VarArr, i17);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CombinedFS [");
        for (com.tencent.mm.vfs.FileSystem fileSystem : this.f212698e) {
            sb6.append(fileSystem.toString());
            sb6.append(", ");
        }
        sb6.setLength(sb6.length() - 2);
        sb6.append(']');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.CombinedFileSystem.class, 1);
        com.tencent.mm.vfs.FileSystem[] fileSystemArr = this.f212698e;
        parcel.writeInt(fileSystemArr.length);
        for (com.tencent.mm.vfs.FileSystem fileSystem : fileSystemArr) {
            parcel.writeParcelable(fileSystem, i17);
        }
        com.tencent.mm.vfs.y[] yVarArr = this.f212699f;
        parcel.writeInt(yVarArr.length);
        for (com.tencent.mm.vfs.y yVar : yVarArr) {
            java.util.regex.Pattern pattern = yVar.f213244a;
            parcel.writeString(pattern == null ? null : pattern.pattern());
            parcel.writeInt(yVar.f213245b);
        }
    }
}
