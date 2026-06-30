package jz1;

/* loaded from: classes13.dex */
public class f implements yj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jz1.e f302690a;

    public f(jz1.e eVar) {
        this.f302690a = eVar;
    }

    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        final jz1.e eVar = this.f302690a;
        if (obj == null || !(obj instanceof android.view.View) || !u46.l.c(str4, "setAlpha")) {
            if (obj == null || !(obj instanceof android.view.View) || !u46.l.c(str4, "setVisibility") || ((android.view.View) obj).getVisibility() == eVar.f302653w) {
                return;
            }
            eVar.getClass();
            sz1.i.d(new java.lang.Runnable() { // from class: jz1.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    jz1.e.this.fj(0, -1, -1);
                }
            }, 300L);
            return;
        }
        android.view.View view = (android.view.View) obj;
        if (java.lang.Math.abs(view.getAlpha() - eVar.f302652v) > 2.0E-9f) {
            eVar.getClass();
            android.content.Context g17 = sz1.a.g(view);
            if (g17 == null || u46.l.c(g17.getClass().getSimpleName(), "LauncherUI")) {
                return;
            }
            sz1.i.d(new java.lang.Runnable() { // from class: jz1.e$$l
                @Override // java.lang.Runnable
                public final void run() {
                    jz1.e.this.fj(0, -1, -1);
                }
            }, 300L);
        }
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        jz1.e eVar = this.f302690a;
        if (obj != null && (obj instanceof android.view.View) && u46.l.c(str4, "setAlpha")) {
            eVar.f302652v = ((android.view.View) obj).getAlpha();
        } else if (obj != null && (obj instanceof android.view.View) && u46.l.c(str4, "setVisibility")) {
            eVar.f302653w = ((android.view.View) obj).getVisibility();
        }
    }
}
