package sj3;

/* loaded from: classes11.dex */
public class e1 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sj3.f1 f408492a;

    public e1(sj3.f1 f1Var) {
        this.f408492a = f1Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        if (bVar.f359531a != 0 || bVar.f359534d == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new sj3.d1(this, bVar));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
