package ke5;

/* loaded from: classes9.dex */
public final class a0 extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f307054i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f307055j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f307056k;

    /* renamed from: l, reason: collision with root package name */
    public int f307057l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(yb5.d chattingContext, hd5.r loader) {
        super(chattingContext, loader);
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(loader, "loader");
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = chattingContext.f460717l;
        java.lang.String stringExtra = baseChattingUIFragment.getStringExtra("key_template_msg_username");
        kotlin.jvm.internal.o.f(stringExtra, "getStringExtra(...)");
        this.f307054i = stringExtra;
        java.lang.String stringExtra2 = baseChattingUIFragment.getStringExtra("key_template_msg_id");
        kotlin.jvm.internal.o.f(stringExtra2, "getStringExtra(...)");
        this.f307055j = stringExtra2;
        java.lang.Boolean booleanExtra = baseChattingUIFragment.getBooleanExtra("key_is_service_voip_template_msg", false);
        kotlin.jvm.internal.o.f(booleanExtra, "getBooleanExtra(...)");
        this.f307056k = booleanExtra.booleanValue();
    }

    @Override // ke5.a, hd5.k
    public void c(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, hd5.q result) {
        boolean z17;
        kotlin.jvm.internal.o.g(result, "result");
        super.c(mMChattingListView, result);
        java.util.List list = result.f280633e;
        int size = ((java.util.LinkedList) result.f280631c).size();
        int i17 = result.f280634f;
        this.f307057l += size;
        boolean isEmpty = list.isEmpty();
        yb5.d dVar = this.f307041b;
        com.tencent.mm.ui.chatting.component.z4.j(dVar.f460717l, com.tencent.mm.R.id.f487584qh1);
        android.view.View c17 = dVar.c(com.tencent.mm.R.id.qeo);
        if (c17 == null) {
            z17 = false;
        } else {
            int i18 = isEmpty ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            z17 = false;
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/ui/chatting/source/presenter/ChattingTemplateMsgPresenter", "onEmptyViewShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/ui/chatting/source/presenter/ChattingTemplateMsgPresenter", "onEmptyViewShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (list.isEmpty()) {
            com.tencent.mm.ui.chatting.component.z4.j(dVar.f460717l, com.tencent.mm.R.id.f487584qh1);
        }
        int i19 = this.f307056k ? i17 : 10;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingTemplateMsgPresenter", "addedCount: " + this.f307057l + ", allCount: " + i17 + ", preAddCount: " + this.f307043d);
        if (this.f307057l >= i19 || this.f307043d >= i17) {
            mMChattingListView.setIsTopShowAll(true);
        } else {
            a(hd5.n.ACTION_MORE_PAGE, z17, null);
        }
        if (result.f280630b == hd5.n.ACTION_ENTER) {
            dVar.N(z17);
        }
        mMChattingListView.setIsBottomShowAll(true);
    }

    @Override // ke5.a
    public he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar) {
        int n76 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).n7(this.f307054i, 318767153);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingTemplateMsgPresenter", "action: " + nVar + ", totalCount: " + n76);
        if (this.f307056k && (nVar == hd5.n.ACTION_ENTER || nVar == hd5.n.ACTION_UPDATE)) {
            this.f307057l = 0;
        }
        int i17 = nVar == null ? -1 : ke5.z.f307158a[nVar.ordinal()];
        if (i17 == 1 || i17 == 2) {
            return new he5.p(this.f307054i, 10, n76, this.f307055j, this.f307056k);
        }
        if (i17 != 3) {
            if (i17 == 4) {
                return new he5.p(this.f307054i, this.f307057l + 10, n76, this.f307055j, this.f307056k);
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingTemplateMsgPresenter", "illegal action type.");
        }
        return null;
    }
}
