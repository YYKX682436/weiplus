package l81;

/* loaded from: classes7.dex */
public final class t0 implements android.os.Parcelable.Creator {
    public t0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData parcelableMultiTaskData = new com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData();
        java.lang.Object c17 = com.tencent.mm.ipcinvoker.extension.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", source);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CommonMultiTaskData");
        parcelableMultiTaskData.f74958d = (r45.w60) c17;
        return parcelableMultiTaskData;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.api.ParcelableMultiTaskData[i17];
    }
}
