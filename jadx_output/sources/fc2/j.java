package fc2;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.o f260947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f260948e;

    public j(fc2.o oVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f260947d = oVar;
        this.f260948e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.o oVar = this.f260947d;
        oVar.getClass();
        new fc2.i(oVar).onScrollStateChanged(this.f260948e, 4);
    }
}
