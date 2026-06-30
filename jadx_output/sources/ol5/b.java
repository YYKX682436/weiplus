package ol5;

/* loaded from: classes15.dex */
public class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f346211d;

    /* renamed from: e, reason: collision with root package name */
    public int f346212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ol5.e f346213f;

    public b(ol5.e eVar) {
        this.f346213f = eVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = this.f346211d;
        ol5.e eVar = this.f346213f;
        if (i17 == eVar.f346220d.getMeasuredWidth() && this.f346212e == eVar.f346220d.getMeasuredHeight()) {
            return;
        }
        eVar.b();
        this.f346211d = eVar.f346220d.getMeasuredWidth();
        this.f346212e = eVar.f346220d.getMeasuredHeight();
    }
}
