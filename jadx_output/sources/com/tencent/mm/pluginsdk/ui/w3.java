package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class w3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl f192037d;

    public w3(com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl voiceInputLayoutImpl) {
        this.f192037d = voiceInputLayoutImpl;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl voiceInputLayoutImpl = this.f192037d;
        if (action == 0) {
            voiceInputLayoutImpl.f189866t = false;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            voiceInputLayoutImpl.f189867u = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.pluginsdk.ui.g3 g3Var = voiceInputLayoutImpl.f189865s;
            g3Var.f190856s = 6;
            g3Var.f190857t.cancel();
            g3Var.invalidateSelf();
            voiceInputLayoutImpl.i(false, false);
        } else if (action == 1) {
            int i17 = voiceInputLayoutImpl.f189856g;
            if (voiceInputLayoutImpl.f189866t) {
                voiceInputLayoutImpl.i(true, false);
                voiceInputLayoutImpl.f189866t = false;
                voiceInputLayoutImpl.f189867u = 0L;
            } else {
                voiceInputLayoutImpl.i(false, true);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
