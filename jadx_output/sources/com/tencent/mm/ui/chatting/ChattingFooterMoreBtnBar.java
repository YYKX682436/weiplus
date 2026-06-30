package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class ChattingFooterMoreBtnBar extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198210d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198211e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198212f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198213g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198214h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198215i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198216m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageButton f198217n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f198218o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f198219p;

    public ChattingFooterMoreBtnBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f198218o = new java.util.HashSet();
        setOrientation(0);
        setGravity(16);
        setBackground(com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478323gq));
        setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478490b));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479923j2), 1.0f);
        this.f198219p = layoutParams;
        layoutParams.topMargin = i65.a.b(getContext(), 0);
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198210d = weImageButton;
        weImageButton.setImageResource(com.tencent.mm.R.drawable.f481160cz5);
        this.f198210d.setContentDescription(context.getString(com.tencent.mm.R.string.n7v));
        this.f198210d.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198210d.setBackgroundResource(0);
        this.f198210d.setIconColor(context.getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton2 = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198213g = weImageButton2;
        weImageButton2.setImageResource(com.tencent.mm.R.drawable.f481155m1);
        this.f198213g.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198213g.setBackgroundResource(0);
        this.f198213g.setContentDescription(context.getString(com.tencent.mm.R.string.b4o));
        this.f198213g.setIconColor(context.getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton3 = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198212f = weImageButton3;
        weImageButton3.setImageResource(com.tencent.mm.R.drawable.f481153lz);
        this.f198212f.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198212f.setBackgroundResource(0);
        this.f198212f.setContentDescription(context.getString(com.tencent.mm.R.string.b4m));
        this.f198212f.setIconColor(context.getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton4 = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198211e = weImageButton4;
        weImageButton4.setImageResource(com.tencent.mm.R.drawable.f481154m0);
        this.f198211e.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198211e.setBackgroundResource(0);
        this.f198211e.setContentDescription(context.getString(com.tencent.mm.R.string.b4n));
        this.f198211e.setIconColor(context.getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton5 = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198215i = weImageButton5;
        weImageButton5.setImageResource(com.tencent.mm.R.drawable.f481158cz4);
        this.f198215i.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198215i.setBackgroundResource(0);
        this.f198215i.setContentDescription(context.getString(com.tencent.mm.R.string.b4q));
        this.f198215i.setIconColor(context.getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton6 = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198216m = weImageButton6;
        weImageButton6.setImageResource(com.tencent.mm.R.drawable.f481152cz2);
        this.f198216m.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198216m.setBackgroundResource(0);
        this.f198216m.setContentDescription(context.getString(com.tencent.mm.R.string.f490359sr));
        this.f198216m.setIconColor(context.getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton7 = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198214h = weImageButton7;
        weImageButton7.setImageResource(com.tencent.mm.R.drawable.f481156cz3);
        this.f198214h.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198214h.setBackgroundResource(0);
        this.f198214h.setContentDescription(context.getString(com.tencent.mm.R.string.n7r));
        this.f198214h.setVisibility(8);
        this.f198214h.setIconColor(context.getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton8 = new com.tencent.mm.ui.widget.imageview.WeImageButton(getContext());
        this.f198217n = weImageButton8;
        weImageButton8.setImageResource(com.tencent.mm.R.raw.dot_3_regular);
        this.f198217n.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f198217n.setBackgroundResource(0);
        this.f198217n.setContentDescription(context.getString(com.tencent.mm.R.string.njn));
        this.f198217n.setIconColor(context.getColor(com.tencent.mm.R.color.FG_0));
        a();
    }

    public void a() {
        removeAllViews();
        java.util.HashSet hashSet = this.f198218o;
        hashSet.clear();
        boolean b17 = ub5.u.f426254a.b();
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigMsgMultiSelectCopyEntrance()) == 1) {
            addView(this.f198210d, this.f198219p);
            hashSet.add(0);
            addView(this.f198216m, this.f198219p);
            hashSet.add(7);
            addView(this.f198213g, this.f198219p);
            hashSet.add(4);
            addView(this.f198212f, this.f198219p);
            hashSet.add(3);
            if (b17) {
                addView(this.f198217n, this.f198219p);
                hashSet.add(8);
                return;
            } else {
                if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigMsgMultiSelectHideMailEntrance()) == 1) {
                    return;
                }
                addView(this.f198211e, this.f198219p);
                hashSet.add(1);
                return;
            }
        }
        int i17 = jt.x.M0;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.openway.RepairerConfigChattingMoreMenuShareOpen()) == 1) {
            addView(this.f198210d, this.f198219p);
            hashSet.add(0);
            addView(this.f198213g, this.f198219p);
            hashSet.add(4);
            addView(this.f198215i, this.f198219p);
            hashSet.add(6);
            addView(this.f198212f, this.f198219p);
            hashSet.add(3);
            addView(this.f198214h, this.f198219p);
            hashSet.add(5);
            if (b17) {
                addView(this.f198217n, this.f198219p);
                hashSet.add(8);
                return;
            }
            return;
        }
        addView(this.f198210d, this.f198219p);
        hashSet.add(0);
        addView(this.f198213g, this.f198219p);
        hashSet.add(4);
        addView(this.f198212f, this.f198219p);
        hashSet.add(3);
        addView(this.f198214h, this.f198219p);
        hashSet.add(5);
        if (b17) {
            addView(this.f198217n, this.f198219p);
            hashSet.add(8);
        } else {
            addView(this.f198211e, this.f198219p);
            hashSet.add(1);
        }
    }

    public void b(int i17, android.view.View.OnClickListener onClickListener) {
        switch (i17) {
            case 0:
                this.f198210d.setOnClickListener(onClickListener);
                return;
            case 1:
                this.f198211e.setOnClickListener(onClickListener);
                return;
            case 2:
            default:
                com.tencent.mars.xlog.Log.w("Ashu.ChattingFooterMoreBtnBar", "set button listener error button index %d", java.lang.Integer.valueOf(i17));
                return;
            case 3:
                this.f198212f.setOnClickListener(onClickListener);
                return;
            case 4:
                this.f198213g.setOnClickListener(onClickListener);
                return;
            case 5:
                this.f198214h.setOnClickListener(onClickListener);
                return;
            case 6:
                this.f198215i.setOnClickListener(onClickListener);
                return;
            case 7:
                this.f198216m.setOnClickListener(onClickListener);
                return;
            case 8:
                this.f198217n.setOnClickListener(onClickListener);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007b, code lost:
    
        r5.add(r0.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0086, code lost:
    
        if (r0.moveToNext() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0079, code lost:
    
        if (r0.moveToFirst() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r10) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar.c(int):void");
    }

    public java.util.HashSet<java.lang.Integer> getShowBtnList() {
        return this.f198218o;
    }
}
