package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class dr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mr f118140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f118141e;

    public dr(com.tencent.mm.plugin.finder.live.widget.mr mrVar, android.content.Context context) {
        this.f118140d = mrVar;
        this.f118141e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel$onConfirmClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.mr mrVar = this.f118140d;
        mrVar.getClass();
        com.tencent.mm.plugin.finder.live.widget.e0.t(mrVar, false, 1, null);
        ((kotlinx.coroutines.flow.h3) ((mm2.g1) mrVar.H.a(mm2.g1.class)).f329073n).k(mrVar.f119113x1);
        ((kotlinx.coroutines.flow.h3) ((mm2.g1) mrVar.H.a(mm2.g1.class)).f329076q).k(mrVar.f119112x0);
        android.content.Context context = this.f118141e;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class)).i7();
        mrVar.h0(2);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel$onConfirmClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
