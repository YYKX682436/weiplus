package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class cj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ej f198892d;

    public cj(com.tencent.mm.ui.chatting.component.ej ejVar) {
        this.f198892d = ejVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/RecordSelectComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.ej ejVar = this.f198892d;
        if (!ejVar.f198982m && !ejVar.n0()) {
            a14.a.a().f582a.f60361h = ejVar.m0();
        }
        ejVar.f198982m = true;
        sb5.z zVar = (sb5.z) ejVar.f198580d.f460708c.a(sb5.z.class);
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) view.getTag();
        if (((com.tencent.mm.ui.chatting.adapter.k) zVar).W.contains(msgIdTalker)) {
            a14.a.a().f586e++;
        } else {
            a14.a.a().f585d++;
        }
        if (!((com.tencent.mm.ui.chatting.adapter.k) zVar).W0(msgIdTalker)) {
            a14.a.a().f583b++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "setOnEditModeItemClickListener msgId:%s", msgIdTalker);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/RecordSelectComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
