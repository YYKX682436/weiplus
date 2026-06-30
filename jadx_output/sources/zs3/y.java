package zs3;

/* loaded from: classes9.dex */
public class y extends dm.s9 implements zs3.s {
    public static final l75.e0 W = dm.s9.initAutoDBInfo(zs3.y.class);

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof zs3.y) && this.field_localId == ((zs3.y) obj).field_localId;
    }

    @Override // dm.s9, l75.f0
    public l75.e0 getDBInfo() {
        return W;
    }

    @Override // zs3.s
    public int getKey() {
        return this.field_localId;
    }

    public java.lang.String toString() {
        return "localid[" + this.field_localId + "]\nrecordId[" + this.field_recordLocalId + "]\nmediaId[" + this.field_mediaId + "]\ndataId[" + this.field_dataId + "]\npath[" + this.field_path + "]\ncdnurl[" + this.field_cdnUrl + "]\ncdnkey[" + this.field_cdnKey + "]\ntype[" + this.field_type + "]\nerrCode[" + this.field_errCode + "]\nfileType[" + this.field_fileType + "]\nisThumb[" + this.field_isThumb + "]\nstatus[" + this.field_status + "]\ntotalLen[" + this.field_totalLen + "]\noffset[" + this.field_offset + "]\ntoUser[" + this.field_toUser + "]\n";
    }
}
