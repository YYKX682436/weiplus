package com.tencent.mm.plugin.label.ui.searchContact;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/searchContact/ContactDataItemList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lcom/tencent/mm/plugin/label/ui/searchContact/d;", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lxm3/n0;", "config", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lym3/f;Lxm3/n0;Landroidx/lifecycle/y;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ContactDataItemList extends com.tencent.mm.plugin.mvvmlist.MvvmList<com.tencent.mm.plugin.label.ui.searchContact.d> {
    public java.util.List A;
    public java.util.ArrayList B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactDataItemList(ym3.f dataSource, xm3.n0 config, androidx.lifecycle.y lifecycleOwner) {
        super(dataSource, config, lifecycleOwner, null, null, 24, null);
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        new java.util.ArrayList();
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.mvvmlist.MvvmList
    public java.lang.String c() {
        return "MicroMsg.Mvvm.ContactDataItemList";
    }

    @Override // com.tencent.mm.plugin.mvvmlist.MvvmList
    public java.util.List e(java.util.List snapshotList) {
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(snapshotList, 10));
        java.util.Iterator it = snapshotList.iterator();
        while (it.hasNext()) {
            arrayList.add((com.tencent.mm.plugin.label.ui.searchContact.d) ((com.tencent.mm.plugin.label.ui.searchContact.d) it.next()).y0());
        }
        return arrayList;
    }
}
