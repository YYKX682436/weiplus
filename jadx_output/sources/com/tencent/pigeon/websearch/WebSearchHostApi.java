package com.tencent.pigeon.websearch;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J:\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/websearch/WebSearchHostApi;", "", "callApi", "", "", "apiName", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface WebSearchHostApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.websearch.WebSearchHostApi.Companion INSTANCE = com.tencent.pigeon.websearch.WebSearchHostApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/websearch/WebSearchHostApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/websearch/WebSearchHostApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.websearch.WebSearchHostApi.Companion $$INSTANCE = new com.tencent.pigeon.websearch.WebSearchHostApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.websearch.WebSearchHostApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.websearch.WebSearchHostApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.websearch.WebSearchHostApi webSearchHostApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, webSearchHostApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.websearch.WebSearchHostApi webSearchHostApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.WebSearchHostApi.callApi" + (messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : ""), getCodec());
            if (webSearchHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.websearch.WebSearchHostApi$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.websearch.WebSearchHostApi.this.callApi((java.lang.String) obj2, (java.util.Map) list.get(1)));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.websearch.WebsearchSearchPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    java.util.Map<java.lang.String, java.lang.Object> callApi(java.lang.String apiName, java.util.Map<java.lang.String, ? extends java.lang.Object> data);
}
