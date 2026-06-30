package g22;

/* loaded from: classes.dex */
public final class w implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f267881d;

    public w(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f267881d = view;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 tipsInfo) {
        kotlin.jvm.internal.o.g(tipsInfo, "tipsInfo");
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 tipsInfo) {
        kotlin.jvm.internal.o.g(tipsInfo, "tipsInfo");
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r showType) {
        kotlin.jvm.internal.o.g(showType, "showType");
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r showType, boolean z17) {
        kotlin.jvm.internal.o.g(showType, "showType");
        ((ua0.q) ((va0.o) i95.n0.c(va0.o.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.b(this, showType, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "stickernavright";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f267881d;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        ((ua0.q) ((va0.o) i95.n0.c(va0.o.class))).getClass();
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 tipsInfo) {
        kotlin.jvm.internal.o.g(tipsInfo, "tipsInfo");
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 tipsInfo) {
        kotlin.jvm.internal.o.g(tipsInfo, "tipsInfo");
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        if (z17) {
            android.view.View view = this.f267881d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$StickersNewTipsView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$StickersNewTipsView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        android.view.View view2 = this.f267881d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$StickersNewTipsView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$StickersNewTipsView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}
