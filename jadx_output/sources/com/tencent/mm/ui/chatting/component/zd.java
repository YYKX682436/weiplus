package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class zd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.le f200370d;

    public zd(com.tencent.mm.ui.chatting.component.le leVar) {
        this.f200370d = leVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupToolsComponet$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "downArrowRl click");
        com.tencent.mm.ui.chatting.view.g0 g0Var = this.f200370d.f199425t;
        if (g0Var != null) {
            g0Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
