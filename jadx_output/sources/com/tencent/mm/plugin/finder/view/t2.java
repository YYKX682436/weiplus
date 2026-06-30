package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner f133085d;

    public t2(com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner) {
        this.f133085d = finderBaseMediaBanner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner$refreshRefUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner = this.f133085d;
        r45.fn2 refFeedInfo = finderBaseMediaBanner.getRefFeedInfo();
        kotlin.jvm.internal.o.d(refFeedInfo);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) refFeedInfo.getCustom(2);
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        intent.putExtra("finder_username", str);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        android.content.Context context = finderBaseMediaBanner.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        iyVar.c(context, intent);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context2 = finderBaseMediaBanner.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        i0Var.mk(context2, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner$refreshRefUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
