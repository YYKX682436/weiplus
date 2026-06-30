package pr;

/* loaded from: classes15.dex */
public final class m0 implements android.os.Parcelable.Creator {
    public m0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData emojiSyncLoaderIPC$EmojiSyncData = new com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData();
        emojiSyncLoaderIPC$EmojiSyncData.f64925d = parcel.readInt();
        emojiSyncLoaderIPC$EmojiSyncData.f64926e = parcel.readInt();
        emojiSyncLoaderIPC$EmojiSyncData.f64927f = parcel.readInt();
        emojiSyncLoaderIPC$EmojiSyncData.f64928g = parcel.readInt();
        emojiSyncLoaderIPC$EmojiSyncData.f64929h = parcel.readByte() != 0;
        return emojiSyncLoaderIPC$EmojiSyncData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData[i17];
    }
}
