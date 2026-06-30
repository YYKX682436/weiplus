package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl f192053d;

    public b(com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl) {
        this.f192053d = webSearchVoiceInputLayoutImpl;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl webSearchVoiceInputLayoutImpl = this.f192053d;
        if (action == 0) {
            webSearchVoiceInputLayoutImpl.f192048t = false;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            webSearchVoiceInputLayoutImpl.getClass();
            com.tencent.mm.pluginsdk.ui.g3 g3Var = webSearchVoiceInputLayoutImpl.f192047s;
            g3Var.f190856s = 6;
            g3Var.f190857t.cancel();
            g3Var.invalidateSelf();
            webSearchVoiceInputLayoutImpl.i(false, false);
        } else if (action == 1) {
            int i17 = com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl.f192045w;
            int i18 = webSearchVoiceInputLayoutImpl.f189856g;
            if (webSearchVoiceInputLayoutImpl.f192048t) {
                webSearchVoiceInputLayoutImpl.i(true, false);
                webSearchVoiceInputLayoutImpl.f192048t = false;
                webSearchVoiceInputLayoutImpl.getClass();
            } else {
                webSearchVoiceInputLayoutImpl.i(false, true);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
