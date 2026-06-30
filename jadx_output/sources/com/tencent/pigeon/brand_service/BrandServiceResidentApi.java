package com.tencent.pigeon.brand_service;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J,\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004H&J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u0002H&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/brand_service/BrandServiceResidentApi;", "", "", "userName", "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/tencent/pigeon/brand_service/BSContactInfo;", "Ljz5/f0;", "callback", "getContactInfo", dm.i4.COL_USERNAME, "scopeId", "Lcom/tencent/pigeon/brand_service/BrsResidentTemplateMsgScopeItem;", "getTemplateMsgScopeItem", "Lcom/tencent/pigeon/brand_service/BrsResidentTemplateMsgScope;", "getTemplateMsgScope", "", "checkAndShowPushPermissionTipsDialog", "Lcom/tencent/pigeon/brand_service/BrsResidentStrategyConfig;", "getStrategyConfig", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface BrandServiceResidentApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.brand_service.BrandServiceResidentApi.Companion INSTANCE = com.tencent.pigeon.brand_service.BrandServiceResidentApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/brand_service/BrandServiceResidentApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/brand_service/BrandServiceResidentApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.brand_service.BrandServiceResidentApi.Companion $$INSTANCE = new com.tencent.pigeon.brand_service.BrandServiceResidentApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.brand_service.BrandServiceResidentApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.brand_service.BrandServiceResidentApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.brand_service.BrandServiceResidentApi brandServiceResidentApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, brandServiceResidentApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.brand_service.BrandServiceResidentApi brandServiceResidentApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BrandServiceResidentApi.getContactInfo" + concat, getCodec());
            if (brandServiceResidentApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.brand_service.BrandServiceResidentApi$Companion$setUp$1$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lcom/tencent/pigeon/brand_service/BSContactInfo;", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.brand_service.BrandServiceResidentApi$Companion$setUp$1$1$1, reason: invalid class name */
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
                            m229invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m229invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.brand_service.BrandServiceResidentPigeonKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.brand_service.BrandServiceResidentPigeonKt.wrapResult((com.tencent.pigeon.brand_service.BSContactInfo) obj);
                                reply2.reply(wrapResult);
                            }
                        }
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        com.tencent.pigeon.brand_service.BrandServiceResidentApi.this.getContactInfo((java.lang.String) obj2, new com.tencent.pigeon.brand_service.BrandServiceResidentApi$Companion$setUp$1$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BrandServiceResidentApi.getTemplateMsgScopeItem" + concat, getCodec());
            if (brandServiceResidentApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.brand_service.BrandServiceResidentApi$Companion$setUp$2$1
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
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.brand_service.BrandServiceResidentApi.this.getTemplateMsgScopeItem(str, (java.lang.String) obj3));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.brand_service.BrandServiceResidentPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BrandServiceResidentApi.getTemplateMsgScope" + concat, getCodec());
            if (brandServiceResidentApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.brand_service.BrandServiceResidentApi$Companion$setUp$3$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.brand_service.BrandServiceResidentApi.this.getTemplateMsgScope((java.lang.String) obj2));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.brand_service.BrandServiceResidentPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BrandServiceResidentApi.checkAndShowPushPermissionTipsDialog" + concat, getCodec());
            if (brandServiceResidentApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.brand_service.BrandServiceResidentApi$Companion$setUp$4$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.brand_service.BrandServiceResidentApi.this.checkAndShowPushPermissionTipsDialog()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.brand_service.BrandServiceResidentPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BrandServiceResidentApi.getStrategyConfig" + concat, getCodec());
            if (brandServiceResidentApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.brand_service.BrandServiceResidentApi$Companion$setUp$5$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.brand_service.BrandServiceResidentApi.this.getStrategyConfig());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.brand_service.BrandServiceResidentPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
        }
    }

    boolean checkAndShowPushPermissionTipsDialog();

    void getContactInfo(java.lang.String str, yz5.l lVar);

    com.tencent.pigeon.brand_service.BrsResidentStrategyConfig getStrategyConfig();

    com.tencent.pigeon.brand_service.BrsResidentTemplateMsgScope getTemplateMsgScope(java.lang.String username);

    com.tencent.pigeon.brand_service.BrsResidentTemplateMsgScopeItem getTemplateMsgScopeItem(java.lang.String username, java.lang.String scopeId);
}
