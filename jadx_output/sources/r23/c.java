package r23;

/* loaded from: classes4.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f368810d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ib6 f368811e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f368812f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f368813g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.g0 f368814h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f368815i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageButton f368816m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f368817n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f368818o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f368819p;

    /* renamed from: q, reason: collision with root package name */
    public int f368820q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f368821r;

    public c(java.lang.ref.WeakReference weakReference, r45.ib6 ib6Var) {
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI;
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI2;
        android.content.Intent intent;
        this.f368810d = weakReference;
        this.f368811e = ib6Var;
        boolean booleanExtra = (weakReference == null || (albumPreviewUI2 = (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) weakReference.get()) == null || (intent = albumPreviewUI2.getIntent()) == null) ? false : intent.getBooleanExtra("key_sns_publish_template", false);
        this.f368812f = booleanExtra;
        r23.a[] aVarArr = r23.a.f368808d;
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(0);
        this.f368813g = j0Var;
        this.f368814h = j0Var;
        this.f368820q = 1;
        this.f368821r = r23.b.f368809d;
        java.lang.ref.WeakReference weakReference2 = this.f368810d;
        if (weakReference2 != null && (albumPreviewUI = (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) weakReference2.get()) != null) {
            this.f368815i = (android.widget.LinearLayout) albumPreviewUI.findViewById(com.tencent.mm.R.id.o17);
            this.f368816m = (android.widget.ImageButton) albumPreviewUI.findViewById(com.tencent.mm.R.id.f487254o12);
            this.f368817n = (android.widget.TextView) albumPreviewUI.findViewById(com.tencent.mm.R.id.o1l);
            if (albumPreviewUI instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI) {
                com.tencent.mm.plugin.gallery.view.AlbumFooterBarView g86 = ((com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI) albumPreviewUI).g8();
                g86 = g86 instanceof android.view.View ? g86 : null;
                if (g86 != null) {
                    this.f368815i = (android.widget.LinearLayout) g86.findViewById(com.tencent.mm.R.id.o17);
                    this.f368816m = (android.widget.ImageButton) g86.findViewById(com.tencent.mm.R.id.f487254o12);
                    this.f368817n = (android.widget.TextView) g86.findViewById(com.tencent.mm.R.id.o1l);
                }
            }
            android.widget.TextView textView = this.f368817n;
            if (textView != null) {
                textView.setTextSize(0, i65.a.f(albumPreviewUI, com.tencent.mm.R.dimen.f479897ia));
            }
            this.f368818o = (android.widget.LinearLayout) albumPreviewUI.findViewById(com.tencent.mm.R.id.f487252o10);
            this.f368819p = (android.widget.TextView) albumPreviewUI.findViewById(com.tencent.mm.R.id.f487253o11);
        }
        android.widget.ImageButton imageButton = this.f368816m;
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
        android.widget.TextView textView2 = this.f368817n;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        if (booleanExtra && (linearLayout = this.f368815i) != null) {
            linearLayout.setVisibility(0);
        }
        if ((ib6Var != null ? ib6Var.f376910e : null) != null) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
            b(0);
        }
    }

    public final boolean a() {
        java.lang.Integer num = (java.lang.Integer) this.f368814h.getValue();
        r23.a[] aVarArr = r23.a.f368808d;
        return num == null || num.intValue() != 0;
    }

    public final void b(int i17) {
        androidx.lifecycle.j0 j0Var = this.f368813g;
        if (i17 == 0) {
            android.widget.ImageButton imageButton = this.f368816m;
            if (imageButton != null) {
                imageButton.setSelected(true);
            }
            android.widget.ImageButton imageButton2 = this.f368816m;
            if (imageButton2 != null) {
                imageButton2.setEnabled(false);
            }
            android.widget.TextView textView = this.f368817n;
            if (textView != null) {
                textView.setClickable(false);
            }
            r23.a[] aVarArr = r23.a.f368808d;
            j0Var.setValue(2);
            this.f368820q = 2;
        } else if (a()) {
            android.widget.ImageButton imageButton3 = this.f368816m;
            if (imageButton3 != null) {
                imageButton3.setSelected(true);
            }
            android.widget.ImageButton imageButton4 = this.f368816m;
            if (imageButton4 != null) {
                imageButton4.setEnabled(true);
            }
            android.widget.TextView textView2 = this.f368817n;
            if (textView2 != null) {
                textView2.setClickable(true);
            }
            r23.a[] aVarArr2 = r23.a.f368808d;
            j0Var.setValue(1);
            this.f368820q = 1;
        }
        if (a()) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if ((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f487254o12) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.o1l)) {
            java.lang.Integer num = (java.lang.Integer) this.f368814h.getValue();
            r23.a[] aVarArr = r23.a.f368808d;
            if (num != null && num.intValue() == 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GalleryTemplateUI", "onClick: not enable to change");
                yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!a() && !((java.lang.Boolean) this.f368821r.invoke()).booleanValue()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GalleryTemplateUI", "not enable to select");
                yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            androidx.lifecycle.j0 j0Var = this.f368813g;
            if (a()) {
                r23.a[] aVarArr2 = r23.a.f368808d;
                i17 = 0;
            } else {
                r23.a[] aVarArr3 = r23.a.f368808d;
                i17 = 1;
            }
            j0Var.setValue(i17);
            android.widget.ImageButton imageButton = this.f368816m;
            if (imageButton != null) {
                imageButton.setSelected(a());
            }
            if (a()) {
                ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
