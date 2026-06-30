package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J*\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&J2\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0011\u001a\u00020\u0002H&¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterFileHost;", "", "", "getDefaultImageCacheDirectory", "getGeneralCacheDirectory", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Lkotlin/Function1;", "Lkotlin/Result;", "Ljz5/f0;", "callback", "createFile", "", "recursive", "createDirectory", "getRealPath", "release", "getStreamProfilerDirectory", "getMemoryDirectory", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface FlutterFileHost {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.FlutterFileHost.Companion INSTANCE = com.tencent.pigeon.mm_foundation.FlutterFileHost.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterFileHost$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/mm_foundation/FlutterFileHost;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.mm_foundation.FlutterFileHost.Companion $$INSTANCE = new com.tencent.pigeon.mm_foundation.FlutterFileHost.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.mm_foundation.FlutterFileHost.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.mm_foundation.FlutterFileHost flutterFileHost, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, flutterFileHost, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.mm_foundation.FlutterFileHost flutterFileHost, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterFileHost.getDefaultImageCacheDirectory" + concat, getCodec());
            if (flutterFileHost != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mm_foundation.FlutterFileHost.this.getDefaultImageCacheDirectory());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationFilePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterFileHost.getGeneralCacheDirectory" + concat, getCodec());
            if (flutterFileHost != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$2$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mm_foundation.FlutterFileHost.this.getGeneralCacheDirectory());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationFilePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterFileHost.createFile" + concat, getCodec());
            if (flutterFileHost != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$3$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$3$1$1, reason: invalid class name */
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
                            m323invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m323invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.mm_foundation.MmFoundationFilePigeonKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.mm_foundation.MmFoundationFilePigeonKt.wrapResult((java.lang.String) obj);
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
                        com.tencent.pigeon.mm_foundation.FlutterFileHost.this.createFile((java.lang.String) obj2, new com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$3$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterFileHost.createDirectory" + concat, getCodec());
            if (flutterFileHost != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$4$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$4$1$1, reason: invalid class name */
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
                            m324invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m324invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.mm_foundation.MmFoundationFilePigeonKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.mm_foundation.MmFoundationFilePigeonKt.wrapResult((java.lang.String) obj);
                                reply2.reply(wrapResult);
                            }
                        }
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        java.lang.Object obj3 = list.get(1);
                        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
                        com.tencent.pigeon.mm_foundation.FlutterFileHost.this.createDirectory((java.lang.String) obj2, booleanValue, new com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$4$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterFileHost.getRealPath" + concat, getCodec());
            if (flutterFileHost != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$5$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mm_foundation.FlutterFileHost.this.getRealPath((java.lang.String) obj2));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationFilePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterFileHost.getStreamProfilerDirectory" + concat, getCodec());
            if (flutterFileHost != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$6$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mm_foundation.FlutterFileHost.this.getStreamProfilerDirectory(((java.lang.Boolean) obj2).booleanValue()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationFilePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel7 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.FlutterFileHost.getMemoryDirectory" + concat, getCodec());
            if (flutterFileHost != null) {
                basicMessageChannel7.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.FlutterFileHost$Companion$setUp$7$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mm_foundation.FlutterFileHost.this.getMemoryDirectory());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationFilePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
        }
    }

    void createDirectory(java.lang.String str, boolean z17, yz5.l lVar);

    void createFile(java.lang.String str, yz5.l lVar);

    java.lang.String getDefaultImageCacheDirectory();

    java.lang.String getGeneralCacheDirectory();

    java.lang.String getMemoryDirectory();

    java.lang.String getRealPath(java.lang.String path);

    java.lang.String getStreamProfilerDirectory(boolean release);
}
