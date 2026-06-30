package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.w f170491d;

    public t(com.tencent.mm.plugin.sns.ui.w wVar) {
        this.f170491d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.v vVar = (com.tencent.mm.plugin.sns.ui.v) view.getTag();
        com.tencent.mm.plugin.sns.ui.w wVar = this.f170491d;
        wVar.f170727d = vVar;
        com.tencent.mm.plugin.sns.ui.v vVar2 = wVar.f170727d;
        wVar.a(vVar2.f170606b, vVar2.f170605a);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$2");
    }
}
