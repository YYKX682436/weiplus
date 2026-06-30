package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J<\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0004\u0012\u00020\u000b0\bH&J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizFinderVidePlayersManager;", "", "Lcom/tencent/pigeon/biz_base/FinderVideoPlayInfo;", "finderVideoPlayInfo", "", "autoPlay", "", "playOffset", "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/tencent/pigeon/biz_base/BizTLPlayerInfo;", "Ljz5/f0;", "callback", "createPlayer", "playerId", "destroy", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "stop", "pause", "getCurrentPlayMs", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface BizFinderVidePlayersManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.Companion INSTANCE = com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizFinderVidePlayersManager$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/biz_base/BizFinderVidePlayersManager;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.Companion $$INSTANCE = new com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.biz_base.BizFinderVidePlayersManager$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.biz_base.BizFinderVidePlayersManager bizFinderVidePlayersManager, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, bizFinderVidePlayersManager, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.biz_base.BizFinderVidePlayersManager bizFinderVidePlayersManager, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizFinderVidePlayersManager.createPlayer" + concat, getCodec());
            if (bizFinderVidePlayersManager != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz_base.BizFinderVidePlayersManager$Companion$setUp$1$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lcom/tencent/pigeon/biz_base/BizTLPlayerInfo;", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz_base.BizFinderVidePlayersManager$Companion$setUp$1$1$1, reason: invalid class name */
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
                            m207invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m207invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.biz_base.BizBasePigeonKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.biz_base.BizBasePigeonKt.wrapResult((com.tencent.pigeon.biz_base.BizTLPlayerInfo) obj);
                                reply2.reply(wrapResult);
                            }
                        }
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.biz_base.FinderVideoPlayInfo");
                        com.tencent.pigeon.biz_base.FinderVideoPlayInfo finderVideoPlayInfo = (com.tencent.pigeon.biz_base.FinderVideoPlayInfo) obj2;
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
                        java.lang.Object obj4 = list.get(2);
                        if (obj4 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj4).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj4).longValue();
                        }
                        com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.this.createPlayer(finderVideoPlayInfo, booleanValue, longValue, new com.tencent.pigeon.biz_base.BizFinderVidePlayersManager$Companion$setUp$1$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizFinderVidePlayersManager.destroy" + concat, getCodec());
            if (bizFinderVidePlayersManager != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz_base.BizFinderVidePlayersManager$Companion$setUp$2$1
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
                            com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.this.destroy(longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz_base.BizBasePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizFinderVidePlayersManager.play" + concat, getCodec());
            if (bizFinderVidePlayersManager != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz_base.BizFinderVidePlayersManager$Companion$setUp$3$1
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
                            com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.this.play(longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz_base.BizBasePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizFinderVidePlayersManager.stop" + concat, getCodec());
            if (bizFinderVidePlayersManager != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz_base.BizFinderVidePlayersManager$Companion$setUp$4$1
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
                            com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.this.stop(longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz_base.BizBasePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizFinderVidePlayersManager.pause" + concat, getCodec());
            if (bizFinderVidePlayersManager != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz_base.BizFinderVidePlayersManager$Companion$setUp$5$1
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
                            com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.this.pause(longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz_base.BizBasePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizFinderVidePlayersManager.getCurrentPlayMs" + concat, getCodec());
            if (bizFinderVidePlayersManager != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz_base.BizFinderVidePlayersManager$Companion$setUp$6$1
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
                            wrapError = kz5.b0.c(java.lang.Long.valueOf(com.tencent.pigeon.biz_base.BizFinderVidePlayersManager.this.getCurrentPlayMs(longValue)));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz_base.BizBasePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
        }
    }

    void createPlayer(com.tencent.pigeon.biz_base.FinderVideoPlayInfo finderVideoPlayInfo, boolean z17, long j17, yz5.l lVar);

    void destroy(long j17);

    long getCurrentPlayMs(long playerId);

    void pause(long j17);

    void play(long j17);

    void stop(long j17);
}
