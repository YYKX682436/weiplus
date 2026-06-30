package com.tencent.pigeon.status;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004J(\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/tencent/pigeon/status/StatusNativeInfoNotifyApi;", "", "", "dataArg", "Lkotlin/Function1;", "Lkotlin/Result;", "", "Ljz5/f0;", "callback", "updateInitData", "", "progressArg", "updateProfileScrollProgress", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "", "messageChannelSuffix", "Ljava/lang/String;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class StatusNativeInfoNotifyApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.status.StatusNativeInfoNotifyApi.Companion INSTANCE = new com.tencent.pigeon.status.StatusNativeInfoNotifyApi.Companion(null);
    private static final jz5.g codec$delegate = jz5.h.b(com.tencent.pigeon.status.StatusNativeInfoNotifyApi$Companion$codec$2.INSTANCE);
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final java.lang.String messageChannelSuffix;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/status/StatusNativeInfoNotifyApi$Companion;", "", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) com.tencent.pigeon.status.StatusNativeInfoNotifyApi.codec$delegate.getValue();
        }
    }

    public StatusNativeInfoNotifyApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String messageChannelSuffix) {
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
        this.binaryMessenger = binaryMessenger;
        this.messageChannelSuffix = messageChannelSuffix;
    }

    public final void updateInitData(byte[] dataArg, final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(dataArg, "dataArg");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.StatusNativeInfoNotifyApi.updateInitData" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(kz5.b0.c(dataArg), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.status.StatusNativeInfoNotifyApi$updateInitData$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.status.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.status.StatusPigeonKt.createConnectionError(str2);
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
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.status.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
                    return;
                }
                if (list.get(0) == null) {
                    yz5.l lVar3 = yz5.l.this;
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.status.FlutterError("null-error", "Flutter api returned null value for non-null return value.", "")))));
                } else {
                    java.lang.Object obj4 = list.get(0);
                    kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue = ((java.lang.Boolean) obj4).booleanValue();
                    yz5.l lVar4 = yz5.l.this;
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    lVar4.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(booleanValue))));
                }
            }
        });
    }

    public final void updateProfileScrollProgress(double d17, final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.StatusNativeInfoNotifyApi.updateProfileScrollProgress" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(kz5.b0.c(java.lang.Double.valueOf(d17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.status.StatusNativeInfoNotifyApi$updateProfileScrollProgress$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.status.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.status.StatusPigeonKt.createConnectionError(str2);
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
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.status.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
                    return;
                }
                if (list.get(0) == null) {
                    yz5.l lVar3 = yz5.l.this;
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.status.FlutterError("null-error", "Flutter api returned null value for non-null return value.", "")))));
                } else {
                    java.lang.Object obj4 = list.get(0);
                    kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue = ((java.lang.Boolean) obj4).booleanValue();
                    yz5.l lVar4 = yz5.l.this;
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    lVar4.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(booleanValue))));
                }
            }
        });
    }

    public /* synthetic */ StatusNativeInfoNotifyApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(binaryMessenger, (i17 & 2) != 0 ? "" : str);
    }
}
