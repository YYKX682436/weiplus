package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class b7 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f206626d;

    public b7(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f206626d = onlyChatContactMgrUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI = this.f206626d;
        com.tencent.mm.ui.contact.item.d item = onlyChatContactMgrUI.f206503e.getItem(i17);
        if (item != null && (item instanceof com.tencent.mm.ui.contact.item.u)) {
            java.lang.String str = ((com.tencent.mm.ui.contact.item.u) item).f206819z;
            if (!onlyChatContactMgrUI.f206503e.f207078f) {
                new rl5.r(onlyChatContactMgrUI.getContext()).g(view, i17, j17, new com.tencent.mm.ui.contact.z6(this, i17), new com.tencent.mm.ui.contact.a7(this, str), onlyChatContactMgrUI.f206513r, onlyChatContactMgrUI.f206514s);
            }
        }
        return true;
    }
}
