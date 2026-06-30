package r35;

/* loaded from: classes11.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f369328d;

    public y3(r35.e4 e4Var) {
        this.f369328d = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f369328d.f369087g;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).showVKB();
        }
    }
}
