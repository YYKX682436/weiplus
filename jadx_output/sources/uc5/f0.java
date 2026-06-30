package uc5;

/* loaded from: classes2.dex */
public final class f0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f426483d;

    public f0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f426483d = i65.a.h(context, com.tencent.mm.R.dimen.amz);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 == -1 || u07 <= 0) {
            return;
        }
        outRect.left = this.f426483d;
    }
}
