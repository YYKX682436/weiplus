package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J*\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004H&J`\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014H&JV\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014H&¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveFrontEndAdapterApi;", "", "", "appID", "Lkotlin/Function1;", "Lkotlin/Result;", "", "Ljz5/f0;", "callback", "isFakeNativeMiniApp", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "sceneNote", "Lcom/tencent/pigeon/live_common/LiveMiniAppType;", "pageType", "Lcom/tencent/pigeon/live_common/LiveOpenMiniAppAnimationType;", "animationType", "enableTapExpand", "enableDragExpand", "", "nativeExtra", "openMiniApp", "openAddToCartMiniApp", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface LiveFrontEndAdapterApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_common.LiveFrontEndAdapterApi.Companion INSTANCE = com.tencent.pigeon.live_common.LiveFrontEndAdapterApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveFrontEndAdapterApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/live_common/LiveFrontEndAdapterApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.live_common.LiveFrontEndAdapterApi.Companion $$INSTANCE = new com.tencent.pigeon.live_common.LiveFrontEndAdapterApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.live_common.LiveFrontEndAdapterApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.live_common.LiveFrontEndAdapterApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.live_common.LiveFrontEndAdapterApi liveFrontEndAdapterApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, liveFrontEndAdapterApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.live_common.LiveFrontEndAdapterApi liveFrontEndAdapterApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.LiveFrontEndAdapterApi.isFakeNativeMiniApp" + concat, getCodec());
            if (liveFrontEndAdapterApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.live_common.LiveFrontEndAdapterApi$Companion$setUp$1$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.live_common.LiveFrontEndAdapterApi$Companion$setUp$1$1$1, reason: invalid class name */
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
                            m286invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m286invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.live_common.LiveCommonLiveFrontEndAdapterPigeonKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.live_common.LiveCommonLiveFrontEndAdapterPigeonKt.wrapResult((java.lang.Boolean) obj);
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
                        com.tencent.pigeon.live_common.LiveFrontEndAdapterApi.this.isFakeNativeMiniApp((java.lang.String) obj2, new com.tencent.pigeon.live_common.LiveFrontEndAdapterApi$Companion$setUp$1$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.LiveFrontEndAdapterApi.openMiniApp" + concat, getCodec());
            if (liveFrontEndAdapterApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.live_common.LiveFrontEndAdapterApi$Companion$setUp$2$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        com.tencent.pigeon.live_common.LiveOpenMiniAppAnimationType ofRaw;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj2;
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str2 = (java.lang.String) obj3;
                        java.lang.Object obj4 = list.get(2);
                        if (obj4 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj4).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj4).longValue();
                        }
                        long j17 = longValue;
                        java.lang.String str3 = (java.lang.String) list.get(3);
                        com.tencent.pigeon.live_common.LiveMiniAppType.Companion companion = com.tencent.pigeon.live_common.LiveMiniAppType.INSTANCE;
                        java.lang.Object obj5 = list.get(4);
                        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
                        com.tencent.pigeon.live_common.LiveMiniAppType ofRaw2 = companion.ofRaw(((java.lang.Integer) obj5).intValue());
                        kotlin.jvm.internal.o.d(ofRaw2);
                        if (list.get(5) == null) {
                            ofRaw = null;
                        } else {
                            com.tencent.pigeon.live_common.LiveOpenMiniAppAnimationType.Companion companion2 = com.tencent.pigeon.live_common.LiveOpenMiniAppAnimationType.INSTANCE;
                            java.lang.Object obj6 = list.get(5);
                            kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Int");
                            ofRaw = companion2.ofRaw(((java.lang.Integer) obj6).intValue());
                        }
                        java.lang.Object obj7 = list.get(6);
                        kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((java.lang.Boolean) obj7).booleanValue();
                        java.lang.Object obj8 = list.get(7);
                        kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue2 = ((java.lang.Boolean) obj8).booleanValue();
                        java.lang.Object obj9 = list.get(8);
                        kotlin.jvm.internal.o.e(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        try {
                            com.tencent.pigeon.live_common.LiveFrontEndAdapterApi.this.openMiniApp(str, str2, j17, str3, ofRaw2, ofRaw, booleanValue, booleanValue2, (java.util.Map) obj9);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.live_common.LiveCommonLiveFrontEndAdapterPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.LiveFrontEndAdapterApi.openAddToCartMiniApp" + concat, getCodec());
            if (liveFrontEndAdapterApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.live_common.LiveFrontEndAdapterApi$Companion$setUp$3$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        com.tencent.pigeon.live_common.LiveOpenMiniAppAnimationType ofRaw;
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj2;
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str2 = (java.lang.String) obj3;
                        java.lang.Object obj4 = list.get(2);
                        if (obj4 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj4).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj4).longValue();
                        }
                        long j17 = longValue;
                        com.tencent.pigeon.live_common.LiveMiniAppType.Companion companion = com.tencent.pigeon.live_common.LiveMiniAppType.INSTANCE;
                        java.lang.Object obj5 = list.get(3);
                        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
                        com.tencent.pigeon.live_common.LiveMiniAppType ofRaw2 = companion.ofRaw(((java.lang.Integer) obj5).intValue());
                        kotlin.jvm.internal.o.d(ofRaw2);
                        if (list.get(4) == null) {
                            ofRaw = null;
                        } else {
                            com.tencent.pigeon.live_common.LiveOpenMiniAppAnimationType.Companion companion2 = com.tencent.pigeon.live_common.LiveOpenMiniAppAnimationType.INSTANCE;
                            java.lang.Object obj6 = list.get(4);
                            kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Int");
                            ofRaw = companion2.ofRaw(((java.lang.Integer) obj6).intValue());
                        }
                        java.lang.Object obj7 = list.get(5);
                        kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((java.lang.Boolean) obj7).booleanValue();
                        java.lang.Object obj8 = list.get(6);
                        kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue2 = ((java.lang.Boolean) obj8).booleanValue();
                        java.lang.Object obj9 = list.get(7);
                        kotlin.jvm.internal.o.e(obj9, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        try {
                            com.tencent.pigeon.live_common.LiveFrontEndAdapterApi.this.openAddToCartMiniApp(str, str2, j17, ofRaw2, ofRaw, booleanValue, booleanValue2, (java.util.Map) obj9);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.live_common.LiveCommonLiveFrontEndAdapterPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
        }
    }

    void isFakeNativeMiniApp(java.lang.String str, yz5.l lVar);

    void openAddToCartMiniApp(java.lang.String str, java.lang.String str2, long j17, com.tencent.pigeon.live_common.LiveMiniAppType liveMiniAppType, com.tencent.pigeon.live_common.LiveOpenMiniAppAnimationType liveOpenMiniAppAnimationType, boolean z17, boolean z18, java.util.Map<java.lang.String, java.lang.String> map);

    void openMiniApp(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, com.tencent.pigeon.live_common.LiveMiniAppType liveMiniAppType, com.tencent.pigeon.live_common.LiveOpenMiniAppAnimationType liveOpenMiniAppAnimationType, boolean z17, boolean z18, java.util.Map<java.lang.String, java.lang.String> map);
}
