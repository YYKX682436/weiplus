package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u0000 .2\u00020\u0001:\u0001.J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J(\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&J\"\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tH&J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0016\u001a\u00020\u0004H&J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0004H&JB\u0010 \u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00132\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001e\u0012\u0004\u0012\u00020\u000e0\u001dH&J2\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001e\u0012\u0004\u0012\u00020\u000e0\u001dH&J\b\u0010$\u001a\u00020\u0004H&J8\u0010*\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0004H&J \u0010-\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H&¨\u0006/À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/biz/NotifyMsgApi;", "", "Lcom/tencent/pigeon/biz/BizNotificationTabInfo;", "getNotificationTabInfo", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "buffer", "size", "", "Lcom/tencent/pigeon/biz/NotifyMsg;", "getNotifyMsgList", "msgIdList", "", "isFoldUnread", "Ljz5/f0;", "setHasRead", "msg", "onItemClick", "onItemDelete", "", dm.i4.COL_USERNAME, "addContact", "getNotifyUnReadCount", "msgVersion", "canUseStyleV2WhenMsgVersion", "url", "itemShowType", "openScene", "brandUserName", "Lkotlin/Function1;", "Lkotlin/Result;", "callback", "addToPreload", "mpArticleKey", "notifyMsgBlockFlag", "onNotifyMsgBlockStatusChanged", "getNotifyCount", "action", "redPointNum", "biz", "hasSmallPoint", "enterFromNotifyTips", "reportPersonalCenter", "addContactScene", "serviceType", "gotoBizProfile", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface NotifyMsgApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.NotifyMsgApi.Companion INSTANCE = com.tencent.pigeon.biz.NotifyMsgApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/biz/NotifyMsgApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/biz/NotifyMsgApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.biz.NotifyMsgApi.Companion $$INSTANCE = new com.tencent.pigeon.biz.NotifyMsgApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.biz.NotifyMsgApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.biz.NotifyMsgApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.biz.NotifyMsgApi notifyMsgApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, notifyMsgApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.biz.NotifyMsgApi notifyMsgApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.getNotificationTabInfo" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.biz.NotifyMsgApi.this.getNotificationTabInfo());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.getNotifyMsgList" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$2$1
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
                        if (obj3 instanceof java.lang.Integer) {
                            longValue2 = ((java.lang.Number) obj3).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                            longValue2 = ((java.lang.Long) obj3).longValue();
                        }
                        long j18 = longValue2;
                        java.lang.Object obj4 = list.get(2);
                        if (obj4 instanceof java.lang.Integer) {
                            longValue3 = ((java.lang.Number) obj4).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                            longValue3 = ((java.lang.Long) obj4).longValue();
                        }
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.biz.NotifyMsgApi.this.getNotifyMsgList(j17, j18, longValue3));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.setHasRead" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$3$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.util.List<java.lang.Long> list2 = (java.util.List) list.get(0);
                        java.lang.Object obj2 = list.get(1);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            com.tencent.pigeon.biz.NotifyMsgApi.this.setHasRead(list2, ((java.lang.Boolean) obj2).booleanValue());
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.onItemClick" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$4$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.biz.NotifyMsg");
                        try {
                            com.tencent.pigeon.biz.NotifyMsgApi.this.onItemClick((com.tencent.pigeon.biz.NotifyMsg) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.onItemDelete" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$5$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.biz.NotifyMsg");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.biz.NotifyMsgApi.this.onItemDelete((com.tencent.pigeon.biz.NotifyMsg) obj2)));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.addContact" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$6$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        try {
                            com.tencent.pigeon.biz.NotifyMsgApi.this.addContact((java.lang.String) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel7 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.getNotifyUnReadCount" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel7.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$7$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Long.valueOf(com.tencent.pigeon.biz.NotifyMsgApi.this.getNotifyUnReadCount()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel8 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.canUseStyleV2WhenMsgVersion" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel8.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$8$1
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
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.biz.NotifyMsgApi.this.canUseStyleV2WhenMsgVersion(longValue)));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel9 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.addToPreload" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel9.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$9$1

                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Ljz5/f0;", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$9$1$1, reason: invalid class name */
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
                            m177invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m177invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.biz.BizPigeonKt.wrapResult(null);
                                reply2.reply(wrapResult);
                            }
                        }
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        long longValue2;
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
                        java.lang.Object obj4 = list.get(2);
                        if (obj4 instanceof java.lang.Integer) {
                            longValue2 = ((java.lang.Number) obj4).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                            longValue2 = ((java.lang.Long) obj4).longValue();
                        }
                        java.lang.Object obj5 = list.get(3);
                        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
                        com.tencent.pigeon.biz.NotifyMsgApi.this.addToPreload(str, longValue, longValue2, (java.lang.String) obj5, new com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$9$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel10 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.onNotifyMsgBlockStatusChanged" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel10.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$10$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$10$1$1, reason: invalid class name */
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
                            m176invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m176invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.biz.BizPigeonKt.wrapResult((java.lang.Boolean) obj);
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
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj2;
                        java.lang.Object obj3 = list.get(1);
                        if (obj3 instanceof java.lang.Integer) {
                            longValue = ((java.lang.Number) obj3).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                            longValue = ((java.lang.Long) obj3).longValue();
                        }
                        com.tencent.pigeon.biz.NotifyMsgApi.this.onNotifyMsgBlockStatusChanged(str, longValue, new com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$10$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel11 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.getNotifyCount" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel11.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$11$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Long.valueOf(com.tencent.pigeon.biz.NotifyMsgApi.this.getNotifyCount()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel12 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.reportPersonalCenter" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel12.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$12$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        long longValue2;
                        long longValue3;
                        long longValue4;
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
                        if (obj4 instanceof java.lang.Integer) {
                            longValue3 = ((java.lang.Number) obj4).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                            longValue3 = ((java.lang.Long) obj4).longValue();
                        }
                        long j19 = longValue3;
                        java.lang.Object obj5 = list.get(3);
                        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj5;
                        java.lang.Object obj6 = list.get(4);
                        kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((java.lang.Boolean) obj6).booleanValue();
                        java.lang.Object obj7 = list.get(5);
                        if (obj7 instanceof java.lang.Integer) {
                            longValue4 = ((java.lang.Number) obj7).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.Long");
                            longValue4 = ((java.lang.Long) obj7).longValue();
                        }
                        try {
                            com.tencent.pigeon.biz.NotifyMsgApi.this.reportPersonalCenter(j17, j18, j19, str, booleanValue, longValue4);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel13 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.NotifyMsgApi.gotoBizProfile" + concat, getCodec());
            if (notifyMsgApi != null) {
                basicMessageChannel13.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.biz.NotifyMsgApi$Companion$setUp$13$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        long longValue;
                        long longValue2;
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
                        long j17 = longValue;
                        java.lang.Object obj4 = list.get(2);
                        if (obj4 instanceof java.lang.Integer) {
                            longValue2 = ((java.lang.Number) obj4).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                            longValue2 = ((java.lang.Long) obj4).longValue();
                        }
                        try {
                            com.tencent.pigeon.biz.NotifyMsgApi.this.gotoBizProfile(str, j17, longValue2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.biz.BizPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
        }
    }

    void addContact(java.lang.String str);

    void addToPreload(java.lang.String str, long j17, long j18, java.lang.String str2, yz5.l lVar);

    boolean canUseStyleV2WhenMsgVersion(long msgVersion);

    com.tencent.pigeon.biz.BizNotificationTabInfo getNotificationTabInfo();

    long getNotifyCount();

    java.util.List<com.tencent.pigeon.biz.NotifyMsg> getNotifyMsgList(long scene, long buffer, long size);

    long getNotifyUnReadCount();

    void gotoBizProfile(java.lang.String str, long j17, long j18);

    void onItemClick(com.tencent.pigeon.biz.NotifyMsg notifyMsg);

    boolean onItemDelete(com.tencent.pigeon.biz.NotifyMsg msg);

    void onNotifyMsgBlockStatusChanged(java.lang.String str, long j17, yz5.l lVar);

    void reportPersonalCenter(long j17, long j18, long j19, java.lang.String str, boolean z17, long j27);

    void setHasRead(java.util.List<java.lang.Long> list, boolean z17);
}
