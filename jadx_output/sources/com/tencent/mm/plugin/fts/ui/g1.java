package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes8.dex */
public class g1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI f138063d;

    public g1(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f138063d = fTSBaseVoiceSearchUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138063d;
        fTSBaseVoiceSearchUI.f137937y0.a();
        fTSBaseVoiceSearchUI.hideVKB();
        fTSBaseVoiceSearchUI.getClass();
        boolean z17 = !fTSBaseVoiceSearchUI.A1;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
