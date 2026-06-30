package com.tencent.mm.plugin.multitask;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/multitask/MultiTaskListParcel;", "Landroid/os/Parcelable;", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class MultiTaskListParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.multitask.MultiTaskListParcel> CREATOR = new com.tencent.mm.plugin.multitask.t0();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f150402d;

    public MultiTaskListParcel(java.util.List list) {
        this.f150402d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeTypedList(this.f150402d);
    }

    public MultiTaskListParcel(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        this.f150402d = in6.createTypedArrayList(com.tencent.mm.plugin.multitask.model.MultiTaskInfo.CREATOR);
    }
}
