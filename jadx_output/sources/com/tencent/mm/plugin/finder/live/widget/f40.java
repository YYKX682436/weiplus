package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h40 f118311d;

    public f40(com.tencent.mm.plugin.finder.live.widget.h40 h40Var) {
        this.f118311d = h40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVoiceRoomModeBtnWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ni2.u2) ((jz5.n) this.f118311d.f118545f).getValue()).w();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVoiceRoomModeBtnWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
