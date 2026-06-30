package cw2;

/* loaded from: classes10.dex */
public final class va implements android.os.Parcelable.Creator {
    public va(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable localVideoCropInfoParcelable = new com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        r45.dd4 dd4Var = new r45.dd4();
        dd4Var.parseFrom(bArr);
        localVideoCropInfoParcelable.f130759d = dd4Var;
        return localVideoCropInfoParcelable;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable[i17];
    }
}
