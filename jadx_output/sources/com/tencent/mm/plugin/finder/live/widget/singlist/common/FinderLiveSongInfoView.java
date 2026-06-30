package com.tencent.mm.plugin.finder.live.widget.singlist.common;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\r¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lhn2/l;", "Lhn2/m;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "Ljz5/f0;", "setScene", "Landroid/view/View;", "getAuditionPlayView", "getAuditionProgressView", "Lcom/tencent/mm/view/MMPAGView;", "getAuditionPlayingAnim", "getAuditionBackgroundView", "Landroid/widget/TextView;", "getMusicNameView", "getMusicDurationView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveSongInfoView extends androidx.constraintlayout.widget.ConstraintLayout implements hn2.l {
    public final android.widget.TextView A;
    public final android.widget.TextView B;
    public final android.widget.TextView C;
    public final android.widget.TextView D;
    public hn2.m E;
    public boolean F;
    public kotlinx.coroutines.r2 G;
    public final kotlinx.coroutines.y0 H;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMRoundCornerImageView f119780v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f119781w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f119782x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f119783y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.view.LazyPlayPAGView f119784z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveSongInfoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void A(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, boolean z17) {
        if (str == null) {
            str = "";
        }
        this.A.setText(str);
        if (str2 == null) {
            str2 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append(' ');
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        this.C.setText(sb6.toString());
        this.B.setVisibility(z17 ? 0 : 8);
        boolean z18 = str3 == null || str3.length() == 0;
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f119780v;
        if (z18) {
            mMRoundCornerImageView.setImageResource(com.tencent.mm.R.drawable.co_);
            return;
        }
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        mn2.q3 q3Var = new mn2.q3(str3, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        yo0.f fVar = new yo0.f();
        fVar.f464083g = com.tencent.mm.R.drawable.co_;
        d1Var.b(q3Var, fVar.a()).b(mMRoundCornerImageView, true);
    }

    public final void B() {
        if (this.F) {
            return;
        }
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        this.f119784z.setRepeatCount(-1);
        kotlinx.coroutines.r2 r2Var = this.G;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.G = kotlinx.coroutines.l.d(this.H, null, null, new hn2.j(this, null), 3, null);
    }

    @Override // hn2.l
    /* renamed from: getAuditionBackgroundView, reason: from getter */
    public android.view.View getF119781w() {
        return this.f119781w;
    }

    @Override // hn2.l
    public android.view.View getAuditionPlayView() {
        return this.f119782x;
    }

    @Override // hn2.l
    public com.tencent.mm.view.MMPAGView getAuditionPlayingAnim() {
        return this.f119784z;
    }

    @Override // hn2.l
    /* renamed from: getAuditionProgressView, reason: from getter */
    public android.view.View getF119783y() {
        return this.f119783y;
    }

    /* renamed from: getMusicDurationView, reason: from getter */
    public final android.widget.TextView getC() {
        return this.C;
    }

    /* renamed from: getMusicNameView, reason: from getter */
    public final android.widget.TextView getA() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kotlinx.coroutines.r2 r2Var = this.G;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.G = null;
    }

    public final void setScene(hn2.m scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.E = scene;
        float f17 = getResources().getDisplayMetrics().density;
        int ordinal = this.E.ordinal();
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f119780v;
        if (ordinal == 0) {
            int i17 = (int) (60 * f17);
            mMRoundCornerImageView.getLayoutParams().width = i17;
            mMRoundCornerImageView.getLayoutParams().height = i17;
        } else if (ordinal == 1) {
            int i18 = (int) (90 * f17);
            mMRoundCornerImageView.getLayoutParams().width = i18;
            mMRoundCornerImageView.getLayoutParams().height = i18;
        } else if (ordinal == 2) {
            int i19 = (int) (60 * f17);
            mMRoundCornerImageView.getLayoutParams().width = i19;
            mMRoundCornerImageView.getLayoutParams().height = i19;
            this.f119782x.setVisibility(8);
            android.view.View view = this.f119783y;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongInfoView", "applySceneConfig", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongInfoView", "applySceneConfig", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mMRoundCornerImageView.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveSongInfoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.E = hn2.m.f282535d;
        this.H = kotlinx.coroutines.z0.b();
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        android.view.View.inflate(context, com.tencent.mm.R.layout.f488990ec1, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.v9c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119780v = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.v9j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119781w = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.v9d);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f119782x = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.v9e);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f119783y = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.v9k);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f119784z = (com.tencent.mm.view.LazyPlayPAGView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.v9h);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.v9i);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.v9f);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.C = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.v9g);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById9;
    }
}
