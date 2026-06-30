package iy2;

/* loaded from: classes13.dex */
public final class p implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl f295905d;

    public p(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl) {
        this.f295905d = finderLiveVoiceInputLayoutImpl;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl = this.f295905d;
        if (action != 0) {
            if (action == 1) {
                if (finderLiveVoiceInputLayoutImpl.E) {
                    finderLiveVoiceInputLayoutImpl.E = false;
                    yj0.a.i(false, this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                finderLiveVoiceInputLayoutImpl.getTAG();
                finderLiveVoiceInputLayoutImpl.getCurrentState();
                if (finderLiveVoiceInputLayoutImpl.D) {
                    finderLiveVoiceInputLayoutImpl.g(true, false);
                    finderLiveVoiceInputLayoutImpl.D = false;
                    finderLiveVoiceInputLayoutImpl.getClass();
                } else {
                    finderLiveVoiceInputLayoutImpl.g(false, true);
                }
                com.tencent.mm.sdk.platformtools.u3.i(new iy2.q(finderLiveVoiceInputLayoutImpl), 100L);
            }
        } else {
            if (!com.tencent.mars.comm.NetStatusUtil.isConnected(finderLiveVoiceInputLayoutImpl.getContext())) {
                finderLiveVoiceInputLayoutImpl.E = true;
                iy2.e voiceDetectListener = finderLiveVoiceInputLayoutImpl.getVoiceDetectListener();
                kotlin.jvm.internal.o.d(voiceDetectListener);
                ((iy2.z) voiceDetectListener).a(12, 0, 0);
                yj0.a.i(false, this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            finderLiveVoiceInputLayoutImpl.E = false;
            finderLiveVoiceInputLayoutImpl.D = false;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            finderLiveVoiceInputLayoutImpl.getClass();
            finderLiveVoiceInputLayoutImpl.getTAG();
            finderLiveVoiceInputLayoutImpl.getCurrentState();
            iy2.b bVar = finderLiveVoiceInputLayoutImpl.C;
            if (bVar != null) {
                bVar.f295880s = 6;
                bVar.f295881t.cancel();
                bVar.invalidateSelf();
            }
            finderLiveVoiceInputLayoutImpl.g(false, false);
            android.widget.TextView textView = finderLiveVoiceInputLayoutImpl.B;
            kotlin.jvm.internal.o.d(textView);
            textView.setVisibility(8);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
