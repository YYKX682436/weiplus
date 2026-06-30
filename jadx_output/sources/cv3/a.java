package cv3;

/* loaded from: classes5.dex */
public final class a implements uu3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu3.h f222566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cv3.c f222567b;

    public a(vu3.h hVar, cv3.c cVar) {
        this.f222566a = hVar;
        this.f222567b = cVar;
    }

    @Override // uu3.g
    public android.graphics.Rect a(uu3.u drawer) {
        kotlin.jvm.internal.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View a17 = this.f222566a.a();
        if (a17 != null) {
            a17.getGlobalVisibleRect(rect);
        }
        java.lang.String str = this.f222567b.f222572g;
        rect.toString();
        return rect;
    }
}
