package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class bb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f190201d;

    public bb(com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        this.f190201d = ibVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190201d;
        ibVar.n();
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
        voiceInputBehavior.clear = 1;
        ibVar.i(voiceInputBehavior);
        ibVar.l(4);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
