package com.tencent.mm.plugin.magicbrush;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"com/tencent/mm/plugin/magicbrush/IMBAppBrandExportFeature$ServerEvent", "Landroid/os/Parcelable;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "CleanUpPkgImplsEvent", "Lcom/tencent/mm/plugin/magicbrush/IMBAppBrandExportFeature$ServerEvent$CleanUpPkgImplsEvent;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class IMBAppBrandExportFeature$ServerEvent<T extends android.os.Parcelable> implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Parcelable f147806d;

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/IMBAppBrandExportFeature$ServerEvent$CleanUpPkgImplsEvent;", "Lcom/tencent/mm/plugin/magicbrush/IMBAppBrandExportFeature$ServerEvent;", "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static final class CleanUpPkgImplsEvent extends com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent<android.os.Parcelable> {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent.CleanUpPkgImplsEvent> CREATOR = new com.tencent.mm.plugin.magicbrush.c4();

        public CleanUpPkgImplsEvent() {
            super(null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            kotlin.jvm.internal.o.g(out, "out");
            out.writeInt(1);
        }
    }

    public IMBAppBrandExportFeature$ServerEvent(android.os.Parcelable parcelable, kotlin.jvm.internal.i iVar) {
        this.f147806d = parcelable;
    }
}
