package vc5;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView f435318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView, android.content.Context context) {
        super(1);
        this.f435318d = msgHistoryGalleryActionBarView;
        this.f435319e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ed5.w typeFilterDialog;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String string;
        java.util.List optionList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(optionList, "optionList");
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView = this.f435318d;
        typeFilterDialog = msgHistoryGalleryActionBarView.getTypeFilterDialog();
        typeFilterDialog.dismiss();
        java.util.Iterator it = optionList.iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it.next();
            if (((yg5.e) obj3).f462352h) {
                break;
            }
        }
        yg5.e eVar = (yg5.e) obj3;
        if (eVar != null) {
            em.u1 u1Var = msgHistoryGalleryActionBarView.f201711f;
            if (u1Var == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryTypeFilterView a17 = u1Var.a();
            java.lang.CharSequence charSequence = eVar.f462351g;
            a17.setTypeFilterDesc(charSequence);
            java.util.Iterator it6 = com.tencent.mm.ui.chatting.history.groups.g.f201751e.a().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.ui.chatting.history.groups.g) next).getClass().getName(), eVar.f462348d)) {
                    obj2 = next;
                    break;
                }
            }
            com.tencent.mm.ui.chatting.history.groups.g gVar = (com.tencent.mm.ui.chatting.history.groups.g) obj2;
            if (gVar != null) {
                yz5.l lVar = msgHistoryGalleryActionBarView.f201713h;
                if (lVar != null) {
                    lVar.invoke(gVar);
                }
                boolean b17 = kotlin.jvm.internal.o.b(gVar, com.tencent.mm.ui.chatting.history.groups.q.f201782f);
                android.content.Context context = this.f435319e;
                if (b17) {
                    string = context.getResources().getString(com.tencent.mm.R.string.f493855pd3);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else if (kotlin.jvm.internal.o.b(gVar, com.tencent.mm.ui.chatting.history.groups.j.f201762f)) {
                    string = context.getResources().getString(com.tencent.mm.R.string.f493854pd2);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else {
                    string = context.getResources().getString(com.tencent.mm.R.string.f493852pd0);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
                msgHistoryGalleryActionBarView.setFilterOptionName(string);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryActionBarView", "TypeFilterDialog selected, option: " + ((java.lang.Object) charSequence));
        }
        return jz5.f0.f302826a;
    }
}
