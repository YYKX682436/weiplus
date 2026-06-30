package sm3;

/* loaded from: classes10.dex */
public final class o extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final sm3.f f409896d;

    /* renamed from: e, reason: collision with root package name */
    public final sm3.h f409897e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f409898f;

    public o(sm3.f callback, sm3.h provider) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f409896d = callback;
        this.f409897e = provider;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f409897e.getTracks().size() + 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 == 0) {
            return 1;
        }
        sm3.h hVar = this.f409897e;
        if (i17 == hVar.getTracks().size() + 1) {
            return 4;
        }
        return i17 == hVar.getTracks().size() + 2 ? 3 : 2;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = holder instanceof sm3.n;
        sm3.h hVar = this.f409897e;
        if (!z17) {
            if (!(holder instanceof sm3.g)) {
                if (holder instanceof sm3.i) {
                    sm3.i iVar = (sm3.i) holder;
                    android.view.View view = iVar.itemView;
                    android.view.ViewGroup viewGroup = iVar.f409875d;
                    view.setLayoutParams(new android.view.ViewGroup.LayoutParams(viewGroup.getWidth() / 2, (viewGroup.getHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom()));
                    return;
                }
                return;
            }
            sm3.g gVar = (sm3.g) holder;
            int fillingWidth = hVar.getDraggingIndex() == -1 ? hVar.getFillingWidth() : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksAdapter", "filling " + fillingWidth);
            android.view.View view2 = gVar.itemView;
            android.view.ViewGroup viewGroup2 = gVar.f409861d;
            view2.setLayoutParams(new android.view.ViewGroup.LayoutParams(fillingWidth, (viewGroup2.getHeight() - viewGroup2.getPaddingTop()) - viewGroup2.getPaddingBottom()));
            return;
        }
        sm3.n nVar = (sm3.n) holder;
        kp4.a trackInfo = (kp4.a) hVar.getTracks().get(i17 - 1);
        kotlin.jvm.internal.o.g(trackInfo, "trackInfo");
        int i18 = nVar.i();
        android.view.View view3 = nVar.itemView;
        sm3.o oVar = nVar.f409895g;
        view3.setOnClickListener(new sm3.k(trackInfo, oVar, i18, nVar));
        qm3.i thumbLoader = oVar.f409897e.getThumbLoader();
        if (thumbLoader != null) {
            com.tencent.mm.plugin.mv.ui.widget.MvFrameListView mvFrameListView = nVar.f409892d;
            mvFrameListView.getClass();
            mvFrameListView.f152005e = trackInfo;
            mvFrameListView.f152006f = thumbLoader;
            int i19 = trackInfo.f311071a;
            android.graphics.Rect rect = mvFrameListView.f152008h;
            rect.right = i19;
            rect.bottom = trackInfo.f311072b;
            float d17 = (i19 * trackInfo.f311076f) / ((float) trackInfo.d());
            mvFrameListView.setDrawStart((int) (((float) trackInfo.f311074d) * d17));
            mvFrameListView.setDrawEnd((int) (d17 * ((float) trackInfo.f311075e)));
            kotlinx.coroutines.r2 r2Var = mvFrameListView.f152007g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            mvFrameListView.f152007g = kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new sm3.b(thumbLoader, trackInfo, mvFrameListView, null), 2, null);
        }
        int i27 = nVar.i();
        sm3.h hVar2 = oVar.f409897e;
        boolean z18 = i27 == hVar2.getTracks().size() - 1;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        if (!z18 || hVar2.getFillingWidth() > 0) {
            f0Var.f310116d += hVar2.getSpaceSize();
        }
        boolean z19 = i18 == hVar2.getSelectedIndex();
        com.tencent.mm.plugin.mv.ui.widget.RangeSliderView rangeSliderView = nVar.f409893e;
        rangeSliderView.setActive(z19);
        rangeSliderView.setMaxEnd(((int) (((float) trackInfo.d()) * hVar2.getWidthPerMills())) - f0Var.f310116d);
        rangeSliderView.setMinWidth(((int) (2000 * hVar2.getWidthPerMills())) - f0Var.f310116d);
        rangeSliderView.setStart((int) (((float) trackInfo.f311074d) * hVar2.getWidthPerMills()));
        if (hVar2.getDraggingIndex() != -1) {
            rangeSliderView.setEnd(trackInfo.f311071a);
        } else {
            rangeSliderView.setEnd(((int) (((float) trackInfo.f311075e) * hVar2.getWidthPerMills())) - f0Var.f310116d);
        }
        rangeSliderView.setKeepSizeOnStartChanged(i18 == 0);
        rangeSliderView.setCallback(new sm3.m(oVar, i18, f0Var, nVar));
        if (i18 == hVar2.getDraggingIndex()) {
            android.view.View view4 = nVar.f409894f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = nVar.f409894f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksAdapter", "bind[" + nVar.i() + "]: time=" + trackInfo.f311080j + ", duration=" + (trackInfo.f311075e - trackInfo.f311074d) + ", width=" + (rangeSliderView.getEnd() - rangeSliderView.getStart()) + ", clipWidth=" + f0Var.f310116d);
        nVar.itemView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1 || i17 == 3) {
            return new sm3.i(parent);
        }
        if (i17 == 4) {
            return new sm3.g(parent);
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.c4y, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new sm3.n(this, inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 holder) {
        qm3.i iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof sm3.n) {
            com.tencent.mm.plugin.mv.ui.widget.MvFrameListView mvFrameListView = ((sm3.n) holder).f409892d;
            kp4.a aVar = mvFrameListView.f152005e;
            com.tencent.mars.xlog.Log.i("MicroMsg.MvFrameListView", aVar + " stop");
            if (aVar != null && (iVar = mvFrameListView.f152006f) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ThumbCachedLoader", "stop " + aVar);
                qm3.a a17 = iVar.a(aVar);
                a17.f364760b.clear();
                a17.f364761c.clear();
                kotlinx.coroutines.r2 r2Var = a17.f364764f;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                a17.f364764f = null;
                rm5.k kVar = a17.f364759a;
                if (kVar != null) {
                    kVar.destroy();
                }
                a17.f364759a = null;
            }
            kotlinx.coroutines.r2 r2Var2 = mvFrameListView.f152007g;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            mvFrameListView.f152007g = null;
        }
    }
}
