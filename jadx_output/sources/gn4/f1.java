package gn4;

/* loaded from: classes15.dex */
public class f1 extends gn4.z {
    public android.view.View A1;
    public android.view.View W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f273613l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f273614p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.TextView f273615p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f273616x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f273617x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f273618y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.ImageView f273619y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.TextView f273620z1;

    @Override // gn4.z, fn4.g
    public com.tencent.mm.pluginsdk.ui.e1 b(r45.xn6 xn6Var) {
        float B = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a);
        float k17 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a) - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 64);
        float f17 = B / k17;
        float f18 = xn6Var.f390260i / xn6Var.f390261m;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVerticalFSVideoContainer", "getScaleType playAreaRatio %.2f videoRatio %.2f playAreaWidth %.2f playAreaHeight %.2f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(B), java.lang.Float.valueOf(k17));
        return f17 <= f18 ? com.tencent.mm.pluginsdk.ui.e1.CONTAIN : com.tencent.mm.pluginsdk.ui.e1.COVER;
    }

    @Override // gn4.z, fn4.g
    public void d() {
        super.d();
        this.W = findViewById(com.tencent.mm.R.id.msx);
        this.f273614p0 = findViewById(com.tencent.mm.R.id.jrb);
        this.f273616x0 = findViewById(com.tencent.mm.R.id.jqz);
        this.f273618y0 = findViewById(com.tencent.mm.R.id.poj);
        this.f273613l1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.poi);
        this.f273615p1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.poh);
        this.f273617x1 = findViewById(com.tencent.mm.R.id.ne9);
        this.f273619y1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ne8);
        this.f273620z1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nec);
        this.A1 = findViewById(com.tencent.mm.R.id.ne7);
        this.f273614p0.setOnClickListener(this.I);
        this.f273618y0.setOnClickListener(this.K);
        this.f273617x1.setOnClickListener(this.M);
        this.W.setOnClickListener(this.f273664J);
    }

    @Override // gn4.z, fn4.g
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d1m;
    }

    @Override // gn4.z, fn4.g
    public void p() {
        super.p();
        com.tencent.mm.pluginsdk.ui.e1 b17 = b(this.E);
        android.view.ViewGroup.LayoutParams layoutParams = this.f264512g.getLayoutParams();
        if (b17 == com.tencent.mm.pluginsdk.ui.e1.CONTAIN) {
            int B = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a);
            layoutParams.width = B;
            r45.xn6 xn6Var = this.E;
            layoutParams.height = (int) (B / (xn6Var.f390260i / xn6Var.f390261m));
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        this.f264512g.setLayoutParams(layoutParams);
        android.view.View view = this.A1;
        if (view != null && this.f273620z1 != null && this.f273619y1 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f273620z1.setVisibility(8);
            this.f273619y1.setVisibility(8);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.E.f390269t)) {
                this.f273620z1.setText(this.E.f390269t);
                this.f273620z1.setVisibility(0);
                if (fn4.z0.f(this.E)) {
                    android.view.View view2 = this.A1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.E.C)) {
                    this.f273619y1.setImageResource(com.tencent.mm.R.drawable.bhm);
                } else {
                    n11.a.b().h(this.E.C, this.f273619y1, wm4.u.f447309a);
                }
                this.f273619y1.setVisibility(0);
            }
        }
        if (this.A.H4()) {
            android.view.View view3 = this.f273616x0;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f273614p0;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = this.f273616x0;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f273614p0;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        u();
    }

    @Override // gn4.z
    public void r() {
        this.H = new fn4.h0(getContext(), this, new gn4.e1(this));
    }

    @Override // gn4.z
    public void u() {
        if ((this.E.L & 128) <= 0) {
            android.view.View view = this.f273618y0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f273618y0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryVerticalFSVideoContainer", "updateWowUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.E.R) {
            this.f273613l1.setImageResource(com.tencent.mm.R.raw.top_story_wow_selected);
            this.f273615p1.setTextColor(getResources().getColor(com.tencent.mm.R.color.a9b));
        } else {
            this.f273613l1.setImageResource(com.tencent.mm.R.raw.top_story_wow_unselected);
            this.f273615p1.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        }
        this.f273615p1.setText(wm4.u.p(this.E.X));
    }
}
