package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderMsgContract$MsgPresenter$thanksUpdateListener$1$callback$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter f122852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f122853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122854f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f122855g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderThanksUpdateEvent f122856h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgPresenter$thanksUpdateListener$1$callback$1(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter, java.lang.Long l17, java.lang.String str, java.lang.Integer num, com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
        super(0);
        this.f122852d = msgPresenter;
        this.f122853e = l17;
        this.f122854f = str;
        this.f122855g = num;
        this.f122856h = finderThanksUpdateEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f122852d;
        java.lang.String str = msgPresenter.f122826g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thanksUpdateListener event objectID:");
        java.lang.Long l17 = this.f122853e;
        sb6.append(l17);
        sb6.append(" wxUsername:");
        java.lang.String str2 = this.f122854f;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.ArrayList arrayList = msgPresenter.f122828i;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.i iVar = (so2.i) next;
            int i19 = iVar.f410411d.field_type;
            java.lang.Integer num = this.f122855g;
            boolean z17 = i19 == 2 && num != null && num.intValue() == 2;
            dm.pd pdVar = iVar.f410411d;
            boolean z18 = pdVar.field_type == 15 && num != null && num.intValue() == 3;
            boolean z19 = pdVar.field_type == 33 && num != null && num.intValue() == 5;
            if (z17 || z18 || z19) {
                long j17 = pdVar.field_objectId;
                if (l17 != null && j17 == l17.longValue() && kotlin.jvm.internal.o.b(pdVar.field_contact.getUsername(), str2)) {
                    com.tencent.mars.xlog.Log.i(msgPresenter.f122826g, "thanksUpdateListener event index " + i17);
                    am.md mdVar = this.f122856h.f54333g;
                    pdVar.w0(mdVar != null && mdVar.f7338b);
                    arrayList.set(i17, iVar);
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = msgPresenter.f122827h;
                    if (msgViewCallback != null && (wxRecyclerAdapter = msgViewCallback.f122867q) != null) {
                        wxRecyclerAdapter.notifyItemChanged(i17, 1);
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
