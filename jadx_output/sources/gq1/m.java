package gq1;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gq1.d f274512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gq1.o f274513g;

    public m(gq1.o oVar, int i17, java.lang.String str, gq1.d dVar) {
        this.f274513g = oVar;
        this.f274510d = i17;
        this.f274511e = str;
        this.f274512f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f274513g.f274520d.a(null, this.f274510d, this.f274511e, this.f274512f);
    }
}
