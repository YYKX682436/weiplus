package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes13.dex */
public class p implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.VoipBigIconButton f177187d;

    public p(com.tencent.mm.plugin.voip.widget.VoipBigIconButton voipBigIconButton) {
        this.f177187d = voipBigIconButton;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/widget/VoipBigIconButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.voip.widget.VoipBigIconButton voipBigIconButton = this.f177187d;
        if (action == 0) {
            voipBigIconButton.f177100d.setBackgroundDrawable(voipBigIconButton.f177103g);
            voipBigIconButton.f177100d.setImageDrawable(voipBigIconButton.f177105i);
            voipBigIconButton.f177101e.setTextColor(voipBigIconButton.f177106m.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        } else if (action == 1) {
            voipBigIconButton.f177100d.setBackgroundDrawable(voipBigIconButton.f177102f);
            voipBigIconButton.f177100d.setImageDrawable(voipBigIconButton.f177104h);
            voipBigIconButton.f177101e.setTextColor(voipBigIconButton.f177106m.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/voip/widget/VoipBigIconButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
