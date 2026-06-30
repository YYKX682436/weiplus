package uf5;

/* loaded from: classes4.dex */
public class p0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrUIBase f427282d;

    public p0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase) {
        this.f427282d = contactMgrUIBase;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase = this.f427282d;
        com.tencent.mm.ui.contact.item.d item = contactMgrUIBase.f207103g.getItem(i17);
        if (item != null && (item instanceof com.tencent.mm.ui.contact.item.u)) {
            java.lang.String str = ((com.tencent.mm.ui.contact.item.u) item).f206819z;
            if (!contactMgrUIBase.f207103g.f207078f) {
                new rl5.r(contactMgrUIBase.getContext()).g(view, i17, j17, new uf5.n0(this, i17), new uf5.o0(this, str), contactMgrUIBase.f207117x, contactMgrUIBase.f207118y);
            }
            this.f427282d.Y6(adapterView, view, i17, j17);
        }
        return true;
    }
}
