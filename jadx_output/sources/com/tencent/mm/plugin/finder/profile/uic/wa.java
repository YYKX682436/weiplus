package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class wa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f124323e;

    public wa(com.tencent.mm.plugin.finder.profile.uic.ob obVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f124322d = obVar;
        this.f124323e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$refreshBanner$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2.i(xc2.y2.f453343a, this.f124322d.getActivity(), new xc2.p0(this.f124323e), 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$refreshBanner$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
