package zl5;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final zl5.b f474086a = new zl5.b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f474087b;

    public static void b(zl5.b bVar, android.view.View view, float f17, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            z18 = true;
        }
        bVar.getClass();
        if (view != null) {
            view.setOutlineProvider(new zl5.a(z17, z18, f17));
        }
        if (view == null) {
            return;
        }
        view.setClipToOutline(true);
    }

    public final void a(android.view.View view, float f17) {
        b(this, view, f17, false, false, 12, null);
    }
}
