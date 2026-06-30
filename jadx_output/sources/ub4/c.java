package ub4;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f426152a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f426153b = "";

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo : this.f426152a) {
            sb6.append("\t[localId=");
            sb6.append(snsInfo.localid);
            sb6.append(", snsId=");
            sb6.append(snsInfo.field_snsId);
            sb6.append("\n");
        }
        java.lang.String str = this.f426153b + "\n" + sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumInfo");
        return str;
    }
}
