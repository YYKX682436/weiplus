package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class a implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl f192052d;

    public a(com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl) {
        this.f192052d = webSearchVoiceInputLayoutImpl;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl.f192045w;
        com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl = this.f192052d;
        int i18 = webSearchVoiceInputLayoutImpl.f189856g;
        webSearchVoiceInputLayoutImpl.f192048t = true;
        com.tencent.mm.pluginsdk.ui.g3 g3Var = webSearchVoiceInputLayoutImpl.f192047s;
        g3Var.f190856s = 7;
        g3Var.f190857t.cancel();
        g3Var.invalidateSelf();
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
