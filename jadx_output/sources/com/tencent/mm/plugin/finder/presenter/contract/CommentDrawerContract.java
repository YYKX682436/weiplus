package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract;", "", "()V", "CloseDrawerCallback", "NPresenter", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommentDrawerContract {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$CloseDrawerCallback;", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes6.dex */
    public interface CloseDrawerCallback {

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
        }

        void a(int i17, java.util.List list, boolean z17);
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;", "Lfs2/a;", "Lyw2/a0;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public interface NPresenter extends fs2.a {

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
        }

        static /* synthetic */ void L(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter, android.content.Context context, so2.y0 y0Var, int i17, zy2.gc gcVar, int i18, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: modComment");
            }
            if ((i18 & 8) != 0) {
                gcVar = null;
            }
            nPresenter.b0(context, y0Var, i17, gcVar);
        }

        void B0(boolean z17);

        void E(android.view.View view, int i17);

        void H(android.view.View view, so2.y0 y0Var);

        boolean J(so2.y0 y0Var, boolean z17);

        void K(int i17);

        so2.y0 N(long j17);

        boolean O(int i17);

        void R(android.widget.ImageView imageView, int i17);

        int S();

        void T();

        void U(so2.y0 y0Var, int i17, zy2.gc gcVar);

        int W();

        com.tencent.mm.view.recyclerview.WxRecyclerAdapter a(android.content.Context context);

        java.lang.String a0();

        androidx.recyclerview.widget.p2 b(android.content.Context context);

        void b0(android.content.Context context, so2.y0 y0Var, int i17, zy2.gc gcVar);

        boolean c0();

        void d(int i17);

        void e(android.view.View view, so2.y0 y0Var);

        com.tencent.mm.plugin.finder.model.BaseFinderFeed f0();

        void g0(long j17);

        int getCommentScene();

        boolean h0();

        kw2.c j();

        int k();

        int k0();

        void l(so2.y0 y0Var, boolean z17);

        boolean l0();

        void n(com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, so2.y0 y0Var);

        void o(so2.y0 y0Var, int i17);

        void q0(com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer, yw2.a0 a0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback closeDrawerCallback, int i17, boolean z17, long j17, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, boolean z18, boolean z19, long j18, boolean z27, boolean z28, boolean z29, int i18);

        boolean r();

        void r0(so2.y0 y0Var);

        void t(int i17);

        boolean t0();

        void u(android.view.View view, so2.y0 y0Var);

        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView v0();

        java.util.HashSet w();

        boolean x();

        com.tencent.mm.plugin.finder.storage.FinderItem z0();
    }
}
