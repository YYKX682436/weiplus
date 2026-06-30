package y9;

/* loaded from: classes3.dex */
public class h extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y9.i f460246a;

    public h(y9.i iVar) {
        this.f460246a = iVar;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        if (i17 == 5) {
            this.f460246a.cancel();
        }
    }
}
