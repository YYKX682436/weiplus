package mj4;

/* loaded from: classes11.dex */
public final class a extends rj4.a {

    /* renamed from: o2, reason: collision with root package name */
    public boolean f327055o2;

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof mj4.a)) {
            return false;
        }
        mj4.a aVar = (mj4.a) obj;
        if (!kotlin.jvm.internal.o.b(aVar.field_StatusID, this.field_StatusID) || !kotlin.jvm.internal.o.b(aVar.field_UserName, this.field_UserName) || !kotlin.jvm.internal.o.b(aVar.field_TopicId, this.field_TopicId) || !kotlin.jvm.internal.o.b(aVar.field_SourceID, this.field_SourceID) || !java.util.Arrays.equals(aVar.field_TopicInfo, this.field_TopicInfo) || !java.util.Arrays.equals(aVar.field_ClusterShowInfo, this.field_ClusterShowInfo) || !kotlin.jvm.internal.o.b(aVar.field_IconID, this.field_IconID) || !kotlin.jvm.internal.o.b(aVar.field_Description, this.field_Description) || aVar.field_MediaType != this.field_MediaType || !kotlin.jvm.internal.o.b(aVar.field_MediaUrl, this.field_MediaUrl) || !kotlin.jvm.internal.o.b(aVar.field_MediaAESKey, this.field_MediaAESKey) || !kotlin.jvm.internal.o.b(aVar.field_MediaThumbUrl, this.field_MediaThumbUrl) || !kotlin.jvm.internal.o.b(aVar.field_MediaThumbAESKey, this.field_MediaThumbAESKey) || !kotlin.jvm.internal.o.b(aVar.field_PoiID, this.field_PoiID) || !kotlin.jvm.internal.o.b(aVar.field_PoiName, this.field_PoiName)) {
            return false;
        }
        if (aVar.field_Longitude == this.field_Longitude) {
            return ((aVar.field_Latitude > this.field_Latitude ? 1 : (aVar.field_Latitude == this.field_Latitude ? 0 : -1)) == 0) && aVar.field_Visibility == this.field_Visibility && aVar.field_CreateTime == this.field_CreateTime && aVar.field_ExpireTime == this.field_ExpireTime && aVar.field_LikeCount == this.field_LikeCount && aVar.field_CommentCount == this.field_CommentCount && aVar.field_state == this.field_state && kotlin.jvm.internal.o.b(aVar.field_backgroundId, this.field_backgroundId) && kotlin.jvm.internal.o.b(aVar.field_option, this.field_option) && aVar.field_mediaWidth == this.field_mediaWidth && aVar.field_mediaHeight == this.field_mediaHeight && kotlin.jvm.internal.o.b(aVar.field_visibilityInfo, this.field_visibilityInfo) && aVar.field_sceneType == this.field_sceneType && java.util.Arrays.equals(aVar.field_EmojiInfo, this.field_EmojiInfo) && kotlin.jvm.internal.o.b(aVar.field_City, this.field_City) && java.util.Arrays.equals(aVar.field_statusExtInfoOriBytes, this.field_statusExtInfoOriBytes) && java.util.Arrays.equals(aVar.field_PrivateInfo, this.field_PrivateInfo) && java.util.Arrays.equals(aVar.field_PublicInfo, this.field_PublicInfo) && aVar.field_HasHb == this.field_HasHb;
        }
        return false;
    }

    @Override // rj4.a, l75.f0
    public l75.e0 getDBInfo() {
        mj4.h.f327064a.getClass();
        l75.e0 e0Var = mj4.g.f327062b;
        kotlin.jvm.internal.o.f(e0Var, "<get-_dbInfo>(...)");
        return e0Var;
    }

    public final boolean t0() {
        return this.field_ExpireTime <= c01.id.e();
    }
}
