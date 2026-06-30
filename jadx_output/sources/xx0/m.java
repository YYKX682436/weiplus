package xx0;

/* loaded from: classes5.dex */
public final class m implements uu3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu3.h f457914a;

    public m(vu3.h hVar) {
        this.f457914a = hVar;
    }

    @Override // uu3.g
    public android.graphics.Rect a(uu3.u drawer) {
        kotlin.jvm.internal.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View a17 = this.f457914a.a();
        if (a17 != null) {
            a17.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
