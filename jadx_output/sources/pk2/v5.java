package pk2;

/* loaded from: classes3.dex */
public final class v5 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356304i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356304i = "assistant.more.commentmanage.quickreply";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356304i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3819n0).getValue()).r()).intValue() == 1;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 moreCommentSettingBottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(moreCommentSettingBottomSheet, "moreCommentSettingBottomSheet");
        android.view.View findViewById = moreCommentSettingBottomSheet.f131959f.findViewById(com.tencent.mm.R.id.hwz);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantFastCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.L, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.u5(this, o9Var, moreCommentSettingBottomSheet));
        }
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.f484159d71);
    }
}
