package pj5;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI f355374d;

    public h(com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI scheduleMsgDetailUI) {
        this.f355374d = scheduleMsgDetailUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI scheduleMsgDetailUI = this.f355374d;
        kotlinx.coroutines.l.d(androidx.lifecycle.z.a(scheduleMsgDetailUI), null, null, new com.tencent.mm.modelsimple.w(new pj5.g(scheduleMsgDetailUI), null), 3, null);
    }
}
