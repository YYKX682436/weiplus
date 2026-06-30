package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J2\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\r2\"\u0010\u0007\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00060\u0004J\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetFlutterPluginApi;", "", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetNavigateBackMessage;", "messageArg", "Lkotlin/Function1;", "", "Ljz5/f0;", "callback", nd1.p.NAME, "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetUpdatePopGestureEnableMessage;", "updatePopGestureEnable", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetSetForbidRightGestureEnableMessage;", "setForbidRightGestureEnable", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetTapEventMessage;", "", "tapEvent", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCloseWindowMessage;", "closeWindow", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class WxaLiteAppWidgetFlutterPluginApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi.Companion(null);
    private static final jz5.g codec$delegate = jz5.h.b(com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi$Companion$codec$2.INSTANCE);
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetFlutterPluginApi$Companion;", "", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return (io.flutter.plugin.common.MessageCodec) com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi.codec$delegate.getValue();
        }
    }

    public WxaLiteAppWidgetFlutterPluginApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        this.binaryMessenger = binaryMessenger;
    }

    public final void closeWindow(com.tencent.pigeon.liteapp.WxaLiteAppWidgetCloseWindowMessage messageArg, final yz5.l callback) {
        kotlin.jvm.internal.o.g(messageArg, "messageArg");
        kotlin.jvm.internal.o.g(callback, "callback");
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.wxa_lite_app_widget.WxaLiteAppWidgetFlutterPluginApi.closeWindow", INSTANCE.getCodec()).send(kz5.b0.c(messageArg), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi$closeWindow$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                yz5.l.this.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
            }
        });
    }

    public final void navigateBack(com.tencent.pigeon.liteapp.WxaLiteAppWidgetNavigateBackMessage messageArg, final yz5.l callback) {
        kotlin.jvm.internal.o.g(messageArg, "messageArg");
        kotlin.jvm.internal.o.g(callback, "callback");
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.wxa_lite_app_widget.WxaLiteAppWidgetFlutterPluginApi.navigateBack", INSTANCE.getCodec()).send(kz5.b0.c(messageArg), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi$navigateBack$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                yz5.l.this.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
            }
        });
    }

    public final void setForbidRightGestureEnable(com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage messageArg, final yz5.l callback) {
        kotlin.jvm.internal.o.g(messageArg, "messageArg");
        kotlin.jvm.internal.o.g(callback, "callback");
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.wxa_lite_app_widget.WxaLiteAppWidgetFlutterPluginApi.setForbidRightGestureEnable", INSTANCE.getCodec()).send(kz5.b0.c(messageArg), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi$setForbidRightGestureEnable$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                yz5.l.this.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
            }
        });
    }

    public final void tapEvent(com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage messageArg, final yz5.l callback) {
        kotlin.jvm.internal.o.g(messageArg, "messageArg");
        kotlin.jvm.internal.o.g(callback, "callback");
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.wxa_lite_app_widget.WxaLiteAppWidgetFlutterPluginApi.tapEvent", INSTANCE.getCodec()).send(kz5.b0.c(messageArg), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi$tapEvent$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                yz5.l.this.invoke((java.util.Map) obj);
            }
        });
    }

    public final void updatePopGestureEnable(com.tencent.pigeon.liteapp.WxaLiteAppWidgetUpdatePopGestureEnableMessage messageArg, final yz5.l callback) {
        kotlin.jvm.internal.o.g(messageArg, "messageArg");
        kotlin.jvm.internal.o.g(callback, "callback");
        new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.wxa_lite_app_widget.WxaLiteAppWidgetFlutterPluginApi.updatePopGestureEnable", INSTANCE.getCodec()).send(kz5.b0.c(messageArg), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi$updatePopGestureEnable$1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                yz5.l.this.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
            }
        });
    }
}
