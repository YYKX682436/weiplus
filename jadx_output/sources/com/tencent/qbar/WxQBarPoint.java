package com.tencent.qbar;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/qbar/WxQBarPoint;", "Lcom/tencent/qbar/QbarNative$QBarPoint;", "Landroid/os/Parcelable;", "CREATOR", "zs5/w0", "scan-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class WxQBarPoint extends com.tencent.qbar.QbarNative$QBarPoint implements android.os.Parcelable {
    public static final zs5.w0 CREATOR = new zs5.w0(null);

    public WxQBarPoint(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.point_cnt = parcel.readInt();
        this.f215230x0 = parcel.readFloat();
        this.f215231x1 = parcel.readFloat();
        this.f215232x2 = parcel.readFloat();
        this.f215233x3 = parcel.readFloat();
        this.f215234y0 = parcel.readFloat();
        this.f215235y1 = parcel.readFloat();
        this.f215236y2 = parcel.readFloat();
        this.f215237y3 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.point_cnt);
        parcel.writeFloat(this.f215230x0);
        parcel.writeFloat(this.f215231x1);
        parcel.writeFloat(this.f215232x2);
        parcel.writeFloat(this.f215233x3);
        parcel.writeFloat(this.f215234y0);
        parcel.writeFloat(this.f215235y1);
        parcel.writeFloat(this.f215236y2);
        parcel.writeFloat(this.f215237y3);
    }

    public WxQBarPoint(com.tencent.qbar.QbarNative$QBarPoint qbarNative$QBarPoint) {
        if (qbarNative$QBarPoint == null) {
            return;
        }
        this.point_cnt = qbarNative$QBarPoint.point_cnt;
        this.f215230x0 = qbarNative$QBarPoint.f215230x0;
        this.f215231x1 = qbarNative$QBarPoint.f215231x1;
        this.f215232x2 = qbarNative$QBarPoint.f215232x2;
        this.f215233x3 = qbarNative$QBarPoint.f215233x3;
        this.f215234y0 = qbarNative$QBarPoint.f215234y0;
        this.f215235y1 = qbarNative$QBarPoint.f215235y1;
        this.f215236y2 = qbarNative$QBarPoint.f215236y2;
        this.f215237y3 = qbarNative$QBarPoint.f215237y3;
    }
}
