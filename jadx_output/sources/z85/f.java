package z85;

/* loaded from: classes7.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.storage.emotion.EmojiIPSetInfo emojiIPSetInfo = new com.tencent.mm.storage.emotion.EmojiIPSetInfo();
        emojiIPSetInfo.field_key = parcel.readString();
        emojiIPSetInfo.field_title = parcel.readString();
        emojiIPSetInfo.field_desc = parcel.readString();
        emojiIPSetInfo.field_iconUrl = parcel.readString();
        emojiIPSetInfo.field_panelUrl = parcel.readString();
        return emojiIPSetInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.storage.emotion.EmojiIPSetInfo[i17];
    }
}
