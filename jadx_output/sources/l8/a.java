package l8;

/* loaded from: classes14.dex */
public final class a implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l8.c f316982d;

    public a(l8.c cVar) {
        this.f316982d = cVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable d17) {
        kotlin.jvm.internal.o.g(d17, "d");
        l8.c cVar = this.f316982d;
        int intValue = ((java.lang.Number) ((n0.q4) cVar.f316985m).getValue()).intValue() + 1;
        ((n0.q4) cVar.f316985m).setValue(java.lang.Integer.valueOf(intValue));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable d17, java.lang.Runnable what, long j17) {
        kotlin.jvm.internal.o.g(d17, "d");
        kotlin.jvm.internal.o.g(what, "what");
        ((android.os.Handler) l8.e.f316988a.getValue()).postAtTime(what, j17);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable d17, java.lang.Runnable what) {
        kotlin.jvm.internal.o.g(d17, "d");
        kotlin.jvm.internal.o.g(what, "what");
        ((android.os.Handler) l8.e.f316988a.getValue()).removeCallbacks(what);
    }
}
