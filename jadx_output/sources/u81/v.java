package u81;

/* loaded from: classes7.dex */
public class v extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u81.w f425482a;

    public v(u81.w wVar) {
        this.f425482a = wVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            return;
        }
        u81.w wVar = this.f425482a;
        com.tencent.mars.xlog.Log.i(wVar.f425485c.f425423u, "onReceive(%s)", "android.intent.action.USER_PRESENT");
        wVar.f425485c.s(u81.u.ON_SYSTEM_SCREEN_ON, null);
    }
}
