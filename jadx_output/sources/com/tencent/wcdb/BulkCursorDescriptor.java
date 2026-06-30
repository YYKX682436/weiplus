package com.tencent.wcdb;

/* loaded from: classes12.dex */
public final class BulkCursorDescriptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.wcdb.BulkCursorDescriptor> CREATOR = new android.os.Parcelable.Creator<com.tencent.wcdb.BulkCursorDescriptor>() { // from class: com.tencent.wcdb.BulkCursorDescriptor.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.wcdb.BulkCursorDescriptor createFromParcel(android.os.Parcel parcel) {
            com.tencent.wcdb.BulkCursorDescriptor bulkCursorDescriptor = new com.tencent.wcdb.BulkCursorDescriptor();
            bulkCursorDescriptor.readFromParcel(parcel);
            return bulkCursorDescriptor;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.wcdb.BulkCursorDescriptor[] newArray(int i17) {
            return new com.tencent.wcdb.BulkCursorDescriptor[i17];
        }
    };
    public java.lang.String[] columnNames;
    public int count;
    public com.tencent.wcdb.IBulkCursor cursor;
    public boolean wantsAllOnMoveCalls;
    public com.tencent.wcdb.CursorWindow window;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.cursor = com.tencent.wcdb.BulkCursorNative.asInterface(parcel.readStrongBinder());
        this.columnNames = readStringArray(parcel);
        this.wantsAllOnMoveCalls = parcel.readInt() != 0;
        this.count = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.window = com.tencent.wcdb.CursorWindow.CREATOR.createFromParcel(parcel);
        }
    }

    public final java.lang.String[] readStringArray(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        java.lang.String[] strArr = new java.lang.String[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            strArr[i17] = parcel.readString();
        }
        return strArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStrongBinder(this.cursor.asBinder());
        parcel.writeStringArray(this.columnNames);
        parcel.writeInt(this.wantsAllOnMoveCalls ? 1 : 0);
        parcel.writeInt(this.count);
        if (this.window == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.window.writeToParcel(parcel, i17);
        }
    }
}
