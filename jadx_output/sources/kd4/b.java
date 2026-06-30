package kd4;

/* loaded from: classes4.dex */
public abstract class b {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpProfileEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpProfileEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1
            {
                this.__eventId = -545742041;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsJumpProfileEvent snsJumpProfileEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
                com.tencent.mm.autogen.events.SnsJumpProfileEvent event = snsJumpProfileEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54820g.f6406a;
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineItemClickEventCenter", "jump to profile page username:" + str);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 101);
                intent.putExtra("Contact_User", str);
                yc4.b0.f460839a.e(intent, event);
                com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
                kd4.b.a();
                y7Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$profileJumperListener$1");
                return true;
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1
            {
                this.__eventId = -1390092593;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent snsJumpPermissionSettingEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
                com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent event = snsJumpPermissionSettingEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.bw bwVar = event.f54819g;
                long j17 = bwVar.f6292b;
                java.lang.String str = bwVar.f6291a;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("sns_permission_snsinfo_svr_id", j17);
                intent.putExtra("sns_permission_userName", str);
                intent.putExtra("sns_permission_anim", true);
                intent.putExtra("sns_permission_block_scene", 5);
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0);
                kd4.b.a();
                j45.l.n(null, com.google.android.gms.common.Scopes.PROFILE, Ni == 0 ? ".ui.PermissionSettingUI" : ".ui.PermissionSettingUI2", intent, 11);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$permissionSettingJumperListener$1");
                return true;
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpReportEvent> iListener3 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpReportEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1
            {
                this.__eventId = -1850845616;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsJumpReportEvent snsJumpReportEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
                com.tencent.mm.autogen.events.SnsJumpReportEvent event = snsJumpReportEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.dw dwVar = event.f54821g;
                long j17 = dwVar.f6504b;
                java.lang.String str = dwVar.f6503a;
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineItemClickEventCenter", "expose id " + j17 + ' ' + str);
                if (j62.e.g().l("clicfg_sns_expose_config_switch_android", false, false, true)) {
                    q80.d0 d0Var = new q80.d0();
                    android.os.Bundle bundle = new android.os.Bundle();
                    d0Var.f360649a = "wxalited4df4810a40b1d9ddc0cbea44d263fd9";
                    d0Var.f360651c = "{\"scene\":33}";
                    bundle.putString("k_username", str);
                    bundle.putLong("k_expose_msg_id", j17);
                    d0Var.f360655g = bundle;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimelineItemClickEventCenter", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                    q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                    kd4.b.a();
                    ((com.tencent.mm.feature.lite.i) g0Var).lk(null, d0Var, new kd4.a(event));
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    long j18 = dwVar.f6504b;
                    java.lang.String str2 = dwVar.f6503a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimelineItemClickEventCenter", "expose id " + j18 + ' ' + str2);
                    intent.putExtra("k_expose_msg_id", j18);
                    intent.putExtra("k_username", str2);
                    intent.putExtra("showShare", false);
                    java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
                    kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
                    java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    intent.putExtra("rawUrl", format);
                    kd4.b.a();
                    j45.l.j(null, "webview", ".ui.tools.WebViewUI", intent, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1");
                return true;
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsOtherFeedClickEvent> iListener4 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsOtherFeedClickEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1
            {
                this.__eventId = 323618552;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsOtherFeedClickEvent snsOtherFeedClickEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
                com.tencent.mm.autogen.events.SnsOtherFeedClickEvent event = snsOtherFeedClickEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                am.iw iwVar = event.f54826g;
                com.tencent.mm.plugin.sns.ui.i2 i2Var = iwVar.f6978b;
                android.view.View view = iwVar.f6979c;
                android.content.Context context = view.getContext();
                com.tencent.mm.plugin.sns.model.k4 k4Var = com.tencent.mm.plugin.sns.ui.kw.B;
                if (k4Var == null) {
                    k4Var = new com.tencent.mm.plugin.sns.model.l7(1);
                }
                int i17 = iwVar.f6977a;
                if (i17 == 3 || i17 == 4 || i17 == 5) {
                    com.tencent.mm.plugin.sns.ui.kw.N(context, i2Var, view, k4Var, 0);
                } else if (i17 == 9) {
                    com.tencent.mm.plugin.sns.ui.kw.H(i2Var, context, k4Var);
                } else if (i17 == 10) {
                    com.tencent.mm.plugin.sns.ui.kw.m(i2Var, context, k4Var);
                } else if (i17 == 17) {
                    com.tencent.mm.plugin.sns.ui.kw.j(i2Var, context, k4Var);
                } else if (i17 != 26) {
                    if (i17 != 34) {
                        if (i17 == 41) {
                            com.tencent.mm.plugin.sns.ui.kw.B(context, i2Var);
                        } else if (i17 != 101) {
                            if (i17 != 22) {
                                if (i17 == 23) {
                                    com.tencent.mm.plugin.sns.ui.kw.l(i2Var, context, k4Var);
                                } else if (i17 == 55) {
                                    com.tencent.mm.plugin.sns.ui.kw.F(context, i2Var);
                                } else if (i17 == 56) {
                                    com.tencent.mm.plugin.sns.ui.kw.i(context, i2Var);
                                } else if (i17 != 58) {
                                    if (i17 != 59) {
                                        switch (i17) {
                                            case 12:
                                                com.tencent.mm.plugin.sns.ui.kw.C(context, i2Var, k4Var);
                                                break;
                                            case 13:
                                                com.tencent.mm.plugin.sns.ui.kw.d(context, i2Var, k4Var);
                                                break;
                                            case 14:
                                                com.tencent.mm.plugin.sns.ui.kw.z(i2Var, context, k4Var);
                                                break;
                                            default:
                                                switch (i17) {
                                                    case 28:
                                                        break;
                                                    case 29:
                                                        com.tencent.mm.plugin.sns.ui.kw.v(context, i2Var);
                                                        break;
                                                    case 30:
                                                        com.tencent.mm.plugin.sns.ui.kw.L(context, i2Var, k4Var);
                                                        break;
                                                    default:
                                                        switch (i17) {
                                                            case 36:
                                                                com.tencent.mm.plugin.sns.ui.kw.t(context, i2Var);
                                                                break;
                                                            case 37:
                                                                com.tencent.mm.plugin.sns.ui.kw.q(context, i2Var);
                                                                break;
                                                            case 38:
                                                                com.tencent.mm.plugin.sns.ui.kw.p(context, i2Var);
                                                                break;
                                                            case 39:
                                                                com.tencent.mm.plugin.sns.ui.kw.o(context, i2Var);
                                                                break;
                                                            default:
                                                                switch (i17) {
                                                                    case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                                                                    case 45:
                                                                        break;
                                                                    case 44:
                                                                        com.tencent.mm.plugin.sns.ui.kw.G(context, i2Var);
                                                                        break;
                                                                    case 46:
                                                                    case 51:
                                                                        com.tencent.mm.plugin.sns.ui.kw.D(context, i2Var);
                                                                        break;
                                                                    case 47:
                                                                    case 48:
                                                                        kotlin.jvm.internal.o.d(context);
                                                                        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
                                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSupportTingMsg$default", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
                                                                        je4.g.c(context, timeLineObject, true);
                                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSupportTingMsg$default", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
                                                                        break;
                                                                    case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 52:
                                                                        com.tencent.mm.plugin.sns.ui.kw.M(context, i2Var);
                                                                        break;
                                                                    case 53:
                                                                        com.tencent.mm.plugin.sns.ui.kw.s(context, i2Var);
                                                                        break;
                                                                    default:
                                                                        com.tencent.mm.plugin.sns.ui.kw.N(context, i2Var, view, k4Var, 0);
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                    }
                                    com.tencent.mm.plugin.sns.ui.kw.u(context, i2Var);
                                } else {
                                    com.tencent.mm.plugin.sns.ui.kw.k(i2Var, context, k4Var);
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.kw.n(i2Var, context, k4Var);
                        } else {
                            com.tencent.mm.plugin.sns.ui.kw.w(context, i2Var);
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.kw.r(context, i2Var, null);
                } else {
                    com.tencent.mm.plugin.sns.ui.kw.E(context, i2Var);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$otherFeedClickIListener$1");
                return true;
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFinderPostEvent> iListener5 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFinderPostEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1
            {
                this.__eventId = 1192680940;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsFinderPostEvent snsFinderPostEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                com.tencent.mm.autogen.events.SnsFinderPostEvent event = snsFinderPostEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineItemClickEventCenter", "PhotoTimeLineItem click to post finder");
                am.qv qvVar = event.f54808g;
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = qvVar.f7748c;
                int i17 = qvVar.f7746a;
                android.content.Context context = qvVar.f7747b;
                wa4.d0 d0Var = wa4.d0.f444215d;
                boolean z17 = true;
                if (i17 == 0) {
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                    kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
                    java.lang.String j17 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", snsInfo.localid);
                    n34.h3 h3Var = n34.h3.f334610d;
                    java.util.ArrayList g17 = h3Var.g(j17);
                    if (g17 == null || !((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).uj()) {
                        kotlin.jvm.internal.o.d(context);
                        java.lang.String ContentDesc = timeLine.ContentDesc;
                        kotlin.jvm.internal.o.f(ContentDesc, "ContentDesc");
                        z17 = h3Var.j(context, ContentDesc, snsInfo.field_snsId, snsInfo.localid, j17, true, false);
                    } else {
                        uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
                        kotlin.jvm.internal.o.d(context);
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_maas_entrance", 9);
                        java.lang.String ContentDesc2 = timeLine.ContentDesc;
                        kotlin.jvm.internal.o.f(ContentDesc2, "ContentDesc");
                        ((ez0.i) hVar).wi(context, intent, new com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams(g17, true, true, true, h3Var.f(ContentDesc2, snsInfo.field_snsId, snsInfo.localid, j17)));
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                } else {
                    if (i17 != 2 && i17 != 1) {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine2 = snsInfo.getTimeLine();
                        kotlin.jvm.internal.o.f(timeLine2, "getTimeLine(...)");
                        java.lang.String str = timeLine2.ContentDesc;
                        java.lang.String j18 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", snsInfo.localid);
                        n34.h3 h3Var2 = n34.h3.f334610d;
                        kotlin.jvm.internal.o.d(context);
                        kotlin.jvm.internal.o.d(str);
                        h3Var2.i(context, j18, str, snsInfo.field_snsId, snsInfo.localid, timeLine2.videoTemplate, false, false);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                    z17 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$finderPostListener$1");
                return z17;
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsRepostEvent> iListener6 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsRepostEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1
            {
                this.__eventId = -15715681;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsRepostEvent snsRepostEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1");
                com.tencent.mm.autogen.events.SnsRepostEvent event = snsRepostEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54837g.f8038a;
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineItemClickEventCenter", "localId " + str);
                com.tencent.mm.plugin.sns.model.s5.s(com.tencent.mm.plugin.sns.storage.w2.m(str));
                com.tencent.mm.plugin.sns.model.s5.r(com.tencent.mm.plugin.sns.storage.w2.m(str));
                com.tencent.mm.plugin.sns.model.l4.Nj().d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$snsRepostListener$1");
                return true;
            }
        };
        arrayList.add(iListener);
        arrayList.add(iListener2);
        arrayList.add(iListener3);
        arrayList.add(iListener4);
        arrayList.add(iListener5);
        arrayList.add(iListener6);
    }

    public static final /* synthetic */ android.content.Context a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        return null;
    }
}
