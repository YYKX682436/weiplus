package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f120124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f120125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120126f;

    public w3(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.widget.b4 b4Var, android.widget.TextView textView) {
        this.f120124d = c0Var;
        this.f120125e = b4Var;
        this.f120126f = textView;
    }

    public static final void a(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.widget.b4 b4Var, android.widget.TextView textView) {
        r45.nw1 liveInfo;
        int i17 = !c0Var.f310112d ? 1 : 2;
        com.tencent.mars.xlog.Log.i("FinderLiveAfterNextLiveInfoWidget", "CgiFinderAudienceReserveLiveNotification do op=" + i17);
        java.lang.String str = b4Var.f117821b.Y().f410646a;
        com.tencent.mm.plugin.finder.live.plugin.oo0 oo0Var = b4Var.f117821b;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = oo0Var.Y().f410651f;
        long j17 = 0;
        long id6 = finderObject != null ? finderObject.getId() : 0L;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = oo0Var.Y().f410651f;
        if (finderObject2 != null && (liveInfo = finderObject2.getLiveInfo()) != null) {
            j17 = liveInfo.getLong(0);
        }
        ke2.b bVar = new ke2.b(str, 2, i17, null, 8, id6, java.lang.Long.valueOf(j17));
        android.content.Context context = b4Var.f117825f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bVar.t(context, b4Var.f117820a.getContext().getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        bVar.l().K(new com.tencent.mm.plugin.finder.live.widget.v3(i17, c0Var, textView, b4Var));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$updateNextLiveInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.c0 c0Var = this.f120124d;
        boolean z17 = c0Var.f310112d;
        android.widget.TextView textView = this.f120126f;
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f120125e;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(b4Var.f117820a.getContext(), 1, true);
            k0Var.X1 = true;
            k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.t3(b4Var);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.u3(c0Var, b4Var, textView);
            k0Var.v();
        } else {
            a(c0Var, b4Var, textView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$updateNextLiveInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
