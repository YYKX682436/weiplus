package m11;

/* loaded from: classes12.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k70.f0 f322694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m11.l1 f322695f;

    public f1(m11.l1 l1Var, java.lang.String str, k70.f0 f0Var) {
        this.f322695f = l1Var;
        this.f322693d = str;
        this.f322694e = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f322695f.b(this.f322693d, this.f322694e);
    }
}
