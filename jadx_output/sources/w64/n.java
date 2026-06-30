package w64;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f443308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f443309b;

    /* renamed from: c, reason: collision with root package name */
    public int f443310c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f443311d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f443312e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.k4 f443313f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f443315h;

    /* renamed from: i, reason: collision with root package name */
    public final i64.b1 f443316i;

    /* renamed from: j, reason: collision with root package name */
    public w64.k f443317j;

    /* renamed from: k, reason: collision with root package name */
    public w64.x f443318k;

    /* renamed from: l, reason: collision with root package name */
    public w64.l f443319l;

    /* renamed from: s, reason: collision with root package name */
    public n74.d f443326s;

    /* renamed from: t, reason: collision with root package name */
    public w64.m f443327t;

    /* renamed from: g, reason: collision with root package name */
    public boolean f443314g = false;

    /* renamed from: m, reason: collision with root package name */
    public int f443320m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f443321n = true;

    /* renamed from: o, reason: collision with root package name */
    public v64.d f443322o = null;

    /* renamed from: p, reason: collision with root package name */
    public u94.f f443323p = null;

    /* renamed from: q, reason: collision with root package name */
    public int f443324q = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final w64.k f443325r = new w64.d(this);

    public n(android.content.Context context, int i17, i64.b1 b1Var, w64.k kVar, w64.l lVar) {
        this.f443312e = context;
        this.f443309b = i17;
        this.f443316i = b1Var;
        this.f443317j = kVar;
        this.f443319l = lVar;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a(w64.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = nVar.f443315h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return adClickActionInfo;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo b(w64.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = nVar.f443311d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return snsInfo;
    }

    public static int f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIndirectClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i17 = 0;
        if (adClickActionInfo == null) {
            com.tencent.mars.xlog.Log.e("AdClickActionHandler", "getIndirectClickAction, clickInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIndirectClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return 0;
        }
        switch (adClickActionInfo.B0) {
            case 0:
                if (adClickActionInfo.f162575d == 1) {
                    i17 = 59;
                    break;
                }
                break;
            case 1:
                i17 = 11;
                break;
            case 3:
            case 20:
            case 25:
                i17 = 21;
                break;
            case 4:
                i17 = 31;
                break;
            case 5:
                if (adClickActionInfo.f162575d != 1) {
                    i17 = 32;
                    break;
                } else {
                    i17 = 61;
                    break;
                }
            case 6:
                i17 = 33;
                break;
            case 8:
                i17 = 42;
                break;
            case 10:
                if (!i64.y.j(i64.y.h(adClickActionInfo, snsInfo == null ? "" : ca4.z0.t0(snsInfo.field_snsId)))) {
                    i17 = 44;
                    break;
                } else {
                    i17 = 68;
                    break;
                }
            case 11:
                i17 = 46;
                break;
            case 12:
                i17 = 37;
                break;
            case 14:
                i17 = 41;
                break;
            case 16:
                i17 = 50;
                break;
            case 17:
                i17 = 51;
                break;
            case 18:
                i17 = 52;
                break;
            case 19:
                i17 = 39;
                break;
            case 21:
                i17 = 53;
                break;
            case 22:
                if (adClickActionInfo.f162575d != 1) {
                    i17 = 54;
                    break;
                } else {
                    i17 = 58;
                    break;
                }
            case 23:
                i17 = 56;
                break;
            case 24:
                i17 = 57;
                break;
            case 26:
                i17 = 60;
                break;
            case 27:
                i17 = 65;
                break;
        }
        com.tencent.mars.xlog.Log.i("AdClickActionHandler", "getIndirectClickAction, originClickType=" + adClickActionInfo.B0 + ", clickAction=" + i17 + ", jumpStyle=" + adClickActionInfo.f162575d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIndirectClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return i17;
    }

    public static int g(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNativeLandingPageSource", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i18 = 2;
        if (i17 == 2) {
            i18 = 16;
        } else if (i17 != 1) {
            i18 = 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNativeLandingPageSource", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return i18;
    }

    public static void q(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpCardDetail", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.tencent.mars.xlog.Log.i("AdClickActionHandler", "jumpCardDetail, cardTpId=" + str + ", cardExt=" + str2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_card_id", str);
        intent.putExtra("key_card_ext", str2);
        intent.putExtra("key_from_scene", 21);
        intent.putExtra("key_stastic_scene", 15);
        j45.l.j(activity, "card", ".ui.CardDetailUI", intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpCardDetail", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public static boolean s(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.modelsns.SnsAdClick snsAdClick, int i17, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        try {
            java.lang.String adInfoLink = snsInfo.getAdInfoLink();
            if (android.text.TextUtils.isEmpty(adInfoLink)) {
                adInfoLink = snsInfo.getAdLink();
            }
            if (android.text.TextUtils.isEmpty(adInfoLink)) {
                com.tencent.mars.xlog.Log.e("AdClickActionHandler", "jumpUpdateWebUI both url is empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                return false;
            }
            t(adInfoLink, snsInfo, snsAdClick, i17, context, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdClickActionHandler", "jumpUpdateWebUI, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpUpdateWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return false;
        }
    }

    public static void t(java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.modelsns.SnsAdClick snsAdClick, int i17, android.content.Context context, boolean z17) {
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.tencent.mars.xlog.Log.i("AdClickActionHandler", "jumpWebUI, url=" + str + ", source=" + i17 + ", snsInfo=" + snsInfo);
        if (android.text.TextUtils.isEmpty(str) || snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        boolean z18 = x51.o1.f452071x ? false : snsInfo.getAdXml().webrightBar == 0;
        if (snsInfo.isAd() && (adInfo = snsInfo.getAdInfo(i17)) != null) {
            intent.putExtra("KsnsViewId", adInfo.viewId);
            if (!z17) {
                str = ca4.z0.b(str, adInfo.uxInfo);
            }
            str = f44.a.e(str);
            ca4.z0.c(intent, adInfo.uxInfo);
        }
        intent.putExtra("KRightBtn", z18);
        android.os.Bundle bundle = new android.os.Bundle();
        if (snsAdClick != null) {
            bundle.putParcelable("KSnsAdTag", snsAdClick);
        }
        bundle.putString("key_snsad_statextstr", snsInfo.getTimeLine().statExtStr);
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("srcUsername", snsInfo.field_userName);
        intent.putExtra("stastic_scene", 15);
        intent.putExtra("KPublisherId", "sns_" + ca4.z0.t0(snsInfo.field_snsId));
        intent.putExtra("pre_username", snsInfo.field_userName);
        intent.putExtra("prePublishId", "sns_" + ca4.z0.t0(snsInfo.field_snsId));
        intent.putExtra("preUsername", snsInfo.field_userName);
        if (i17 == 0) {
            ca4.z0.a(intent, 81);
        } else {
            ca4.z0.a(intent, 82);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWebUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public int c(int i17) {
        com.tencent.mm.modelsns.SnsAdClick snsAdClick;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertSceneToClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i18 = 26;
        if (i17 != 1) {
            if (i17 == 2) {
                i18 = 33;
            } else if (i17 == 3) {
                i18 = 34;
            } else if (i17 == 4) {
                i18 = 35;
            } else if (i17 == 5) {
                i18 = 1001;
            } else if (i17 == 6) {
                i18 = 1002;
            } else if (i17 == 7 || i17 == 8) {
                i18 = 21;
            } else if (i17 == 9) {
                i18 = 37;
            } else if (i17 == 10) {
                i18 = 3;
            } else if (i17 == 11) {
                i18 = 39;
            } else if (i17 == 12) {
                i18 = 40;
            } else if (i17 == 14 || i17 == 13) {
                i18 = 22;
            } else if (i17 == 15) {
                i18 = 44;
            } else if (i17 == 16) {
                i18 = 25;
            } else if (i17 == 17) {
                i18 = 28;
            } else if (i17 == 19) {
                i18 = 45;
            } else if (i17 == 27) {
                i18 = 56;
            } else if (i17 == 18) {
                i18 = 46;
            } else if (i17 == 20) {
                i18 = 47;
            } else if (i17 == 21) {
                i18 = 48;
            } else if (i17 == 22) {
                i18 = 49;
            } else if (i17 == 23) {
                i18 = 50;
            } else if (i17 == 24) {
                i18 = 53;
            } else if (i17 == 25) {
                i18 = 54;
            } else if (i17 == 26) {
                i18 = 55;
            } else if (i17 == 28) {
                i18 = 57;
            } else if (i17 == 29) {
                v64.d dVar = this.f443322o;
                i18 = (dVar == null || (snsAdClick = (com.tencent.mm.modelsns.SnsAdClick) dVar.a("ext_sns_ad_click", null)) == null) ? 1 : snsAdClick.f71469g;
            } else if (i17 == 30) {
                i18 = 58;
            } else if (i17 == 31) {
                i18 = 59;
            } else if (i17 == 32) {
                i18 = 60;
            } else if (i17 == 33) {
                i18 = 61;
            } else if (i17 == 34) {
                i18 = 62;
            } else if (i17 == 35) {
                i18 = 63;
            } else if (i17 == 36) {
                i18 = 64;
            } else if (i17 == 37) {
                i18 = 65;
            } else if (i17 == 38) {
                i18 = 66;
            } else if (i17 == 39) {
                i18 = 67;
            } else if (i17 == 40) {
                i18 = 68;
            } else if (i17 == 42) {
                i18 = 69;
            } else if (i17 == 41) {
                i18 = 70;
            }
            com.tencent.mars.xlog.Log.i("AdClickActionHandler", "convertSceneToClickPos, scene=" + i17 + ", clickPos=" + i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertSceneToClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return i18;
        }
        com.tencent.mars.xlog.Log.i("AdClickActionHandler", "convertSceneToClickPos, scene=" + i17 + ", clickPos=" + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertSceneToClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return i18;
    }

    public final void d(android.content.Intent intent, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        i64.b1 b1Var = this.f443316i;
        if (b1Var == null || intent == null || snsInfo == null) {
            com.tencent.mars.xlog.Log.e("AdClickActionHandler", "snsAdStatistic or intent or info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return;
        }
        if (com.tencent.mm.plugin.sns.ui.bs.j(snsInfo) != 9 && com.tencent.mm.plugin.sns.ui.bs.j(snsInfo) != 19) {
            com.tencent.mars.xlog.Log.i("AdClickActionHandler", "viewType is not TYPE_SIGHT and is not TYPE_AD_SIGHT");
        } else if (snsInfo.getAdXml().adVideoContinuePlay) {
            long g17 = b1Var.g(snsInfo.field_snsId);
            com.tencent.mars.xlog.Log.i("AdClickActionHandler", "snsId = " + snsInfo.field_snsId + ", adSightVideoSeekTime = " + g17);
            intent.putExtra("sns_landing_page_sight_video_seek_time", g17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("determineShouldCanvasOpenVoice", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        if (this.f443320m != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("determineShouldCanvasOpenVoice", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return;
        }
        if (this.f443311d.getAdXml().isSlideFullCard() || this.f443311d.getAdXml().isLookbookCardAd() || this.f443311d.getAdXml().isFlipCardAd() || ca4.m0.Y(this.f443311d)) {
            this.f443320m = 1;
        } else {
            this.f443320m = 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("determineShouldCanvasOpenVoice", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent h(com.tencent.mm.plugin.sns.storage.SnsInfo r22, android.app.Activity r23, int r24, android.view.View r25, int r26) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w64.n.h(com.tencent.mm.plugin.sns.storage.SnsInfo, android.app.Activity, int, android.view.View, int):android.content.Intent");
    }

    public final int i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenAppOrigin", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i17 = this.f443308a;
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenAppOrigin", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return 0;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenAppOrigin", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return 3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenAppOrigin", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        return 2;
    }

    public final void j(com.tencent.mm.storage.e8 e8Var, com.tencent.mm.storage.z3 z3Var, com.tencent.mm.modelsns.SnsAdClick snsAdClick) {
        ca4.k kVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        if (z3Var != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdClickActionHandler", th6.toString());
            }
            if (z3Var.r2()) {
                u94.f.f(this.f443312e, this.f443315h.M);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC);
        u94.f fVar = new u94.f();
        this.f443323p = fVar;
        fVar.g(this.f443312e, this.f443311d, this.f443315h, this.f443309b, e8Var, z3Var, this.f443325r);
        u94.f fVar2 = this.f443323p;
        int i17 = this.f443309b;
        fVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendAddBrandFromTimeline", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (fVar2.f425848c != null && (kVar = fVar2.f425852g) != null && !com.tencent.mm.sdk.platformtools.t8.K0(kVar.f39965a)) {
            android.content.Context context = fVar2.f425848c;
            fVar2.f425851f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), fVar2.f425848c.getString(com.tencent.mm.R.string.j7k), true, true, null);
            com.tencent.mm.modelbase.m1 a17 = com.tencent.mm.plugin.sns.model.y.a(fVar2.f425852g.f39965a, new u94.c(fVar2, i17, null), i17);
            if (a17 instanceof ab0.s) {
                gm0.j1.d().g(a17);
            } else if (a17 instanceof ns.l) {
                gm0.j1.d().g(a17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendAddBrandFromTimeline", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendAddBrandFromTimeline", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAddBrand", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:336|(2:337|338)|(19:346|347|(3:359|360|(1:362))|349|350|351|352|353|354|115|116|81|82|83|84|85|(3:49|(1:53)|54)|55|(1:57))(1:340)|341|342|115|116|81|82|83|84|85|(0)|55|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:336|337|338|(19:346|347|(3:359|360|(1:362))|349|350|351|352|353|354|115|116|81|82|83|84|85|(3:49|(1:53)|54)|55|(1:57))(1:340)|341|342|115|116|81|82|83|84|85|(0)|55|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x085d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x085e, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0941, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0942, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0944, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0945, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x00e9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x08d0 A[Catch: Exception -> 0x08ae, TRY_LEAVE, TryCatch #1 {Exception -> 0x08ae, blocks: (B:93:0x08a5, B:27:0x08b6, B:29:0x08ba, B:31:0x08be, B:33:0x08c8, B:35:0x08d0, B:69:0x08ee, B:72:0x08f8), top: B:92:0x08a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0902 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0974 A[Catch: Exception -> 0x09b5, TryCatch #6 {Exception -> 0x09b5, blocks: (B:47:0x095d, B:49:0x0974, B:51:0x0978, B:53:0x097d, B:54:0x09a6, B:55:0x09a9, B:57:0x09ad), top: B:46:0x095d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x09ad A[Catch: Exception -> 0x09b5, TRY_LEAVE, TryCatch #6 {Exception -> 0x09b5, blocks: (B:47:0x095d, B:49:0x0974, B:51:0x0978, B:53:0x097d, B:54:0x09a6, B:55:0x09a9, B:57:0x09ad), top: B:46:0x095d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x08a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r39v0, types: [w64.n] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v109 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v110 */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v116 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v124 */
    /* JADX WARN: Type inference failed for: r4v125 */
    /* JADX WARN: Type inference failed for: r4v126 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v35, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v36, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v37, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [com.tencent.mm.modelsns.SnsAdClick] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r9v23, types: [n44.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(android.view.View r40) {
        /*
            Method dump skipped, instructions count: 2610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w64.n.k(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l(android.view.View r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, com.tencent.mm.modelsns.SnsAdClick r54, int r55) {
        /*
            Method dump skipped, instructions count: 1935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w64.n.l(android.view.View, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.modelsns.SnsAdClick, int):int");
    }

    public void m(com.tencent.mm.modelsns.SnsAdClick snsAdClick) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleQuickAddFinder", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.tencent.mars.xlog.Log.i("AdClickActionHandler", "onClick handleQuickAddFinder");
        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ui(this.f443315h.finderUsername, new w64.i(this, snsAdClick), 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleQuickAddFinder", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void n(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        p(new w64.c(adClickActionInfo, snsInfo, 0, null, false, 0, false, null, 252, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void o(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        p(new w64.c(adClickActionInfo, snsInfo, i17, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void p(w64.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f443315h = cVar.f443284a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f443311d = cVar.f443285b;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f443315h;
        if (adClickActionInfo != null) {
            this.f443308a = adClickActionInfo.f162569a;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubClickPos", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f443310c = cVar.f443286c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f443313f = cVar.f443287d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForceUseNormalAnim", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceUseNormalAnim", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f443314g = cVar.f443288e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f443320m = cVar.f443289f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUseExternalClickType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUseExternalClickType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f443321n = cVar.f443290g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExt", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdActionClickContext");
        this.f443322o = cVar.f443291h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void r(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.app.Activity activity, int i17, android.view.View view, com.tencent.mm.modelsns.SnsAdClick snsAdClick, int i18) {
        java.lang.String str;
        java.lang.String str2;
        w64.l lVar;
        w64.m mVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpNativeLandingPageUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpNativeLandingPageUI, snsId=");
        sb6.append(snsInfo == null ? 0L : snsInfo.field_snsId);
        com.tencent.mars.xlog.Log.i("AdClickActionHandler", sb6.toString());
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpNativeLandingPageUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            return;
        }
        android.content.Intent h17 = h(snsInfo, activity, i17, view, i18);
        if (h17 != null) {
            boolean z17 = snsInfo.getAdXml().forbiddenCustomAnimation;
            if (this.f443318k == null && (mVar = this.f443327t) != null) {
                this.f443318k = mVar.a();
            }
            w64.x xVar = this.f443318k;
            if (!((xVar == null || xVar.f() == null) ? false : this.f443318k.f().U(this.f443318k, z17)) && (lVar = this.f443319l) != null) {
                lVar.a();
            }
            if (this.f443324q == 2 && this.f443308a == 1) {
                h17.putExtra("sns_landing_pages_auto_download_for_action_btn", true);
            }
            w64.x.g(h17, this.f443318k, z17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(h17);
            java.util.Collections.reverse(arrayList);
            str = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
            str2 = "jumpNativeLandingPageUI";
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler", "jumpNativeLandingPageUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Landroid/app/Activity;ILandroid/view/View;Lcom/tencent/mm/modelsns/SnsAdClick;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler", "jumpNativeLandingPageUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Landroid/app/Activity;ILandroid/view/View;Lcom/tencent/mm/modelsns/SnsAdClick;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            w64.x xVar2 = this.f443318k;
            if (xVar2 == null || xVar2.l() == 0) {
                int i19 = this.f443308a;
                if (i19 == 10) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
                    return;
                }
                if (i19 == 7 || i19 == 8 || i19 == 13 || i19 == 14) {
                    if (!z17) {
                        activity.overridePendingTransition(0, 0);
                    }
                } else if (i19 != 18 && i19 != 22) {
                    activity.overridePendingTransition(0, 0);
                }
            } else if (!z17 && w64.x.h(this.f443318k)) {
                activity.overridePendingTransition(0, 0);
            }
        } else {
            str = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
            str2 = "jumpNativeLandingPageUI";
            s(this.f443311d, snsAdClick, this.f443309b, this.f443312e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void u(android.view.View view, com.tencent.mm.modelsns.SnsAdClick snsAdClick) {
        java.lang.String str;
        java.lang.String str2;
        android.content.Context context;
        int i17;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        java.lang.String str5;
        android.content.Intent intent;
        java.lang.String str6;
        i64.b1 b1Var;
        int i18;
        int i19;
        int i27;
        int i28;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVangogh", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        boolean a17 = m54.v.a();
        android.content.Context context2 = this.f443312e;
        int i29 = this.f443309b;
        if (a17) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f443311d;
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f443315h;
            int i37 = this.f443310c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIntent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            if (snsInfo == null || adClickActionInfo == null || (b1Var = this.f443316i) == null) {
                str = "openVangogh";
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
                context = context2;
                i17 = i29;
                str3 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher";
                str4 = "";
                z17 = true;
                str5 = "SnsAd.LandPageLauncher";
                com.tencent.mars.xlog.Log.e(str5, "the sns info , click info or ad stat is null!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIntent", str3);
                intent = null;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateIntent", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
                str4 = "";
                long j17 = adClickActionInfo.f162602q0;
                java.lang.String str7 = adClickActionInfo.f162604r0;
                str = "openVangogh";
                if (str7 == null) {
                    str7 = str4;
                }
                java.lang.String str8 = adClickActionInfo.f162608t0;
                if (str8 == null) {
                    str8 = str4;
                }
                int i38 = adClickActionInfo.f162569a;
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
                if (i38 == 10) {
                    i19 = 9;
                    i18 = 1;
                } else {
                    i18 = 1;
                    i19 = 1;
                }
                if (i29 != i18) {
                    if (i29 == 2) {
                        i19 = 16;
                    }
                    i27 = i19;
                } else {
                    i27 = 2;
                }
                if (i38 == 10 && i29 == 1) {
                    i17 = i29;
                    i28 = 10;
                } else {
                    i28 = i27;
                    i17 = i29;
                }
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                context = context2;
                kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
                r45.a90 a90Var = timeLine.ContentObj;
                boolean z19 = (a90Var != null && a90Var.f369837e == 15) && timeLine.sightFolded != 1;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
                intent2.putExtra("sns_landing_pages_rawSnsId", snsInfo.field_snsId);
                intent2.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
                intent2.putExtra("sns_landing_pages_pageid", j17);
                intent2.putExtra("sns_landing_page_canvas_dynamicinfo", str7);
                intent2.putExtra("sns_landing_page_canvas_ext_dynamicinfo", str8);
                intent2.putExtra("sns_landig_pages_from_source", i28);
                intent2.putExtra("sns_landing_is_native_sight_ad", z19);
                intent2.putExtra("sns_landing_pages_from_outer_index", i37);
                intent2.putExtra("sns_landing_pages_aid", snsInfo.getAid());
                intent2.putExtra("sns_landing_pages_traceid", snsInfo.getTraceid());
                if (i38 == 8 || i38 == 10) {
                    com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
                    kotlin.jvm.internal.o.f(adXml, "getAdXml(...)");
                    z18 = true;
                    z18 = true;
                    if (adXml.adVideoContinuePlay) {
                        intent2.putExtra("sns_landing_page_sight_video_seek_time", b1Var.g(snsInfo.field_snsId));
                    }
                } else {
                    z18 = true;
                }
                if (i38 == z18) {
                    intent2.putExtra("sns_landing_pages_auto_download_for_action_btn", z18);
                }
                str3 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateIntent", str3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIntent", str3);
                intent = intent2;
                str5 = "SnsAd.LandPageLauncher";
                z17 = z18;
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f443311d;
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = this.f443315h;
            w64.j jVar = new w64.j(this, view, snsAdClick);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launch", str3);
            if (context == null || snsInfo2 == null || adClickActionInfo2 == null || intent == null) {
                com.tencent.mars.xlog.Log.e(str5, "the context, sns info , click info , click data is null!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launch", str3);
            } else {
                android.content.Context context3 = context;
                if (context3 instanceof com.tencent.mm.ui.MMActivity) {
                    try {
                        m54.a aVar = m54.a.f324241a;
                        long j18 = snsInfo2.field_snsId;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putSnsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
                        if (j18 == 0) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putSnsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
                        } else {
                            m54.a.f324242b.put(java.lang.Long.valueOf(j18), snsInfo2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putSnsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
                        }
                        int i39 = i17 == 0 ? z17 : 2;
                        long j19 = adClickActionInfo2.f162602q0;
                        java.lang.String str9 = adClickActionInfo2.f162604r0;
                        java.lang.String str10 = str9 == null ? str4 : str9;
                        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo2.getAdInfo();
                        java.lang.String str11 = adInfo != null ? adInfo.uxInfo : null;
                        if (str11 == null) {
                            str11 = str4;
                        }
                        java.lang.String str12 = adClickActionInfo2.f162608t0;
                        if (str12 == null) {
                            str12 = str4;
                        }
                        str6 = "launch";
                        try {
                            m54.f.f324265a.b((com.tencent.mm.ui.MMActivity) context3, j19, str10, str12, null, str11, i39, intent, jVar);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            com.tencent.mars.xlog.Log.e(str5, "launch canvas: there is an exception " + th.getMessage());
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str3);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        str6 = "launch";
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str3);
                } else {
                    com.tencent.mars.xlog.Log.e(str5, "the context is not AppCompatActivity");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launch", str3);
                }
            }
        } else {
            str = "openVangogh";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler";
            try {
                java.lang.String str13 = this.f443311d.getAdInfo(i29).uxInfo;
                if (context2 instanceof com.tencent.mm.ui.MMActivity) {
                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo3 = this.f443315h;
                    a84.o0.i(adClickActionInfo3.f162602q0, this.f443309b, str13, adClickActionInfo3.f162604r0, (com.tencent.mm.ui.MMActivity) context2, this.f443311d, this.f443316i, this.f443310c, view, this.f443313f, adClickActionInfo3.f162569a, this.f443320m, snsAdClick, null);
                }
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("AdClickActionHandler", "there is something exception");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public final void v(android.content.Context context, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendSubscribeInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.tencent.mm.sdk.platformtools.u3.h(new w64.f(this, context, adClickActionInfo, snsInfo, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendSubscribeInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void w(w64.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdClickActionStateChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        this.f443317j = kVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdClickActionStateChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }

    public void x(w64.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        this.f443318k = xVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
    }
}
