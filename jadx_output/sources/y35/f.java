package y35;

/* loaded from: classes11.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.g f459209d;

    public f(y35.g gVar) {
        this.f459209d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f459209d.f459211d.f459196d;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).showVKB();
        }
    }
}
