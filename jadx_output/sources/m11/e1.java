package m11;

/* loaded from: classes9.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k70.f0 f322681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m11.l1 f322682g;

    public e1(m11.l1 l1Var, java.lang.String str, java.lang.String str2, k70.f0 f0Var) {
        this.f322682g = l1Var;
        this.f322679d = str;
        this.f322680e = str2;
        this.f322681f = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f322682g.d(this.f322679d, this.f322680e, this.f322681f);
    }
}
