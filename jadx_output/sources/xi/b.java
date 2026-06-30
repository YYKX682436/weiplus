package xi;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj.a f454648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xi.e f454649e;

    public b(xi.e eVar, bj.a aVar) {
        this.f454649e = eVar;
        this.f454648d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        xi.e eVar = this.f454649e;
        android.widget.Toast toast = new android.widget.Toast(eVar.f454651a);
        toast.setDuration(1);
        toast.setGravity(16, 0, 0);
        toast.setView(android.view.LayoutInflater.from(eVar.f454651a).inflate(com.tencent.mm.R.layout.cgq, (android.view.ViewGroup) null));
        toast.show();
        android.os.Looper.myQueue().addIdleHandler(new xi.a(this, toast));
    }
}
