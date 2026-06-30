package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/ting/TingNoteVoiceToTextApi;", "", "", "taskKey", "attachmentId", "", "favId", dm.i4.COL_LOCALID, "Ljz5/f0;", "startConvert", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface TingNoteVoiceToTextApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingNoteVoiceToTextApi.Companion INSTANCE = com.tencent.pigeon.ting.TingNoteVoiceToTextApi.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/ting/TingNoteVoiceToTextApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/ting/TingNoteVoiceToTextApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ com.tencent.pigeon.ting.TingNoteVoiceToTextApi.Companion $$INSTANCE = new com.tencent.pigeon.ting.TingNoteVoiceToTextApi.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.tencent.pigeon.ting.TingNoteVoiceToTextApi$Companion$codec$2.INSTANCE);

        private Companion() {
        }

        public static /* synthetic */ void setUp$default(com.tencent.pigeon.ting.TingNoteVoiceToTextApi.Companion companion, io.flutter.plugin.common.BinaryMessenger binaryMessenger, com.tencent.pigeon.ting.TingNoteVoiceToTextApi tingNoteVoiceToTextApi, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, tingNoteVoiceToTextApi, str);
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) codec.getValue();
        }

        public final void setUp(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final com.tencent.pigeon.ting.TingNoteVoiceToTextApi tingNoteVoiceToTextApi, java.lang.String messageChannelSuffix) {
            kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.TingNoteVoiceToTextApi.startConvert" + (messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : ""), getCodec());
            if (tingNoteVoiceToTextApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: com.tencent.pigeon.ting.TingNoteVoiceToTextApi$Companion$setUp$1$1
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
                        java.lang.Object obj5 = list.get(3);
                        if (obj5 instanceof java.lang.Integer) {
                            longValue2 = ((java.lang.Number) obj5).intValue();
                        } else {
                            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Long");
                            longValue2 = ((java.lang.Long) obj5).longValue();
                        }
                        try {
                            com.tencent.pigeon.ting.TingNoteVoiceToTextApi.this.startConvert(str, str2, j17, longValue2);
                            wrapError = kz5.b0.c(null);
                        } catch (java.lang.Throwable th6) {
                            wrapError = com.tencent.pigeon.ting.TingNoteVoiceToTextPigeonKt.wrapError(th6);
                        }
                        reply.reply(wrapError);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    void startConvert(java.lang.String str, java.lang.String str2, long j17, long j18);
}
