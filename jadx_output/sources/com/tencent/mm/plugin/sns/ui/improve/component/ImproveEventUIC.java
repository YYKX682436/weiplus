package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class ImproveEventUIC extends com.tencent.mm.plugin.sns.ui.improve.component.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f168659d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f168660e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveEventUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f168659d = arrayList;
        final androidx.lifecycle.y lifecycleOwner = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpProfileEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpProfileEvent>(lifecycleOwner) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1
            {
                this.__eventId = -545742041;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsJumpProfileEvent snsJumpProfileEvent) {
                boolean z17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                com.tencent.mm.autogen.events.SnsJumpProfileEvent event = snsJumpProfileEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC improveEventUIC = com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this;
                if (improveEventUIC.isActive()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    java.lang.String str = event.f54820g.f6406a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.EventUIC", "jump to profile page username:" + str);
                    android.content.Intent intent = new android.content.Intent();
                    yc4.b0.f460839a.e(intent, event);
                    intent.putExtra("CONTACT_INFO_UI_SOURCE", 101);
                    intent.putExtra("Contact_User", str);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, improveEventUIC.getContext());
                    ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ni(12076, kotlin.jvm.internal.o.b(str, c01.z1.r()) ? "BrowseMyAlbumTime" : "BrowseOtherAlbumTime");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$profileJumpImpl", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                    z17 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$profileJumperListener$1");
                return z17;
            }
        };
        final androidx.lifecycle.y lifecycleOwner2 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent>(lifecycleOwner2) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1
            {
                this.__eventId = -1390092593;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent snsJumpPermissionSettingEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent event = snsJumpPermissionSettingEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC improveEventUIC = com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this;
                boolean z17 = false;
                if (improveEventUIC.isActive()) {
                    am.bw bwVar = event.f54819g;
                    long j17 = bwVar.f6292b;
                    java.lang.String str = bwVar.f6291a;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("sns_permission_snsinfo_svr_id", j17);
                    intent.putExtra("sns_permission_userName", str);
                    intent.putExtra("sns_permission_anim", true);
                    intent.putExtra("sns_permission_block_scene", 5);
                    j45.l.n(improveEventUIC.getContext(), com.google.android.gms.common.Scopes.PROFILE, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0) == 0 ? ".ui.PermissionSettingUI" : ".ui.PermissionSettingUI2", intent, 11);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$permissionSettingJumperListener$1");
                return z17;
            }
        };
        final androidx.lifecycle.y lifecycleOwner3 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpReportEvent> iListener3 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsJumpReportEvent>(lifecycleOwner3) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1
            {
                this.__eventId = -1850845616;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsJumpReportEvent snsJumpReportEvent) {
                boolean z17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                com.tencent.mm.autogen.events.SnsJumpReportEvent event = snsJumpReportEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC improveEventUIC = com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this;
                boolean z18 = false;
                if (improveEventUIC.isActive()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleFeedReport", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleFeedReport", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    am.dw dwVar = event.f54821g;
                    long j17 = dwVar.f6504b;
                    java.lang.String str = dwVar.f6503a;
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String t07 = ca4.z0.t0(j17);
                    kotlin.jvm.internal.o.f(t07, "longToString(...)");
                    ((zy1.f) sVar).Di(12076, "ExposeFeedCount", t07);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.EventUIC", "expose id " + j17 + ' ' + str);
                    if (j62.e.g().l("clicfg_sns_expose_config_switch_android", false, false, true)) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                        bundle.putString("query", "{\"scene\":33}");
                        bundle2.putString("k_username", str);
                        bundle2.putLong("k_expose_msg_id", j17);
                        bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.EventUIC", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(improveEventUIC.getActivity(), bundle, true, false, new com.tencent.mm.plugin.sns.ui.improve.component.w(j17, str, improveEventUIC));
                        z17 = true;
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("k_expose_msg_id", j17);
                        intent.putExtra("k_username", str);
                        intent.putExtra("showShare", false);
                        java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
                        kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
                        z17 = true;
                        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                        intent.putExtra("rawUrl", format);
                        j45.l.j(improveEventUIC.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleFeedReport", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleFeedReport", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                    z18 = z17;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$reportJumperListener$1");
                return z18;
            }
        };
        final androidx.lifecycle.y lifecycleOwner4 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsOtherFeedClickEvent> iListener4 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsOtherFeedClickEvent>(lifecycleOwner4) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1
            {
                this.__eventId = 323618552;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsOtherFeedClickEvent snsOtherFeedClickEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                com.tencent.mm.autogen.events.SnsOtherFeedClickEvent event = snsOtherFeedClickEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                boolean z17 = false;
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$jumpLinkDetailUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpLinkDetailUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
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
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpLinkDetailUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$jumpLinkDetailUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$otherFeedClickIListener$1");
                return z17;
            }
        };
        final androidx.lifecycle.y lifecycleOwner5 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFinderPostEvent> iListener5 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFinderPostEvent>(lifecycleOwner5) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1
            {
                this.__eventId = 1192680940;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsFinderPostEvent snsFinderPostEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                com.tencent.mm.autogen.events.SnsFinderPostEvent event = snsFinderPostEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                boolean z17 = false;
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.EventUIC", "PhotoTimeLineItem click to post finder");
                    am.qv qvVar = event.f54808g;
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = qvVar.f7748c;
                    int i17 = qvVar.f7746a;
                    android.content.Context context = qvVar.f7747b;
                    wa4.d0 d0Var = wa4.d0.f444215d;
                    boolean z18 = true;
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
                            z17 = true;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                    } else {
                        if (i17 != 2 && i17 != 1) {
                            z18 = false;
                        }
                        if (z18) {
                            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine2 = snsInfo.getTimeLine();
                            kotlin.jvm.internal.o.f(timeLine2, "getTimeLine(...)");
                            java.lang.String str = timeLine2.ContentDesc;
                            java.lang.String j18 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", snsInfo.localid);
                            n34.h3 h3Var2 = n34.h3.f334610d;
                            kotlin.jvm.internal.o.d(context);
                            kotlin.jvm.internal.o.d(str);
                            h3Var2.i(context, j18, str, snsInfo.field_snsId, snsInfo.localid, timeLine2.videoTemplate, false, false);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$finderPostListener$1");
                return z17;
            }
        };
        final androidx.lifecycle.y lifecycleOwner6 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsRepostEvent> iListener6 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsRepostEvent>(lifecycleOwner6) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1
            {
                this.__eventId = -15715681;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsRepostEvent snsRepostEvent) {
                boolean z17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                com.tencent.mm.autogen.events.SnsRepostEvent event = snsRepostEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    java.lang.String str = event.f54837g.f8038a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.EventUIC", "localId " + str);
                    com.tencent.mm.plugin.sns.model.s5.s(com.tencent.mm.plugin.sns.storage.w2.m(str));
                    com.tencent.mm.plugin.sns.model.s5.r(com.tencent.mm.plugin.sns.storage.w2.m(str));
                    com.tencent.mm.plugin.sns.model.l4.Nj().d();
                    androidx.appcompat.app.AppCompatActivity activity2 = activity;
                    kotlin.jvm.internal.o.g(activity2, "activity");
                    ((com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.class)).refreshError();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                    z17 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsRepostListener$1");
                return z17;
            }
        };
        final androidx.lifecycle.y lifecycleOwner7 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUploadPostDoneEvent> iListener7 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUploadPostDoneEvent>(lifecycleOwner7) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1
            {
                this.__eventId = 497662095;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsUploadPostDoneEvent snsUploadPostDoneEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                com.tencent.mm.autogen.events.SnsUploadPostDoneEvent event = snsUploadPostDoneEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Bi(12076, "PostFeedCount", 1);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsUploadPostDoneListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner8 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsExposeItemNotifyEvent> iListener8 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsExposeItemNotifyEvent>(lifecycleOwner8) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1
            {
                this.__eventId = 70537970;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsExposeItemNotifyEvent snsExposeItemNotifyEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1");
                com.tencent.mm.autogen.events.SnsExposeItemNotifyEvent event = snsExposeItemNotifyEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsExposeItemNotifyListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner9 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent> iListener9 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent>(lifecycleOwner9) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1
            {
                this.__eventId = -1614598524;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent event = snsFavFeedForDataReportEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String snsId = event.f54806g.f7579a;
                    kotlin.jvm.internal.o.f(snsId, "snsId");
                    ((zy1.f) sVar).Di(12076, "FavFeedCount", snsId);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsFavFeedForDataReportListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner10 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsPermissionNotifyEvent> iListener10 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsPermissionNotifyEvent>(lifecycleOwner10) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1
            {
                this.__eventId = 26482458;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                com.tencent.mm.autogen.events.SnsPermissionNotifyEvent event = snsPermissionNotifyEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    am.jw jwVar = event.f54827g;
                    java.lang.String str = jwVar.f7103b;
                    if (jwVar.f7102a) {
                        dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                        kotlin.jvm.internal.o.d(str);
                        ((zy1.f) sVar).Di(12076, "BlackListFriendCount", str);
                    } else {
                        dy1.s sVar2 = (dy1.s) i95.n0.c(dy1.s.class);
                        kotlin.jvm.internal.o.d(str);
                        ((zy1.f) sVar2).Di(12076, "OutsiderFriendCount", str);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsPermissionNotifyListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner11 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NewNotificationEvent> iListener11 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NewNotificationEvent>(lifecycleOwner11) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1
            {
                this.__eventId = -1755589409;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NewNotificationEvent newNotificationEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                com.tencent.mm.autogen.events.NewNotificationEvent event = newNotificationEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "HasNewChatMsgWhenExit", java.lang.Boolean.TRUE);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$newNotificationListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner12 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsForwardFeedToSnsForDataReportEvent> iListener12 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsForwardFeedToSnsForDataReportEvent>(lifecycleOwner12) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1
            {
                this.__eventId = -374645387;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsForwardFeedToSnsForDataReportEvent snsForwardFeedToSnsForDataReportEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                com.tencent.mm.autogen.events.SnsForwardFeedToSnsForDataReportEvent event = snsForwardFeedToSnsForDataReportEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String snsId = event.f54813g.f8223a;
                    kotlin.jvm.internal.o.f(snsId, "snsId");
                    ((zy1.f) sVar).Di(12076, "ForwardFeedIdCount", snsId);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSnsForDataReportListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner13 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent> iListener13 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent>(lifecycleOwner13) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1
            {
                this.__eventId = 1100082729;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent snsForwardFeedToSingleChatForDataReportEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent event = snsForwardFeedToSingleChatForDataReportEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String snsId = event.f54812g.f8139a;
                    kotlin.jvm.internal.o.f(snsId, "snsId");
                    ((zy1.f) sVar).Di(12076, "ForwardToSingleChatFeedIdCount", snsId);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToSingleChatForDataReportListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner14 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent> iListener14 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent>(lifecycleOwner14) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1
            {
                this.__eventId = 1078309244;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent snsForwardFeedToChatRoomForDataReportEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent event = snsForwardFeedToChatRoomForDataReportEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
                    java.lang.String snsId = event.f54811g.f8037a;
                    kotlin.jvm.internal.o.f(snsId, "snsId");
                    ((zy1.f) sVar).Di(12076, "ForwardToChatRoomFeedIdCount", snsId);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsForwardFeedToChatRoomForDataReportListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner15 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent> iListener15 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent>(lifecycleOwner15) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1
            {
                this.__eventId = -1833188841;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent snsAdLongVideoBrowseStatusChangedForDataReportEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                com.tencent.mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent event = snsAdLongVideoBrowseStatusChangedForDataReportEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ni(12076, "BrowseAdLongVideoTime");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$snsAdLongVideoBrowseStatusChangedForDataReportListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner16 = getLifecycleOwner();
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent> iListener16 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent>(lifecycleOwner16) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1
            {
                this.__eventId = 1179123103;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent activeStatusChangedForDataReportEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent activeStatusEvent = activeStatusChangedForDataReportEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                kotlin.jvm.internal.o.g(activeStatusEvent, "activeStatusEvent");
                if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.this.isActive()) {
                    am.e eVar = activeStatusEvent.f53965g;
                    boolean z17 = eVar.f6510a;
                    java.lang.String str = eVar.f6511b;
                    kotlin.jvm.internal.o.d(str);
                    java.util.Locale locale = java.util.Locale.getDefault();
                    kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                    java.lang.String lowerCase = str.toLowerCase(locale);
                    kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                    if (r26.n0.L(lowerCase, "sns", 0, false, 6, null) >= 0) {
                        if (z17) {
                            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BackGroundTime");
                        } else {
                            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ni(12076, "BackGroundTime");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$activeStatusChangedForDataReportListener$1");
                return false;
            }
        };
        arrayList.add(iListener);
        arrayList.add(iListener2);
        arrayList.add(iListener3);
        arrayList.add(iListener4);
        arrayList.add(iListener5);
        arrayList.add(iListener6);
        arrayList.add(iListener7);
        arrayList.add(iListener8);
        arrayList.add(iListener9);
        arrayList.add(iListener10);
        arrayList.add(iListener11);
        arrayList.add(iListener12);
        arrayList.add(iListener13);
        arrayList.add(iListener14);
        arrayList.add(iListener15);
        arrayList.add(iListener16);
        this.f168660e = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.x(this));
    }

    public final com.tencent.mm.plugin.sns.ui.listener.c O6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        com.tencent.mm.plugin.sns.ui.listener.c cVar = (com.tencent.mm.plugin.sns.ui.listener.c) ((jz5.n) this.f168660e).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnMenuItemSelectedListener", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        return cVar;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        java.util.Iterator it = this.f168659d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.sdk.event.IListener) it.next()).alive();
        }
        O6().b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        java.util.Iterator it = this.f168659d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.sdk.event.IListener) it.next()).dead();
        }
        O6().r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
    }
}
