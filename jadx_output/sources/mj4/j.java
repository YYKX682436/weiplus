package mj4;

/* loaded from: classes11.dex */
public final class j implements mj4.i {

    /* renamed from: a, reason: collision with root package name */
    public final mj4.h f327065a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f327066b;

    public j(mj4.h originalItem) {
        kotlin.jvm.internal.o.g(originalItem, "originalItem");
        this.f327065a = originalItem;
        this.f327066b = new java.util.HashMap();
    }

    public mj4.h a() {
        mj4.a aVar = new mj4.a();
        mj4.k kVar = (mj4.k) this.f327065a;
        aVar.field_UserName = kVar.o();
        aVar.field_StatusID = kVar.l();
        aVar.field_TopicId = kVar.m();
        mj4.a aVar2 = kVar.f327067b;
        java.lang.String str = aVar2.field_SourceID;
        if (str == null) {
            str = "";
        }
        aVar.field_SourceID = str;
        aVar.field_TopicInfo = kVar.n();
        byte[] bArr = aVar2.field_ClusterShowInfo;
        if (bArr == null) {
            bArr = new byte[0];
        }
        aVar.field_ClusterShowInfo = bArr;
        aVar.field_IconID = kVar.h();
        aVar.field_Description = kVar.g();
        aVar.field_MediaType = aVar2.field_MediaType;
        aVar.field_MediaUrl = kVar.j();
        java.lang.String str2 = aVar2.field_MediaAESKey;
        if (str2 == null) {
            str2 = "";
        }
        aVar.field_MediaAESKey = str2;
        aVar.field_MediaThumbUrl = kVar.i();
        java.lang.String str3 = aVar2.field_MediaThumbAESKey;
        if (str3 == null) {
            str3 = "";
        }
        aVar.field_MediaThumbAESKey = str3;
        java.lang.String str4 = aVar2.field_PoiID;
        if (str4 == null) {
            str4 = "";
        }
        aVar.field_PoiID = str4;
        aVar.field_PoiName = kVar.k();
        aVar.field_Longitude = aVar2.field_Longitude;
        aVar.field_Latitude = aVar2.field_Latitude;
        aVar.field_Visibility = aVar2.field_Visibility;
        aVar.field_CreateTime = aVar2.field_CreateTime;
        aVar.field_ExpireTime = aVar2.field_ExpireTime;
        aVar.field_LikeCount = aVar2.field_LikeCount;
        aVar.field_state = aVar2.field_state;
        aVar.field_backgroundId = kVar.p();
        aVar.field_option = java.lang.Long.valueOf(kVar.q());
        aVar.field_mediaWidth = aVar2.field_mediaWidth;
        aVar.field_mediaHeight = aVar2.field_mediaHeight;
        java.lang.String str5 = aVar2.field_visibilityInfo;
        if (str5 == null) {
            str5 = "";
        }
        aVar.field_visibilityInfo = str5;
        java.lang.String str6 = aVar2.field_referenceUserName;
        if (str6 == null) {
            str6 = "";
        }
        aVar.field_referenceUserName = str6;
        java.lang.String str7 = aVar2.field_referenceTextStatusId;
        if (str7 == null) {
            str7 = "";
        }
        aVar.field_referenceTextStatusId = str7;
        aVar.field_referenceCount = aVar2.field_referenceCount;
        aVar.field_sceneType = aVar2.field_sceneType;
        java.lang.String str8 = aVar2.field_duplicateUserName;
        if (str8 == null) {
            str8 = "";
        }
        aVar.field_duplicateUserName = str8;
        java.lang.String str9 = aVar2.field_duplicateTextStatusId;
        aVar.field_duplicateTextStatusId = str9 != null ? str9 : "";
        byte[] bArr2 = aVar2.field_EmojiInfo;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        aVar.field_EmojiInfo = bArr2;
        aVar.field_statusExtInfoOriBytes = kVar.r();
        aVar.field_ClusterId = kVar.c();
        aVar.field_LikeCountVersion = aVar2.field_LikeCountVersion;
        aVar.field_profileSeq = aVar2.field_profileSeq;
        aVar.field_CommentCount = aVar2.field_CommentCount;
        aVar.field_City = kVar.f();
        aVar.field_contentScore = aVar2.field_contentScore;
        aVar.field_HasHb = aVar2.field_HasHb;
        byte[] bArr3 = aVar2.field_PrivateInfo;
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        aVar.field_PrivateInfo = bArr3;
        byte[] bArr4 = aVar2.field_PublicInfo;
        if (bArr4 == null) {
            bArr4 = new byte[0];
        }
        aVar.field_PublicInfo = bArr4;
        aVar.systemRowid = aVar2.systemRowid;
        aVar.f327055o2 = kVar.y();
        for (java.util.Map.Entry entry : this.f327066b.entrySet()) {
            java.lang.String str10 = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            switch (str10.hashCode()) {
                case -2120902034:
                    if (str10.equals("field_CreateTime")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_CreateTime = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case -1984674757:
                    if (str10.equals("field_SourceID")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_SourceID = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1923285950:
                    if (str10.equals("isOnLocal")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Boolean");
                        aVar.f327055o2 = ((java.lang.Boolean) value).booleanValue();
                        break;
                    } else {
                        break;
                    }
                case -1851446247:
                    if (str10.equals("field_MediaType")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_MediaType = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case -1813803963:
                    if (str10.equals("field_TopicId")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_TopicId = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1716245457:
                    if (str10.equals("field_MediaAESKey")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_MediaAESKey = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1585955012:
                    if (str10.equals("field_PublicInfo")) {
                        aVar.field_PublicInfo = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case -1548782697:
                    if (str10.equals("field_Visibility")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_Visibility = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case -1547281530:
                    if (str10.equals("systemRowid")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Long");
                        aVar.systemRowid = ((java.lang.Long) value).longValue();
                        break;
                    } else {
                        break;
                    }
                case -1357175460:
                    if (str10.equals("field_referenceUserName")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_referenceUserName = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1309758777:
                    if (str10.equals("field_MediaThumbAESKey")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_MediaThumbAESKey = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1226418592:
                    if (str10.equals("field_referenceTextStatusId")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_referenceTextStatusId = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1077623776:
                    if (str10.equals("field_duplicateTextStatusId")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_duplicateTextStatusId = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -1076121200:
                    if (str10.equals("field_PoiName")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_PoiName = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -938727847:
                    if (str10.equals("field_IconID")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_IconID = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -876013007:
                    if (str10.equals("field_Latitude")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Double");
                        aVar.field_Latitude = ((java.lang.Double) value).doubleValue();
                        break;
                    } else {
                        break;
                    }
                case -857088827:
                    if (str10.equals("field_visibilityInfo")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_visibilityInfo = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -336818000:
                    if (str10.equals("field_MediaUrl")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_MediaUrl = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -133989874:
                    if (str10.equals("field_backgroundId")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_backgroundId = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case -29872879:
                    if (str10.equals("field_ExpireTime")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_ExpireTime = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 28451041:
                    if (str10.equals("field_sceneType")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_sceneType = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 113451667:
                    if (str10.equals("field_LikeCount")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_LikeCount = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 161331034:
                    if (str10.equals("field_option")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Long");
                        aVar.field_option = (java.lang.Long) value;
                        break;
                    } else {
                        break;
                    }
                case 291815645:
                    if (str10.equals("field_statusExtInfoOriBytes")) {
                        aVar.field_statusExtInfoOriBytes = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 297298619:
                    if (str10.equals("field_UserName")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_UserName = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 440423562:
                    if (str10.equals("field_Longitude")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Double");
                        aVar.field_Longitude = ((java.lang.Double) value).doubleValue();
                        break;
                    } else {
                        break;
                    }
                case 575386032:
                    if (str10.equals("field_City")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_City = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 661474703:
                    if (str10.equals("field_HasHb")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_HasHb = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 669270336:
                    if (str10.equals("field_PoiID")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_PoiID = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 691126616:
                    if (str10.equals("field_TopicInfo")) {
                        aVar.field_TopicInfo = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 701736204:
                    if (str10.equals("field_state")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_state = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 711743768:
                    if (str10.equals("field_MediaThumbUrl")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_MediaThumbUrl = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 743526567:
                    if (str10.equals("field_mediaWidth")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_mediaWidth = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 864997264:
                    if (str10.equals("field_ClusterId")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_ClusterId = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 1024437438:
                    if (str10.equals("field_contentScore")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Float");
                        aVar.field_contentScore = ((java.lang.Float) value).floatValue();
                        break;
                    } else {
                        break;
                    }
                case 1026585193:
                    if (str10.equals("field_referenceCount")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_referenceCount = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 1138137397:
                    if (str10.equals("field_CommentCount")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_CommentCount = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 1141492326:
                    if (str10.equals("field_mediaHeight")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_mediaHeight = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 1151894764:
                    if (str10.equals("field_PrivateInfo")) {
                        aVar.field_PrivateInfo = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 1171682076:
                    if (str10.equals("field_duplicateUserName")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_duplicateUserName = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 1660371968:
                    if (str10.equals("field_ClusterShowInfo")) {
                        aVar.field_ClusterShowInfo = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 1751024663:
                    if (str10.equals("field_Description")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_Description = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 1850545861:
                    if (str10.equals("field_LikeCountVersion")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Int");
                        aVar.field_LikeCountVersion = ((java.lang.Integer) value).intValue();
                        break;
                    } else {
                        break;
                    }
                case 1882657362:
                    if (str10.equals("field_StatusID")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.String");
                        aVar.field_StatusID = (java.lang.String) value;
                        break;
                    } else {
                        break;
                    }
                case 1989153007:
                    if (str10.equals("field_EmojiInfo")) {
                        aVar.field_EmojiInfo = value instanceof byte[] ? (byte[]) value : null;
                        break;
                    } else {
                        break;
                    }
                case 2003706459:
                    if (str10.equals("field_profileSeq")) {
                        kotlin.jvm.internal.o.e(value, "null cannot be cast to non-null type kotlin.Long");
                        aVar.field_profileSeq = ((java.lang.Long) value).longValue();
                        break;
                    } else {
                        break;
                    }
            }
        }
        return new mj4.k(aVar);
    }

    public mj4.i b(int i17) {
        this.f327066b.put("field_LikeCount", java.lang.Integer.valueOf(i17));
        return this;
    }

    public mj4.i c(boolean z17) {
        this.f327066b.put("isOnLocal", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public mj4.i d(byte[] bArr) {
        this.f327066b.put("field_PrivateInfo", bArr);
        return this;
    }

    public mj4.i e(byte[] bArr) {
        this.f327066b.put("field_PublicInfo", bArr);
        return this;
    }

    public mj4.i f(int i17) {
        this.f327066b.put("field_state", java.lang.Integer.valueOf(i17));
        return this;
    }

    public mj4.i g(java.lang.String statusID) {
        kotlin.jvm.internal.o.g(statusID, "statusID");
        this.f327066b.put("field_StatusID", statusID);
        return this;
    }

    public mj4.i h(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f327066b.put("field_UserName", userName);
        return this;
    }
}
