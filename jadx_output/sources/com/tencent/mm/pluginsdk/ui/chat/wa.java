package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class wa implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ib f190712d;

    public wa(com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        this.f190712d = ibVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f190712d;
        if (ibVar.f190426z) {
            ibVar.f190424y = true;
        }
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
