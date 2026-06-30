package iy2;

/* loaded from: classes11.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel f295914d;

    public y(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel) {
        this.f295914d = finderLiveVoiceInputPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = this.f295914d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(finderLiveVoiceInputPanel.getContext());
        iy2.x xVar = new iy2.x(finderLiveVoiceInputPanel, u1Var);
        u1Var.u(finderLiveVoiceInputPanel.getContext().getString(com.tencent.mm.R.string.f491878nw2));
        u1Var.t(finderLiveVoiceInputPanel.B, xVar, finderLiveVoiceInputPanel.A);
        u1Var.a(true);
        u1Var.i(iy2.w.f295911a);
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
