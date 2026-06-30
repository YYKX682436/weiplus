package ke5;

/* loaded from: classes9.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f307134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f307135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.MMChattingListView f307136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ke5.x f307137g;

    public w(ke5.x xVar, android.os.Bundle bundle, int i17, com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView) {
        this.f307137g = xVar;
        this.f307134d = bundle;
        this.f307135e = i17;
        this.f307136f = mMChattingListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        ke5.x xVar = this.f307137g;
        sb5.z zVar = (sb5.z) xVar.f307041b.f460708c.a(sb5.z.class);
        int i17 = this.f307135e;
        android.os.Bundle bundle = this.f307134d;
        if (bundle != null && bundle.getInt("SCENE", 0) == 1) {
            boolean z17 = bundle.getBoolean("IS_IDLE_VISBLE", false);
            int i18 = bundle.getInt("SELECTION_TOP_OFFSET", 0);
            boolean z18 = bundle.getBoolean("IS_SMOOTH_SCROLL", false);
            xVar.f307041b.f460720o = i17;
            xVar.g(i17, z17, i18, z18);
            if (i17 < 0 || !xVar.f307041b.f460717l.getBooleanExtra("need_hight_item", false).booleanValue()) {
                return;
            }
            xVar.f307041b.f460717l.getLongExtra("msg_local_id", -1L);
            this.f307137g.f(this.f307136f, this.f307135e, com.tencent.mm.plugin.msg.MsgIdTalker.f149479g, false, i18, false, this.f307134d);
            return;
        }
        if (bundle == null || bundle.getInt("SCENE", 0) != 2) {
            return;
        }
        ((com.tencent.mm.ui.chatting.adapter.k) zVar).V0(i17);
        yb5.d dVar = xVar.f307041b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/source/presenter/ChattingServiceNotifyDataPresenter$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/source/presenter/ChattingServiceNotifyDataPresenter$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
