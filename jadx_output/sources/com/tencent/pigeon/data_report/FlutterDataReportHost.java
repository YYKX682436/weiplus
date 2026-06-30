package com.tencent.pigeon.data_report;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJD\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&JL\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&JZ\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000b\u001a\u00020\tH&JR\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&JD\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u000b\u001a\u00020\tH&¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/data_report/FlutterDataReportHost;", "", "", "time", "", "eventId", "", "params", "routeRule", "Lcom/tencent/pigeon/data_report/ReportPageInfo;", "curPageInfo", "sourcePageInfo", "Ljz5/f0;", "reportCustomEvent", "bizId", "", "isBatchReport", "reportCustomCgiEvent", "pageHash", "pageId", "pageName", "", "Lcom/tencent/pigeon/data_report/ReportRouteRule;", "routeRules", "reportStandardPageEvent", "viewId", "reportStandardViewEvent", "reportAllOutEvent", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public interface FlutterDataReportHost {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.data_report.FlutterDataReportHost.Companion INSTANCE = com.tencent.pigeon.data_report.FlutterDataReportHost.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/data_report/FlutterDataReportHost$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/data_report/FlutterDataReportHost;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes16.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.data_report.FlutterDataReportHost.Companion $$INSTANCE = new com.tencent.pigeon.data_report.FlutterDataReportHost.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.data_report.FlutterDataReportHost$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.data_report.FlutterDataReportHost.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.data_report.FlutterDataReportHost flutterDataReportHost, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, flutterDataReportHost, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.data_report.FlutterDataReportHost flutterDataReportHost, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterDataReportHost.reportCustomEvent" + concat, getCodec());
            if (flutterDataReportHost != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.data_report.FlutterDataReportHost$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        long longValue2;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        if (obj2 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj2).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj2).longValue();
                        }
                        long j17 = longValue;
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj3;
                        java.lang.Object obj4 = list.get(2);
                        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        java.util.Map<java.lang.String, ? extends java.lang.Object> map = (java.util.Map) obj4;
                        java.lang.Object obj5 = list.get(3);
                        if (obj5 instanceof java.lang.Integer) {
                            longValue2 = ((java.lang.Number) obj5).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Long");
                            longValue2 = ((java.lang.Long) obj5).longValue();
                        }
                        long j18 = longValue2;
                        java.lang.Object obj6 = list.get(4);
                        kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type com.tencent.pigeon.data_report.ReportPageInfo");
                        com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo = (com.tencent.pigeon.data_report.ReportPageInfo) obj6;
                        java.lang.Object obj7 = list.get(5);
                        kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type com.tencent.pigeon.data_report.ReportPageInfo");
                        try {
                            com.tencent.pigeon.data_report.FlutterDataReportHost.this.reportCustomEvent(j17, str, map, j18, reportPageInfo, (com.tencent.pigeon.data_report.ReportPageInfo) obj7);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.data_report.DatareportPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterDataReportHost.reportCustomCgiEvent" + concat, getCodec());
            if (flutterDataReportHost != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.data_report.FlutterDataReportHost$Companion$setUp$2$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        long longValue2;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        if (obj2 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj2).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj2).longValue();
                        }
                        long j17 = longValue;
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj3;
                        java.lang.Object obj4 = list.get(2);
                        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        java.util.Map<java.lang.String, ? extends java.lang.Object> map = (java.util.Map) obj4;
                        java.lang.Object obj5 = list.get(3);
                        if (obj5 instanceof java.lang.Integer) {
                            longValue2 = ((java.lang.Number) obj5).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Long");
                            longValue2 = ((java.lang.Long) obj5).longValue();
                        }
                        long j18 = longValue2;
                        java.lang.Object obj6 = list.get(4);
                        kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((java.lang.Boolean) obj6).booleanValue();
                        java.lang.Object obj7 = list.get(5);
                        kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type com.tencent.pigeon.data_report.ReportPageInfo");
                        com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo = (com.tencent.pigeon.data_report.ReportPageInfo) obj7;
                        java.lang.Object obj8 = list.get(6);
                        kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type com.tencent.pigeon.data_report.ReportPageInfo");
                        try {
                            com.tencent.pigeon.data_report.FlutterDataReportHost.this.reportCustomCgiEvent(j17, str, map, j18, booleanValue, reportPageInfo, (com.tencent.pigeon.data_report.ReportPageInfo) obj8);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.data_report.DatareportPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterDataReportHost.reportStandardPageEvent" + concat, getCodec());
            if (flutterDataReportHost != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.data_report.FlutterDataReportHost$Companion$setUp$3$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        long longValue2;
                        long longValue3;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        if (obj2 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj2).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj2).longValue();
                        }
                        long j17 = longValue;
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj3;
                        java.lang.Object obj4 = list.get(2);
                        if (obj4 instanceof java.lang.Integer) {
                            longValue2 = ((java.lang.Number) obj4).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                            longValue2 = ((java.lang.Long) obj4).longValue();
                        }
                        java.lang.Object obj5 = list.get(3);
                        if (obj5 instanceof java.lang.Integer) {
                            longValue3 = ((java.lang.Number) obj5).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Long");
                            longValue3 = ((java.lang.Long) obj5).longValue();
                        }
                        long j18 = longValue3;
                        java.lang.Object obj6 = list.get(4);
                        kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str2 = (java.lang.String) obj6;
                        java.lang.Object obj7 = list.get(5);
                        kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        java.util.Map<java.lang.String, ? extends java.lang.Object> map = (java.util.Map) obj7;
                        java.lang.Object obj8 = list.get(6);
                        kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.data_report.ReportRouteRule>");
                        java.util.List<com.tencent.pigeon.data_report.ReportRouteRule> list2 = (java.util.List) obj8;
                        java.lang.Object obj9 = list.get(7);
                        kotlin.jvm.internal.o.e(obj9, "null cannot be cast to non-null type com.tencent.pigeon.data_report.ReportPageInfo");
                        try {
                            com.tencent.pigeon.data_report.FlutterDataReportHost.this.reportStandardPageEvent(j17, str, longValue2, j18, str2, map, list2, (com.tencent.pigeon.data_report.ReportPageInfo) obj9);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.data_report.DatareportPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterDataReportHost.reportStandardViewEvent" + concat, getCodec());
            if (flutterDataReportHost != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.data_report.FlutterDataReportHost$Companion$setUp$4$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        if (obj2 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj2).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj2).longValue();
                        }
                        long j17 = longValue;
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj3;
                        java.lang.Object obj4 = list.get(2);
                        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str2 = (java.lang.String) obj4;
                        java.lang.Object obj5 = list.get(3);
                        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        java.util.Map<java.lang.String, ? extends java.lang.Object> map = (java.util.Map) obj5;
                        java.lang.Object obj6 = list.get(4);
                        kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.data_report.ReportRouteRule>");
                        java.util.List<com.tencent.pigeon.data_report.ReportRouteRule> list2 = (java.util.List) obj6;
                        java.lang.Object obj7 = list.get(5);
                        kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type com.tencent.pigeon.data_report.ReportPageInfo");
                        com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo = (com.tencent.pigeon.data_report.ReportPageInfo) obj7;
                        java.lang.Object obj8 = list.get(6);
                        kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type com.tencent.pigeon.data_report.ReportPageInfo");
                        try {
                            com.tencent.pigeon.data_report.FlutterDataReportHost.this.reportStandardViewEvent(j17, str, str2, map, list2, reportPageInfo, (com.tencent.pigeon.data_report.ReportPageInfo) obj8);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.data_report.DatareportPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterDataReportHost.reportAllOutEvent" + concat, getCodec());
            if (flutterDataReportHost != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.data_report.FlutterDataReportHost$Companion$setUp$5$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        long longValue2;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        if (obj2 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj2).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj2).longValue();
                        }
                        long j17 = longValue;
                        java.lang.Object obj3 = list.get(1);
                        if (obj3 instanceof java.lang.Integer) {
                            longValue2 = ((java.lang.Number) obj3).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                            longValue2 = ((java.lang.Long) obj3).longValue();
                        }
                        long j18 = longValue2;
                        java.lang.Object obj4 = list.get(2);
                        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj4;
                        java.lang.Object obj5 = list.get(3);
                        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str2 = (java.lang.String) obj5;
                        java.lang.Object obj6 = list.get(4);
                        kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        java.util.Map<java.lang.String, ? extends java.lang.Object> map = (java.util.Map) obj6;
                        java.lang.Object obj7 = list.get(5);
                        kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type com.tencent.pigeon.data_report.ReportPageInfo");
                        try {
                            com.tencent.pigeon.data_report.FlutterDataReportHost.this.reportAllOutEvent(j17, j18, str, str2, map, (com.tencent.pigeon.data_report.ReportPageInfo) obj7);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.data_report.DatareportPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
        }
    }

    void reportAllOutEvent(long j17, long j18, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo);

    void reportCustomCgiEvent(long j17, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, long j18, boolean z17, com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo, com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo2);

    void reportCustomEvent(long j17, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, long j18, com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo, com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo2);

    void reportStandardPageEvent(long j17, java.lang.String str, long j18, long j19, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.List<com.tencent.pigeon.data_report.ReportRouteRule> list, com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo);

    void reportStandardViewEvent(long j17, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.List<com.tencent.pigeon.data_report.ReportRouteRule> list, com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo, com.tencent.pigeon.data_report.ReportPageInfo reportPageInfo2);
}
