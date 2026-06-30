package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\nH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/MusicPlayerApi;", "", "Lcom/tencent/pigeon/mm_foundation/FlutterMusicInfo;", "getCurrentMusic", "info", "Ljz5/f0;", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "pause", "resume", "stop", "Lcom/tencent/pigeon/mm_foundation/FLMusicIntType;", "timeMs", "seek", "getCurrentPosition", "getDuration", "", "getHistory", "clearHistory", "", "canPlayMusic", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public interface MusicPlayerApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion INSTANCE = com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/MusicPlayerApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/mm_foundation/MusicPlayerApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes16.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion $$INSTANCE = new com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.mm_foundation.MusicPlayerApi musicPlayerApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, musicPlayerApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.mm_foundation.MusicPlayerApi musicPlayerApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.getCurrentMusic" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.getCurrentMusic());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.play" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$2$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.mm_foundation.FlutterMusicInfo");
                        try {
                            com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.play((com.tencent.pigeon.mm_foundation.FlutterMusicInfo) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.pause" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$3$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.pause();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.resume" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$4$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.resume();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.stop" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$5$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.stop();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.seek" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$6$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.mm_foundation.FLMusicIntType");
                        try {
                            com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.seek((com.tencent.pigeon.mm_foundation.FLMusicIntType) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel7 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.getCurrentPosition" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel7.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$7$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.getCurrentPosition());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel8 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.getDuration" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel8.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$8$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.getDuration());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel9 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.getHistory" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel9.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$9$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.getHistory());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel10 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.clearHistory" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel10.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$10$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.clearHistory();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel11 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.MusicPlayerApi.canPlayMusic" + concat, getCodec());
            if (musicPlayerApi != null) {
                basicMessageChannel11.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.mm_foundation.MusicPlayerApi$Companion$setUp$11$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.mm_foundation.MusicPlayerApi.this.canPlayMusic()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.mm_foundation.MmFoundationMusicPlayerMessagePigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
        }
    }

    boolean canPlayMusic();

    void clearHistory();

    com.tencent.pigeon.mm_foundation.FlutterMusicInfo getCurrentMusic();

    com.tencent.pigeon.mm_foundation.FLMusicIntType getCurrentPosition();

    com.tencent.pigeon.mm_foundation.FLMusicIntType getDuration();

    java.lang.String getHistory();

    void pause();

    void play(com.tencent.pigeon.mm_foundation.FlutterMusicInfo flutterMusicInfo);

    void resume();

    void seek(com.tencent.pigeon.mm_foundation.FLMusicIntType fLMusicIntType);

    void stop();
}
