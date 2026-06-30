package g95;

/* loaded from: classes9.dex */
public final class c0 {
    public c0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String str) {
        if (b().f(str)) {
            b().remove(str);
        }
        if (gm0.j1.a()) {
            if (c01.id.c() - ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) g95.d0.f269798c).getValue()).getLong("time", 0L) > g95.d0.f269800e) {
                ((ku5.t0) ku5.t0.f312615d).q(g95.a0.f269793d);
            }
        }
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) g95.d0.f269797b).getValue();
    }

    public final float c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getLocalVisibleRect(rect);
        if (new android.graphics.Rect(0, 0, view.getWidth(), view.getHeight()).isEmpty()) {
            return 100.0f;
        }
        if (rect.isEmpty()) {
            return 0.0f;
        }
        return ((rect.width() * 100.0f) * rect.height()) / (r1.width() * r1.height());
    }
}
