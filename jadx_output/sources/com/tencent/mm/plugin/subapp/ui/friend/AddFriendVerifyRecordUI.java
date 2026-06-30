package com.tencent.mm.plugin.subapp.ui.friend;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AddFriendVerifyRecordUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f172162p = 0;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f172166g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f172167h;

    /* renamed from: m, reason: collision with root package name */
    public l75.q0 f172169m;

    /* renamed from: n, reason: collision with root package name */
    public long f172170n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f172171o;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f172163d = jz5.h.b(new eg4.p0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f172164e = jz5.h.b(eg4.r0.f252786d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f172165f = jz5.h.b(eg4.o0.f252769d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f172168i = jz5.h.b(new eg4.q0(this));

    public static final void U6(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI) {
        int y17;
        int itemCount;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) addFriendVerifyRecordUI.f172163d).getValue();
        if (wxRecyclerView == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || addFriendVerifyRecordUI.f172166g || addFriendVerifyRecordUI.f172167h || (y17 = linearLayoutManager.y()) < linearLayoutManager.getItemCount() - 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "tryLoadMoreIfNearBottom: lastVisible=" + y17 + " >= " + itemCount + ", trigger syncVerifyRecordHistory");
        if (addFriendVerifyRecordUI.f172167h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory: already loading, skip");
            return;
        }
        if (((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) addFriendVerifyRecordUI.f172165f).getValue()).getBoolean("all_history_fetched", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory: MMKV already marks fetched all, skip network request");
            addFriendVerifyRecordUI.f172166g = true;
            addFriendVerifyRecordUI.W6();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory: start loading");
            addFriendVerifyRecordUI.f172167h = true;
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) addFriendVerifyRecordUI.f172168i).getValue(), null, new eg4.a1(addFriendVerifyRecordUI, null), 1, null);
        }
    }

    public final com.tencent.mm.storage.jb V6() {
        return (com.tencent.mm.storage.jb) ((jz5.n) this.f172164e).getValue();
    }

    public final void W6() {
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) this.f172168i).getValue(), null, new eg4.c1(this, null), 1, null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dyl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int, boolean] */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.fbf);
        hideActionbarLine();
        try {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).g();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddFriendVerifyRecordUI", e17, "try cancel notification fail", new java.lang.Object[0]);
        }
        if (!gm0.j1.a()) {
            finish();
            return;
        }
        this.f172170n = c01.id.c();
        com.tencent.mm.storage.jb V6 = V6();
        ?? r17 = (V6 == null || !(((java.util.ArrayList) V6.z0()).isEmpty() ^ true)) ? 0 : 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "onCreate: hasLocalVerifyRecord=" + ((boolean) r17) + ", report has_backend_sync=" + ((int) r17));
        if (!this.f172171o) {
            this.f172171o = true;
            cy1.a aVar = (cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FMessageConversationUI)).ik(this, 4, 33926);
            aVar.fk(this, "page_sessionid", java.lang.Long.valueOf(this.f172170n));
            aVar.fk(this, "new_friends_page_type", 2);
            aVar.fk(this, "has_backend_sync", java.lang.Integer.valueOf((int) r17));
        }
        setBackBtn(new eg4.s0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.gum), new eg4.u0(this));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f172163d).getValue();
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
            wxRecyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordConvertFactory(new eg4.f1(this)), new java.util.ArrayList(), false));
            wxRecyclerView.i(new eg4.e1(this));
            W6();
        }
        this.f172169m = new eg4.v0(this);
        com.tencent.mm.storage.jb V62 = V6();
        if (V62 != null) {
            V62.add(this.f172169m);
        }
        this.f172166g = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f172165f).getValue()).getBoolean("all_history_fetched", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "onCreate: hasFetchedAll=" + this.f172166g + ", no initial sync");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        l75.q0 q0Var = this.f172169m;
        if (q0Var != null) {
            com.tencent.mm.storage.jb V6 = V6();
            if (V6 != null) {
                V6.remove(q0Var);
            }
            this.f172169m = null;
        }
        r21.w.wi().y0();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
    }
}
