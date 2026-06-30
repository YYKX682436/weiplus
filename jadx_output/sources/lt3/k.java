package lt3;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f321251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.de f321252f;

    public k(android.content.Context context, android.view.ViewGroup viewGroup, r45.de deVar) {
        this.f321250d = context;
        this.f321251e = viewGroup;
        this.f321252f = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.n nVar = lt3.n.f321260a;
        r45.de it = this.f321252f;
        kotlin.jvm.internal.o.f(it, "$it");
        zu3.s sVar = new zu3.s(it);
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the position item view");
        zu3.z zVar = new zu3.z(this.f321250d);
        this.f321251e.addView(zVar, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        zVar.d(sVar);
    }
}
