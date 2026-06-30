package qe;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.plugin.appbrand.jsruntime.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.f f361918d;

    public b(qe.f fVar) {
        this.f361918d = fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.x
    public final void onDestroy() {
        ((qe.c) ((jz5.n) this.f361918d.f361944c).getValue()).destroy();
        this.f361918d.f361942a = null;
        this.f361918d.f361943b = null;
    }
}
