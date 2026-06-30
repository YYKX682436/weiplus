package xj3;

/* loaded from: classes8.dex */
public final class b extends androidx.recyclerview.widget.f2 implements android.view.View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    public static final float f454857q = sj3.i1.f408570o;

    /* renamed from: r, reason: collision with root package name */
    public static final float f454858r = sj3.i1.f408568m;

    /* renamed from: s, reason: collision with root package name */
    public static final float f454859s = sj3.i1.f408562g;

    /* renamed from: t, reason: collision with root package name */
    public static final float f454860t = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 2);

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f454861d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f454862e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.CopyOnWriteArrayList f454863f;

    /* renamed from: g, reason: collision with root package name */
    public int f454864g;

    /* renamed from: h, reason: collision with root package name */
    public int f454865h;

    /* renamed from: i, reason: collision with root package name */
    public int f454866i;

    /* renamed from: m, reason: collision with root package name */
    public float f454867m;

    /* renamed from: n, reason: collision with root package name */
    public float f454868n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f454869o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f454870p;

    public b(androidx.recyclerview.widget.RecyclerView recyclerView, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f454861d = recyclerView;
        this.f454862e = context;
        this.f454863f = new java.util.concurrent.CopyOnWriteArrayList();
        this.f454864g = -1;
        this.f454865h = -1;
        this.f454866i = -1;
        this.f454867m = f454857q;
        this.f454868n = f454858r;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f454863f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f454870p = true;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        xj3.d holder = (xj3.d) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) this.f454867m, (int) this.f454868n);
        android.widget.ImageView imageView = holder.f454873e;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f454872d;
        if (weImageView != null) {
            weImageView.setLayoutParams(layoutParams);
        }
        if (this.f454866i != i17) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.f454870p) {
            this.f454870p = false;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f454861d;
            if (recyclerView != null) {
                int i18 = this.f454866i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbnailLayoutHolder;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbnailLayoutHolder;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        boolean z17 = !this.f454863f.isEmpty();
        float f17 = f454860t;
        if (z17 && i17 < this.f454863f.size()) {
            f3.i iVar = new f3.i(this.f454862e.getResources(), (android.graphics.Bitmap) this.f454863f.get(i17));
            iVar.f259249d.setAntiAlias(true);
            iVar.c(f17);
            if (weImageView != null) {
                weImageView.setBackground(iVar);
            }
        }
        if (weImageView != null) {
            weImageView.setClipToOutline(true);
        }
        if (weImageView != null) {
            weImageView.setOutlineProvider(new com.tencent.mm.plugin.voip.ui.f1(f17));
        }
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
        if (imageView != null) {
            imageView.setOutlineProvider(new com.tencent.mm.plugin.voip.ui.f1(f17));
        }
        holder.itemView.setTag(java.lang.Integer.valueOf(i17));
        holder.itemView.setClipToOutline(true);
        holder.itemView.setOutlineProvider(new com.tencent.mm.plugin.voip.ui.f1(f17));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        yz5.p pVar = this.f454869o;
        if (pVar != null) {
            java.lang.Object tag = v17.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f454862e).inflate(com.tencent.mm.R.layout.c3v, parent, false);
        inflate.setOnClickListener(this);
        return new xj3.d(inflate);
    }
}
