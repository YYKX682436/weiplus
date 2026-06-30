package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabMachineFragment;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "Lcom/tencent/mm/modelbase/u0;", "", "getFeedFrom", "getType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvTabMachineFragment extends com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment {

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f151727w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMvTabMachineFragment(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public void c(dm.i8 i8Var, java.lang.String str) {
        java.lang.String keyword = getKeyword();
        this.music = i8Var;
        this.keyword = keyword;
        com.tencent.mars.xlog.Log.i("Music.MusicMvTabFragment", "syncBgFinderFeed " + str);
        if (i8Var != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gm0.j1.d().g(new hm3.k(context, this.f151727w));
        }
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public int getFeedFrom() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public int getType() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd, type:");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        sb6.append(", errType:");
        sb6.append(i17);
        sb6.append(", errcode:");
        sb6.append(i18);
        sb6.append(", errMsg:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Music.MusicMvTabFragment", sb6.toString());
        if (m1Var instanceof hm3.k) {
            if (i17 == 0 && i18 == 0) {
                hm3.k kVar = (hm3.k) m1Var;
                r45.es4 es4Var = kVar.f282259n;
                this.f151727w = es4Var != null ? es4Var.f373702e : null;
                if (es4Var != null) {
                    java.util.LinkedList linkedList = es4Var.f373701d;
                    linkedList.size();
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        boolean z17 = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
                        if (finderObject != null) {
                            jm3.h1.f300322a.a(finderObject);
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                            if (objectDesc != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null && finderMedia.getMediaType() == 2) {
                                z17 = false;
                            }
                            if (z17) {
                                long id6 = finderObject.getId();
                                java.lang.String objectNonceId = finderObject.getObjectNonceId();
                                if (!getFeedIdMap().contains(java.lang.Long.valueOf(id6))) {
                                    getDataList().add(new com.tencent.mm.plugin.mv.ui.view.q3(new com.tencent.mm.plugin.mv.ui.view.t3(id6, objectNonceId, finderObject, false, 8, null)));
                                }
                            }
                        }
                    }
                    getAdapter().notifyDataSetChanged();
                    r45.es4 es4Var2 = kVar.f282259n;
                    setHasMore(!(es4Var2 != null && es4Var2.f373703f == 0));
                    java.lang.String str2 = es4Var.f373712r;
                    yz5.a onSceneEndListener = getOnSceneEndListener();
                    if (onSceneEndListener != null) {
                        onSceneEndListener.invoke();
                    }
                    com.tencent.mars.xlog.Log.i("Music.MusicMvTabFragment", "onSceneEnd GetFinderFavFeed " + getDataList().size() + ", hasMore:" + getHasMore() + ", report requestId:" + str2);
                    com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct mvCreateActionStruct = fm3.g0.f264071b;
                    mvCreateActionStruct.C = mvCreateActionStruct.b("RequestId", str2, true);
                }
            }
            getRlLayout().N(0);
            com.tencent.mm.plugin.mv.ui.view.p3 resultListener = getResultListener();
            if (resultListener != null) {
                ((com.tencent.mm.plugin.mv.ui.view.h0) resultListener).a(0, getAdapter().getItemCount());
            }
            if (getAdapter().getItemCount() == 0) {
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
    public MusicMvTabMachineFragment(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
        gm0.j1.d().a(6860, this);
    }
}
