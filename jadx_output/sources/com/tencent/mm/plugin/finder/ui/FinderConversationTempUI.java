package com.tencent.mm.plugin.finder.ui;

@db5.a(512)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationTempUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderConversationParentUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderConversationTempUI extends com.tencent.mm.plugin.finder.ui.FinderConversationParentUI {

    /* renamed from: u, reason: collision with root package name */
    public int f128537u;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 333;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109420v() {
        return "FinderConversationTempUI";
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderConversationParentUI
    public androidx.fragment.app.Fragment c7() {
        if (this.f128536t == null) {
            this.f128536t = new com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment();
        }
        com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment finderBaseConversationFragment = this.f128536t;
        kotlin.jvm.internal.o.d(finderBaseConversationFragment);
        return finderBaseConversationFragment;
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderConversationParentUI
    public java.lang.String d7() {
        java.lang.String string = getString(com.tencent.mm.R.string.cqv);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) i95.n0.c(c61.l7.class)).nk().S()).h(null, zy2.y8.f477619o);
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderConversationParentUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f128537u = ((c61.l7) i95.n0.c(c61.l7.class)).Kj().L0(1, 3, "");
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderConversationParentUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.lang.String str = "";
        int L0 = ((c61.l7) i95.n0.c(c61.l7.class)).Kj().L0(1, 3, "");
        qb2.h0 h0Var = (qb2.h0) ((com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment) c7()).z0();
        l75.n0 c17 = h0Var.c();
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.FinderConversationStorage");
        java.util.List P0 = ((com.tencent.mm.plugin.finder.storage.t80) c17).P0(h0Var.f361217a, 0, 1, new int[]{3}, h0Var.f361219c);
        if (!P0.isEmpty()) {
            str = ((qb2.t) P0.get(0)).F1 + ':' + ((qb2.t) P0.get(0)).field_digest;
        }
        long j17 = P0.isEmpty() ? 0L : ((qb2.t) P0.get(0)).field_updateTime;
        com.tencent.mars.xlog.Log.i("Finder.FinderConversationParentUI", "[onResume] digest:" + str);
        com.tencent.mm.plugin.finder.storage.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        Kj.getClass();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        p75.n0 n0Var = dm.a4.B;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c18 = dm.a4.H.i(1).c(dm.a4.G.i(3));
        p75.i0 g17 = dm.a4.B.g(linkedList);
        g17.f352657d = c18;
        g17.f352659f = linkedList2;
        g17.f352660g = linkedList3;
        p75.l0 a17 = g17.a();
        java.util.List k17 = a17.k(Kj.f128069d, qb2.t.class);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        java.lang.String sql = a17.f352636a;
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.getAliasConvCount", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        int size = ((java.util.ArrayList) k17).size();
        qb2.t D0 = Kj.D0("finderaliassessionholder");
        if (size <= 0) {
            long j18 = D0.systemRowid;
            if (j18 > 0 && size == 0 && Kj.delete(j18)) {
                Kj.doNotify(D0.field_sessionId, 6, D0);
                return;
            }
            return;
        }
        if (D0.systemRowid <= 0 || (kotlin.jvm.internal.o.b(str, D0.field_digest) && j17 == D0.field_updateTime)) {
            if (this.f128537u != L0) {
                this.f128537u = L0;
                Kj.doNotify(D0.field_sessionId, 1, D0);
                return;
            }
            return;
        }
        D0.field_digest = str;
        D0.field_updateTime = j17;
        if (Kj.update(D0.systemRowid, D0, false)) {
            Kj.doNotify(D0.field_sessionId, 1, D0);
        }
    }
}
