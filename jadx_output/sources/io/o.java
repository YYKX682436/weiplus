package io;

/* loaded from: classes3.dex */
public final class o extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f293419a;

    public o(android.content.Context context) {
        this.f293419a = context;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        if (outline != null) {
            outline.setRoundRect(0, 0, view != null ? view.getMeasuredWidth() : 0, view != null ? view.getMeasuredHeight() : 0, ym5.x.a(this.f293419a, 8.0f));
        }
    }
}
