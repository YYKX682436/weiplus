package w82;

/* loaded from: classes12.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f443893a = false;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f443894b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageButton f443895c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageButton f443896d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f443897e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f443898f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f443899g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f443900h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f443901i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f443902j;

    /* renamed from: k, reason: collision with root package name */
    public w82.j f443903k;

    public void a(android.view.View view) {
        this.f443893a = false;
        this.f443894b = view;
    }

    public void b(boolean z17) {
        if (this.f443893a) {
            this.f443895c.setEnabled(z17);
            this.f443896d.setEnabled(z17);
            this.f443898f.setEnabled(z17);
            android.widget.ImageButton imageButton = this.f443897e;
            if (imageButton != null) {
                imageButton.setEnabled(z17);
                this.f443897e.setAlpha(z17 ? 1.0f : 0.3f);
            }
        }
    }

    public void c() {
        if (this.f443893a && this.f443894b.getVisibility() != 8) {
            android.view.View view = this.f443894b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f443894b;
            view2.startAnimation(android.view.animation.AnimationUtils.loadAnimation(view2.getContext(), com.tencent.mm.R.anim.f477784bd));
        }
    }

    public void d(boolean z17, boolean z18, boolean z19, boolean z27) {
        if (!this.f443893a) {
            android.view.View view = this.f443894b;
            if (view == null) {
                return;
            }
            if (view instanceof android.view.ViewStub) {
                this.f443894b = ((android.view.ViewStub) view).inflate();
            }
            this.f443899g = this.f443894b.findViewById(com.tencent.mm.R.id.dvz);
            this.f443900h = this.f443894b.findViewById(com.tencent.mm.R.id.f484324dw0);
            this.f443901i = this.f443894b.findViewById(com.tencent.mm.R.id.f484325dw1);
            this.f443902j = this.f443894b.findViewById(com.tencent.mm.R.id.f484326dw2);
            android.widget.ImageButton imageButton = (android.widget.ImageButton) this.f443894b.findViewById(com.tencent.mm.R.id.du8);
            this.f443895c = imageButton;
            imageButton.setEnabled(false);
            android.widget.ImageButton imageButton2 = this.f443895c;
            imageButton2.setContentDescription(imageButton2.getContext().getString(com.tencent.mm.R.string.f493406k20));
            this.f443895c.setOnClickListener(new w82.f(this));
            if (z17) {
                android.view.View view2 = this.f443899g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f443895c.setVisibility(8);
            }
            android.widget.ImageButton imageButton3 = (android.widget.ImageButton) this.f443894b.findViewById(com.tencent.mm.R.id.f484317du5);
            this.f443896d = imageButton3;
            imageButton3.setEnabled(false);
            android.widget.ImageButton imageButton4 = this.f443896d;
            imageButton4.setContentDescription(imageButton4.getContext().getString(com.tencent.mm.R.string.btj));
            this.f443896d.setOnClickListener(new w82.g(this));
            if (z18) {
                android.view.View view3 = this.f443900h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f443896d.setVisibility(8);
            }
            android.widget.ImageButton imageButton5 = (android.widget.ImageButton) this.f443894b.findViewById(com.tencent.mm.R.id.du6);
            this.f443898f = imageButton5;
            imageButton5.setEnabled(false);
            android.widget.ImageButton imageButton6 = this.f443898f;
            imageButton6.setContentDescription(imageButton6.getContext().getString(com.tencent.mm.R.string.boe));
            this.f443898f.setOnClickListener(new w82.h(this));
            if (z19) {
                android.view.View view4 = this.f443901i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f443898f.setVisibility(8);
            }
            android.widget.ImageButton imageButton7 = (android.widget.ImageButton) this.f443894b.findViewById(com.tencent.mm.R.id.t_5);
            this.f443897e = imageButton7;
            imageButton7.setEnabled(false);
            this.f443897e.setAlpha(0.3f);
            android.widget.ImageButton imageButton8 = this.f443897e;
            imageButton8.setContentDescription(imageButton8.getContext().getString(com.tencent.mm.R.string.nx8));
            this.f443897e.setOnClickListener(new w82.i(this));
            if (z27) {
                android.view.View view5 = this.f443902j;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f443897e.setVisibility(8);
            }
            this.f443893a = true;
        }
        if (this.f443894b.getVisibility() != 0) {
            android.view.View view6 = this.f443894b;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = this.f443894b;
            view7.startAnimation(android.view.animation.AnimationUtils.loadAnimation(view7.getContext(), com.tencent.mm.R.anim.f477783bc));
        }
    }
}
