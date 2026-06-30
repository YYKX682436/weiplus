package com.tencent.mm.plugin.recordvideo.jumper;

/* loaded from: classes10.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem[i17];
    }
}
