package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u0006\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002J0\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002J \u0010\f\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002J \u0010\u0010\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002J(\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\r2\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\t2\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/DartServiceCallerApi;", "", "Lkotlin/Function1;", "Lkotlin/Result;", "Ljz5/f0;", "callback", "flutterBackupInitModel", "", "packageIdArg", "", "isBackupArg", "flutterBackupStartTask", "flutterBackupStopAllTask", "", "notifyDataArg", "flutterBSInitNotifyData", "flutterBSClearNotifyCache", "contactDataArg", "flutterBSUpdateContact", "enableArg", "setEnableAmoebaDebugView", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "", "messageChannelSuffix", "Ljava/lang/String;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class DartServiceCallerApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.DartServiceCallerApi.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.DartServiceCallerApi.Companion(null);
    private static final jz5.g codec$delegate = jz5.h.b(com.tencent.pigeon.mm_foundation.DartServiceCallerApi$Companion$codec$2.INSTANCE);
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final java.lang.String messageChannelSuffix;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/DartServiceCallerApi$Companion;", "", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) com.tencent.pigeon.mm_foundation.DartServiceCallerApi.codec$delegate.getValue();
        }
    }

    public DartServiceCallerApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String messageChannelSuffix) {
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        kotlin.jvm.internal.o.g(messageChannelSuffix, "messageChannelSuffix");
        this.binaryMessenger = binaryMessenger;
        this.messageChannelSuffix = messageChannelSuffix;
    }

    public final void flutterBSClearNotifyCache(final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.DartServiceCallerApi.flutterBSClearNotifyCache" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(null, new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.mm_foundation.DartServiceCallerApi$flutterBSClearNotifyCache$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.mm_foundation.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.mm_foundation.MmFoundationDartServiceCallerPigeonKt.createConnectionError(str2);
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(createConnectionError))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() <= 1) {
                    yz5.l lVar2 = yz5.l.this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
                    return;
                }
                yz5.l lVar3 = yz5.l.this;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                java.lang.Object obj2 = list.get(0);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = list.get(1);
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.mm_foundation.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
            }
        });
    }

    public final void flutterBSInitNotifyData(byte[] notifyDataArg, final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(notifyDataArg, "notifyDataArg");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.DartServiceCallerApi.flutterBSInitNotifyData" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(kz5.b0.c(notifyDataArg), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.mm_foundation.DartServiceCallerApi$flutterBSInitNotifyData$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.mm_foundation.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.mm_foundation.MmFoundationDartServiceCallerPigeonKt.createConnectionError(str2);
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(createConnectionError))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() <= 1) {
                    yz5.l lVar2 = yz5.l.this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
                    return;
                }
                yz5.l lVar3 = yz5.l.this;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                java.lang.Object obj2 = list.get(0);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = list.get(1);
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.mm_foundation.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
            }
        });
    }

    public final void flutterBSUpdateContact(byte[] contactDataArg, final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(contactDataArg, "contactDataArg");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.DartServiceCallerApi.flutterBSUpdateContact" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(kz5.b0.c(contactDataArg), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.mm_foundation.DartServiceCallerApi$flutterBSUpdateContact$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.mm_foundation.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.mm_foundation.MmFoundationDartServiceCallerPigeonKt.createConnectionError(str2);
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(createConnectionError))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() <= 1) {
                    yz5.l lVar2 = yz5.l.this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
                    return;
                }
                yz5.l lVar3 = yz5.l.this;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                java.lang.Object obj2 = list.get(0);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = list.get(1);
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.mm_foundation.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
            }
        });
    }

    public final void flutterBackupInitModel(final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.DartServiceCallerApi.flutterBackupInitModel" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(null, new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.mm_foundation.DartServiceCallerApi$flutterBackupInitModel$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.mm_foundation.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.mm_foundation.MmFoundationDartServiceCallerPigeonKt.createConnectionError(str2);
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(createConnectionError))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() <= 1) {
                    yz5.l lVar2 = yz5.l.this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
                    return;
                }
                yz5.l lVar3 = yz5.l.this;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                java.lang.Object obj2 = list.get(0);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = list.get(1);
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.mm_foundation.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
            }
        });
    }

    public final void flutterBackupStartTask(long j17, boolean z17, final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.DartServiceCallerApi.flutterBackupStartTask" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(kz5.c0.i(java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.mm_foundation.DartServiceCallerApi$flutterBackupStartTask$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.mm_foundation.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.mm_foundation.MmFoundationDartServiceCallerPigeonKt.createConnectionError(str2);
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(createConnectionError))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() <= 1) {
                    yz5.l lVar2 = yz5.l.this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
                    return;
                }
                yz5.l lVar3 = yz5.l.this;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                java.lang.Object obj2 = list.get(0);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = list.get(1);
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.mm_foundation.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
            }
        });
    }

    public final void flutterBackupStopAllTask(final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.DartServiceCallerApi.flutterBackupStopAllTask" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(null, new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.mm_foundation.DartServiceCallerApi$flutterBackupStopAllTask$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.mm_foundation.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.mm_foundation.MmFoundationDartServiceCallerPigeonKt.createConnectionError(str2);
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(createConnectionError))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() <= 1) {
                    yz5.l lVar2 = yz5.l.this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
                    return;
                }
                yz5.l lVar3 = yz5.l.this;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                java.lang.Object obj2 = list.get(0);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = list.get(1);
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.mm_foundation.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
            }
        });
    }

    public final void setEnableAmoebaDebugView(boolean z17, final yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.DartServiceCallerApi.setEnableAmoebaDebugView" + str;
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(kz5.b0.c(java.lang.Boolean.valueOf(z17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.mm_foundation.DartServiceCallerApi$setEnableAmoebaDebugView$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                com.tencent.pigeon.mm_foundation.FlutterError createConnectionError;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    createConnectionError = com.tencent.pigeon.mm_foundation.MmFoundationDartServiceCallerPigeonKt.createConnectionError(str2);
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(createConnectionError))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() <= 1) {
                    yz5.l lVar2 = yz5.l.this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
                    return;
                }
                yz5.l lVar3 = yz5.l.this;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                java.lang.Object obj2 = list.get(0);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = list.get(1);
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.mm_foundation.FlutterError((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
            }
        });
    }

    public /* synthetic */ DartServiceCallerApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(binaryMessenger, (i17 & 2) != 0 ? "" : str);
    }
}
