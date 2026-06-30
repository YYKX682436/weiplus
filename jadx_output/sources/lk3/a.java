package lk3;

/* loaded from: classes8.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.field_id = parcel.readString();
        multiTaskInfo.field_type = parcel.readInt();
        multiTaskInfo.field_createTime = parcel.readLong();
        multiTaskInfo.field_updateTime = parcel.readLong();
        r45.lr4 lr4Var = new r45.lr4();
        lr4Var.set(0, parcel.readString());
        lr4Var.set(1, parcel.readString());
        lr4Var.set(2, parcel.readString());
        lr4Var.set(3, java.lang.Integer.valueOf(parcel.readInt()));
        lr4Var.set(4, parcel.readString());
        lr4Var.set(5, parcel.readString());
        lr4Var.set(6, java.lang.Integer.valueOf(parcel.readInt()));
        lr4Var.set(7, java.lang.Boolean.valueOf(parcel.readInt() != 0));
        multiTaskInfo.field_showData = lr4Var;
        try {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            multiTaskInfo.field_data = bArr;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskInfo", "read ext info error: %s", e17.getMessage());
        }
        return multiTaskInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.multitask.model.MultiTaskInfo[i17];
    }
}
