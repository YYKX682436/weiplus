package l41;

/* loaded from: classes4.dex */
public class n2 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l41.o2 f315881a;

    public n2(l41.q2 q2Var, l41.o2 o2Var) {
        this.f315881a = o2Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        if (bVar.f359531a != 0 || (bitmap = bVar.f359534d) == null || bitmap.isRecycled()) {
            return;
        }
        this.f315881a.f315889a = bVar.f359534d;
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
