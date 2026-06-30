package f93;

/* loaded from: classes4.dex */
public final class d0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260309d;

    public d0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        this.f260309d = contactEditLabel;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260309d;
        f93.y yVar = contactEditLabel.A;
        if (yVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        com.tencent.mm.ui.contact.item.d item = yVar.getItem(i17);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.u)) {
            return true;
        }
        java.lang.String str = ((com.tencent.mm.ui.contact.item.u) item).f206819z;
        f93.y yVar2 = contactEditLabel.A;
        if (yVar2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        if (!yVar2.f207078f) {
            new rl5.r(contactEditLabel.getContext()).g(view, i17, j17, new f93.b0(i17), new f93.c0(contactEditLabel, str), contactEditLabel.B, contactEditLabel.C);
        }
        return true;
    }
}
