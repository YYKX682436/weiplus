package w11;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441970d;

    public b(w11.c cVar, java.lang.String str) {
        this.f441970d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.modelavatar.m0().a(this.f441970d, new w11.a(this));
    }
}
