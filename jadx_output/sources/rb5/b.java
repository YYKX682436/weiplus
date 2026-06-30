package rb5;

/* loaded from: classes11.dex */
public class b implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb5.l f393863d;

    public b(rb5.l lVar) {
        this.f393863d = lVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        rb5.l lVar = this.f393863d;
        com.tencent.mm.ui.MMActivity mMActivity = lVar.f393880d;
        if (mMActivity != null && !mMActivity.isDestroyed() && !lVar.f393880d.isFinishing()) {
            rb5.l.a(lVar, true);
        }
        return false;
    }
}
