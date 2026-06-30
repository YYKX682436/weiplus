package com.tencent.mm.ui.chatting.history.person;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/person/MsgHistoryGalleryPersonRecommendUI;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseActivity;", "Lzc5/p;", "Lzc5/o;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MsgHistoryGalleryPersonRecommendUI extends com.tencent.mm.ui.immersive.ImmersiveBaseActivity implements zc5.p, zc5.o {
    public static final /* synthetic */ int F = 0;
    public boolean A;
    public androidx.recyclerview.widget.w2 B;
    public boolean C;
    public final com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI$previewExitEventListener$1 E;

    /* renamed from: v, reason: collision with root package name */
    public em.w1 f201811v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f201812w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f201813x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f201814y;

    /* renamed from: t, reason: collision with root package name */
    public final int f201809t = com.tencent.mm.R.color.f478489a;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f201810u = kz5.c0.k(com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendActionBarView.class);

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f201815z = jz5.h.b(new bd5.g(this));
    public final jz5.g D = jz5.h.b(new bd5.h(this));

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI$previewExitEventListener$1] */
    public MsgHistoryGalleryPersonRecommendUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MsgHistoryGalleryPreviewExitEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI$previewExitEventListener$1
            {
                this.__eventId = -801824477;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MsgHistoryGalleryPreviewExitEvent msgHistoryGalleryPreviewExitEvent) {
                android.view.View findViewByPosition;
                com.tencent.mm.autogen.events.MsgHistoryGalleryPreviewExitEvent event = msgHistoryGalleryPreviewExitEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI.F;
                com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI msgHistoryGalleryPersonRecommendUI = com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI.this;
                xm3.t0 b17 = xm3.u0.b(msgHistoryGalleryPersonRecommendUI.h7());
                if (b17 == null) {
                    return false;
                }
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = msgHistoryGalleryPersonRecommendUI.h7().getLayoutManager();
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
                if (gridLayoutManager == null) {
                    return false;
                }
                long j17 = event.f54498g.f8198a;
                int w17 = gridLayoutManager.w();
                int y17 = gridLayoutManager.y();
                java.util.List data = b17.getData();
                java.util.Iterator it = new e06.k(w17, y17).iterator();
                while (((e06.j) it).hasNext()) {
                    int b18 = ((kz5.x0) it).b();
                    java.lang.Object a07 = kz5.n0.a0(data, b18);
                    uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
                    if (h0Var != null) {
                        uc5.d dVar = h0Var.f426494d;
                        uc5.d dVar2 = dVar instanceof dd5.n1 ? (dd5.n1) dVar : null;
                        if (dVar2 == null) {
                            dVar2 = dVar instanceof dd5.d3 ? (dd5.d3) dVar : null;
                            if (dVar2 != null) {
                            }
                        }
                        if (dVar2.p().getMsgId() == j17 && (findViewByPosition = gridLayoutManager.findViewByPosition(b18)) != null) {
                            int[] iArr = new int[2];
                            findViewByPosition.getLocationOnScreen(iArr);
                            int i18 = iArr[0];
                            am.wj wjVar = event.f54499h;
                            wjVar.f8288a = i18;
                            wjVar.f8289b = iArr[1];
                            wjVar.f8290c = findViewByPosition.getWidth();
                            wjVar.f8291d = findViewByPosition.getHeight();
                        }
                    }
                }
                return true;
            }
        };
    }

    @Override // zc5.p
    public void E1() {
        this.C = true;
    }

    @Override // zc5.p
    public long[] G() {
        java.util.List<uc5.l0> data;
        xm3.t0 b17 = xm3.u0.b(h7());
        if (b17 == null || (data = b17.getData()) == null) {
            return new long[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (uc5.l0 l0Var : data) {
            if (l0Var instanceof uc5.h0) {
                uc5.d dVar = ((uc5.h0) l0Var).f426494d;
                if ((dVar instanceof dd5.n1) || (dVar instanceof dd5.d3)) {
                    arrayList.add(java.lang.Long.valueOf(dVar.p().getMsgId()));
                }
            }
        }
        return kz5.n0.T0(arrayList);
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    public android.view.View V6() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.eke, (android.view.ViewGroup) null);
        this.f201811v = new em.w1(inflate);
        android.view.View view = X6().f254624a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        view.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a, null));
        em.w1 w1Var = this.f201811v;
        if (w1Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView a17 = w1Var.a();
        bd5.f fVar = new bd5.f(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(a17, fVar);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    /* renamed from: Y6 */
    public boolean getF208938m() {
        return false;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    /* renamed from: b7, reason: from getter */
    public int getF201809t() {
        return this.f201809t;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    /* renamed from: c7, reason: from getter */
    public java.util.List getF201810u() {
        return this.f201810u;
    }

    @Override // zc5.o
    public com.tencent.mm.ui.chatting.history.media.MsgHistoryGalleryMediaLoadGroup d3() {
        return (com.tencent.mm.ui.chatting.history.media.MsgHistoryGalleryMediaLoadGroup) ((jz5.n) this.D).getValue();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView h7() {
        em.w1 w1Var = this.f201811v;
        if (w1Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView a17 = w1Var.a();
        kotlin.jvm.internal.o.f(a17, "getRecyclerView(...)");
        return a17;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("kTalker");
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PersonRecommendUI", "talker is null, finishing");
            finish();
            return;
        }
        this.f201812w = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("kLabelId");
        if (stringExtra2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PersonRecommendUI", "labelId is null, finishing");
            finish();
            return;
        }
        this.f201813x = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("kCropImagePath");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f201814y = stringExtra3;
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479644bj);
        com.tencent.mm.view.recyclerview.WxRecyclerView h76 = h7();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(getContext(), 4);
        gridLayoutManager.B = new bd5.e(this);
        h76.setLayoutManager(gridLayoutManager);
        h7().N(new ed5.a(4, h17, 0, 4, null));
        h7().setItemAnimator(null);
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f201815z).getValue(), null, new bd5.j(this, null), 1, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        androidx.recyclerview.widget.w2 w2Var = this.B;
        if (w2Var != null) {
            h7().V0(w2Var);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.C) {
            return;
        }
        this.C = false;
        java.util.Set set = xc5.l.f453521r;
        xc5.l.f453521r = null;
        xm3.t0 b17 = xm3.u0.b(h7());
        if (b17 == null) {
            return;
        }
        java.util.List data = b17.getData();
        if (!(set == null || set.isEmpty())) {
            java.util.HashSet hashSet = new java.util.HashSet(set);
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = h7().getLayoutManager();
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
            int w17 = gridLayoutManager != null ? gridLayoutManager.w() : -1;
            int y17 = gridLayoutManager != null ? gridLayoutManager.y() : -1;
            int i17 = 0;
            for (java.lang.Object obj : data) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                uc5.l0 l0Var = (uc5.l0) obj;
                if (hashSet.isEmpty()) {
                    return;
                }
                uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
                if (h0Var != null) {
                    uc5.d dVar = h0Var.f426494d;
                    dd5.n1 n1Var = dVar instanceof dd5.n1 ? (dd5.n1) dVar : null;
                    if (n1Var != null && hashSet.contains(java.lang.Long.valueOf(n1Var.f229231h.getMsgId()))) {
                        hashSet.remove(java.lang.Long.valueOf(n1Var.f229231h.getMsgId()));
                        n1Var.f426477e = null;
                        if (w17 <= i17 && i17 <= y17) {
                            b17.notifyItemRangeChanged(i17, 1, "force_content_refresh");
                        }
                    }
                }
                i17 = i18;
            }
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = h7().getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager2 = layoutManager2 instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager2 : null;
        if (gridLayoutManager2 == null) {
            return;
        }
        int w18 = gridLayoutManager2.w();
        int y18 = gridLayoutManager2.y();
        if (w18 < 0 || w18 > y18) {
            return;
        }
        while (true) {
            java.lang.Object a07 = kz5.n0.a0(data, w18);
            uc5.h0 h0Var2 = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
            if (h0Var2 != null) {
                uc5.d dVar2 = h0Var2.f426494d;
                dd5.n1 n1Var2 = dVar2 instanceof dd5.n1 ? (dd5.n1) dVar2 : null;
                if (n1Var2 != null) {
                    n1Var2.f426477e = null;
                    b17.notifyItemRangeChanged(w18, 1, "force_content_refresh");
                }
            }
            if (w18 == y18) {
                return;
            } else {
                w18++;
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        alive();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        dead();
    }
}
