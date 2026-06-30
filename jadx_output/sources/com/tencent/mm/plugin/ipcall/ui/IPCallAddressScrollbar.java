package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class IPCallAddressScrollbar extends com.tencent.mm.ui.base.VerticalScrollBar {
    public IPCallAddressScrollbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.VerticalScrollBar
    public void c() {
        this.f197706f = new java.lang.String[]{"↑", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "U", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "#"};
        this.f197704d = 1.3f;
        this.f197705e = 66;
    }

    @Override // com.tencent.mm.ui.base.VerticalScrollBar
    public int getToastLayoutId() {
        return com.tencent.mm.R.layout.cna;
    }
}
