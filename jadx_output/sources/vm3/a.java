package vm3;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f438140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vm3.d f438141e;

    public a(int i17, vm3.d dVar) {
        this.f438140d = i17;
        this.f438141e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ScrollView U6;
        vm3.d dVar = this.f438141e;
        int scrollY = this.f438140d - dVar.U6().getScrollY();
        if (scrollY <= 0 || (U6 = dVar.U6()) == null) {
            return;
        }
        U6.smoothScrollBy(0, scrollY);
    }
}
