package nn0;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f338587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn0.m f338588e;

    public j(nn0.m mVar, int i17) {
        this.f338588e = mVar;
        this.f338587d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f338588e.c(this.f338587d);
    }
}
