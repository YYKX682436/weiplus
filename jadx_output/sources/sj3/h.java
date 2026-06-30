package sj3;

/* loaded from: classes14.dex */
public final class h implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.j f408545d;

    public h(sj3.j jVar) {
        this.f408545d = jVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        this.f408545d.k();
        return true;
    }
}
