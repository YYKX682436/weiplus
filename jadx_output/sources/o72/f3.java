package o72;

/* loaded from: classes8.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o72.i3 f343335e;

    public f3(o72.i3 i3Var, java.lang.String str) {
        this.f343335e = i3Var;
        this.f343334d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f343335e.b(this.f343334d);
    }
}
