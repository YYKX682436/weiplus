package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ue implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ve f119970d;

    public ue(com.tencent.mm.plugin.finder.live.widget.ve veVar) {
        this.f119970d = veVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansAnnouncementLevelSettingPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.ve veVar = this.f119970d;
        yz5.l lVar = veVar.f120064h;
        if (lVar != null) {
            com.tencent.mm.plugin.finder.view.FinderLiveDarkModePicker finderLiveDarkModePicker = veVar.f120065i;
            if (finderLiveDarkModePicker == null) {
                kotlin.jvm.internal.o.o("picker");
                throw null;
            }
            lVar.invoke(java.lang.Integer.valueOf(finderLiveDarkModePicker.getValue() + 1));
        }
        veVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansAnnouncementLevelSettingPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
