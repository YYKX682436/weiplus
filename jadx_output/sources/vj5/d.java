package vj5;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vj5.h f437693e;

    public d(vj5.h hVar, boolean z17) {
        this.f437693e = hVar;
        this.f437692d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f437693e.setLayoutFrozen(this.f437692d);
    }
}
