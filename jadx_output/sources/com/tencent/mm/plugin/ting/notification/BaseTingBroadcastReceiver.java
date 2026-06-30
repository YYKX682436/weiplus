package com.tencent.mm.plugin.ting.notification;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ting/notification/BaseTingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BaseTingBroadcastReceiver extends android.content.BroadcastReceiver {
    public void a(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        int intExtra = intent.getIntExtra("com.tencent.mm.ting.ActionCode", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTingBroadcastReceiver", "onReceive:" + intExtra);
        if (intExtra == 1) {
            d();
            return;
        }
        if (intExtra == 2) {
            c();
            return;
        }
        if (intExtra == 3) {
            b();
        } else if (intExtra == 4) {
            e();
        } else {
            if (intExtra != 5) {
                return;
            }
            a(context, intent.getIntExtra("com.tent.mm.ting.PlayAppId", -1));
        }
    }
}
