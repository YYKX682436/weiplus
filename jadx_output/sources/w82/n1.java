package w82;

/* loaded from: classes12.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w82.o1 f443915d;

    public n1(w82.o1 o1Var) {
        this.f443915d = o1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443915d.f443917d;
        if (favVideoView.f101569g != null) {
            favVideoView.g(favVideoView.f101576q);
        }
    }
}
