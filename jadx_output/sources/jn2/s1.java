package jn2;

/* loaded from: classes10.dex */
public final class s1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView f300695d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f300696e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f300697f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMProcessBar f300698g;

    /* renamed from: h, reason: collision with root package name */
    public jn2.t1 f300699h;

    /* renamed from: i, reason: collision with root package name */
    public fn2.c f300700i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f300701m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(jn2.z1 z1Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f300701m = z1Var;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.sdt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = (com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView) findViewById;
        this.f300695d = finderLiveSongInfoView;
        this.f300696e = (com.tencent.mm.ui.widget.button.WeButton) itemView.findViewById(com.tencent.mm.R.id.sdq);
        this.f300697f = (com.tencent.mm.ui.widget.button.WeButton) itemView.findViewById(com.tencent.mm.R.id.sds);
        this.f300698g = (com.tencent.mm.ui.widget.MMProcessBar) itemView.findViewById(com.tencent.mm.R.id.sdr);
        this.f300699h = jn2.t1.f300704d;
        finderLiveSongInfoView.B();
    }

    public final void i(jn2.t1 state, boolean z17) {
        boolean z18;
        kotlin.jvm.internal.o.g(state, "state");
        if (this.f300699h != state || z17) {
            this.f300699h = state;
            com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = this.f300695d;
            android.view.View f119781w = finderLiveSongInfoView.getF119781w();
            com.tencent.mm.view.MMPAGView auditionPlayingAnim = finderLiveSongInfoView.getAuditionPlayingAnim();
            int ordinal = state.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                z18 = true;
                auditionPlayingAnim.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f119781w, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$SingSongViewHolder", "updatePlayingAnimByState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$ViewHolderState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f119781w.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f119781w, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$SingSongViewHolder", "updatePlayingAnimByState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$ViewHolderState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                auditionPlayingAnim.n();
            } else if (ordinal != 2) {
                z18 = true;
            } else {
                auditionPlayingAnim.setVisibility(0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                z18 = true;
                yj0.a.d(f119781w, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$SingSongViewHolder", "updatePlayingAnimByState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$ViewHolderState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f119781w.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(f119781w, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$SingSongViewHolder", "updatePlayingAnimByState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$ViewHolderState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                auditionPlayingAnim.g();
            }
            jn2.t1 t1Var = this.f300699h;
            android.widget.TextView a17 = finderLiveSongInfoView.getA();
            int ordinal2 = t1Var.ordinal();
            jn2.z1 z1Var = this.f300701m;
            if (ordinal2 == 0 || ordinal2 == z18) {
                a17.setTextColor(z1Var.f300766e.getResources().getColor(com.tencent.mm.R.color.abw));
            } else if (ordinal2 == 2) {
                a17.setTextColor(z1Var.f300766e.getResources().getColor(com.tencent.mm.R.color.f479206su));
            }
            int ordinal3 = this.f300699h.ordinal();
            com.tencent.mm.ui.widget.button.WeButton weButton = this.f300697f;
            com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f300696e;
            if (ordinal3 == 0) {
                if (weButton2 != null) {
                    weButton2.setVisibility(0);
                }
                if (weButton2 != null) {
                    weButton2.setEnabled(z18);
                }
                if (weButton != null) {
                    weButton.setVisibility(8);
                }
            } else if (ordinal3 == z18) {
                if (weButton2 != null) {
                    weButton2.setVisibility(8);
                }
                if (weButton != null) {
                    weButton.setVisibility(8);
                }
            } else if (ordinal3 == 2) {
                if (weButton2 != null) {
                    weButton2.setVisibility(8);
                }
                if (weButton != null) {
                    weButton.setVisibility(0);
                }
                if (weButton != null) {
                    weButton.setEnabled(z18);
                }
            }
            int ordinal4 = this.f300699h.ordinal();
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f300698g;
            if (ordinal4 != 0) {
                if (ordinal4 == z18) {
                    if (mMProcessBar == null) {
                        return;
                    }
                    mMProcessBar.setVisibility(0);
                    return;
                } else if (ordinal4 != 2) {
                    return;
                }
            }
            if (mMProcessBar == null) {
                return;
            }
            mMProcessBar.setVisibility(8);
        }
    }
}
