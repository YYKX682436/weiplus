package iy2;

/* loaded from: classes13.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl f295906d;

    public q(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl) {
        this.f295906d = finderLiveVoiceInputLayoutImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f295906d.B;
        kotlin.jvm.internal.o.d(textView);
        textView.setVisibility(0);
    }
}
