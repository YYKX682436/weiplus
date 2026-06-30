package sz0;

/* loaded from: classes14.dex */
public final class a implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz0.c f413912d;

    public a(sz0.c cVar) {
        this.f413912d = cVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable d17) {
        kotlin.jvm.internal.o.g(d17, "d");
        sz0.c cVar = this.f413912d;
        int intValue = ((java.lang.Number) ((n0.q4) cVar.f413915m).getValue()).intValue() + 1;
        ((n0.q4) cVar.f413915m).setValue(java.lang.Integer.valueOf(intValue));
        long a17 = sz0.e.a(cVar.f413914i);
        ((n0.q4) cVar.f413916n).setValue(new d1.k(a17));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable d17, java.lang.Runnable what, long j17) {
        kotlin.jvm.internal.o.g(d17, "d");
        kotlin.jvm.internal.o.g(what, "what");
        ((android.os.Handler) sz0.e.f413920a.getValue()).postAtTime(what, j17);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable d17, java.lang.Runnable what) {
        kotlin.jvm.internal.o.g(d17, "d");
        kotlin.jvm.internal.o.g(what, "what");
        ((android.os.Handler) sz0.e.f413920a.getValue()).removeCallbacks(what);
    }
}
