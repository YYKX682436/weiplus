package lf4;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.f f318375d;

    public c0(if4.f fVar) {
        this.f318375d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: deleteItem fake ");
        if4.f fVar = this.f318375d;
        sb6.append(fVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfGalleryPresenter", sb6.toString());
        ef4.e0.f252441a.a(fVar.f291247e.f291253a);
        jf4.a aVar = jf4.a.f299432a;
        aVar.a(fVar.f291247e.f291259g);
        aVar.b(fVar.f291247e.f291259g);
    }
}
