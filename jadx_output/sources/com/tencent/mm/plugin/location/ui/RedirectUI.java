package com.tencent.mm.plugin.location.ui;

@db5.a(23)
/* loaded from: classes12.dex */
public class RedirectUI extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f144649o = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f144656m;

    /* renamed from: d, reason: collision with root package name */
    public int f144650d = 0;

    /* renamed from: e, reason: collision with root package name */
    public double f144651e = 0.0d;

    /* renamed from: f, reason: collision with root package name */
    public double f144652f = 0.0d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144653g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f144654h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f144655i = "";

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f144657n = new com.tencent.mm.sdk.platformtools.n3();

    public final void K6(android.content.Intent intent, double d17, double d18) {
        if (intent == null) {
            finish();
            return;
        }
        intent.putExtra("kShowshare", getIntent().getBooleanExtra("kShowshare", true));
        intent.putExtra("kimg_path", g83.a.a());
        java.lang.String stringExtra = getIntent().getStringExtra("kPoi_url");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        intent.putExtra("kPoi_url", stringExtra);
        intent.putExtra("map_view_type", getIntent().getIntExtra("map_view_type", 0));
        intent.putExtra("map_indoor_support", getIntent().getIntExtra("map_indoor_support", 0));
        intent.putExtra("kFavInfoLocalId", getIntent().getLongExtra("kFavInfoLocalId", -1L));
        intent.putExtra("kFavCanDel", getIntent().getBooleanExtra("kFavCanDel", true));
        intent.putExtra("kFavShowIconType", getIntent().getIntExtra("kFavShowIconType", 0));
        intent.putExtra("KFavOriginDataId", getIntent().getStringExtra("KFavOriginDataId"));
        intent.putExtra("kFavOriginFavInfoLocalId", getIntent().getLongExtra("kFavOriginFavInfoLocalId", -1L));
        intent.putExtra("kFavCanRemark", getIntent().getBooleanExtra("kFavCanRemark", true));
        intent.putExtra("kwebmap_slat", d17);
        intent.putExtra("kwebmap_lng", d18);
        intent.putExtra("kPoiid", getIntent().getStringExtra("kPoiid"));
        intent.putExtra("KIsFromPoiList", getIntent().getBooleanExtra("KIsFromPoiList", false));
        intent.putExtra("KPoiCategoryTips", getIntent().getStringExtra("KPoiCategoryTips"));
        intent.putExtra("kPoiBusinessHour", getIntent().getStringExtra("kPoiBusinessHour"));
        intent.putExtra("KPoiPhone", getIntent().getStringExtra("KPoiPhone"));
        intent.putExtra("KPoiPriceTips", getIntent().getFloatExtra("KPoiPriceTips", 0.0f));
        intent.putExtra("kBuildingID", getIntent().getStringExtra("kBuildingID"));
        intent.putExtra("kFloorName", getIntent().getStringExtra("kFloorName"));
        intent.putExtra("kPoiName", getIntent().getStringExtra("kPoiName"));
        java.lang.String stringExtra2 = getIntent().getStringExtra("kisUsername");
        intent.putExtra("kisUsername", stringExtra2 != null ? stringExtra2 : "");
        intent.putExtra("map_talker_name", this.f144653g);
        intent.putExtra("KFavLocSigleView", getIntent().getBooleanExtra("KFavLocSigleView", false));
        com.tencent.mm.autogen.events.TalkRoomUitlEvent talkRoomUitlEvent = new com.tencent.mm.autogen.events.TalkRoomUitlEvent();
        talkRoomUitlEvent.f54885g.getClass();
        talkRoomUitlEvent.e();
        int i17 = this.f144650d;
        if (i17 == 6) {
            intent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1L));
            intent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
            int i18 = this.f144654h;
            if (i18 > 0) {
                intent.putExtra("kwebmap_scale", i18);
            }
            intent.putExtra("Kwebmap_locaion", this.f144655i);
            intent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
            startActivityForResult(intent, 3);
            return;
        }
        if (i17 == 1 || i17 == 2 || i17 == 12 || i17 == 13 || i17 == 11 || i17 == 7 || i17 == 14 || i17 == 9 || i17 == 10) {
            intent.putExtra("kMsgId", getIntent().getLongExtra("kMsgId", -1L));
            intent.putExtra("kRemark", getIntent().getStringExtra("kRemark"));
            intent.putExtra("kTags", getIntent().getStringArrayListExtra("kTags"));
            int i19 = this.f144654h;
            if (i19 > 0) {
                intent.putExtra("kwebmap_scale", i19);
            }
            intent.putExtra("Kwebmap_locaion", this.f144655i);
            intent.putExtra("soso_street_view_url", getIntent().getStringExtra("soso_street_view_url"));
            intent.putExtra("key_fav_search_report_obj", getIntent().getByteArrayExtra("key_fav_search_report_obj"));
            startActivityForResult(intent, 3);
            return;
        }
        if (i17 == 0) {
            startActivityForResult(intent, 2);
            return;
        }
        if (i17 == 3) {
            startActivityForResult(intent, 5);
        } else if (i17 == 8) {
            intent.putExtra("KPickPoiLat", d17);
            intent.putExtra("KPickPoiLong", d18);
            startActivityForResult(intent, 6);
        }
    }

    public void L6(double d17, double d18) {
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra("key_from_type");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.location_soso.SoSoProxyUI.class);
        com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer repairerConfigLocationPoiDrawer = new com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer();
        boolean z17 = j62.e.g().c(repairerConfigLocationPoiDrawer) == 1 || bm5.o1.f22719a.h(repairerConfigLocationPoiDrawer) == 1;
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_forward_preview", false);
        if ((((!z17) | (serializableExtra == null)) || !serializableExtra.equals(zy2.o9.f477517e)) && !booleanExtra) {
            intent.addFlags(67108864);
        }
        intent.putExtra("type_tag", getIntent().getIntExtra("type_tag", 0));
        intent.putExtra("key_geo_coder_four_level", getIntent().getBooleanExtra("key_geo_coder_four_level", false));
        intent.putExtra("type_pick_location_btn", getIntent().getIntExtra("type_pick_location_btn", 1));
        intent.putExtra("key_drawer_allow_no_poiid", getIntent().getBooleanExtra("key_drawer_allow_no_poiid", false));
        intent.putExtra("key_drawer_expend", getIntent().getBooleanExtra("key_drawer_expend", false));
        intent.putExtra("key_from_type", getIntent().getSerializableExtra("key_from_type"));
        intent.putExtra("KEY_ENTER_MEDIA_TAB_TYPE", getIntent().getIntExtra("KEY_ENTER_MEDIA_TAB_TYPE", 0));
        intent.putExtra("key_context_id", getIntent().getStringExtra("key_context_id"));
        intent.putExtra("key_from_object_id", getIntent().getLongExtra("key_from_object_id", 0L));
        intent.putExtra("key_enable_flutter_poi", getIntent().getBooleanExtra("key_enable_flutter_poi", false));
        intent.putExtra("poi_from_chat_report_bundle", getIntent().getBundleExtra("poi_from_chat_report_bundle"));
        switch (this.f144650d) {
            case 0:
            case 3:
            case 8:
                com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "ShowConfig", "hidePoiOversea"), 1);
                intent.putExtra("intent_map_key", 2);
                break;
            case 1:
            case 2:
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                intent.putExtra("intent_map_key", 4);
                break;
            case 4:
            case 5:
            default:
                intent = null;
                break;
            case 6:
                java.lang.String stringExtra = getIntent().getStringExtra("fromWhereShare");
                intent.putExtra("intent_map_key", 5);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    intent.putExtra("fromWhereShare", stringExtra);
                    break;
                }
                break;
            case 9:
                intent.putExtra("intent_map_key", 4);
                break;
        }
        if (this.f144650d == 0) {
            intent.putExtra("location_scene", 1);
        }
        if (x51.o1.f452042a) {
            this.f144657n.postDelayed(new za3.x(this, intent, d17, d18), 2000L);
        } else {
            K6(intent, d17, d18);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        com.tencent.mm.pluginsdk.location.LocationIntent locationIntent;
        com.tencent.mm.plugin.location.ui.RedirectUI redirectUI = this;
        int i19 = i18;
        android.content.Intent intent2 = intent;
        com.tencent.mars.xlog.Log.i("MicroMsg.RedirectUI", "onAcvityResult requestCode:" + i17);
        if (i19 != -1) {
            finish();
            return;
        }
        if (intent2 == null) {
            finish();
            return;
        }
        str = "";
        if (i17 == 2) {
            java.lang.String str2 = redirectUI.f144653g;
            com.tencent.mm.pluginsdk.location.LocationIntent locationIntent2 = (com.tencent.mm.pluginsdk.location.LocationIntent) intent2.getParcelableExtra("KLocationIntent");
            com.tencent.mars.xlog.Log.i("MicroMsg.RedirectUI", "locationintent " + locationIntent2.a());
            java.lang.String str3 = locationIntent2.f188746p;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(locationIntent2.f188752v)) {
                str3 = locationIntent2.f188752v;
            }
            com.tencent.mm.autogen.events.PublishLocationEvent publishLocationEvent = new com.tencent.mm.autogen.events.PublishLocationEvent();
            int i27 = redirectUI.f144656m;
            am.xo xoVar = publishLocationEvent.f54630g;
            xoVar.f8388a = i27;
            xoVar.f8389b = locationIntent2.f188737d;
            xoVar.f8390c = locationIntent2.f188738e;
            xoVar.f8391d = locationIntent2.f188739f;
            xoVar.f8392e = locationIntent2.f188740g;
            xoVar.f8393f = locationIntent2.f188741h;
            publishLocationEvent.e();
            y80.p0 p0Var = (y80.p0) ((z80.h0) i95.n0.c(z80.h0.class));
            p0Var.getClass();
            if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendLocation()) != 0) {
                try {
                    y80.q1 q1Var = new y80.q1(str2);
                    q1Var.f459904d = locationIntent2.f188737d;
                    q1Var.f459905e = locationIntent2.f188738e;
                    q1Var.f459906f = locationIntent2.f188739f;
                    java.lang.String str4 = locationIntent2.f188740g;
                    if (str4 == null) {
                        str4 = "";
                    }
                    q1Var.f459907g = str4;
                    java.lang.String str5 = locationIntent2.f188741h;
                    if (str5 == null) {
                        str5 = "";
                    }
                    q1Var.f459908h = str5;
                    java.lang.String str6 = locationIntent2.f188742i;
                    if (str6 == null) {
                        str6 = "";
                    }
                    q1Var.f459909i = str6;
                    if (str3 == null) {
                        str3 = "";
                    }
                    q1Var.f459910j = str3;
                    q1Var.f459911k = locationIntent2.f188747q;
                    java.lang.String str7 = locationIntent2.f188748r;
                    if (str7 == null) {
                        str7 = "";
                    }
                    q1Var.f459912l = str7;
                    java.lang.String str8 = locationIntent2.f188749s;
                    if (str8 == null) {
                        str8 = "";
                    }
                    q1Var.f459913m = str8;
                    java.lang.String str9 = locationIntent2.f188750t;
                    if (str9 == null) {
                        str9 = "";
                    }
                    q1Var.f459914n = str9;
                    q1Var.f459915o = locationIntent2.f188751u;
                    java.lang.String str10 = locationIntent2.f188753w;
                    if (str10 == null) {
                        str10 = "";
                    }
                    q1Var.f459916p = str10;
                    java.lang.String str11 = locationIntent2.f188754x;
                    if (str11 != null) {
                        str = str11;
                    }
                    q1Var.f459917q = str;
                    qi3.b0 Zi = p0Var.Zi(q1Var);
                    p0Var.bj(Zi);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RedirectUI", "new send location done, taskId=" + ((qi3.c) Zi).i());
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RedirectUI", e17, "new send location failed", new java.lang.Object[0]);
                }
                locationIntent = locationIntent2;
            } else {
                double d17 = locationIntent2.f188737d;
                double d18 = locationIntent2.f188738e;
                int i28 = locationIntent2.f188739f;
                java.lang.String str12 = locationIntent2.f188740g;
                java.lang.String str13 = locationIntent2.f188741h;
                java.lang.String str14 = locationIntent2.f188742i;
                boolean z17 = locationIntent2.f188747q;
                java.lang.String str15 = locationIntent2.f188748r;
                java.lang.String str16 = locationIntent2.f188749s;
                java.lang.String str17 = locationIntent2.f188750t;
                float f17 = locationIntent2.f188751u;
                java.lang.String str18 = locationIntent2.f188753w;
                java.lang.String str19 = locationIntent2.f188754x;
                if (str13 == null) {
                    str13 = "";
                }
                if (str15 == null) {
                    str15 = "";
                }
                if (str16 == null) {
                    str16 = "";
                }
                if (str17 == null) {
                    str17 = "";
                }
                locationIntent = locationIntent2;
                java.lang.String str20 = "<msg><location x=\"" + d17 + "\" y=\"" + d18 + "\" scale=\"" + i28 + "\" label=\"" + com.tencent.mm.sdk.platformtools.t8.p(str12) + "\" poiname=\"" + com.tencent.mm.sdk.platformtools.t8.p(str13) + "\" infourl=\"" + com.tencent.mm.sdk.platformtools.t8.p(str14) + "\" maptype=\"0\" poiid=\"" + str3 + "\" isFromPoiList=\"" + z17 + "\" poiCategoryTips=\"" + str15 + "\" poiBusinessHour=\"" + str16 + "\" poiPhone=\"" + str17 + "\" poiPriceTips=\"" + f17 + "\" buildingId=\"" + str18 + "\" floorName=\"" + str19 + "\" /></msg>";
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                mtVar.f7362a = str2;
                mtVar.f7363b = str20;
                mtVar.f7364c = 48;
                mtVar.f7365d = 0;
                sendMsgEvent.e();
            }
            com.tencent.mm.pluginsdk.location.LocationIntent locationIntent3 = locationIntent;
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2004, (float) locationIntent3.f188738e, (float) locationIntent3.f188737d, 0);
            ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
            com.tencent.mm.pluginsdk.ui.tools.p0.a();
            redirectUI = this;
            i19 = i18;
            intent2 = intent;
        } else if (i17 == 5) {
            com.tencent.mm.pluginsdk.location.LocationIntent locationIntent4 = (com.tencent.mm.pluginsdk.location.LocationIntent) intent2.getParcelableExtra("KLocationIntent");
            com.tencent.mars.xlog.Log.i("MicroMsg.RedirectUI", "locationintent " + locationIntent4.a());
            if (locationIntent4.f188744n == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10822, 1, locationIntent4.f188743m, 1);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10822, 1, locationIntent4.f188743m, 0);
            }
            intent2.putExtra("kwebmap_slat", locationIntent4.f188737d);
            intent2.putExtra("kwebmap_lng", locationIntent4.f188738e);
            intent2.putExtra("kwebmap_scale", locationIntent4.f188739f);
            intent2.putExtra("Kwebmap_locaion", locationIntent4.f188740g);
            intent2.putExtra("kTags", intent2.getStringArrayListExtra("kTags"));
            intent2.putExtra("kPoiName", locationIntent4.f188741h.equals("") ? "" : locationIntent4.f188741h);
            intent2.putExtra("kPoiid", locationIntent4.f188746p);
            intent2.putExtra("kNearByPoiid", locationIntent4.f188752v);
            intent2.putExtra("KIsFromPoiList", locationIntent4.f188747q);
            intent2.putExtra("KPoiCategoryTips", locationIntent4.f188748r);
            intent2.putExtra("kPoiBusinessHour", locationIntent4.f188749s);
            intent2.putExtra("KPoiPhone", locationIntent4.f188750t);
            intent2.putExtra("KPoiPriceTips", locationIntent4.f188751u);
        } else if (i17 == 6) {
            com.tencent.mm.pluginsdk.location.LocationIntent locationIntent5 = (com.tencent.mm.pluginsdk.location.LocationIntent) intent2.getParcelableExtra("KLocationIntent");
            com.tencent.mars.xlog.Log.i("MicroMsg.RedirectUI", "locationintent " + locationIntent5.a());
            com.tencent.mm.modelgeo.Addr addr = locationIntent5.f188745o;
            if (addr != null) {
                addr.toString();
            }
            intent2.putExtra("key_pick_addr", locationIntent5.f188745o);
            intent2.putExtra("kPoiid", locationIntent5.f188746p);
        }
        redirectUI.setResult(i19, intent2);
        finish();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.sdk.platformtools.t8.s(this, bundle);
        super.onCreate(bundle);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        if (com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().l(81938, null))).longValue()) * 1000 > 86400000) {
            ((qz.a) ((rz.m) i95.n0.c(rz.m.class))).getClass();
            if (f21.c.f258844f == null) {
                f21.c.f258844f = new f21.c();
            }
            f21.c.f258844f.a();
        }
        int intExtra = getIntent().getIntExtra("map_view_type", -1);
        this.f144650d = intExtra;
        if (intExtra == -1) {
            finish();
        }
        this.f144653g = getIntent().getStringExtra("map_talker_name");
        switch (this.f144650d) {
            case 0:
            case 3:
            case 8:
                getIntent().getStringExtra("map_sender_name");
                getIntent().getIntExtra("view_type_key", 1);
                this.f144656m = getIntent().getIntExtra("key_get_location_type", 0);
                this.f144651e = getIntent().getDoubleExtra("KPickPoiLat", -85.0d);
                double doubleExtra = getIntent().getDoubleExtra("KPickPoiLong", -85.0d);
                this.f144652f = doubleExtra;
                L6(this.f144651e, doubleExtra);
                return;
            case 1:
            case 2:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                this.f144651e = getIntent().getDoubleExtra("kwebmap_slat", -85.0d);
                this.f144652f = getIntent().getDoubleExtra("kwebmap_lng", -1000.0d);
                this.f144654h = getIntent().getIntExtra("kwebmap_scale", 0);
                this.f144655i = getIntent().getStringExtra("Kwebmap_locaion");
                L6(this.f144651e, this.f144652f);
                return;
            case 4:
            case 5:
            default:
                return;
            case 6:
                ua3.a c17 = va3.j0.Ui().c(this.f144653g);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resume try to enter trackRoom ");
                sb6.append(c17 != null);
                com.tencent.mars.xlog.Log.i("MicroMsg.RedirectUI", sb6.toString());
                if (c17 == null) {
                    L6(-1000.0d, -1000.0d);
                    return;
                }
                double d17 = c17.f425972g;
                this.f144651e = d17;
                this.f144652f = c17.f425971f;
                this.f144655i = c17.f425973h;
                com.tencent.mars.xlog.Log.i("MicroMsg.RedirectUI", "resume lat %f lng %f %s member size %d", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(this.f144652f), this.f144655i, java.lang.Integer.valueOf(c17.f425970e.size()));
                this.f144654h = 0;
                L6(this.f144651e, this.f144652f);
                return;
        }
    }
}
