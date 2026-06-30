package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class l6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$buildItemConverts$1 textStatusDoWhatActivityV2$buildItemConverts$1, com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        super(0);
        this.f174049d = textStatusDoWhatActivityV2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174049d;
        java.util.Iterator it = textStatusDoWhatActivityV2.Y.iterator();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((in5.c) next) instanceof lj4.f) {
                i17 = i18;
                break;
            }
            i18 = i19;
        }
        textStatusDoWhatActivityV2.Y.remove(i17);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusDoWhatActivityV2.f173537e;
        if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null) {
            adapter.notifyItemRemoved(i17);
        }
        return jz5.f0.f302826a;
    }
}
