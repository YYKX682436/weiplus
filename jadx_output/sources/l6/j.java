package l6;

/* loaded from: classes16.dex */
public class j extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l6.l f316731a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l6.l lVar, android.os.Looper looper) {
        super(looper);
        this.f316731a = lVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17;
        try {
            int i18 = message.what;
            l6.l lVar = this.f316731a;
            if (i18 != 101) {
                if (i18 != 102) {
                    return;
                }
                int i19 = lVar.f316733b - 1;
                lVar.f316733b = i19;
                if (i19 > 0) {
                    lVar.f316737f.sendEmptyMessageDelayed(101, lVar.f316732a);
                    return;
                }
                return;
            }
            p6.b bVar = (p6.b) lVar.f316738g;
            p6.d dVar = bVar.f352120d;
            l6.l lVar2 = dVar.f352132h;
            if (lVar2 != null) {
                synchronized (lVar2) {
                    i17 = lVar2.f316734c;
                }
            } else {
                i17 = bVar.f352118b;
            }
            dVar.e(bVar.f352117a, i17, bVar.f352119c, null);
            lVar.f316737f.sendEmptyMessageDelayed(102, lVar.f316735d);
        } catch (java.lang.Throwable unused) {
        }
    }
}
