package hx2;

/* loaded from: classes2.dex */
public final class g extends hx2.i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f285647b;

    /* renamed from: c, reason: collision with root package name */
    public final int f285648c;

    /* renamed from: d, reason: collision with root package name */
    public final int f285649d;

    /* renamed from: e, reason: collision with root package name */
    public final int f285650e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f285651f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f285652g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f285653h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f285654i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f285655j;

    public /* synthetic */ g(android.content.Context context, int i17, int i18, int i19, boolean z17, boolean z18, int i27, kotlin.jvm.internal.i iVar) {
        this(context, (i27 & 2) != 0 ? com.tencent.mm.R.color.f478494f : i17, (i27 & 4) != 0 ? com.tencent.mm.R.color.BW_0_Alpha_0_5 : i18, (i27 & 8) != 0 ? com.tencent.mm.R.drawable.abt : i19, (i27 & 16) != 0 ? true : z17, (i27 & 32) != 0 ? false : z18);
    }

    @Override // hx2.i
    public android.view.View a() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View view = this.f285655j;
        android.content.Context context = this.f285647b;
        if (view == null) {
            this.f285655j = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b6j, (android.view.ViewGroup) null);
        }
        android.view.View view2 = this.f285655j;
        if (view2 != null && (findViewById2 = view2.findViewById(com.tencent.mm.R.id.f485216gy1)) != null) {
            findViewById2.setBackgroundResource(this.f285650e);
        }
        android.view.View view3 = this.f285655j;
        boolean z17 = this.f285651f;
        if (view3 != null && (findViewById = view3.findViewById(com.tencent.mm.R.id.gxy)) != null) {
            if (!z17 && !this.f285652g) {
                findViewById.getLayoutParams().height = -2;
            }
            findViewById.setBackgroundColor(context.getResources().getColor(this.f285648c));
        }
        android.view.View view4 = this.f285655j;
        if (view4 != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view4.findViewById(com.tencent.mm.R.id.gxz)) != null) {
            weImageView.setVisibility(z17 ? 0 : 8);
            weImageView.setIconColor(context.getResources().getColor(this.f285649d));
        }
        return this.f285655j;
    }

    @Override // hx2.i
    public void e(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        jz5.g gVar = this.f285653h;
        android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).getValue()).getLayoutParams();
        layoutParams.height = i65.a.b(this.f285647b, 4);
        view.setLayoutParams(layoutParams);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f285654i).getValue()).setAlpha(0.0f);
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.g(layout, f17, source);
        if (this.f285651f) {
            float borderExpand = layout.getBorderExpand();
            float borderExpand2 = layout.getBorderExpand();
            android.content.Context context = this.f285647b;
            float b17 = (f17 - borderExpand) / ((borderExpand2 + i65.a.b(context, 56)) - borderExpand);
            float f18 = (b17 - 0.5f) * 2.0f;
            if (f18 < 0.0f) {
                f18 = 0.0f;
            }
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (b17 > 1.0f) {
                b17 = 1.0f;
            }
            float f19 = 0.0f < b17 ? b17 : 0.0f;
            int b18 = i65.a.b(context, 16);
            int b19 = i65.a.b(context, 4);
            jz5.g gVar = this.f285653h;
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).getValue()).getLayoutParams();
            layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
            view.setLayoutParams(layoutParams);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f285654i).getValue()).setAlpha(f18);
        }
    }

    public g(android.content.Context context, int i17, int i18, int i19, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285647b = context;
        this.f285648c = i17;
        this.f285649d = i18;
        this.f285650e = i19;
        this.f285651f = z17;
        this.f285652g = z18;
        this.f285653h = jz5.h.b(new hx2.f(this));
        this.f285654i = jz5.h.b(new hx2.d(this));
        jz5.h.b(new hx2.e(this));
    }
}
