package com.tencent.mm.plugin.profile.ui.tab.list;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "Landroidx/fragment/app/Fragment;", "Lzy2/h5;", "<init>", "()V", "wr3/a", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class BaseBizProfileFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements zy2.h5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f154411d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher f154412e;

    /* renamed from: f, reason: collision with root package name */
    public r45.wl f154413f;

    /* renamed from: g, reason: collision with root package name */
    public as3.a0 f154414g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.m0 f154415h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f154416i = jz5.h.b(new wr3.e(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f154417m = jz5.h.b(new wr3.d(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f154418n = jz5.h.b(new wr3.b(this));

    /* renamed from: o, reason: collision with root package name */
    public wr3.a f154419o;

    public BaseBizProfileFragment() {
        jz5.h.b(new wr3.c(this));
    }

    @Override // zy2.h5
    public boolean O() {
        return this instanceof com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment;
    }

    @Override // zy2.h5
    public void P() {
    }

    public final java.lang.String j0() {
        java.lang.String str = this.f154411d;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("bizUsername");
        throw null;
    }

    public android.view.View l0() {
        java.lang.Object value = ((jz5.n) this.f154416i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final r45.wl m0() {
        r45.wl wlVar = this.f154413f;
        if (wlVar != null) {
            return wlVar;
        }
        kotlin.jvm.internal.o.o("mBizProfileResp");
        throw null;
    }

    public final com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher n0() {
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher = this.f154412e;
        if (bizProfileDataFetcher != null) {
            return bizProfileDataFetcher;
        }
        kotlin.jvm.internal.o.o("mDataFetcher");
        throw null;
    }

    public final as3.a0 o0() {
        as3.a0 a0Var = this.f154414g;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.o.o("topicFlowContract");
        throw null;
    }

    public final void p0(java.lang.String tag, yz5.l getTopicList, yz5.l setHasTopic, yz5.l addHeaderView, yz5.l removeHeaderView) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(getTopicList, "getTopicList");
        kotlin.jvm.internal.o.g(setHasTopic, "setHasTopic");
        kotlin.jvm.internal.o.g(addHeaderView, "addHeaderView");
        kotlin.jvm.internal.o.g(removeHeaderView, "removeHeaderView");
        java.util.ArrayList arrayList = (java.util.ArrayList) getTopicList.invoke(m0());
        if (!arrayList.isEmpty()) {
            setHasTopic.invoke(java.lang.Boolean.TRUE);
        } else {
            setHasTopic.invoke(java.lang.Boolean.FALSE);
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        this.f154414g = new as3.a0((com.tencent.mm.plugin.profile.ui.ContactInfoUI) context, arrayList);
        as3.a0 o07 = o0();
        java.util.ArrayList arrayList2 = o07.f13485d;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = o07.f13483b;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(new vr3.d0((r45.um) it.next()));
        }
        arrayList2.addAll(arrayList4);
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView = new com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView(o07.f13482a);
        bizProfileTopicFlowView.b(o07);
        bizProfileTopicFlowView.c();
        if (arrayList2.isEmpty()) {
            bizProfileTopicFlowView.setVisibility(8);
        } else {
            bizProfileTopicFlowView.setVisibility(0);
        }
        o07.f13486e = bizProfileTopicFlowView;
        com.tencent.mars.xlog.Log.i(o07.f13484c, "gen topic view, visibility = " + bizProfileTopicFlowView.getVisibility());
        removeHeaderView.invoke(bizProfileTopicFlowView);
        addHeaderView.invoke(bizProfileTopicFlowView);
        o0().f13487f = new wr3.f(tag, this);
        o0().f13488g = new wr3.g(tag);
        o0().a((java.util.ArrayList) getTopicList.invoke(m0()));
    }
}
