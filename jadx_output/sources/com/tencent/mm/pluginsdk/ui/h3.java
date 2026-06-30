package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputFooter f190863d;

    public h3(com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter) {
        this.f190863d = voiceInputFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter = this.f190863d;
        if (voiceInputFooter.getVisibility() == 8) {
            voiceInputFooter.setVisibility(0);
        }
        if (voiceInputFooter.f189843p.getVisibility() == 0) {
            voiceInputFooter.j();
        }
        if (voiceInputFooter.f189842o.getVisibility() == 0) {
            voiceInputFooter.i();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/VoiceInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
