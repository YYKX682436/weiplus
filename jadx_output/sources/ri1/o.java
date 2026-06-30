package ri1;

/* loaded from: classes4.dex */
public final class o implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.String readString = source.readString();
        kotlin.jvm.internal.o.d(readString);
        java.lang.String readString2 = source.readString();
        kotlin.jvm.internal.o.d(readString2);
        java.lang.String readString3 = source.readString();
        kotlin.jvm.internal.o.d(readString3);
        java.lang.String readString4 = source.readString();
        kotlin.jvm.internal.o.d(readString4);
        return new com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel(readString, readString2, readString3, readString4, source.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel[i17];
    }
}
