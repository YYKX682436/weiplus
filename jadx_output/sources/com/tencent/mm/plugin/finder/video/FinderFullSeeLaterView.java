package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100B!\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b/\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010*\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!¨\u00063"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderFullSeeLaterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "style", "Ljz5/f0;", "setStyle", "", org.chromium.base.BaseSwitches.V, "F", "getPlayPercent", "()F", "setPlayPercent", "(F)V", "playPercent", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "w", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "getFeed", "()Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "setFeed", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "feed", "x", "Ljz5/g;", "getSeeLaterBgShowTime", "()I", "seeLaterBgShowTime", "", "y", "Z", "getNeedClickAction", "()Z", "setNeedClickAction", "(Z)V", "needClickAction", "z", "getEnableDarkMode", "setEnableDarkMode", "enableDarkMode", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getEnableSwitchToDoneStyle", "setEnableSwitchToDoneStyle", "enableSwitchToDoneStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFullSeeLaterView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int C = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public boolean enableSwitchToDoneStyle;
    public int B;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public float playPercent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed feed;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final jz5.g seeLaterBgShowTime;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public boolean needClickAction;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public boolean enableDarkMode;

    static {
        jz5.h.b(cw2.g1.f223723d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFullSeeLaterView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.seeLaterBgShowTime = jz5.h.b(cw2.j1.f223781d);
        this.needClickAction = true;
        this.B = 2;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.di8, this);
        setOnClickListener(new cw2.i1(this));
    }

    public static final void A(com.tencent.mm.plugin.finder.video.FinderFullSeeLaterView finderFullSeeLaterView) {
        if (finderFullSeeLaterView.enableSwitchToDoneStyle) {
            finderFullSeeLaterView.setStyle(4);
        } else {
            finderFullSeeLaterView.setVisibility(8);
        }
    }

    private final int getSeeLaterBgShowTime() {
        return ((java.lang.Number) this.seeLaterBgShowTime.getValue()).intValue();
    }

    private final void setStyle(int i17) {
        boolean z17;
        boolean z18;
        java.lang.String str = "set style=" + i17;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            com.tencent.mm.sdk.platformtools.Log.a("Finder.FullSeeLaterView", str, new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FullSeeLaterView", str);
        }
        if (i17 == 1) {
            setEnabled(true);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n)).setVisibility(0);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.aai);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n)).setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479253u5));
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qgl);
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479253u5));
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.lqi));
            return;
        }
        if (i17 == 2) {
            setEnabled(true);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.aai);
            findViewById2.setBackgroundResource(com.tencent.mm.R.drawable.a8l);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n)).setVisibility(0);
            if (this.enableDarkMode) {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n)).setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.qgl)).setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            } else {
                ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n)).setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0));
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.qgl)).setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            }
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.qgl)).setText(getContext().getResources().getString(com.tencent.mm.R.string.lqi));
            return;
        }
        if (i17 != 3) {
            if (i17 == 4 && this.enableSwitchToDoneStyle) {
                setEnabled(false);
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.aai);
                android.graphics.drawable.Drawable background = findViewById3.getBackground();
                android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(findViewById3.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_0_5, null));
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById3.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n)).setVisibility(8);
                android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qgl);
                textView2.setTextColor(textView2.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2, null));
                textView2.setText(textView2.getContext().getResources().getString(com.tencent.mm.R.string.lsz));
                return;
            }
            return;
        }
        setEnabled(true);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n)).setVisibility(0);
        if (!this.enableDarkMode) {
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.aai);
            android.graphics.drawable.Drawable background2 = findViewById4.getBackground();
            android.graphics.drawable.GradientDrawable gradientDrawable2 = background2 instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background2 : null;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(findViewById4.getContext().getResources().getColor(com.tencent.mm.R.color.abz, null));
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById4, arrayList8.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById4.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n)).setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0));
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qgl);
            textView3.setTextColor(textView3.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            textView3.setText(textView3.getContext().getResources().getString(com.tencent.mm.R.string.lqi));
            return;
        }
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.aai);
        android.graphics.drawable.Drawable background3 = findViewById5.getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable3 = background3 instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background3 : null;
        if (gradientDrawable3 != null) {
            gradientDrawable3.setColor(findViewById5.getContext().getResources().getColor(com.tencent.mm.R.color.abz, null));
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(findViewById5, arrayList9.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(findViewById5, arrayList10.toArray(), "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById5.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/video/FinderFullSeeLaterView", "setStyle", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h5n)).setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qgl);
        textView4.setTextColor(textView4.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.mm.ui.fk.a(textView4);
        textView4.setText(textView4.getContext().getResources().getString(com.tencent.mm.R.string.lqi));
    }

    public final boolean getEnableDarkMode() {
        return this.enableDarkMode;
    }

    public final boolean getEnableSwitchToDoneStyle() {
        return this.enableSwitchToDoneStyle;
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed getFeed() {
        return this.feed;
    }

    public final boolean getNeedClickAction() {
        return this.needClickAction;
    }

    public final float getPlayPercent() {
        return this.playPercent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Integer num = null;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this, "watch_later_in_feed_player");
        boolean z19 = true;
        aVar.Tj(this, 24, 1, true);
        aVar.Ai(this, new cw2.h1(this));
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[2] = new jz5.l("comment_scene", nyVar2 != null ? java.lang.Integer.valueOf(nyVar2.f135380n) : null);
        aVar.gk(this, kz5.c1.k(lVarArr));
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            com.tencent.mm.sdk.platformtools.Log.c("Finder.FullSeeLaterView", hashCode() + " addSdkReport", new java.lang.Object[0]);
        }
        super.onAttachedToWindow();
        int i17 = this.B;
        boolean wi6 = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).wi();
        ey2.g1 g1Var = (ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.feed;
        boolean contains = ((java.util.HashSet) ((jz5.n) g1Var.f257379h).getValue()).contains(java.lang.Long.valueOf(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.feed;
        if (!((baseFinderFeed2 == null || (feedObject3 = baseFinderFeed2.getFeedObject()) == null || !feedObject3.showSeeLaterInVideo()) ? false : true)) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z19 = false;
        }
        boolean z27 = getContext() instanceof com.tencent.mm.ui.MMActivity;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("source=88,style(");
        sb6.append(this.B);
        sb6.append("->");
        sb6.append(i17);
        sb6.append("), cur enable=");
        sb6.append(isEnabled());
        sb6.append(",checkSeeLaterVisible(");
        sb6.append(hashCode());
        sb6.append(") feed=");
        sb6.append(this.feed);
        sb6.append(" fun flag:");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = this.feed;
        if (baseFinderFeed3 != null && (feedObject = baseFinderFeed3.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null) {
            num = java.lang.Integer.valueOf(feedObject2.getFunc_flag());
        }
        sb6.append(num);
        sb6.append(",showSeeLaterInVideo:");
        sb6.append(z19);
        sb6.append(",enableShowLongVideo:");
        sb6.append(wi6);
        sb6.append(",haveSeeLater:");
        sb6.append(contains);
        sb6.append(",contextIsActivity:");
        sb6.append(z27);
        sb6.append(",needClickAction=");
        sb6.append(this.needClickAction);
        com.tencent.mars.xlog.Log.i("Finder.FullSeeLaterView", sb6.toString());
        if (wi6 && !contains && z19 && z27) {
            this.B = i17;
            setStyle(i17);
            setVisibility(0);
        } else {
            if (!wi6 || !z19 || !contains || !this.enableSwitchToDoneStyle) {
                setVisibility(8);
                return;
            }
            this.B = 4;
            setStyle(4);
            setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisibility(8);
    }

    public final void setEnableDarkMode(boolean z17) {
        this.enableDarkMode = z17;
    }

    public final void setEnableSwitchToDoneStyle(boolean z17) {
        this.enableSwitchToDoneStyle = z17;
    }

    public final void setFeed(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.feed = baseFinderFeed;
    }

    public final void setNeedClickAction(boolean z17) {
        this.needClickAction = z17;
    }

    public final void setPlayPercent(float f17) {
        this.playPercent = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFullSeeLaterView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.seeLaterBgShowTime = jz5.h.b(cw2.j1.f223781d);
        this.needClickAction = true;
        this.B = 2;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.di8, this);
        setOnClickListener(new cw2.i1(this));
    }
}
