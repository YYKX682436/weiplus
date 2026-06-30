package zo1;

/* loaded from: classes5.dex */
public final class q3 implements com.tencent.mm.ui.contact.l4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474748d;

    public q3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        this.f474748d = selectContactUI;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public android.widget.ListView O3() {
        android.widget.ListView listView = this.f474748d.f92848e;
        if (listView != null) {
            return listView;
        }
        kotlin.jvm.internal.o.o("searchResultLv");
        throw null;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        return "";
    }

    @Override // com.tencent.mm.ui.contact.l4
    public android.app.Activity getActivity() {
        return this.f474748d;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        wo1.v vVar;
        if (dVar == null || (vVar = this.f474748d.f92861u) == null) {
            return false;
        }
        return vVar.isSelected(dVar.f206850s);
    }
}
