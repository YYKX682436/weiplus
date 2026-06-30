package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f166066a;

    @za4.k1
    public s34.k adDragInfo;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f166067b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f166068c;

    /* renamed from: d, reason: collision with root package name */
    public int f166069d = 30;

    /* renamed from: e, reason: collision with root package name */
    public int f166070e;

    @za4.k1(resType = 2)
    public java.lang.String endCoverUrl;

    @za4.k1
    public com.tencent.mm.plugin.sns.ui.qa endCoverViewInfo;

    /* renamed from: f, reason: collision with root package name */
    public int f166071f;

    @za4.k1(resType = 2)
    public java.lang.String frontCoverUrl;

    /* renamed from: g, reason: collision with root package name */
    public s34.l0 f166072g;

    @za4.k1(resType = 5)
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo gestureClickActionInfo;

    /* renamed from: h, reason: collision with root package name */
    public float f166073h;

    /* renamed from: i, reason: collision with root package name */
    public int f166074i;

    /* renamed from: j, reason: collision with root package name */
    public int f166075j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.x f166076k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.u f166077l;

    public void a(java.util.Map map, java.lang.String str) {
        android.graphics.Rect rect;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFullCardInfo");
        this.f166066a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".displayType"), 0);
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        if (str2 == null) {
            str2 = "";
        }
        this.f166067b = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".description");
        if (str3 == null) {
            str3 = "";
        }
        this.f166068c = str3;
        this.f166069d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".markMaxAlpha"), 30);
        this.f166070e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".titlePosition"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + ".maskImg");
        if (str4 == null) {
            str4 = "";
        }
        this.frontCoverUrl = str4;
        this.f166074i = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".maskImgDisappearTime"), 0);
        java.lang.String str5 = (java.lang.String) map.get(str + ".coverImg");
        if (str5 == null) {
            str5 = "";
        }
        this.endCoverUrl = str5;
        this.f166075j = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".coverImgAppearTime"), 0);
        java.lang.String str6 = (java.lang.String) map.get(str + ".adGestureInfo.points");
        this.f166073h = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str + ".blankViewHeightPercent"));
        this.f166071f = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".adGestureInfo.breakFrameFlag"), 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            java.lang.String str7 = str + ".adGestureInfo";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGestureInfo");
            s34.l0 l0Var = new s34.l0();
            if (str7 != null) {
                l0Var.f402699a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str7.concat(".startTime")), 0);
                l0Var.f402700b = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str7.concat(".endTime")), 0);
                java.lang.String str8 = (java.lang.String) map.get(str7.concat(".color"));
                if (str8 == null) {
                    str8 = "";
                }
                l0Var.f402701c = ca4.n0.e(str8, -1);
                java.lang.String str9 = (java.lang.String) map.get(str7.concat(".points"));
                if (str9 == null) {
                    str9 = "";
                }
                l0Var.f402702d = str9;
                l0Var.f402703e = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str7.concat(".radius")));
                l0Var.f402704f = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str7.concat(".pointsBasicWidth")), 1280);
                l0Var.f402705g = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str7.concat(".pointsBasicHeight")), com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGestureInfo");
            this.f166072g = l0Var;
        }
        java.lang.String str10 = str + ".endCoverInfo";
        if (map.containsKey(str10)) {
            com.tencent.mm.plugin.sns.ui.qa qaVar = new com.tencent.mm.plugin.sns.ui.qa();
            this.endCoverViewInfo = qaVar;
            java.lang.String str11 = (java.lang.String) map.get(str10 + ".title");
            if (str11 == null) {
                str11 = "";
            }
            qaVar.f170333a = str11;
            com.tencent.mm.plugin.sns.ui.qa qaVar2 = this.endCoverViewInfo;
            java.lang.String str12 = (java.lang.String) map.get(str10 + ".description");
            if (str12 == null) {
                str12 = "";
            }
            qaVar2.f170334b = str12;
            com.tencent.mm.plugin.sns.ui.qa qaVar3 = this.endCoverViewInfo;
            java.lang.String str13 = (java.lang.String) map.get(str10 + ".actionTitle");
            if (str13 == null) {
                str13 = "";
            }
            qaVar3.f170335c = str13;
            com.tencent.mm.plugin.sns.ui.qa qaVar4 = this.endCoverViewInfo;
            java.lang.String str14 = (java.lang.String) map.get(str10 + ".ambientImageUrl");
            if (str14 == null) {
                str14 = "";
            }
            qaVar4.coverImgUrl = str14;
            com.tencent.mm.plugin.sns.ui.qa qaVar5 = this.endCoverViewInfo;
            java.lang.String str15 = (java.lang.String) map.get(str10 + ".titleImageUrl");
            if (str15 == null) {
                str15 = "";
            }
            qaVar5.titleImgUrl = str15;
            this.endCoverViewInfo.f170336d = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str10 + ".endCoverEndTime"), 0);
        }
        this.f166076k = com.tencent.mm.plugin.sns.storage.x.a(map, str + ".adLongPressGestureInfo");
        java.lang.String str16 = str + ".dragImageGestureInfo";
        com.tencent.mm.plugin.sns.storage.u uVar = null;
        if (map.containsKey(str16)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            s34.k kVar = new s34.k();
            java.lang.String str17 = (java.lang.String) map.get(str16 + ".imageUrl");
            if (str17 == null) {
                str17 = "";
            }
            kVar.dragImagUrl = str17;
            if (android.text.TextUtils.isEmpty(str17)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            } else {
                kVar.f402680a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str16 + ".dragStartTime"), 0);
                int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str16 + ".dragEndTime"), 0);
                kVar.f402681b = D1;
                int i17 = kVar.f402680a;
                if (i17 < 0 || D1 < 0 || i17 > D1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                } else {
                    java.lang.String str18 = (java.lang.String) map.get(str16 + ".srcDisplayRect");
                    if (str18 == null) {
                        str18 = "";
                    }
                    kVar.f402682c = s34.k.d(str18);
                    java.lang.String str19 = (java.lang.String) map.get(str16 + ".destDisplayRect");
                    if (str19 == null) {
                        str19 = "";
                    }
                    kVar.f402683d = s34.k.d(str19);
                    java.lang.String str20 = (java.lang.String) map.get(str16 + ".srcHitRect");
                    if (str20 == null) {
                        str20 = "";
                    }
                    kVar.f402684e = s34.k.d(str20);
                    java.lang.String str21 = (java.lang.String) map.get(str16 + ".destHitRect");
                    if (str21 == null) {
                        str21 = "";
                    }
                    android.graphics.Rect d17 = s34.k.d(str21);
                    kVar.f402685f = d17;
                    if (kVar.f402682c == null || kVar.f402683d == null || (rect = kVar.f402684e) == null || d17 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                    } else if (android.graphics.Rect.intersects(rect, d17)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                        this.adDragInfo = kVar;
                    }
                }
            }
            kVar = null;
            this.adDragInfo = kVar;
        }
        java.lang.String str22 = str + ".clickableAnimLabel";
        if (map.containsKey(str22)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ClickableAnimLabelInfo");
            java.lang.String str23 = (java.lang.String) map.get(str22 + ".descText");
            java.lang.String str24 = str23 != null ? str23 : "";
            int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str22 + ".animShowTime"), 0);
            int D13 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str22 + ".animHideTime"), 0);
            if (D12 <= 0 || D13 <= 0 || android.text.TextUtils.isEmpty(str24)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ClickableAnimLabelInfo");
            } else if (D12 >= D13) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ClickableAnimLabelInfo");
            } else {
                uVar = new com.tencent.mm.plugin.sns.storage.u();
                uVar.f166146a = str24;
                uVar.f166147b = D12;
                uVar.f166148c = D13;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ClickableAnimLabelInfo");
            }
            this.f166077l = uVar;
        }
        java.lang.String str25 = str + ".adGestureClickActionInfo";
        if (map.containsKey(str25)) {
            this.gestureClickActionInfo = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str25);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFullCardInfo");
    }
}
