package x75;

/* loaded from: classes4.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.search.data.SimilarEmojiQueryModel(java.lang.String.valueOf(source.readString()), java.lang.String.valueOf(source.readString()), java.lang.String.valueOf(source.readString()), source.readLong(), source.readInt(), java.lang.String.valueOf(source.readString()), null, null, true, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.search.data.SimilarEmojiQueryModel[i17];
    }
}
