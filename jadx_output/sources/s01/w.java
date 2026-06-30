package s01;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j53 f401932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f401934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s01.y f401935g;

    public w(s01.y yVar, r45.j53 j53Var, java.lang.String str, boolean z17) {
        this.f401935g = yVar;
        this.f401932d = j53Var;
        this.f401933e = str;
        this.f401934f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f401935g.l(this.f401932d, this.f401933e, this.f401934f);
    }
}
