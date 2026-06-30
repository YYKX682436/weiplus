package com.tencent.mm.storage.emotion;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/storage/emotion/EmojiIPSetInfo;", "Ldm/u2;", "Landroid/os/Parcelable;", "<init>", "()V", "z85/g", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class EmojiIPSetInfo extends dm.u2 implements android.os.Parcelable {

    /* renamed from: v, reason: collision with root package name */
    public static final z85.g f193891v = new z85.g(null);

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f193892w = dm.u2.initAutoDBInfo(com.tencent.mm.storage.emotion.EmojiIPSetInfo.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.storage.emotion.EmojiIPSetInfo> CREATOR = new z85.f();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.u2, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f193892w;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.field_key);
        parcel.writeString(this.field_title);
        parcel.writeString(this.field_desc);
        parcel.writeString(this.field_iconUrl);
        parcel.writeString(this.field_panelUrl);
    }
}
