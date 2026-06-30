package com.tencent.mm.plugin.gamelive;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/gamelive/GameLiveAppbrandProcessService$EnterFinderLiveResult", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "h63/r", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class GameLiveAppbrandProcessService$EnterFinderLiveResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final h63.r CREATOR = new h63.r(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f142011d;

    public GameLiveAppbrandProcessService$EnterFinderLiveResult(int i17) {
        this.f142011d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f142011d);
    }
}
