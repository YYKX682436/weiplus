package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabMyLikeFragment;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "Lcom/tencent/mm/modelbase/u0;", "", "getFeedFrom", "getType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvTabMyLikeFragment extends com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment {

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f151729w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMvTabMyLikeFragment(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public void c(dm.i8 i8Var, java.lang.String str) {
        this.music = i8Var;
        this.keyword = str;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gm0.j1.d().g(new hm3.n(xy2.c.e(context), this.f151729w));
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public int getFeedFrom() {
        return 6;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public int getType() {
        return 4;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        if (m1Var instanceof hm3.n) {
            boolean z17 = true;
            if (i17 == 0 && i18 == 0) {
                hm3.n nVar = (hm3.n) m1Var;
                r45.d71 d71Var = nVar.f282272n;
                int i19 = 2;
                this.f151729w = d71Var != null ? d71Var.getByteString(2) : null;
                r45.d71 d71Var2 = nVar.f282272n;
                if (d71Var2 != null) {
                    java.util.Iterator it = d71Var2.getList(1).iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
                        if (finderObject != null) {
                            jm3.h1.f300322a.a(finderObject);
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                            if ((objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null || finderMedia.getMediaType() != i19) ? z17 : false) {
                                long id6 = finderObject.getId();
                                java.lang.String objectNonceId = finderObject.getObjectNonceId();
                                if (!getFeedIdMap().contains(java.lang.Long.valueOf(id6))) {
                                    getDataList().add(new com.tencent.mm.plugin.mv.ui.view.q3(new com.tencent.mm.plugin.mv.ui.view.t3(id6, objectNonceId, finderObject, false, 8, null)));
                                }
                            }
                            z17 = true;
                            i19 = 2;
                        }
                    }
                    getAdapter().notifyDataSetChanged();
                    r45.d71 d71Var3 = nVar.f282272n;
                    java.lang.Integer valueOf = d71Var3 != null ? java.lang.Integer.valueOf(d71Var3.getInteger(3)) : null;
                    setHasMore(valueOf == null || valueOf.intValue() != 0);
                    yz5.a onSceneEndListener = getOnSceneEndListener();
                    if (onSceneEndListener != null) {
                        onSceneEndListener.invoke();
                    }
                    com.tencent.mars.xlog.Log.i("Music.MusicMvTabFragment", "onSceneEnd GetFinderLikeFeed " + getDataList().size() + ", hasMore:" + getHasMore());
                }
            }
            getRlLayout().N(0);
            com.tencent.mm.plugin.mv.ui.view.p3 resultListener = getResultListener();
            if (resultListener != null) {
                ((com.tencent.mm.plugin.mv.ui.view.h0) resultListener).a(3, getAdapter().getItemCount());
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.mv.ui.view.q3> adapter = getAdapter();
            if (adapter != null && adapter.getItemCount() == 0) {
                android.widget.LinearLayout emptyLL = getEmptyLL();
                if (emptyLL != null) {
                    emptyLL.setVisibility(0);
                }
            } else {
                android.widget.LinearLayout emptyLL2 = getEmptyLL();
                if (emptyLL2 != null) {
                    emptyLL2.setVisibility(8);
                }
            }
            android.widget.TextView loadingTv = getLoadingTv();
            if (loadingTv == null) {
                return;
            }
            loadingTv.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvTabMyLikeFragment(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
        gm0.j1.d().a(3965, this);
    }
}
