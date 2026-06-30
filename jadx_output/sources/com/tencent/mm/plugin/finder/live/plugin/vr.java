package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class vr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f114814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(com.tencent.mm.plugin.finder.live.plugin.et etVar, float f17) {
        super(1);
        this.f114813d = etVar;
        this.f114814e = f17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!(it instanceof android.view.ViewGroup) && it.getId() != this.f114813d.f112461y.getId() && it.getId() != com.tencent.mm.R.id.uat) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(this.f114814e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(it, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$initVoicePanel$2$onVoiceStart$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            it.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(it, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$initVoicePanel$2$onVoiceStart$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f302826a;
    }
}
