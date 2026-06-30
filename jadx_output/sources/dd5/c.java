package dd5;

/* loaded from: classes10.dex */
public final class c extends uc5.n {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.ThreadLocal f229096p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ad5.l0[] availableOperations) {
        super(availableOperations);
        kotlin.jvm.internal.o.g(availableOperations, "availableOperations");
        this.f229096p = new java.lang.ThreadLocal();
    }

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        y();
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.tencent.mm.R.layout.aia, (android.view.ViewGroup) recyclerView, false);
        kotlin.jvm.internal.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.mie);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f487295o70);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        zy2.b5 b5Var = new zy2.b5(inflate, (android.widget.CheckBox) findViewById, (android.widget.ImageView) findViewById2);
        android.view.View view = b5Var.f477351a;
        view.setTag(com.tencent.mm.R.id.uhk, b5Var);
        return view;
    }

    @Override // uc5.n, in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        java.lang.Object tag = recyclerView.getTag(com.tencent.mm.R.id.uhs);
        dd5.b bVar = new dd5.b(tag instanceof uc5.f ? (uc5.f) tag : null);
        y();
        com.tencent.mm.plugin.finder.convert.eh ehVar = to2.a.f420940b;
        if (ehVar != null) {
            ehVar.j(recyclerView);
        }
        com.tencent.mm.plugin.finder.convert.zk zkVar = to2.a.f420941c;
        if (zkVar != null) {
            zkVar.j(recyclerView);
        }
        to2.a.f420940b = null;
        to2.a.f420941c = null;
        tu2.b bVar2 = new tu2.b();
        bVar2.f422131a = false;
        com.tencent.mm.plugin.finder.convert.eh ehVar2 = new com.tencent.mm.plugin.finder.convert.eh(-1, bVar2, null, bVar);
        com.tencent.mm.plugin.finder.convert.zk zkVar2 = new com.tencent.mm.plugin.finder.convert.zk(-1, bVar2, null, bVar);
        ehVar2.g(recyclerView, adapter);
        zkVar2.g(recyclerView, adapter);
        to2.a.f420940b = ehVar2;
        to2.a.f420941c = zkVar2;
    }

    @Override // uc5.n, in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        dd5.a1 item = (dd5.a1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.ThreadLocal threadLocal = this.f229096p;
        threadLocal.set(holder);
        try {
            super.h(holder, item, i17, i18, z17, list);
        } finally {
            threadLocal.remove();
        }
    }

    @Override // uc5.n, in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        y();
        to2.a.f420939a.a(recyclerView);
        super.j(recyclerView);
    }

    @Override // uc5.n
    public java.lang.Object p(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.uhk);
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.FinderMsgHistoryGalleryMediaItemViews");
        return new dd5.a((zy2.b5) tag);
    }

    @Override // uc5.n
    public android.widget.CheckBox q(java.lang.Object obj) {
        dd5.a binding = (dd5.a) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        return binding.f229081a.f477352b;
    }

    @Override // uc5.n
    public android.view.View r(java.lang.Object obj) {
        dd5.a binding = (dd5.a) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        return binding.f229081a.f477351a;
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        zy2.a5 a5Var;
        java.lang.Object obj2;
        com.tencent.mm.plugin.finder.convert.ck ckVar;
        com.tencent.mm.plugin.finder.convert.ck ckVar2;
        dd5.a binding = (dd5.a) obj;
        dd5.b1 b1Var = (dd5.b1) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        in5.s0 s0Var = (in5.s0) this.f229096p.get();
        if (s0Var == null || b1Var == null || (a5Var = b1Var.f229091a) == null || (obj2 = a5Var.f477347a) == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(s0Var.getAdapterPosition());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        y();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2 : null;
        if (baseFinderFeed == null || (ckVar = to2.a.f420940b) == null || (ckVar2 = to2.a.f420941c) == null) {
            return;
        }
        int h17 = baseFinderFeed.h();
        ((h17 == 4 || h17 == 3002 || h17 == 8 || h17 == 9) ? ckVar2 : ckVar).h(s0Var, baseFinderFeed, intValue, baseFinderFeed.h(), false, null);
    }

    @Override // uc5.n
    /* renamed from: t */
    public void h(in5.s0 holder, uc5.d dVar, int i17, int i18, boolean z17, java.util.List list) {
        dd5.a1 item = (dd5.a1) dVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.ThreadLocal threadLocal = this.f229096p;
        threadLocal.set(holder);
        try {
            super.h(holder, item, i17, i18, z17, list);
        } finally {
            threadLocal.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        xm3.t0 b17;
        dd5.b1 b1Var;
        zy2.a5 a5Var;
        dd5.a binding = (dd5.a) obj;
        dd5.b1 b1Var2 = (dd5.b1) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (b1Var2 == null) {
            return;
        }
        uc5.r rVar = context instanceof uc5.r ? (uc5.r) context : null;
        if (rVar == null) {
            return;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) rVar).m7())) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (uc5.l0 l0Var : b17.getData()) {
            if (l0Var instanceof uc5.h0) {
                uc5.d dVar = ((uc5.h0) l0Var).f426494d;
                if ((dVar instanceof dd5.a1) && (b1Var = (dd5.b1) ((dd5.a1) dVar).f426477e) != null && (a5Var = b1Var.f229091a) != null) {
                    arrayList.add(java.lang.Long.valueOf(a5Var.f477348b));
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        zy2.a5 a5Var2 = b1Var2.f229091a;
        if (isEmpty) {
            arrayList.add(java.lang.Long.valueOf(a5Var2.f477348b));
        }
        long j17 = a5Var2.f477348b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(arrayList.indexOf(java.lang.Long.valueOf(j17)));
        java.lang.Integer num = valueOf.intValue() >= 0 ? valueOf : null;
        int intValue = num != null ? num.intValue() : 0;
        y();
        android.view.View anchorView = binding.f229081a.f477351a;
        long[] T0 = kz5.n0.T0(arrayList);
        kotlin.jvm.internal.o.g(anchorView, "anchorView");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25.class);
        intent.putExtra("KEY_FEED_ID_LIST", T0);
        intent.putExtra("KEY_CENTER_FEED_ID", j17);
        intent.putExtra("KEY_CENTER_FEED_POS", intValue);
        intent.putExtra("KEY_COMMENT_SCENE", nd1.d1.CTRL_INDEX);
        intent.putExtra("KEY_HAS_MORE", false);
        wa2.x.e(intent, anchorView, 0L, false, false, null, 30, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        android.app.Activity activity2 = activity;
        yj0.a.d(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/FinderCommonFeatureService", "msgHistoryGalleryOpenLocalTimelineFromGallery", "(Landroid/app/Activity;Landroid/view/View;J[JII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity2, "com/tencent/mm/plugin/FinderCommonFeatureService", "msgHistoryGalleryOpenLocalTimelineFromGallery", "(Landroid/app/Activity;Landroid/view/View;J[JII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            return null;
        }
        if (!(!r26.n0.N(U1))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        zy2.b6 y17 = y();
        long msgId = f9Var.getMsgId();
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        zy2.a5 Ok = ((c61.l7) y17).Ok(U1, msgId, Q0);
        if (Ok == null) {
            return null;
        }
        long msgId2 = f9Var.getMsgId();
        java.lang.String Q02 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
        return new dd5.b1(Ok, msgId2, Q02);
    }

    @Override // uc5.n
    public void x(java.lang.Object obj) {
        dd5.a binding = (dd5.a) obj;
        kotlin.jvm.internal.o.g(binding, "binding");
        zy2.b5 b5Var = binding.f229081a;
        b5Var.f477353c.setImageDrawable(new android.graphics.drawable.ColorDrawable(b5Var.f477351a.getContext().getResources().getColor(com.tencent.mm.R.color.f478490b, null)));
    }

    public final zy2.b6 y() {
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return (zy2.b6) c17;
    }
}
