package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class eh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kh f112413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.o f112414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(com.tencent.mm.plugin.finder.live.plugin.kh khVar, jz5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112413e = khVar;
        this.f112414f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.eh(this.f112413e, this.f112414f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.eh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Boolean bool;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112412d;
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = this.f112413e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fl2.e eVar = khVar.f113246t;
            this.f112412d = 1;
            if (eVar.b(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.widget.TextView textView = khVar.f113247u;
        if (textView != null) {
            bool = java.lang.Boolean.valueOf(textView.getVisibility() == 0);
        } else {
            bool = null;
        }
        android.widget.TextView textView2 = khVar.f113247u;
        if (textView2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView3 = khVar.f113245s;
        if (textView3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ml2.r0) c17).yk(1, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        android.widget.TextView textView4 = khVar.f113247u;
        if (textView4 != null) {
            textView4.setText((java.lang.CharSequence) this.f112414f.f302843f);
        }
        com.tencent.mm.plugin.finder.live.plugin.kh.t1(khVar);
        return jz5.f0.f302826a;
    }
}
