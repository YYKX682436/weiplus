package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f114549d;

    /* renamed from: e, reason: collision with root package name */
    public int f114550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f114551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(com.tencent.mm.plugin.finder.live.plugin.ad adVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114551f = adVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.uc(this.f114551f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.uc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.ad adVar;
        r45.m70 a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114550e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.ad adVar2 = this.f114551f;
            com.tencent.mm.protobuf.g gVar = ((mm2.g0) adVar2.P0(mm2.g0.class)).f329063g;
            if (gVar != null) {
                i95.m c17 = i95.n0.c(zy2.b6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                android.content.Context context = adVar2.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                this.f114549d = adVar2;
                this.f114550e = 1;
                obj = ((c61.l7) ((zy2.b6) c17)).kk(context, gVar, false, this);
                if (obj == aVar) {
                    return aVar;
                }
                adVar = adVar2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        adVar = (com.tencent.mm.plugin.finder.live.plugin.ad) this.f114549d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.zc5 zc5Var = (r45.zc5) obj;
        if (zc5Var != null && (a17 = com.tencent.mm.plugin.finder.assist.i9.a(zc5Var)) != null) {
            android.widget.TextView textView = adVar.f111864t;
            if (textView != null) {
                textView.setTextSize(14.0f);
            }
            android.widget.TextView textView2 = adVar.f111864t;
            if (textView2 != null) {
                textView2.setAlpha(0.5f);
            }
            android.widget.TextView textView3 = adVar.f111863s;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            android.widget.TextView textView4 = adVar.f111863s;
            if (textView4 != null) {
                textView4.setText(a17.getString(1));
            }
            android.view.View view = adVar.f111862r;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$6", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$6", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ImageView imageView = adVar.f111861q;
            if (imageView != null) {
                n11.a.b().g(a17.getString(2), imageView);
            }
            android.widget.TextView textView5 = adVar.f111863s;
            if (textView5 != null) {
                int width = adVar.f365323d.getWidth();
                android.view.ViewGroup viewGroup = adVar.f111867w;
                textView5.setMaxWidth((width - (viewGroup != null ? viewGroup.getWidth() : 0)) - ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 72.0f));
            }
        }
        return jz5.f0.f302826a;
    }
}
