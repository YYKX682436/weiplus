package fb5;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb5.e f260884d;

    public d(fb5.e eVar) {
        this.f260884d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f260884d.notifyDataSetChanged();
    }
}
