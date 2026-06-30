package com.tencent.pigeon.flutter_voip;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 R2\u00020\u0001:\u0001RJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0004\u0012\u00020\u00060\u000bH&J\"\u0010\u000f\u001a\u00020\u00062\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0004\u0012\u00020\u00060\u000bH&J\"\u0010\u0010\u001a\u00020\u00062\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0004\u0012\u00020\u00060\u000bH&J\b\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H&J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0019H&J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0016H&J\b\u0010\u001d\u001a\u00020\u0006H&J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0004H&J\b\u0010!\u001a\u00020\u0006H&J\b\u0010\"\u001a\u00020\u0004H&J\b\u0010#\u001a\u00020\u0004H&J\b\u0010$\u001a\u00020\u0004H&J\u0010\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H&J\b\u0010)\u001a\u00020\u0016H&J\b\u0010*\u001a\u00020\u0004H&J\b\u0010+\u001a\u00020\u0004H&J\b\u0010,\u001a\u00020\u0004H&J\b\u0010-\u001a\u00020\u0016H&J\b\u0010.\u001a\u00020\u0016H&J\b\u0010/\u001a\u00020\u0004H&J\b\u00100\u001a\u00020\u0004H&J\b\u00101\u001a\u00020\u0006H&J\u0010\u00102\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H&J\b\u00103\u001a\u00020\u0006H&J*\u00104\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0004\u0012\u00020\u00060\u000bH&J\b\u00105\u001a\u00020\u0016H&J\u0010\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0004H&J\b\u00108\u001a\u00020\u0006H&J\b\u00109\u001a\u00020\u0006H&J\b\u0010:\u001a\u00020\u0006H&J\u0010\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H&J\b\u0010>\u001a\u00020\u0006H&J\b\u0010?\u001a\u00020\u0004H&J\b\u0010@\u001a\u00020\u0006H&J\b\u0010A\u001a\u00020\u0004H&J\b\u0010B\u001a\u00020\u0004H&J\b\u0010C\u001a\u00020\u0016H&J\u0010\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u0016H&J\u0010\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0004H&J\b\u0010H\u001a\u00020\u0006H&J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020J0IH&J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020JH&J\b\u0010N\u001a\u00020JH&J\u0012\u0010P\u001a\u00020\u00062\b\u0010O\u001a\u0004\u0018\u00010%H&J\u0010\u0010Q\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0004H&¨\u0006SÀ\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/VoIPPluginApi;", "", "Lcom/tencent/pigeon/flutter_voip/AcceptParams;", "params", "", "accept", "Ljz5/f0;", "hangUp", "cancel", "reject", "Lcom/tencent/pigeon/flutter_voip/MinimizeParams;", "Lkotlin/Function1;", "Lkotlin/Result;", "callback", "minimize", "switchCamera", "switchCameraOpenStatus", "switchToVoiceMode", "muted", "setMuted", "enabled", "setSpeakerEnabled", "", "type", "getTextureId", "Lcom/tencent/pigeon/flutter_voip/UpdateTextureSizeParams;", "updateTextureSize", dm.i4.COL_ID, "releaseTexture", "prepareTextures", "isLocal", "", "getSmallStreamAspectRatio", "requestRefreshTextureSize", "isCameraFloatable", "isFrontCamera", "isCameraOn", "", dm.i4.COL_USERNAME, "Lcom/tencent/pigeon/flutter_voip/UserInfoParams;", "getUserInfo", "getConnectedTime", "isCaller", "isVideoMode", "isMuted", "getAudioOutputDevice", "getStatus", "isScreenInteractive", "isAccessibleModeOn", "onRendered", "requestRingtoneInfo", "onClickRingtoneButton", "setRingtoneSelf", "getRingStreamType", "mute", "requestRingtoneMute", "pauseRing", "resumeRing", "restartRing", "Lcom/tencent/pigeon/flutter_voip/FpsParams;", "prams", "reportFps", "onBooted", "isSplitScreenSupported", "toggleSplitScreen", "isScreenSplited", "checkWeVisonSupport", "queryGPURating", "segmentMode", "setSegmentVirtualBackground", "isAuto", "clearVirtualBackground", "hideRingtoneHalfDialog", "", "Lcom/tencent/pigeon/flutter_voip/AudioRouteInfo;", "queryAudioRouteInfos", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME, "routeToDevice", "queryCurrentAudioRouteInfo", "verificationUrlOrNull", "showTalkingUnSafe", "showNotFriend", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface VoIPPluginApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip.VoIPPluginApi.Companion INSTANCE = com.tencent.pigeon.flutter_voip.VoIPPluginApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/VoIPPluginApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/flutter_voip/VoIPPluginApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.flutter_voip.VoIPPluginApi.Companion $$INSTANCE = new com.tencent.pigeon.flutter_voip.VoIPPluginApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.flutter_voip.VoIPPluginApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.flutter_voip.VoIPPluginApi voIPPluginApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, voIPPluginApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.flutter_voip.VoIPPluginApi voIPPluginApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.accept" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$1$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.flutter_voip.AcceptParams");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.accept((com.tencent.pigeon.flutter_voip.AcceptParams) obj2)));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.hangUp" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$2$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.hangUp();
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
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.cancel" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$3$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.cancel()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.reject" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$4$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.reject()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.minimize" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$5$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$5$1$1, reason: invalid class name */
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
                            m266invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m266invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapResult((java.lang.Boolean) obj);
                                reply2.reply(wrapResult);
                            }
                        }
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.flutter_voip.MinimizeParams");
                        com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.minimize((com.tencent.pigeon.flutter_voip.MinimizeParams) obj2, new com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$5$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.switchCamera" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$6$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$6$1$1, reason: invalid class name */
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
                            m267invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m267invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapResult((java.lang.Boolean) obj);
                                reply2.reply(wrapResult);
                            }
                        }
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        kotlin.jvm.internal.o.g(reply, "reply");
                        com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.switchCamera(new com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$6$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel7 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.switchCameraOpenStatus" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel7.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$7$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$7$1$1, reason: invalid class name */
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
                            m268invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m268invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapResult((java.lang.Boolean) obj);
                                reply2.reply(wrapResult);
                            }
                        }
                    }

                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        kotlin.jvm.internal.o.g(reply, "reply");
                        com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.switchCameraOpenStatus(new com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$7$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel8 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.switchToVoiceMode" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel8.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$8$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.switchToVoiceMode()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel9 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.setMuted" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel9.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$9$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.setMuted(((java.lang.Boolean) obj2).booleanValue());
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel10 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.setSpeakerEnabled" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel10.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$10$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.setSpeakerEnabled(((java.lang.Boolean) obj2).booleanValue());
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel11 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.getTextureId" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel11.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$11$1
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
                            wrapError = kz5.b0.c(java.lang.Long.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.getTextureId(longValue)));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel12 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.updateTextureSize" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel12.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$12$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.updateTextureSize((com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel13 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.releaseTexture" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel13.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$13$1
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
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.releaseTexture(longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel14 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.prepareTextures" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel14.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$14$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.prepareTextures();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel15 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.getSmallStreamAspectRatio" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel15.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$15$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            wrapError = kz5.b0.c(java.lang.Double.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.getSmallStreamAspectRatio(((java.lang.Boolean) obj2).booleanValue())));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel16 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.requestRefreshTextureSize" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel16.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$16$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.requestRefreshTextureSize();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel17 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isCameraFloatable" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel17.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$17$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isCameraFloatable()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel17.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel18 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isFrontCamera" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel18.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$18$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isFrontCamera()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel18.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel19 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isCameraOn" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel19.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$19$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isCameraOn()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel19.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel20 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.getUserInfo" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel20.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$20$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.getUserInfo((java.lang.String) obj2));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel20.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel21 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.getConnectedTime" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel21.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$21$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Long.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.getConnectedTime()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel21.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel22 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isCaller" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel22.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$22$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isCaller()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel22.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel23 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isVideoMode" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel23.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$23$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isVideoMode()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel23.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel24 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isMuted" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel24.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$24$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isMuted()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel24.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel25 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.getAudioOutputDevice" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel25.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$25$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Long.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.getAudioOutputDevice()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel25.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel26 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.getStatus" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel26.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$26$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Long.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.getStatus()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel26.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel27 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isScreenInteractive" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel27.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$27$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isScreenInteractive()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel27.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel28 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isAccessibleModeOn" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel28.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$28$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isAccessibleModeOn()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel28.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel29 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.onRendered" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel29.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$29$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.onRendered();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel29.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel30 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.requestRingtoneInfo" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel30.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$30$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.requestRingtoneInfo((java.lang.String) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel30.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel31 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.onClickRingtoneButton" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel31.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$31$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.onClickRingtoneButton();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel31.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel32 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.setRingtoneSelf" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel32.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$32$1

                    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$32$1$1, reason: invalid class name */
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
                            m265invoke(((kotlin.Result) obj).getValue());
                            return jz5.f0.f302826a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m265invoke(java.lang.Object obj) {
                            java.util.List wrapResult;
                            java.util.List wrapError;
                            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
                            if (m524exceptionOrNullimpl != null) {
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply = this.$reply;
                                wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(m524exceptionOrNullimpl);
                                reply.reply(wrapError);
                            } else {
                                if (kotlin.Result.m527isFailureimpl(obj)) {
                                    obj = null;
                                }
                                io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply2 = this.$reply;
                                wrapResult = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapResult((java.lang.Boolean) obj);
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
                        com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.setRingtoneSelf((java.lang.String) obj2, new com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$32$1.AnonymousClass1(reply));
                    }
                });
            } else {
                basicMessageChannel32.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel33 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.getRingStreamType" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel33.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$33$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Long.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.getRingStreamType()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel33.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel34 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.requestRingtoneMute" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel34.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$34$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.requestRingtoneMute(((java.lang.Boolean) obj2).booleanValue());
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel34.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel35 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.pauseRing" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel35.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$35$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.pauseRing();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel35.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel36 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.resumeRing" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel36.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$36$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.resumeRing();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel36.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel37 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.restartRing" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel37.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$37$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.restartRing();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel37.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel38 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.reportFps" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel38.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$38$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.flutter_voip.FpsParams");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.reportFps((com.tencent.pigeon.flutter_voip.FpsParams) obj2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel38.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel39 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.onBooted" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel39.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$39$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.onBooted();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel39.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel40 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isSplitScreenSupported" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel40.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$40$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isSplitScreenSupported()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel40.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel41 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.toggleSplitScreen" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel41.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$41$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.toggleSplitScreen();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel41.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel42 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.isScreenSplited" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel42.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$42$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.isScreenSplited()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel42.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel43 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.checkWeVisonSupport" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel43.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$43$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.checkWeVisonSupport()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel43.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel44 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.queryGPURating" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel44.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$44$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(java.lang.Long.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.queryGPURating()));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel44.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel45 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.setSegmentVirtualBackground" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel45.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$45$1
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
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.setSegmentVirtualBackground(longValue);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel45.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel46 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.clearVirtualBackground" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel46.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$46$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.clearVirtualBackground(((java.lang.Boolean) obj2).booleanValue());
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel46.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel47 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.hideRingtoneHalfDialog" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel47.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$47$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.hideRingtoneHalfDialog();
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel47.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel48 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.queryAudioRouteInfos" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel48.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$48$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.queryAudioRouteInfos());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel48.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel49 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.routeToDevice" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel49.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$49$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.flutter_voip.AudioRouteInfo");
                        try {
                            wrapError = kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.routeToDevice((com.tencent.pigeon.flutter_voip.AudioRouteInfo) obj2)));
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel49.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel50 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.queryCurrentAudioRouteInfo" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel50.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$50$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        try {
                            wrapError = kz5.b0.c(com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.queryCurrentAudioRouteInfo());
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel50.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel51 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.showTalkingUnSafe" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel51.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$51$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.showTalkingUnSafe((java.lang.String) ((java.util.List) obj).get(0));
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel51.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel52 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.VoIPPluginApi.showNotFriend" + concat, getCodec());
            if (voIPPluginApi != null) {
                basicMessageChannel52.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.flutter_voip.VoIPPluginApi$Companion$setUp$52$1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                        java.util.List wrapError;
                        kotlin.jvm.internal.o.g(reply, "reply");
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        try {
                            com.tencent.pigeon.flutter_voip.VoIPPluginApi.this.showNotFriend(((java.lang.Boolean) obj2).booleanValue());
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.flutter_voip.VoIPFlutterPluginApiKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel52.setMessageHandler(null);
            }
        }
    }

    boolean accept(com.tencent.pigeon.flutter_voip.AcceptParams params);

    boolean cancel();

    boolean checkWeVisonSupport();

    void clearVirtualBackground(boolean z17);

    long getAudioOutputDevice();

    long getConnectedTime();

    long getRingStreamType();

    double getSmallStreamAspectRatio(boolean isLocal);

    long getStatus();

    long getTextureId(long type);

    com.tencent.pigeon.flutter_voip.UserInfoParams getUserInfo(java.lang.String username);

    void hangUp();

    void hideRingtoneHalfDialog();

    boolean isAccessibleModeOn();

    boolean isCaller();

    boolean isCameraFloatable();

    boolean isCameraOn();

    boolean isFrontCamera();

    boolean isMuted();

    boolean isScreenInteractive();

    boolean isScreenSplited();

    boolean isSplitScreenSupported();

    boolean isVideoMode();

    void minimize(com.tencent.pigeon.flutter_voip.MinimizeParams minimizeParams, yz5.l lVar);

    void onBooted();

    void onClickRingtoneButton();

    void onRendered();

    void pauseRing();

    void prepareTextures();

    java.util.List<com.tencent.pigeon.flutter_voip.AudioRouteInfo> queryAudioRouteInfos();

    com.tencent.pigeon.flutter_voip.AudioRouteInfo queryCurrentAudioRouteInfo();

    long queryGPURating();

    boolean reject();

    void releaseTexture(long j17);

    void reportFps(com.tencent.pigeon.flutter_voip.FpsParams fpsParams);

    void requestRefreshTextureSize();

    void requestRingtoneInfo(java.lang.String str);

    void requestRingtoneMute(boolean z17);

    void restartRing();

    void resumeRing();

    boolean routeToDevice(com.tencent.pigeon.flutter_voip.AudioRouteInfo device);

    void setMuted(boolean z17);

    void setRingtoneSelf(java.lang.String str, yz5.l lVar);

    void setSegmentVirtualBackground(long j17);

    void setSpeakerEnabled(boolean z17);

    void showNotFriend(boolean z17);

    void showTalkingUnSafe(java.lang.String str);

    void switchCamera(yz5.l lVar);

    void switchCameraOpenStatus(yz5.l lVar);

    boolean switchToVoiceMode();

    void toggleSplitScreen();

    void updateTextureSize(com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams updateTextureSizeParams);
}
