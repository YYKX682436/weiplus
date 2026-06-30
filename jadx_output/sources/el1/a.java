package el1;

/* loaded from: classes3.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f253728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f253729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f253730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f253731g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f253732h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f253733i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f253734m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f253735n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f253736o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f253737p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f253738q;

    public a(int i17, int i18, int i19, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        this.f253728d = i17;
        this.f253729e = i18;
        this.f253730f = i19;
        this.f253731g = f17;
        this.f253732h = f18;
        this.f253733i = f19;
        this.f253734m = f27;
        this.f253735n = f28;
        this.f253736o = f29;
        this.f253737p = f37;
        this.f253738q = f38;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.k3 w07 = parent.w0(view);
        if (w07 instanceof cl1.z) {
            cl1.z zVar = (cl1.z) w07;
            if (zVar.getItemViewType() == 1 || zVar.getItemViewType() == 2) {
                if (u07 == -1) {
                    u07 = zVar.getOldPosition();
                }
                int i17 = u07 - this.f253728d;
                if (i17 / 4 >= 1) {
                    outRect.top = this.f253729e;
                } else {
                    outRect.top = this.f253730f;
                }
                outRect.bottom = 0;
                int i18 = i17 % 4;
                if (i18 == 0) {
                    outRect.left = (int) this.f253731g;
                    outRect.right = (int) this.f253732h;
                    return;
                }
                if (i18 == 1) {
                    outRect.left = (int) this.f253733i;
                    outRect.right = (int) this.f253734m;
                    return;
                } else if (i18 == 2) {
                    outRect.left = (int) this.f253735n;
                    outRect.right = (int) this.f253736o;
                    return;
                } else {
                    if (i18 != 3) {
                        return;
                    }
                    outRect.left = (int) this.f253737p;
                    outRect.right = (int) this.f253738q;
                    return;
                }
            }
        }
        outRect.top = 0;
        outRect.left = 0;
        outRect.right = 0;
    }
}
