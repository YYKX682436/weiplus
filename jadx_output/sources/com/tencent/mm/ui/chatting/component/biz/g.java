package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes11.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f198779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198780e;

    public g(com.tencent.mm.ui.chatting.component.biz.a aVar, java.util.LinkedList linkedList) {
        this.f198780e = aVar;
        this.f198779d = linkedList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.tj tjVar = new r45.tj();
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f198779d;
            if (i18 >= linkedList.size()) {
                com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198780e;
                aVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "updateBizChatMemberList()");
                java.lang.String string = aVar.f198580d.s().getString(com.tencent.mm.R.string.i4_);
                s01.y Ni = r01.q3.Ni();
                s01.h hVar = aVar.f198744f;
                java.lang.String str = hVar.field_brandUserName;
                java.lang.String str2 = hVar.field_bizChatServId;
                Ni.getClass();
                s01.q0 q0Var = new s01.q0(str, str2, null, tjVar, aVar);
                gm0.j1.n().f273288b.g(q0Var);
                yb5.d dVar = aVar.f198580d;
                dVar.W(dVar.g(), aVar.f198580d.s().getString(com.tencent.mm.R.string.f490573yv), string, true, true, new com.tencent.mm.ui.chatting.component.biz.i(aVar, q0Var));
                return;
            }
            r45.sj sjVar = new r45.sj();
            sjVar.f385768d = (java.lang.String) linkedList.get(i18);
            tjVar.f386494d.add(sjVar);
            i18++;
        }
    }
}
