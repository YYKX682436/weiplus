package lt3;

/* loaded from: classes10.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f321248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.de f321249f;

    public j(android.content.Context context, android.view.ViewGroup viewGroup, r45.de deVar) {
        this.f321247d = context;
        this.f321248e = viewGroup;
        this.f321249f = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.n nVar = lt3.n.f321260a;
        r45.de it = this.f321249f;
        kotlin.jvm.internal.o.f(it, "$it");
        zu3.j jVar = new zu3.j(it);
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the emoji item view");
        zu3.l lVar = new zu3.l(this.f321247d);
        this.f321248e.addView(lVar, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        lVar.f475821y = true;
        lVar.setViewMatrix(jVar.f475811h);
        lVar.setEmojiInfo(jVar.f475810g);
        lVar.resume();
    }
}
