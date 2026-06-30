package rc5;

/* loaded from: classes11.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f394197a = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.ui.chatting.half.HalfScreenChattingStarter$msgReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(intent, "intent");
            bm5.f1.a();
            com.tencent.mm.sdk.platformtools.x2.n();
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
            com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner processUIResumedStateOwner = com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE;
            processUIResumedStateOwner.isForeground();
            intent.toString();
            android.content.Intent intent2 = (android.content.Intent) intent.getParcelableExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
            if (processUIResumedStateOwner.isForeground()) {
                android.content.BroadcastReceiver broadcastReceiver = rc5.z.f394197a;
                if (intent2 == null) {
                    com.tencent.mars.xlog.Log.e("HalfScreenChattingStarter", "startHalfScreenAct err extraData is null");
                    return;
                }
                intent2.setExtrasClassLoader(rc5.z.class.getClassLoader());
                java.lang.String stringExtra = intent2.getStringExtra("Chat_User");
                if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.x2.n() ? ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b : "", stringExtra)) {
                    com.tencent.mars.xlog.Log.w("HalfScreenChattingStarter", "curTalker is same, do nothing");
                    return;
                }
                android.content.Context n17 = com.tencent.mm.app.w.f53873r.n();
                if (n17 == null) {
                    return;
                }
                ((rb5.m) ((wn.o) i95.n0.c(wn.p.f447379a.getClass()))).Di(n17, stringExtra, intent2);
            }
        }
    };
}
