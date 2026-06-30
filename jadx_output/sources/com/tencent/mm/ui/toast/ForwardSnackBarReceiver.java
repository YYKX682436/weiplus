package com.tencent.mm.ui.toast;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/toast/ForwardSnackBarReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ForwardSnackBarReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f209957a = 0;

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r13, java.lang.CharSequence r14, int r15, java.lang.String r16, java.lang.String r17, int r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.toast.ForwardSnackBarReceiver.a(android.content.Context, java.lang.CharSequence, int, java.lang.String, java.lang.String, int):void");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.CharSequence charSequenceExtra = intent.getCharSequenceExtra("INTENT_SNACK_BAR_TEXT");
        int intExtra = intent.getIntExtra("INTENT_SNACK_BAR_ICON_ID", 0);
        java.lang.String stringExtra = intent.getStringExtra("INTENT_SNACK_BAR_FORWARD_USERNAME");
        java.lang.String stringExtra2 = intent.getStringExtra("INTENT_SNACK_BAR_FROM_USERNAME");
        if (com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.isForeground()) {
            com.tencent.mars.xlog.Log.i("WeToastStarter", "EnterChattingAfterTrans forwardSnackBarReceiver onReceive text:" + ((java.lang.Object) charSequenceExtra) + ", toUsername:" + stringExtra + ", fromUsername:" + stringExtra2);
            a(context, charSequenceExtra, intExtra, stringExtra, stringExtra2, 3);
        }
    }
}
