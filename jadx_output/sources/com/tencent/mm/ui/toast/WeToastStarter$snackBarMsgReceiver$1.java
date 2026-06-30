package com.tencent.mm.ui.toast;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/ui/toast/WeToastStarter$snackBarMsgReceiver$1", "Landroid/content/BroadcastReceiver;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class WeToastStarter$snackBarMsgReceiver$1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f209958a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.app.Activity activity;
        if (intent != null) {
            java.lang.CharSequence charSequenceExtra = intent.getCharSequenceExtra("INTENT_SNACK_BAR_TEXT");
            int intExtra = intent.getIntExtra("INTENT_SNACK_BAR_ICON_ID", 0);
            if (com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.isForeground()) {
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                    java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
                    activity = j17 != null ? (android.app.Activity) j17.get() : null;
                }
                h0Var.f310123d = activity;
                if (activity != null && activity.isFinishing()) {
                    com.tencent.mars.xlog.Log.i("WeToastStarter", "snackBarMsgReceiver topActivity is finishing!!");
                    pm0.v.V(100L, new bk5.g(h0Var, charSequenceExtra, intExtra));
                    return;
                }
                if (h0Var.f310123d == null) {
                    h0Var.f310123d = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                com.tencent.mars.xlog.Log.i("WeToastStarter", "snackBarMsgReceiver2 msgReceiver topActivity:%s", h0Var.f310123d);
                android.content.Context context2 = (android.content.Context) h0Var.f310123d;
                if (context2 == null) {
                    return;
                }
                int i17 = al5.u4.f6058t;
                al5.t4 t4Var = new al5.t4(context2);
                t4Var.f6042e = charSequenceExtra;
                t4Var.e(intExtra);
                t4Var.g();
            }
        }
    }
}
