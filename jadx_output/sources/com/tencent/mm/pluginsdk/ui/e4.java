package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class e4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputUI f190807d;

    public e4(com.tencent.mm.pluginsdk.ui.VoiceInputUI voiceInputUI) {
        this.f190807d = voiceInputUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.pluginsdk.ui.VoiceInputUI voiceInputUI = this.f190807d;
        if (action == 0) {
            voiceInputUI.f189879o++;
        } else if (motionEvent.getAction() == 1) {
            if (voiceInputUI.f189873f.f189843p.getVisibility() == 0) {
                com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter = voiceInputUI.f189873f;
                voiceInputFooter.j();
                voiceInputFooter.setVisibility(8);
            }
            if (voiceInputUI.f189873f.f189842o.getVisibility() == 0) {
                com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter2 = voiceInputUI.f189873f;
                voiceInputFooter2.i();
                voiceInputFooter2.setVisibility(8);
            }
            com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter3 = voiceInputUI.f189873f;
            voiceInputFooter3.setVisibility(0);
            android.widget.ImageButton imageButton = voiceInputFooter3.f189845r;
            if (imageButton != null) {
                imageButton.setImageResource(com.tencent.mm.R.drawable.f481235o1);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/VoiceInputUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
