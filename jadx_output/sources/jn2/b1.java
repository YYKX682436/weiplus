package jn2;

/* loaded from: classes10.dex */
public final class b1 extends androidx.recyclerview.widget.k3 implements hn2.l {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f300557m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView f300558d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f300559e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f300560f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMProcessBar f300561g;

    /* renamed from: h, reason: collision with root package name */
    public jn2.u0 f300562h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ jn2.c1 f300563i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(jn2.c1 c1Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f300563i = c1Var;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.v9l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = (com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView) findViewById;
        this.f300558d = finderLiveSongInfoView;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.slp);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f300559e = (com.tencent.mm.ui.widget.button.WeButton) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.opx);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f300560f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.ree);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f300561g = (com.tencent.mm.ui.widget.MMProcessBar) findViewById4;
        this.f300562h = jn2.u0.f300711d;
        finderLiveSongInfoView.B();
    }

    @Override // hn2.l
    /* renamed from: getAuditionBackgroundView */
    public android.view.View getF119781w() {
        return this.f300558d.getF119781w();
    }

    @Override // hn2.l
    public android.view.View getAuditionPlayView() {
        return this.f300558d.getAuditionPlayView();
    }

    @Override // hn2.l
    public com.tencent.mm.view.MMPAGView getAuditionPlayingAnim() {
        return this.f300558d.getAuditionPlayingAnim();
    }

    @Override // hn2.l
    /* renamed from: getAuditionProgressView */
    public android.view.View getF119783y() {
        return this.f300558d.getF119783y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if (r3 == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(jn2.w0 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "songData"
            kotlin.jvm.internal.o.g(r1, r2)
            r45.ay1 r2 = r1.f300740a
            java.lang.String r3 = r2.f370350d
            if (r3 != 0) goto L12
            java.lang.String r3 = ""
        L12:
            boolean r4 = r2.f370360q
            jn2.c1 r5 = r0.f300563i
            sf2.x r5 = r5.f300568e
            if (r5 == 0) goto L2f
            java.lang.Class<mm2.j5> r6 = mm2.j5.class
            androidx.lifecycle.c1 r5 = r5.business(r6)
            mm2.j5 r5 = (mm2.j5) r5
            kotlinx.coroutines.flow.f3 r5 = r5.f329182g
            if (r5 == 0) goto L2f
            kotlinx.coroutines.flow.h3 r5 = (kotlinx.coroutines.flow.h3) r5
            java.lang.Object r5 = r5.getValue()
            nm2.a r5 = (nm2.a) r5
            goto L30
        L2f:
            r5 = 0
        L30:
            hn2.i r6 = hn2.i.f282531a
            r45.cy1 r1 = r1.f300741b
            hn2.d r1 = r6.a(r2, r1)
            r45.zr5 r1 = r1.b()
            r6 = 0
            if (r1 == 0) goto L41
            r1 = 1
            goto L42
        L41:
            r1 = r6
        L42:
            com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView r7 = r0.f300558d
            android.view.View r7 = r7.getF119781w()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.ThreadLocal r8 = zj0.c.f473285a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r15.add(r8)
            java.util.Collections.reverse(r15)
            java.lang.Object[] r9 = r15.toArray()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder"
            java.lang.String r11 = "updateAuditionUI"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongItemData;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r8 = r7
            r2 = r15
            r15 = r16
            yj0.a.d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder"
            java.lang.String r10 = "updateAuditionUI"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongItemData;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            yj0.a.f(r8, r9, r10, r11, r12, r13, r14)
            hn2.a r2 = hn2.a.f282498a
            if (r5 == 0) goto L9c
            boolean r3 = r5.c(r3, r4)
            r4 = 1
            if (r3 != r4) goto L9c
            goto L9d
        L9c:
            r4 = r6
        L9d:
            r2.a(r0, r1, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.b1.i(jn2.w0):void");
    }

    public final void j(jn2.u0 u0Var) {
        this.f300562h = u0Var;
        int ordinal = u0Var.ordinal();
        jn2.c1 c1Var = this.f300563i;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f300561g;
        android.widget.TextView textView = this.f300560f;
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f300559e;
        if (ordinal == 0) {
            mMProcessBar.setVisibility(8);
            textView.setVisibility(8);
            weButton.setVisibility(0);
            weButton.setText(c1Var.f300567d.getString(com.tencent.mm.R.string.d5g));
            return;
        }
        if (ordinal == 1) {
            weButton.setVisibility(8);
            textView.setVisibility(8);
            mMProcessBar.setVisibility(0);
        } else {
            if (ordinal != 2) {
                return;
            }
            weButton.setVisibility(8);
            mMProcessBar.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(c1Var.f300567d.getString(com.tencent.mm.R.string.f493696op0));
        }
    }
}
