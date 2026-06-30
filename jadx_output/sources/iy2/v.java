package iy2;

/* loaded from: classes3.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel f295910d;

    public v(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel) {
        this.f295910d = finderLiveVoiceInputPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = this.f295910d;
        finderLiveVoiceInputPanel.d();
        android.widget.TextView textView = finderLiveVoiceInputPanel.f136768i;
        if (textView != null) {
            textView.setVisibility(finderLiveVoiceInputPanel.C.size() < 2 ? 8 : 0);
        }
        if (finderLiveVoiceInputPanel.f136770n != null) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ml2.r0) c17).ak(2, 13, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
