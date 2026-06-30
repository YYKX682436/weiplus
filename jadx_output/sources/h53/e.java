package h53;

/* loaded from: classes8.dex */
public class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h53.j f279043d;

    public e(h53.j jVar) {
        this.f279043d = jVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f279043d.a();
        return false;
    }
}
