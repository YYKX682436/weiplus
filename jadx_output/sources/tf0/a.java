package tf0;

@j95.b
/* loaded from: classes11.dex */
public final class a extends i95.w implements uf0.e {
    public void Ai(android.content.Context context, java.lang.String plugin, java.lang.String entry, android.content.Intent intent, android.widget.RemoteViews remoteViews, java.lang.String description, boolean z17, java.lang.String channelId, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(entry, "entry");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(channelId, "channelId");
        com.tencent.mm.sdk.platformtools.u3.i(new bm5.b(fp.h.b(28) || kotlin.jvm.internal.o.b(android.os.Build.VERSION.CODENAME, "Q"), remoteViews, intent, plugin, entry, context, description, channelId, z18), z17 ? 0L : 800L);
    }

    public void wi(android.content.Context context, android.content.Intent intent, android.widget.RemoteViews remoteViews, java.lang.String description, java.lang.String str, boolean z17, java.lang.String channelId, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(channelId, "channelId");
        com.tencent.mm.sdk.platformtools.u3.i(new bm5.a(fp.h.b(28) || kotlin.jvm.internal.o.b(android.os.Build.VERSION.CODENAME, "Q"), remoteViews, intent, context, description, str, channelId, z18, z19), z17 ? 0L : 800L);
    }
}
