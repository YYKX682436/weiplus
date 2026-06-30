package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f198768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198769e;

    public b(com.tencent.mm.ui.chatting.component.biz.a aVar, boolean z17) {
        this.f198769e = aVar;
        this.f198768d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198769e;
        qk.o oVar = aVar.f198746h;
        oVar.field_hadAlert = 1;
        if (oVar != null) {
            oVar.field_brandFlag |= 4;
            r01.z.p(oVar);
        }
        if (!this.f198768d) {
            r01.q3.Zi().f(aVar.f198580d.x());
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = aVar.f198580d.f460717l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(baseChattingUIFragment, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/biz/BizComponent$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        baseChattingUIFragment.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(baseChattingUIFragment, "com/tencent/mm/ui/chatting/component/biz/BizComponent$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
