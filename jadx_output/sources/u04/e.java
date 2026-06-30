package u04;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u04.f f423479d;

    public e(u04.f fVar) {
        this.f423479d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u04.g gVar = this.f423479d.f423483d;
        if (gVar != null) {
            ((q04.w) gVar).a();
        }
    }
}
