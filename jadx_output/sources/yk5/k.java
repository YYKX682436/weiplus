package yk5;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f462887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk5.u f462888e;

    public k(yk5.u uVar, java.lang.Runnable runnable) {
        this.f462888e = uVar;
        this.f462887d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f462887d.run();
        this.f462888e.notifyDataSetChanged();
    }
}
