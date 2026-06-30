package re5;

/* loaded from: classes12.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.d0 f394561d;

    public c0(re5.d0 d0Var) {
        this.f394561d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        re5.d0 d0Var = this.f394561d;
        em.s1 s1Var = d0Var.f394564t;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar c17 = s1Var.c();
        c17.setVideoTotalTime(d0Var.f394566v);
        c17.a(d0Var.f394565u);
    }
}
