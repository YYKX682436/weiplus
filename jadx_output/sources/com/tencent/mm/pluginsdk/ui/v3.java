package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class v3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl f192032d;

    public v3(com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl voiceInputLayoutImpl) {
        this.f192032d = voiceInputLayoutImpl;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl voiceInputLayoutImpl = this.f192032d;
        int i17 = voiceInputLayoutImpl.f189856g;
        voiceInputLayoutImpl.f189866t = true;
        com.tencent.mm.pluginsdk.ui.g3 g3Var = voiceInputLayoutImpl.f189865s;
        g3Var.f190856s = 7;
        g3Var.f190857t.cancel();
        g3Var.invalidateSelf();
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
