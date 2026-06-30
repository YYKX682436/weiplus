package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J*\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH&J$\u0010\u0010\u001a\u00020\u00022\u001a\u0010\u000f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0004\u0012\u00020\u00020\fH&¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveNativeRouterApi;", "", "Ljz5/f0;", "openTeenModeInterruptionPage", "", "url", "", "enableShare", "showsTitle", "Lcom/tencent/pigeon/live_common/LiveOpenHalfWebParams;", "halfWebParams", com.tencent.mm.plugin.appbrand.jsapi.o9.NAME, "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/tencent/pigeon/live_common/LiveAddressInfo;", "callback", "openAddressSelectPage", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface LiveNativeRouterApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_common.LiveNativeRouterApi.Companion INSTANCE = com.tencent.pigeon.live_common.LiveNativeRouterApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveNativeRouterApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/live_common/LiveNativeRouterApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.live_common.LiveNativeRouterApi.Companion $$INSTANCE = new com.tencent.pigeon.live_common.LiveNativeRouterApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.live_common.LiveNativeRouterApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.live_common.LiveNativeRouterApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.live_common.LiveNativeRouterApi liveNativeRouterApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, liveNativeRouterApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.live_common.LiveNativeRouterApi liveNativeRouterApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.LiveNativeRouterApi.openTeenModeInterruptionPage" + concat, getCodec());
            if (liveNativeRouterApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.live_common.LiveNativeRouterApi$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.live_common.LiveNativeRouterApi.this.openTeenModeInterruptionPage();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.live_common.LiveCommonLiveNativeRouterPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.LiveNativeRouterApi.openLink" + concat, getCodec());
            if (liveNativeRouterApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.live_common.LiveNativeRouterApi$Companion$setUp$2$1
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
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
                        java.lang.Object obj4 = list.get(2);
                        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            com.tencent.pigeon.live_common.LiveNativeRouterApi.this.openLink(str, booleanValue, ((java.lang.Boolean) obj4).booleanValue(), (com.tencent.pigeon.live_common.LiveOpenHalfWebParams) list.get(3));
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.live_common.LiveCommonLiveNativeRouterPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.LiveNativeRouterApi.openAddressSelectPage" + concat, getCodec());
            if (liveNativeRouterApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.live_common.LiveNativeRouterApi$Companion$setUp$3$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lcom/tencent/pigeon/live_common/LiveAddressInfo;", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.live_common.LiveNativeRouterApi$Companion$setUp$3$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends kotlin.jvm.internal.q implements yz5.l {
                        final /* synthetic */ io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> $reply;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                            super(1);
                            this.$reply = reply;
                        }

                        @Override // yz5.l
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            m292invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m292invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.live_common.LiveCommonLiveNativeRouterPigeonKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.live_common.LiveCommonLiveNativeRouterPigeonKt.wrapResult((com.tencent.pigeon.live_common.LiveAddressInfo) obj);
                                reply2.reply(wrapResult);
                            }
                        }
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        kotlin.jvm.internal.o.g(reply, "reply");
                        com.tencent.pigeon.live_common.LiveNativeRouterApi.this.openAddressSelectPage(new com.tencent.pigeon.live_common.LiveNativeRouterApi$Companion$setUp$3$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
        }
    }

    void openAddressSelectPage(yz5.l lVar);

    void openLink(java.lang.String str, boolean z17, boolean z18, com.tencent.pigeon.live_common.LiveOpenHalfWebParams liveOpenHalfWebParams);

    void openTeenModeInterruptionPage();
}
