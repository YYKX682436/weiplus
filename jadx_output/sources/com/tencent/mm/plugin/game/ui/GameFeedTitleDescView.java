package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameFeedTitleDescView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f140834d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f140835e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f140836f;

    public GameFeedTitleDescView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            this.f140836f.setVisibility(8);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f140834d.setVisibility(8);
            } else {
                this.f140834d.setText(str);
                this.f140834d.setVisibility(0);
            }
        } else {
            this.f140836f.setVisibility(0);
            while (this.f140836f.getChildCount() < linkedList.size() + 1) {
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479835gk), getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479835gk));
                layoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479829ge), 0);
                layoutParams.gravity = 16;
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                this.f140836f.addView(imageView, 0, layoutParams);
            }
            int i17 = 0;
            while (i17 < linkedList.size()) {
                m53.m0 m0Var = (m53.m0) linkedList.get(i17);
                android.widget.ImageView imageView2 = (android.widget.ImageView) this.f140836f.getChildAt(i17);
                r53.y a17 = r53.y.a();
                java.lang.String str3 = m0Var.f323890d;
                a17.getClass();
                r53.v vVar = new r53.v();
                vVar.f392705c = true;
                a17.e(imageView2, str3, vVar.a(), null);
                imageView2.setVisibility(0);
                i17++;
            }
            while (i17 < this.f140836f.getChildCount() - 1) {
                int i18 = i17 + 1;
                android.view.View childAt = this.f140836f.getChildAt(i17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameFeedTitleDescView", "setData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/game/ui/GameFeedTitleDescView", "setData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i17 = i18;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((android.widget.TextView) this.f140836f.getChildAt(i17)).setText(str);
            }
            this.f140834d.setVisibility(8);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.f140835e.setVisibility(8);
        } else {
            this.f140835e.setText(str2);
            this.f140835e.setVisibility(0);
        }
        if ((com.tencent.mm.sdk.platformtools.t8.K0(str) ? (char) 0 : this.f140834d.getPaint().measureText(str) > ((float) ((r53.f.h(getContext()) - ((android.view.ViewGroup) getParent()).getPaddingLeft()) - ((android.view.ViewGroup) getParent()).getPaddingRight())) ? (char) 2 : (char) 1) > 1) {
            this.f140835e.setMaxLines(1);
        } else {
            this.f140835e.setMaxLines(2);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489147bg2, (android.view.ViewGroup) this, true);
        this.f140836f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.ovb);
        this.f140834d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        this.f140835e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484050cu2);
    }
}
