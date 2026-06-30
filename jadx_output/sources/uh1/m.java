package uh1;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f427835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uh1.q f427837f;

    public m(uh1.q qVar, java.lang.Runnable runnable, java.lang.String str) {
        this.f427837f = qVar;
        this.f427835d = runnable;
        this.f427836e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f427836e;
        uh1.q qVar = this.f427837f;
        try {
            this.f427835d.run();
        } finally {
            ((java.util.concurrent.ConcurrentSkipListSet) qVar.f427857d).remove(str);
        }
    }
}
