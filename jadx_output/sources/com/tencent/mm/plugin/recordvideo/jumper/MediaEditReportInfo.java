package com.tencent.mm.plugin.recordvideo.jumper;

/* loaded from: classes10.dex */
public class MediaEditReportInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo> CREATOR = new ut3.g();
    public int cropSizeCnt;
    public java.util.ArrayList<com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem> editList = new java.util.ArrayList<>();
    public int seekBarDragCnt;

    /* loaded from: classes10.dex */
    public static class EditItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem> CREATOR = new com.tencent.mm.plugin.recordvideo.jumper.a();
        public int clickEditCount;
        public int dragCount;
        public int durationCutCount;
        public int durationScrollCount;
        public boolean isBeauty;
        public long originDuration;
        public int scaleCount;
        public long targetDuration;
        public int type;

        public EditItem() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.type);
            parcel.writeInt(this.isBeauty ? 1 : 0);
            parcel.writeLong(this.originDuration);
            parcel.writeLong(this.targetDuration);
            parcel.writeInt(this.clickEditCount);
            parcel.writeInt(this.durationCutCount);
            parcel.writeInt(this.durationScrollCount);
            parcel.writeInt(this.dragCount);
            parcel.writeInt(this.scaleCount);
        }

        public EditItem(android.os.Parcel parcel) {
            this.type = parcel.readInt();
            this.isBeauty = parcel.readInt() != 0;
            this.originDuration = parcel.readLong();
            this.targetDuration = parcel.readLong();
            this.clickEditCount = parcel.readInt();
            this.durationCutCount = parcel.readInt();
            this.durationScrollCount = parcel.readInt();
            this.dragCount = parcel.readInt();
            this.scaleCount = parcel.readInt();
        }
    }

    public MediaEditReportInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.seekBarDragCnt);
        parcel.writeInt(this.cropSizeCnt);
        parcel.writeList(this.editList);
    }

    public MediaEditReportInfo(android.os.Parcel parcel) {
        this.seekBarDragCnt = parcel.readInt();
        this.cropSizeCnt = parcel.readInt();
        parcel.readList(this.editList, com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem.class.getClassLoader());
    }
}
