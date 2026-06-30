package or1;

/* loaded from: classes9.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.d67 f347589a;

    /* renamed from: b, reason: collision with root package name */
    public int f347590b;

    public v1() {
        this.f347590b = 0;
        this.f347589a = new r45.d67();
    }

    public static o11.g a(android.content.Context context, int i17) {
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342091o = i17;
        fVar.f342096t = true;
        if (i65.a.D(context)) {
            fVar.f342097u = 0.1f * i65.a.f(context, com.tencent.mm.R.dimen.f479566i);
        } else {
            fVar.f342097u = 0.1f * i65.a.f(context, com.tencent.mm.R.dimen.f479890i3);
        }
        return fVar.a();
    }

    public v1(r45.d67 d67Var) {
        this.f347590b = 0;
        this.f347589a = d67Var;
    }
}
