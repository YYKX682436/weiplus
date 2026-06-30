package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class CategoryTipView extends android.widget.RelativeLayout implements ze4.e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f206333h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f206334d;

    /* renamed from: e, reason: collision with root package name */
    public int f206335e;

    /* renamed from: f, reason: collision with root package name */
    public long f206336f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f206337g;

    public CategoryTipView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206334d = null;
        this.f206335e = 0;
        this.f206336f = 0L;
        this.f206337g = "";
        b();
    }

    public void a(int i17) {
        this.f206335e = i17;
        if (!c()) {
            setVisibility(8);
            this.f206334d.setVisibility(8);
            return;
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("StoryShouldShowEntraceInFavorFriend", 1);
        if (b17 == 1 && (i17 & 1) != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CategoryTipView", "%s showStoryCategory has new story %s", this, java.lang.Integer.valueOf(b17));
            setVisibility(0);
            this.f206334d.setVisibility(0);
            android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(com.tencent.mm.R.raw.icon_outlined_one_day_video_blue);
            drawable.setBounds(0, 0, i65.a.b(getContext(), 20), i65.a.b(getContext(), 20));
            this.f206334d.setCompoundDrawables(null, null, drawable, null);
            this.f206334d.invalidate();
            return;
        }
        if (b17 != 1 || (i17 & 2) == 0) {
            setVisibility(8);
            this.f206334d.setVisibility(8);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CategoryTipView", "%s showStoryCategory has story %s", this, java.lang.Integer.valueOf(b17));
        setVisibility(0);
        this.f206334d.setVisibility(0);
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_one_day_video, getContext().getResources().getColor(com.tencent.mm.R.color.f478714f5));
        e17.setBounds(0, 0, i65.a.b(getContext(), 20), i65.a.b(getContext(), 20));
        this.f206334d.setCompoundDrawables(null, null, e17, null);
        this.f206334d.invalidate();
    }

    public final void b() {
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f487986dc, (android.view.ViewGroup) this, true);
        this.f206334d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cfz);
        setOnClickListener(new com.tencent.mm.ui.contact.m0(this));
        ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
        java.util.List list = ef4.i.f252446a;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        java.util.List list2 = ef4.i.f252446a;
        if (list2.contains(weakReference)) {
            return;
        }
        list2.add(weakReference);
    }

    public final boolean c() {
        java.lang.Object tag = getTag();
        return tag != null && (tag instanceof java.lang.Integer) && ((java.lang.Integer) tag).intValue() == 32;
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        if (i17 == 0) {
            this.f206337g = com.tencent.mm.ui.x2.a(java.lang.String.valueOf(6L));
        }
    }

    public CategoryTipView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f206334d = null;
        this.f206335e = 0;
        this.f206336f = 0L;
        this.f206337g = "";
        b();
    }
}
