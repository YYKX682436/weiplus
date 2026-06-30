package com.tencent.pigeon.status;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/status/StatusProfileFlutterInfoNotifyApi;", "", "notifyBottomWidgetHeight", "", "height", "", "requestDisableProfileScroll", "disable", "bottomPadding", "requestProfileExpand", "expand", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface StatusProfileFlutterInfoNotifyApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi.Companion INSTANCE = com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/status/StatusProfileFlutterInfoNotifyApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/status/StatusProfileFlutterInfoNotifyApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi.Companion $$INSTANCE = new com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi statusProfileFlutterInfoNotifyApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, statusProfileFlutterInfoNotifyApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi statusProfileFlutterInfoNotifyApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.StatusProfileFlutterInfoNotifyApi.notifyBottomWidgetHeight" + concat, getCodec());
            if (statusProfileFlutterInfoNotifyApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Double");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi.this.notifyBottomWidgetHeight(((java.lang.Double) obj2).doubleValue())));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.status.StatusPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.StatusProfileFlutterInfoNotifyApi.requestProfileExpand" + concat, getCodec());
            if (statusProfileFlutterInfoNotifyApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi$Companion$setUp$2$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi.this.requestProfileExpand(((java.lang.Boolean) obj2).booleanValue())));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.status.StatusPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.StatusProfileFlutterInfoNotifyApi.requestDisableProfileScroll" + concat, getCodec());
            if (statusProfileFlutterInfoNotifyApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi$Companion$setUp$3$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Double");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.status.StatusProfileFlutterInfoNotifyApi.this.requestDisableProfileScroll(booleanValue, ((java.lang.Double) obj3).doubleValue())));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.status.StatusPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
        }
    }

    boolean notifyBottomWidgetHeight(double height);

    boolean requestDisableProfileScroll(boolean disable, double bottomPadding);

    boolean requestProfileExpand(boolean expand);
}
