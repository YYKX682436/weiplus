package com.tencent.mm.storage.emotion;

/* loaded from: classes12.dex */
public class EmojiGroupInfo extends dm.t2 implements android.os.Parcelable, qk.w6 {
    public static final l75.e0 M1 = dm.t2.initAutoDBInfo(com.tencent.mm.storage.emotion.EmojiGroupInfo.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.storage.emotion.EmojiGroupInfo> CREATOR = new z85.c();

    public EmojiGroupInfo() {
    }

    public void A0(java.lang.String str) {
        this.field_productID = str;
    }

    public void D0(int i17) {
        this.field_status = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // dm.t2, l75.f0
    public l75.e0 getDBInfo() {
        return M1;
    }

    public void setType(int i17) {
        this.field_type = i17;
    }

    public r45.zj0 t0() {
        r45.zj0 zj0Var = new r45.zj0();
        zj0Var.f392128d = this.field_productID;
        zj0Var.f392129e = this.field_packGrayIconUrl;
        zj0Var.f392130f = this.field_packName;
        zj0Var.f392131g = this.field_packDesc;
        zj0Var.f392132h = this.field_packAuthInfo;
        java.lang.String str = this.field_packPrice;
        zj0Var.f392133i = str;
        zj0Var.f392134m = this.field_packType;
        zj0Var.f392135n = this.field_packFlag;
        zj0Var.f392136o = this.field_packCoverUrl;
        zj0Var.f392137p = (int) this.field_packExpire;
        zj0Var.f392138q = this.field_packCopyright;
        zj0Var.f392139r = (int) this.field_packTimeStamp;
        zj0Var.f392141t = str;
        return zj0Var;
    }

    public java.lang.String toString() {
        return "field_productID:" + this.field_productID + "\nfield_packIconUrl:" + this.field_packIconUrl + "\nfield_packGrayIconUrl:" + this.field_packGrayIconUrl + "\nfield_packCoverUrl:" + this.field_packCoverUrl + "\nfield_packName:" + this.field_packName + "\nfield_packDesc:" + this.field_packDesc + "\nfield_packAuthInfo:" + this.field_packAuthInfo + "\nfield_packPrice:" + this.field_packPrice + "\nfield_packType:" + this.field_packType + "\nfield_packFlag:" + this.field_packFlag + "\nfield_packExpire:" + this.field_packExpire + "\nfield_packTimeStamp:" + this.field_packTimeStamp + "\nfield_packCopyright:" + this.field_packCopyright + "\nfield_type:" + this.field_type + "\nfield_status:" + this.field_status + "\nfield_sort:" + this.field_sort + "\nfield_lastUseTime:" + this.field_lastUseTime + "\nfield_packStatus:" + this.field_packStatus + "\nfield_recommand:" + this.field_recommand + "\nfield_sync:" + this.field_sync + "\nfield_idx:" + this.field_idx + "\nfield_BigIconUrl:" + this.field_BigIconUrl + "\nfield_MutiLanName:" + this.field_MutiLanName + "\nfield_count:" + this.field_count + "\n";
    }

    public void u0(java.lang.String str) {
        this.field_packGrayIconUrl = str;
    }

    public void v0(long j17) {
        this.field_lastUseTime = j17;
    }

    public void w0(java.lang.String str) {
        this.field_packIconUrl = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.field_productID);
        parcel.writeString(this.field_packIconUrl);
        parcel.writeString(this.field_packGrayIconUrl);
        parcel.writeString(this.field_packCoverUrl);
        parcel.writeString(this.field_packName);
        parcel.writeString(this.field_packDesc);
        parcel.writeString(this.field_packAuthInfo);
        parcel.writeString(this.field_packPrice);
        parcel.writeInt(this.field_packType);
        parcel.writeInt(this.field_packFlag);
        parcel.writeLong(this.field_packExpire);
        parcel.writeLong(this.field_packTimeStamp);
        parcel.writeString(this.field_packCopyright);
        parcel.writeInt(this.field_type);
        parcel.writeInt(this.field_status);
        parcel.writeInt(this.field_sort);
        parcel.writeLong(this.field_lastUseTime);
        parcel.writeInt(this.field_packStatus);
        parcel.writeInt(this.field_flag);
        parcel.writeInt(this.field_recommand);
        parcel.writeInt(this.field_sync);
        parcel.writeInt(this.field_idx);
        parcel.writeString(this.field_BigIconUrl);
        parcel.writeString(this.field_MutiLanName);
        parcel.writeInt(this.field_recommandType);
        parcel.writeString(this.field_lang);
        parcel.writeString(this.field_recommandWord);
        parcel.writeInt(this.field_buttonType);
        parcel.writeInt(this.field_count);
        parcel.writeLong(this.systemRowid);
        parcel.writeString(this.field_ipKey);
    }

    public void y0(java.lang.String str) {
        this.field_packName = str;
    }

    public void z0(int i17) {
        this.field_packStatus = i17;
    }

    public EmojiGroupInfo(android.os.Parcel parcel) {
        this.field_productID = parcel.readString();
        this.field_packIconUrl = parcel.readString();
        this.field_packGrayIconUrl = parcel.readString();
        this.field_packCoverUrl = parcel.readString();
        this.field_packName = parcel.readString();
        this.field_packDesc = parcel.readString();
        this.field_packAuthInfo = parcel.readString();
        this.field_packPrice = parcel.readString();
        this.field_packType = parcel.readInt();
        this.field_packFlag = parcel.readInt();
        this.field_packExpire = parcel.readLong();
        this.field_packTimeStamp = parcel.readLong();
        this.field_packCopyright = parcel.readString();
        this.field_type = parcel.readInt();
        this.field_status = parcel.readInt();
        this.field_sort = parcel.readInt();
        this.field_lastUseTime = parcel.readLong();
        this.field_packStatus = parcel.readInt();
        this.field_flag = parcel.readInt();
        this.field_recommand = parcel.readInt();
        this.field_sync = parcel.readInt();
        this.field_idx = parcel.readInt();
        this.field_BigIconUrl = parcel.readString();
        this.field_MutiLanName = parcel.readString();
        this.field_recommandType = parcel.readInt();
        this.field_lang = parcel.readString();
        this.field_recommandWord = parcel.readString();
        this.field_buttonType = parcel.readInt();
        this.field_count = parcel.readInt();
        this.systemRowid = parcel.readLong();
        this.field_ipKey = parcel.readString();
    }
}
