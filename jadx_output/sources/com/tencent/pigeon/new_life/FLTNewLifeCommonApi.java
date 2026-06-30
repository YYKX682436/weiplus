package com.tencent.pigeon.new_life;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/tencent/pigeon/new_life/FLTNewLifeCommonApi;", "", "Lcom/tencent/pigeon/new_life/FLTActionRequest;", "requestArg", "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/tencent/pigeon/new_life/FLTActionResponse;", "Ljz5/f0;", "callback", "onReceiveAction", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "", "messageChannelSuffix", "Ljava/lang/String;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FLTNewLifeCommonApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.new_life.FLTNewLifeCommonApi.Companion INSTANCE = new com.tencent.pigeon.new_life.FLTNewLifeCommonApi.Companion(null);
    private static final jz5.g codec$delegate = jz5.h.b(com.tencent.pigeon.new_life.FLTNewLifeCommonApi$Companion$codec$2.INSTANCE);
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final java.lang.String messageChannelSuffix;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/new_life/FLTNewLifeCommonApi$Companion;", "", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) com.tencent.pigeon.new_life.FLTNewLifeCommonApi.codec$delegate.getValue();
        }
    }

    public FLTNewLifeCommonApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String messageChannelSuffix) {
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
        this.binaryMessenger = binaryMessenger;
        this.messageChannelSuffix = messageChannelSuffix;
    }

    public final void onReceiveAction(com.tencent.pigeon.new_life.FLTActionRequest requestArg, final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(requestArg, "requestArg");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.FLTNewLifeCommonApi.onReceiveAction" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(kz5.b0.c(requestArg), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.new_life.FLTNewLifeCommonApi$onReceiveAction$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.new_life.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.new_life.NewLifePigeonKt.createConnectionError(str2);
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(createConnectionError))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() > 1) {
                    yz5.l lVar2 = yz5.l.this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    java.lang.Object obj2 = list.get(0);
                    kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    java.lang.Object obj3 = list.get(1);
                    kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.new_life.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
                    return;
                }
                if (list.get(0) == null) {
                    yz5.l lVar3 = yz5.l.this;
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.new_life.FlutterError("null-error", "Flutter api returned null value for non-null return value.", "")))));
                } else {
                    java.lang.Object obj4 = list.get(0);
                    kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type com.tencent.pigeon.new_life.FLTActionResponse");
                    yz5.l.this.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl((com.tencent.pigeon.new_life.FLTActionResponse) obj4)));
                }
            }
        });
    }

    public /* synthetic */ FLTNewLifeCommonApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(binaryMessenger, (i17 & 2) != 0 ? "" : str);
    }
}
