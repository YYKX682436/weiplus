package com.tencent.mm.plugin.recordvideo.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasFilterItem;", "Landroid/os/Parcelable;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class ImproveRecordMaasFilterItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem> CREATOR = new vt3.o();

    /* renamed from: d, reason: collision with root package name */
    public final vt3.m f155703d;

    /* renamed from: e, reason: collision with root package name */
    public final int f155704e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f155705f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f155706g;

    /* renamed from: h, reason: collision with root package name */
    public final int f155707h;

    /* renamed from: i, reason: collision with root package name */
    public final float f155708i;

    public ImproveRecordMaasFilterItem(vt3.m rvType, int i17, java.lang.String filterName, java.lang.String filterPath, int i18, float f17) {
        kotlin.jvm.internal.o.g(rvType, "rvType");
        kotlin.jvm.internal.o.g(filterName, "filterName");
        kotlin.jvm.internal.o.g(filterPath, "filterPath");
        this.f155703d = rvType;
        this.f155704e = i17;
        this.f155705f = filterName;
        this.f155706g = filterPath;
        this.f155707h = i18;
        this.f155708i = f17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem)) {
            return false;
        }
        com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem improveRecordMaasFilterItem = (com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem) obj;
        return this.f155703d == improveRecordMaasFilterItem.f155703d && this.f155704e == improveRecordMaasFilterItem.f155704e && kotlin.jvm.internal.o.b(this.f155705f, improveRecordMaasFilterItem.f155705f) && kotlin.jvm.internal.o.b(this.f155706g, improveRecordMaasFilterItem.f155706g) && this.f155707h == improveRecordMaasFilterItem.f155707h && java.lang.Float.compare(this.f155708i, improveRecordMaasFilterItem.f155708i) == 0;
    }

    public int hashCode() {
        return (((((((((this.f155703d.hashCode() * 31) + java.lang.Integer.hashCode(this.f155704e)) * 31) + this.f155705f.hashCode()) * 31) + this.f155706g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f155707h)) * 31) + java.lang.Float.hashCode(this.f155708i);
    }

    public java.lang.String toString() {
        return "ImproveRecordMaasFilterItem(rvType=" + this.f155703d + ", filterType=" + this.f155704e + ", filterName=" + this.f155705f + ", filterPath=" + this.f155706g + ", bgColor=" + this.f155707h + ", intensity=" + this.f155708i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f155703d.name());
        out.writeInt(this.f155704e);
        out.writeString(this.f155705f);
        out.writeString(this.f155706g);
        out.writeInt(this.f155707h);
        out.writeFloat(this.f155708i);
    }

    public /* synthetic */ ImproveRecordMaasFilterItem(vt3.m mVar, int i17, java.lang.String str, java.lang.String str2, int i18, float f17, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? vt3.m.f440012f : mVar, i17, str, str2, i18, (i19 & 32) != 0 ? 1.0f : f17);
    }
}
