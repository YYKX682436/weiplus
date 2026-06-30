package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122378d;

    public o(android.content.Context context) {
        this.f122378d = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.content.Context context = this.f122378d;
        r45.ac4 ac4Var = new r45.ac4();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setJumpinfo_type(2);
        com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
        html5Info.setUrl("https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/Lfe1Jj8m4vhEGHxK");
        html5Info.setStyle(1);
        finderJumpInfo.setHtml5_info(html5Info);
        ac4Var.set(1, finderJumpInfo);
        c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
