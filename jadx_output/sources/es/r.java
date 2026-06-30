package es;

/* loaded from: classes15.dex */
public class r implements es.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ es.s f256273a;

    public r(es.s sVar) {
        this.f256273a = sVar;
    }

    @Override // es.f
    public void a() {
        onAnimationEnd();
    }

    @Override // es.f
    public void b() {
    }

    @Override // es.f
    public void onAnimationEnd() {
        this.f256273a.f256275e.f256278c.f64975v = true;
        new android.os.Handler().post(new es.q(this));
    }

    @Override // es.f
    public void onAnimationStart() {
    }
}
