package ke5;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f307098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f307099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f307100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.MMChattingListView f307101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ke5.l f307102h;

    public k(ke5.l lVar, android.os.Bundle bundle, int i17, java.util.List list, com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView) {
        this.f307102h = lVar;
        this.f307098d = bundle;
        this.f307099e = i17;
        this.f307100f = list;
        this.f307101g = mMChattingListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        ke5.l lVar = this.f307102h;
        sb5.z zVar = (sb5.z) lVar.f307041b.f460708c.a(sb5.z.class);
        int i18 = this.f307099e;
        android.os.Bundle bundle = this.f307098d;
        if (bundle == null || bundle.getInt("SCENE", 0) != 1) {
            if (bundle == null || bundle.getInt("SCENE", 0) != 2) {
                return;
            }
            ((com.tencent.mm.ui.chatting.adapter.k) zVar).V0(i18);
            yb5.d dVar = lVar.f307041b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/source/presenter/ChattingBrandEcsNoticeMsgDataPresenter$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/source/presenter/ChattingBrandEcsNoticeMsgDataPresenter$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            return;
        }
        boolean z17 = bundle.getBoolean("IS_HIGHLIGHT_ITEM", false);
        boolean z18 = bundle.getBoolean("IS_IDLE_VISBLE", false);
        int i19 = bundle.getInt("SELECTION_TOP_OFFSET", 0);
        boolean z19 = bundle.getBoolean("IS_SMOOTH_SCROLL", false);
        lVar.f307041b.f460720o = i18;
        java.util.List list = this.f307100f;
        if (list.size() > i18 && i18 != -1) {
            ((com.tencent.mm.storage.f9) list.get(i18)).getClass();
        }
        lVar.g(i18, z18, i19, z19);
        if (!z17 || (i17 = this.f307099e) < 0) {
            return;
        }
        this.f307102h.f(this.f307101g, i17, com.tencent.mm.plugin.msg.MsgIdTalker.f149479g, z18, i19, z19, this.f307098d);
    }
}
