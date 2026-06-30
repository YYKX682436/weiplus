package com.tencent.pigeon.mega_video;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 )2\u00020\u0001:\u0001)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&J.\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000eH&J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\nH&J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\nH&J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\nH&J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\nH&J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&J,\u0010\"\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 H&J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0002H&J#\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\nH&¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\nH&¨\u0006*À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/mega_video/MegaVideoNativeApi;", "", "", "checkroomTicket", "", "openParamsBytes", "Ljz5/f0;", "openFeedPlayerDetail", "ticket", "openWatchLaterList", "", "type", "Lcom/tencent/pigeon/mega_video/MegaVideoFeedInfo;", "feed", "", "params", "openKitchen", "orientation", "setOnceOrientation", "", "isHandled", "didGetGestureEvent", "playSessionId", "commentscene", "updatePlaySessionId", "playerId", "minimize", "showSharePanel", "Lcom/tencent/pigeon/mega_video/MegaMainFeedListContext;", "getInitMainFeedListContext", "showLastExitFeedHint", "starContext", "Lcom/tencent/pigeon/mega_video/LVSnapshotInfo;", "snapshotInfo", "markStar", dm.i4.COL_ID, "updateStarInfo", "starId", "isStarred", "(Ljava/lang/String;J)Ljava/lang/Boolean;", "removeStar", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface MegaVideoNativeApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mega_video.MegaVideoNativeApi.Companion INSTANCE = com.tencent.pigeon.mega_video.MegaVideoNativeApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/mega_video/MegaVideoNativeApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/mega_video/MegaVideoNativeApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoNativeApi.Companion $$INSTANCE = new com.tencent.pigeon.mega_video.MegaVideoNativeApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.mega_video.MegaVideoNativeApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.mega_video.MegaVideoNativeApi megaVideoNativeApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, megaVideoNativeApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.mega_video.MegaVideoNativeApi megaVideoNativeApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.openFeedPlayerDetail" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj2;
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.ByteArray");
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.openFeedPlayerDetail(str, (byte[]) obj3);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.openWatchLaterList" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$2$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.openWatchLaterList((java.lang.String) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.openKitchen" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$3$1
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
                        com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo = (com.tencent.pigeon.mega_video.MegaVideoFeedInfo) list.get(1);
                        java.lang.Object obj3 = list.get(2);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.openKitchen(longValue, megaVideoFeedInfo, (java.util.Map) obj3);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.setOnceOrientation" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$4$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        if (obj2 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj2).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj2).longValue();
                        }
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.setOnceOrientation(longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.didGetGestureEvent" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$5$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.didGetGestureEvent(((java.lang.Boolean) obj2).booleanValue());
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.updatePlaySessionId" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$6$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj2;
                        java.lang.Object obj3 = list.get(1);
                        if (obj3 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj3).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj3).longValue();
                        }
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.updatePlaySessionId(str, longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel7 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.minimize" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel7.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$7$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        if (obj2 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj2).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj2).longValue();
                        }
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.minimize(longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel8 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.showSharePanel" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel8.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$8$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.mega_video.MegaVideoFeedInfo");
                        com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo = (com.tencent.pigeon.mega_video.MegaVideoFeedInfo) obj2;
                        java.lang.Object obj3 = list.get(1);
                        if (obj3 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj3).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj3).longValue();
                        }
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.showSharePanel(megaVideoFeedInfo, longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel9 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.getInitMainFeedListContext" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel9.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$9$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.getInitMainFeedListContext());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel10 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.showLastExitFeedHint" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel10.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$10$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.mega_video.MegaVideoFeedInfo");
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.showLastExitFeedHint((com.tencent.pigeon.mega_video.MegaVideoFeedInfo) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel11 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.markStar" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel11.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$11$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.mega_video.MegaVideoFeedInfo");
                        com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo = (com.tencent.pigeon.mega_video.MegaVideoFeedInfo) obj2;
                        byte[] bArr = (byte[]) list.get(1);
                        java.lang.Object obj3 = list.get(2);
                        if (obj3 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj3).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj3).longValue();
                        }
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.markStar(megaVideoFeedInfo, bArr, longValue, (com.tencent.pigeon.mega_video.LVSnapshotInfo) list.get(3));
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel12 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.updateStarInfo" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel12.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$12$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.updateStarInfo((java.lang.String) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel13 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.isStarred" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel13.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$13$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.String str = (java.lang.String) list.get(0);
                        java.lang.Object obj2 = list.get(1);
                        if (obj2 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj2).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj2).longValue();
                        }
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.isStarred(str, longValue));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel14 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MegaVideoNativeApi.removeStar" + concat, getCodec());
            if (megaVideoNativeApi != null) {
                basicMessageChannel14.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mega_video.MegaVideoNativeApi$Companion$setUp$14$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.String str = (java.lang.String) list.get(0);
                        java.lang.Object obj2 = list.get(1);
                        if (obj2 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj2).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj2).longValue();
                        }
                        try {
                            com.tencent.pigeon.mega_video.MegaVideoNativeApi.this.removeStar(str, longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mega_video.MegaVideoNativePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
        }
    }

    void didGetGestureEvent(boolean z17);

    com.tencent.pigeon.mega_video.MegaMainFeedListContext getInitMainFeedListContext();

    java.lang.Boolean isStarred(java.lang.String starId, long commentscene);

    void markStar(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo, byte[] bArr, long j17, com.tencent.pigeon.mega_video.LVSnapshotInfo lVSnapshotInfo);

    void minimize(long j17);

    void openFeedPlayerDetail(java.lang.String str, byte[] bArr);

    void openKitchen(long j17, com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo, java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    void openWatchLaterList(java.lang.String str);

    void removeStar(java.lang.String str, long j17);

    void setOnceOrientation(long j17);

    void showLastExitFeedHint(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo);

    void showSharePanel(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo, long j17);

    void updatePlaySessionId(java.lang.String str, long j17);

    void updateStarInfo(java.lang.String str);
}
