package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes16.dex */
public final class ms {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f204602a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f204603b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f204604c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f204605d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f204606e;

    /* renamed from: f, reason: collision with root package name */
    public final b10.d f204607f;

    /* renamed from: g, reason: collision with root package name */
    public long f204608g;

    public ms(android.content.Context context, android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f204602a = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489655dz, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f204603b = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f484148t65);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f204604c = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f487791zj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById2;
        this.f204605d = linearLayout;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f487790zi);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f204606e = (android.widget.LinearLayout) findViewById3;
        this.f204607f = new b10.d(linearLayout);
    }

    public final void a(bw5.x7 x7Var, java.lang.String str) {
        try {
            pq.a aVar = new pq.a(this.f204602a);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("encryptUserName", com.tencent.mm.feature.ecs.share.s.f66001a.a(str));
            aVar.b(jSONObject);
            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(aVar, x7Var, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsKfProductCardWholeCtrl", e17, "ecsJump error", new java.lang.Object[0]);
        }
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        try {
            bw5.x7 parseFrom = new bw5.x7().parseFrom(android.util.Base64.decode(str, 0));
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsJumpInfo");
            a(parseFrom, str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsKfProductCardWholeCtrl", e17, "ecsJumpFromBase64 error", new java.lang.Object[0]);
        }
    }

    public final void c(java.util.List list, java.util.List jumpInfos, com.tencent.mm.storage.f9 f9Var, java.lang.String str, long j17) {
        int i17;
        java.lang.String str2;
        b10.b bVar;
        java.lang.String str3;
        boolean isEmpty = list.isEmpty();
        java.lang.String str4 = "MicroMsg.EcsKfProductCardWholeCtrl";
        android.widget.LinearLayout linearLayout = this.f204605d;
        if (isEmpty) {
            linearLayout.setVisibility(8);
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardWholeCtrl", "renderProductItems: no product rendered, msgSvrId=" + j17);
            return;
        }
        linearLayout.setVisibility(0);
        c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
        com.tencent.mm.ui.chatting.viewitems.ls lsVar = new com.tencent.mm.ui.chatting.viewitems.ls(list, u3Var, f9Var, this, str);
        b10.d dVar = this.f204607f;
        dVar.getClass();
        kotlin.jvm.internal.o.g(jumpInfos, "jumpInfos");
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException(("EcsKfProductCardListController.bind must be called on main thread, actual=" + java.lang.Thread.currentThread().getName()).toString());
        }
        if (!(list.size() == jumpInfos.size())) {
            throw new java.lang.IllegalArgumentException(("shareObjects/jumpInfos size mismatch: " + list.size() + " vs " + jumpInfos.size()).toString());
        }
        int size = list.size();
        android.widget.LinearLayout linearLayout2 = dVar.f17021a;
        int childCount = linearLayout2.getChildCount();
        if (childCount > 0 && !(linearLayout2.getChildAt(0) instanceof com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView)) {
            linearLayout2.removeAllViews();
            childCount = 0;
        }
        java.util.ArrayDeque arrayDeque = dVar.f17023c;
        if (size == 0) {
            dVar.c(0);
            linearLayout2.setVisibility(8);
            bVar = new b10.b(0, 0, 0, arrayDeque.size());
            str2 = "MicroMsg.EcsKfProductCardWholeCtrl";
        } else {
            linearLayout2.setVisibility(0);
            if (childCount > size) {
                dVar.c(size);
                childCount = size;
            }
            int i18 = 0;
            while (true) {
                i17 = dVar.f17022b;
                if (i18 >= childCount) {
                    break;
                }
                android.view.View childAt = linearLayout2.getChildAt(i18);
                kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView");
                com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView ecsKfProductCardItemView = (com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView) childAt;
                android.view.ViewGroup.LayoutParams layoutParams = ecsKfProductCardItemView.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    str3 = str4;
                    layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                } else {
                    str3 = str4;
                }
                int i19 = i18 == 0 ? 0 : i17;
                if ((layoutParams2 == layoutParams && layoutParams2.topMargin == i19) ? false : true) {
                    layoutParams2.topMargin = i19;
                    ecsKfProductCardItemView.setLayoutParams(layoutParams2);
                }
                dVar.a(ecsKfProductCardItemView, (bw5.u8) list.get(i18), (bw5.x7) jumpInfos.get(i18), lsVar);
                i18++;
                str4 = str3;
            }
            str2 = str4;
            int i27 = childCount;
            int i28 = 0;
            int i29 = 0;
            while (i27 < size) {
                com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView ecsKfProductCardItemView2 = (com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView) arrayDeque.poll();
                if (ecsKfProductCardItemView2 != null) {
                    i28++;
                } else {
                    android.content.Context context = linearLayout2.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    ecsKfProductCardItemView2 = new com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView(context, null, 0, 6, null);
                    i29++;
                }
                int i37 = size;
                android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutParams3.topMargin = i27 == 0 ? 0 : i17;
                linearLayout2.addView(ecsKfProductCardItemView2, layoutParams3);
                dVar.a(ecsKfProductCardItemView2, (bw5.u8) list.get(i27), (bw5.x7) jumpInfos.get(i27), lsVar);
                i27++;
                size = i37;
            }
            bVar = new b10.b(childCount, i28, i29, arrayDeque.size());
        }
        int childCount2 = linearLayout.getChildCount();
        for (int i38 = 0; i38 < childCount2; i38++) {
            android.view.View childAt2 = linearLayout.getChildAt(i38);
            if (childAt2 != null) {
                ((b00.a0) u3Var).a(childAt2, f9Var, "ecs_kf_card_template_product_item", i38);
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "renderProductItems: msgSvrId=" + j17 + " count=" + list.size() + " reused=" + bVar.f17014a + " fromPool=" + bVar.f17015b + " new=" + bVar.f17016c + " poolSize=" + bVar.f17017d);
    }
}
