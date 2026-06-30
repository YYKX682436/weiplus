package q04;

/* loaded from: classes12.dex */
public final class w implements u04.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q04.y f359407a;

    public w(q04.y yVar) {
        this.f359407a = yVar;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SecRecoveryDataService", "timerNotifierDetachListener onTimerFinish");
        q04.y yVar = this.f359407a;
        boolean isEmpty = yVar.f359410d.isEmpty();
        u04.f fVar = yVar.f359411e;
        if (isEmpty) {
            fVar.f423481b.removeCallbacks(fVar.f423482c);
            return;
        }
        for (java.util.Map.Entry entry : yVar.f359410d.entrySet()) {
            yVar.Di((java.lang.String) entry.getKey(), ((q04.t) entry.getValue()).f359403b, ((q04.t) entry.getValue()).f359404c.a());
        }
        fVar.a();
    }
}
