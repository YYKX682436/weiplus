package yt2;

/* loaded from: classes3.dex */
public final class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt2.g f465294d;

    public e(yt2.g gVar) {
        this.f465294d = gVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int max;
        yt2.g gVar = this.f465294d;
        if (gVar.f465304i <= 0) {
            max = 0;
        } else {
            max = (int) java.lang.Math.max(0L, gVar.f465304i - (c01.id.c() / 1000));
        }
        if (max > 0) {
            gVar.d().setText(gVar.c(max));
            return true;
        }
        yz5.a aVar = gVar.f465303h;
        if (aVar != null) {
            aVar.invoke();
        }
        gVar.b(2);
        return false;
    }
}
