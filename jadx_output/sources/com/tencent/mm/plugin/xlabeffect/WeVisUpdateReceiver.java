package com.tencent.mm.plugin.xlabeffect;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/xlabeffect/WeVisUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-xlabeffect_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WeVisUpdateReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f188595a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String action = intent.getAction();
        if (kotlin.jvm.internal.o.b("com.tencent.mm.WeVisUpdate", action)) {
            java.lang.String stringExtra = intent.getStringExtra("type");
            com.tencent.mars.xlog.Log.i("MicroMsg.WeVisUpdateReceiver", "onReceive: " + action + ", " + stringExtra);
            if (kotlin.jvm.internal.o.b(stringExtra, "wevis_model")) {
                p05.p3.f350639a.c();
            } else if (kotlin.jvm.internal.o.b(stringExtra, "effect_config")) {
                p05.v2.f350704d.Di();
            }
        }
    }
}
