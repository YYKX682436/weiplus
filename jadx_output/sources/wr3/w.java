package wr3;

/* loaded from: classes2.dex */
public final class w extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f448909d;

    public w(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f448909d = context;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        android.content.Context context = this.f448909d;
        if (u07 == 0) {
            outRect.top = 0;
        } else {
            outRect.top = i65.a.b(context, 8);
        }
        outRect.bottom = i65.a.b(context, 8);
    }
}
