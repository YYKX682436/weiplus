package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00018B\u001b\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105B#\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\u0006\u00106\u001a\u00020\u0007¢\u0006\u0004\b4\u00107J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010/\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00069"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLikeDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "Lcom/tencent/mm/ui/tools/f5;", "provider", "Ljz5/f0;", "setKeyboardHeightProvider", "", "y", "I", "getScene", "()I", "setScene", "(I)V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "Lyw2/n;", "z", "Lyw2/n;", "getBuilder", "()Lyw2/n;", "setBuilder", "(Lyw2/n;)V", "builder", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "getFeedObj", "()Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "setFeedObj", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "feedObj", "Lcom/tencent/mm/protobuf/g;", "B", "Lcom/tencent/mm/protobuf/g;", "getLikeBuffer", "()Lcom/tencent/mm/protobuf/g;", "setLikeBuffer", "(Lcom/tencent/mm/protobuf/g;)V", "likeBuffer", "Ljava/util/LinkedList;", "Lr45/h60;", "C", "Ljava/util/LinkedList;", "getCommentFriendInfoList", "()Ljava/util/LinkedList;", "setCommentFriendInfoList", "(Ljava/util/LinkedList;)V", "commentFriendInfoList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/vc", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLikeDrawer extends com.tencent.mm.view.drawer.RecyclerViewDrawer {
    public static final com.tencent.mm.plugin.finder.view.vc D = new com.tencent.mm.plugin.finder.view.vc(null);

    /* renamed from: A */
    public com.tencent.mm.plugin.finder.storage.FinderItem feedObj;

    /* renamed from: B, reason: from kotlin metadata */
    public com.tencent.mm.protobuf.g likeBuffer;

    /* renamed from: C, reason: from kotlin metadata */
    public java.util.LinkedList commentFriendInfoList;

    /* renamed from: y, reason: from kotlin metadata */
    public int com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String;

    /* renamed from: z, reason: from kotlin metadata */
    public yw2.n builder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLikeDrawer(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static /* synthetic */ void w(com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer, in5.s0 s0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.protobuf.g gVar, int i17, java.lang.String str, java.util.LinkedList linkedList, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            i17 = 0;
        }
        int i19 = i17;
        if ((i18 & 16) != 0) {
            str = "";
        }
        java.lang.String str2 = str;
        if ((i18 & 32) != 0) {
            linkedList = null;
        }
        finderLikeDrawer.v(s0Var, finderItem, gVar, i19, str2, linkedList);
    }

    public final yw2.n getBuilder() {
        return this.builder;
    }

    public final java.util.LinkedList<r45.h60> getCommentFriendInfoList() {
        return this.commentFriendInfoList;
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem getFeedObj() {
        return this.feedObj;
    }

    public final com.tencent.mm.protobuf.g getLikeBuffer() {
        return this.likeBuffer;
    }

    /* renamed from: getScene, reason: from getter */
    public final int getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() {
        return this.com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String;
    }

    public final void setBuilder(yw2.n nVar) {
        this.builder = nVar;
    }

    public final void setCommentFriendInfoList(java.util.LinkedList<r45.h60> linkedList) {
        this.commentFriendInfoList = linkedList;
    }

    public final void setFeedObj(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.feedObj = finderItem;
    }

    public final void setKeyboardHeightProvider(com.tencent.mm.ui.tools.f5 f5Var) {
        getSquares().setKeyboardHeightProvider(f5Var);
    }

    public final void setLikeBuffer(com.tencent.mm.protobuf.g gVar) {
        this.likeBuffer = gVar;
    }

    public final void setScene(int i17) {
        this.com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String = i17;
    }

    public final void u() {
        if (q()) {
            n(true);
        }
    }

    public final void v(in5.s0 s0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.protobuf.g gVar, int i17, java.lang.String highLightUsername, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(highLightUsername, "highLightUsername");
        if (q()) {
            return;
        }
        this.feedObj = finderItem;
        this.likeBuffer = gVar;
        this.commentFriendInfoList = linkedList;
        yw2.n nVar = this.builder;
        com.tencent.mm.plugin.finder.feed.w20 w20Var = nVar != null ? nVar.f466651d : null;
        com.tencent.mm.plugin.finder.feed.id idVar = w20Var instanceof com.tencent.mm.plugin.finder.feed.id ? (com.tencent.mm.plugin.finder.feed.id) w20Var : null;
        if (idVar != null) {
            idVar.f107009o = s0Var;
            idVar.f107005h = highLightUsername;
        }
        yw2.n nVar2 = this.builder;
        java.lang.Object obj = nVar2 != null ? nVar2.f466651d : null;
        com.tencent.mm.plugin.finder.feed.mh mhVar = obj instanceof com.tencent.mm.plugin.finder.feed.mh ? (com.tencent.mm.plugin.finder.feed.mh) obj : null;
        if (mhVar != null) {
            mhVar.f107383n = highLightUsername;
        }
        if (i17 > 0) {
            int h17 = com.tencent.mm.ui.bl.h(getContext());
            int g17 = com.tencent.mm.ui.bl.g(getContext());
            com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
            int a17 = (e8Var.a() - h17) - g17;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            setTopOffset((decorView.getSystemUiVisibility() & 1024) > 0 ? e8Var.b(getContext()) - i17 : java.lang.Math.min((int) (e8Var.a() * 0.4f), (a17 - i17) + h17));
        }
        r(true, true, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLikeDrawer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLikeDrawer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
