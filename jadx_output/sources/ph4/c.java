package ph4;

/* loaded from: classes8.dex */
public final class c extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354469d;

    public c(android.content.Context context) {
        this.f354469d = context;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        if (u07 == -1) {
            u07 = parent.w0(view).getOldPosition();
        }
        int i17 = ph4.e.f354471p;
        int i18 = ph4.e.f354472q;
        outRect.left = i18 / 2;
        outRect.right = i18 / 2;
        if (u07 / 3 > 0) {
            outRect.top = i65.a.f(this.f354469d, com.tencent.mm.R.dimen.f479693cs);
        } else {
            outRect.top = 0;
        }
        outRect.bottom = 0;
    }
}
