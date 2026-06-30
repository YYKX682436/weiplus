package nx0;

/* loaded from: classes3.dex */
public final class m1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f341163d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341164e;

    /* renamed from: f, reason: collision with root package name */
    public final int f341165f;

    /* renamed from: g, reason: collision with root package name */
    public final int f341166g;

    /* renamed from: h, reason: collision with root package name */
    public final int f341167h;

    /* renamed from: i, reason: collision with root package name */
    public final int f341168i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f341169m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f341170n;

    public m1(java.util.List dividerPositionList) {
        kotlin.jvm.internal.o.g(dividerPositionList, "dividerPositionList");
        this.f341163d = dividerPositionList;
        this.f341164e = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 21);
        this.f341165f = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        this.f341166g = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        this.f341167h = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 22);
        this.f341168i = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 2);
        this.f341169m = jz5.h.b(nx0.l1.f341157d);
        this.f341170n = new android.graphics.Paint();
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        int i17 = this.f341168i;
        if (u07 == 0) {
            outRect.left = this.f341166g;
            outRect.right = i17;
        } else if (this.f341163d.contains(java.lang.Integer.valueOf(u07))) {
            outRect.left = this.f341167h;
            outRect.right = i17;
        } else {
            outRect.left = i17;
            outRect.right = i17;
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (this.f341163d.contains(java.lang.Integer.valueOf(parent.u0(parent.getChildAt(i17))))) {
                c17.drawBitmap((android.graphics.Bitmap) ((jz5.n) this.f341169m).getValue(), r1.getLeft() - this.f341165f, r1.getTop() + this.f341164e, this.f341170n);
            }
        }
    }

    public /* synthetic */ m1(java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list);
    }
}
