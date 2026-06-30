package hn4;

/* loaded from: classes11.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.i f282571d;

    public h(hn4.i iVar) {
        this.f282571d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoAdapter", "show education pop window");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(this.f282571d.f282575f.f264492g.B().getString(com.tencent.mm.R.string.k1f));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.f490455vj);
        u1Var.l(new hn4.g(this));
        u1Var.e(new hn4.f(this));
        u1Var.q(false);
    }
}
