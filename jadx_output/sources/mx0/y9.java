package mx0;

/* loaded from: classes3.dex */
public final class y9 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f332458d = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 2);

    /* renamed from: e, reason: collision with root package name */
    public final int f332459e = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.afq);

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        int i17 = this.f332458d;
        outRect.right = i17;
        outRect.left = i17;
        int b17 = state.b() - 1;
        int i18 = this.f332459e;
        if (u07 == b17) {
            outRect.right = (parent.getWidth() - i18) / 2;
        }
        if (u07 == 0) {
            outRect.left = (parent.getWidth() - i18) / 2;
        }
    }
}
