package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes2.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LauncherUI f198821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f198822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.m0 f198823f;

    public x(com.tencent.mm.ui.chatting.component.biz.a aVar, com.tencent.mm.ui.LauncherUI launcherUI, java.util.List list, com.tencent.mm.ui.chatting.component.biz.m0 m0Var) {
        this.f198821d = launcherUI;
        this.f198822e = list;
        this.f198823f = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/biz/BizComponent$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(view.getContext(), view.getContext().getString(com.tencent.mm.R.string.f490739ak0), false, 0, null);
        f17.show();
        r45.hv6 hv6Var = new r45.hv6();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 7386;
        lVar.f70666c = "/cgi-bin/micromsg-bin/usebizmuteflag";
        lVar.f70664a = hv6Var;
        lVar.f70665b = new r45.iv6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.f70649i = true;
        iVar.l().f(this.f198821d).h(new com.tencent.mm.ui.chatting.component.biz.w(this, f17));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/biz/BizComponent$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
