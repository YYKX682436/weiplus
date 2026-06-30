package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class d1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl f138261d;

    public d1(com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl) {
        this.f138261d = fTSVoiceInputLayoutImpl;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = this.f138261d;
        int i17 = fTSVoiceInputLayoutImpl.f138233f;
        fTSVoiceInputLayoutImpl.f138226t = true;
        com.tencent.mm.plugin.fts.ui.widget.x0 x0Var = fTSVoiceInputLayoutImpl.f138225s;
        x0Var.f138358n = 7;
        x0Var.invalidateSelf();
        yj0.a.i(true, this, "com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
