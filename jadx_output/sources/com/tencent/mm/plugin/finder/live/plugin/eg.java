package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class eg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we2.p f112409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f112410e;

    public eg(we2.p pVar, dk2.zf zfVar) {
        this.f112409d = pVar;
        this.f112410e = zfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateBottomMsg$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l e17 = this.f112409d.e(this.f112410e);
        if (e17 != null) {
            kotlin.jvm.internal.o.d(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateBottomMsg$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
