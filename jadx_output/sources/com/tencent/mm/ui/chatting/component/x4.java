package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.c0.class)
/* loaded from: classes12.dex */
public final class x4 extends com.tencent.mm.ui.chatting.component.a implements sb5.c0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f200214e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f200215f;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        ((java.util.LinkedHashMap) this.f200214e).clear();
        this.f200215f = null;
    }

    @Override // yn.d
    public void e0() {
        m0(true);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0) {
            m0(true);
        }
    }

    public final void m0(boolean z17) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView2;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView3;
        java.lang.Object p17 = this.f198580d.p();
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView4 = null;
        androidx.recyclerview.widget.RecyclerView recyclerView = p17 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p17 : null;
        if (recyclerView == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        if (this.f200215f != null) {
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            if (w17 == -1 || y17 == -1 || w17 > y17) {
                this.f200215f = null;
            } else {
                if (w17 <= y17) {
                    while (true) {
                        android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(w17);
                        if (findViewByPosition != null && (chattingMediaGroupMvvmView = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) findViewByPosition.findViewById(com.tencent.mm.R.id.sr8)) != null && chattingMediaGroupMvvmView.u()) {
                            java.lang.Object tag = chattingMediaGroupMvvmView.getTag(com.tencent.mm.R.id.sr9);
                            java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                            if (str != null && kotlin.jvm.internal.o.b(str, this.f200215f)) {
                                break;
                            }
                        }
                        if (w17 == y17) {
                            break;
                        } else {
                            w17++;
                        }
                    }
                }
                this.f200215f = null;
            }
        }
        chattingMediaGroupMvvmView = null;
        if (chattingMediaGroupMvvmView == null) {
            int t17 = linearLayoutManager.t();
            int x17 = linearLayoutManager.x();
            if (t17 != -1 && x17 != -1 && t17 <= x17) {
                float height = linearLayoutManager.getHeight() * 0.4f;
                if (t17 <= x17) {
                    float f17 = Float.MAX_VALUE;
                    while (true) {
                        android.view.View findViewByPosition2 = linearLayoutManager.findViewByPosition(t17);
                        if (findViewByPosition2 != null && (chattingMediaGroupMvvmView3 = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) findViewByPosition2.findViewById(com.tencent.mm.R.id.sr8)) != null && chattingMediaGroupMvvmView3.u()) {
                            chattingMediaGroupMvvmView3.getLocationInWindow(new int[2]);
                            float f18 = r10[1] - height;
                            if (f18 < f17) {
                                chattingMediaGroupMvvmView4 = chattingMediaGroupMvvmView3;
                                f17 = f18;
                            }
                        }
                        if (t17 == x17) {
                            break;
                        } else {
                            t17++;
                        }
                    }
                }
            }
            if (chattingMediaGroupMvvmView4 == null) {
                return;
            } else {
                chattingMediaGroupMvvmView = chattingMediaGroupMvvmView4;
            }
        }
        int w18 = linearLayoutManager.w();
        int y18 = linearLayoutManager.y();
        if (w18 == -1 || y18 == -1 || w18 > y18 || w18 > y18) {
            return;
        }
        while (true) {
            android.view.View findViewByPosition3 = linearLayoutManager.findViewByPosition(w18);
            if (findViewByPosition3 != null && (chattingMediaGroupMvvmView2 = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) findViewByPosition3.findViewById(com.tencent.mm.R.id.sr8)) != null) {
                chattingMediaGroupMvvmView2.E(chattingMediaGroupMvvmView2 == chattingMediaGroupMvvmView && z17);
            }
            if (w18 == y18) {
                return;
            } else {
                w18++;
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f200214e).entrySet()) {
            ((b11.c) entry.getValue()).f17031d = t21.d3.a((int) r1.f17030c, r1.f17028a) * 1000;
        }
        m0(true);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        m0(false);
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f200214e).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            b11.c cVar = (b11.c) entry.getValue();
            if (!cVar.f17033f) {
                t21.d3.w(str, (int) cVar.f17031d, cVar.f17032e);
                cVar.f17033f = true;
            }
        }
    }
}
