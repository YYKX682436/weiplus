package g0;

/* loaded from: classes14.dex */
public final class a implements g0.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f267336d;

    public a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f267336d = view;
    }

    @Override // g0.e
    public java.lang.Object a(d1.g gVar, s1.z zVar, kotlin.coroutines.Continuation continuation) {
        d1.g d17 = gVar.d(s1.a0.d(zVar));
        this.f267336d.requestRectangleOnScreen(new android.graphics.Rect((int) d17.f225629a, (int) d17.f225630b, (int) d17.f225631c, (int) d17.f225632d), false);
        return jz5.f0.f302826a;
    }
}
