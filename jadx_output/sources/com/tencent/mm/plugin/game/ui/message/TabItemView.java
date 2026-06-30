package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class TabItemView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f141507d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f141508e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f141509f;

    public TabItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.game.d2.f139440c);
        java.lang.String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bh8, (android.view.ViewGroup) this, true);
        this.f141508e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nv7);
        this.f141509f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nv6);
        this.f141508e.setText(string);
        if (i65.a.D(getContext())) {
            this.f141508e.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479801fm) * i65.a.m(getContext()));
            this.f141509f.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479833gi) * i65.a.m(getContext()));
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        if (!z17) {
            this.f141508e.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478873jj));
            return;
        }
        this.f141508e.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f141509f.setVisibility(8);
        com.tencent.mm.plugin.game.model.i1 Ai = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai();
        int i17 = this.f141507d;
        com.tencent.mm.plugin.game.model.e1 j17 = Ai.j();
        if (j17 != null && j17.field_showType == i17) {
            Ai.e();
        }
    }

    public void setShowType(int i17) {
        this.f141507d = i17;
    }

    public void setUnreadCount(int i17) {
        if (i17 <= 0) {
            this.f141509f.setVisibility(8);
            return;
        }
        this.f141509f.setVisibility(0);
        if (i17 < 100) {
            this.f141509f.setText(java.lang.String.valueOf(i17));
        } else {
            this.f141509f.setText(com.tencent.mm.R.string.foi);
        }
    }

    public TabItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet);
    }
}
