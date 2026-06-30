package com.tencent.mm.plugin.multitask.model;

/* loaded from: classes8.dex */
public class MultiTaskInfo extends dm.h8 implements android.os.Parcelable {
    public static final l75.e0 A = dm.h8.initAutoDBInfo(dm.h8.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.multitask.model.MultiTaskInfo> CREATOR = new lk3.a();

    public static org.json.JSONObject u0(java.lang.String str, int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("field_id", str);
            jSONObject.put("field_type", i17);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTaskInfo", e17, "convertMultiTaskToJSONObject fail, exception:%s", e17);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.h8, l75.f0
    public l75.e0 getDBInfo() {
        return A;
    }

    public r45.lr4 v0() {
        if (this.field_showData == null) {
            this.field_showData = new r45.lr4();
        }
        return this.field_showData;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.field_id);
        parcel.writeInt(this.field_type);
        parcel.writeLong(this.field_createTime);
        parcel.writeLong(this.field_updateTime);
        parcel.writeString(this.field_showData.getString(0));
        parcel.writeString(this.field_showData.getString(1));
        parcel.writeString(this.field_showData.getString(2));
        parcel.writeInt(this.field_showData.getInteger(3));
        parcel.writeString(this.field_showData.getString(4));
        parcel.writeString(this.field_showData.getString(5));
        parcel.writeInt(this.field_showData.getInteger(6));
        parcel.writeInt(this.field_showData.getBoolean(7) ? 1 : 0);
        parcel.writeInt(this.field_data.length);
        parcel.writeByteArray(this.field_data);
    }
}
