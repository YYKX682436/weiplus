package cy;

/* loaded from: classes5.dex */
public final class d extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f224665a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io.flutter.plugin.common.BinaryMessenger messenger) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        this.f224665a = messenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        cy.h.f224666a.a();
        if (context == null) {
            throw new java.lang.IllegalStateException("ChatbotCard PlatformView missing context, viewId=" + i17);
        }
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        if (map == null) {
            map = kz5.q0.f314001d;
        }
        java.util.Map map2 = map;
        java.lang.Object obj2 = map2.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = map2.get("itemId");
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create viewId=");
        sb6.append(i17);
        sb6.append(" scene=");
        sb6.append(str);
        sb6.append(" itemId=");
        sb6.append(str2);
        sb6.append(" suffix=");
        sb6.append(valueOf);
        sb6.append(" argsType=");
        sb6.append(obj != null ? obj.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotCardPlatformViewFactory", sb6.toString());
        return new cy.c(context, i17, this.f224665a, valueOf, new cy.a(), map2);
    }
}
