package w82;

/* loaded from: classes3.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f443944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel f443945e;

    public x0(android.view.View view, com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel) {
        this.f443944d = view;
        this.f443945e = favTopTagPanel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.drawable.Drawable i17 = i65.a.i(this.f443945e.getContext(), com.tencent.mm.R.drawable.f481477tz);
        android.view.View view = this.f443944d;
        view.setBackground(i17);
        view.invalidate();
    }
}
