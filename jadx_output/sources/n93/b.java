package n93;

/* loaded from: classes.dex */
public class b implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n93.c f335919a;

    public b(n93.c cVar) {
        this.f335919a = cVar;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        this.f335919a.f143443f.a("fail errCode: " + i17 + "  errMsg: " + str);
    }

    @Override // l81.v0
    public void onSuccess() {
        this.f335919a.f143443f.d(false);
    }
}
