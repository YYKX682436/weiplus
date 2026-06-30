package com.tencent.pigeon.flutter_voip;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH&¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/RouterPluginApi;", "", "Ljz5/f0;", "launchDoubleLinkSettings", "Lcom/tencent/pigeon/flutter_voip/SnsPostLaunchRequest;", "request", "launchSnsPost", "Lcom/tencent/pigeon/flutter_voip/UserProfileLaunchRequest;", "launchUserProfile", "Lcom/tencent/pigeon/flutter_voip/FinderFeedLaunchRequest;", "launchFinderFeed", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface RouterPluginApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip.RouterPluginApi.Companion INSTANCE = com.tencent.pigeon.flutter_voip.RouterPluginApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/RouterPluginApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/flutter_voip/RouterPluginApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.flutter_voip.RouterPluginApi.Companion $$INSTANCE = new com.tencent.pigeon.flutter_voip.RouterPluginApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.flutter_voip.RouterPluginApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.flutter_voip.RouterPluginApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.flutter_voip.RouterPluginApi routerPluginApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, routerPluginApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.flutter_voip.RouterPluginApi routerPluginApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.RouterPluginApi.launchDoubleLinkSettings" + concat, getCodec());
            if (routerPluginApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.RouterPluginApi$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.RouterPluginApi.this.launchDoubleLinkSettings();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.RouterPluginApi.launchSnsPost" + concat, getCodec());
            if (routerPluginApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.RouterPluginApi$Companion$setUp$2$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.flutter_voip.SnsPostLaunchRequest");
                        try {
                            com.tencent.pigeon.flutter_voip.RouterPluginApi.this.launchSnsPost((com.tencent.pigeon.flutter_voip.SnsPostLaunchRequest) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.RouterPluginApi.launchUserProfile" + concat, getCodec());
            if (routerPluginApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.RouterPluginApi$Companion$setUp$3$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.flutter_voip.UserProfileLaunchRequest");
                        try {
                            com.tencent.pigeon.flutter_voip.RouterPluginApi.this.launchUserProfile((com.tencent.pigeon.flutter_voip.UserProfileLaunchRequest) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.RouterPluginApi.launchFinderFeed" + concat, getCodec());
            if (routerPluginApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.RouterPluginApi$Companion$setUp$4$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest");
                        try {
                            com.tencent.pigeon.flutter_voip.RouterPluginApi.this.launchFinderFeed((com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
        }
    }

    void launchDoubleLinkSettings();

    void launchFinderFeed(com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest finderFeedLaunchRequest);

    void launchSnsPost(com.tencent.pigeon.flutter_voip.SnsPostLaunchRequest snsPostLaunchRequest);

    void launchUserProfile(com.tencent.pigeon.flutter_voip.UserProfileLaunchRequest userProfileLaunchRequest);
}
