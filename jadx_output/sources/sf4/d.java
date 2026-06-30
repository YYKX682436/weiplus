package sf4;

/* loaded from: classes4.dex */
public final class d extends y9.i {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f407433n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f407434o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f407435p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f407436q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f407437r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f407438s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f407439t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f407440u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f407441v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f407442w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f407443x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f407444y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f407445z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.f407445z = true;
        this.C = true;
        this.E = true;
        setContentView(com.tencent.mm.R.layout.cwd);
    }

    @Override // y9.i, androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(134218752);
            window.clearFlags(2);
        }
        this.f407433n = findViewById(com.tencent.mm.R.id.nll);
        this.f407434o = findViewById(com.tencent.mm.R.id.nlt);
        this.f407435p = findViewById(com.tencent.mm.R.id.nlq);
        this.f407436q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nlm);
        this.f407437r = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nlu);
        this.f407438s = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nlr);
        this.f407439t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nls);
        this.f407440u = findViewById(com.tencent.mm.R.id.nln);
        this.f407440u = findViewById(com.tencent.mm.R.id.nln);
        this.f407441v = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nlo);
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac);
        android.widget.ImageView imageView = this.f407436q;
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.delete_icon_nor, color));
        }
        android.widget.ImageView imageView2 = this.f407437r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_refresh, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
        }
        android.widget.ImageView imageView3 = this.f407441v;
        if (imageView3 != null) {
            imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_circle_star, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
        }
        android.view.View view2 = this.f407434o;
        if (view2 != null) {
            view2.setOnClickListener(new sf4.c(this));
        }
        if (this.A && (view = this.f407434o) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f407445z) {
            android.view.View view3 = this.f407433n;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = this.f407433n;
            if (view4 != null) {
                view4.setOnClickListener(new sf4.a(this));
            }
        } else {
            android.view.View view5 = this.f407433n;
            if (view5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.C) {
            android.view.View view6 = this.f407435p;
            if (view6 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view7 = this.f407435p;
            if (view7 != null) {
                view7.setOnClickListener(new sf4.b(this));
            }
            if (this.B) {
                android.widget.ImageView imageView4 = this.f407438s;
                if (imageView4 != null) {
                    imageView4.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_unlock, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
                }
                android.widget.TextView textView = this.f407439t;
                if (textView != null) {
                    textView.setText(getContext().getString(com.tencent.mm.R.string.jlu));
                }
            } else {
                android.widget.ImageView imageView5 = this.f407438s;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_lock, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
                }
                android.widget.TextView textView2 = this.f407439t;
                if (textView2 != null) {
                    textView2.setText(getContext().getString(com.tencent.mm.R.string.jlv));
                }
            }
        } else {
            android.view.View view8 = this.f407435p;
            if (view8 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view8, arrayList5.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.E) {
        }
        android.view.View view9 = this.f407440u;
        if (view9 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view9, arrayList6.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484059cv0);
        if (findViewById != null) {
            findViewById.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
    }
}
