package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class zb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostAtUI f130088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.ac f130089e;

    public zb(com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI, com.tencent.mm.plugin.finder.ui.ac acVar) {
        this.f130088d = finderPostAtUI;
        this.f130089e = acVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderPostAtUI activity = this.f130088d;
        activity.getIntent().putExtra("from_at_contact", true);
        activity.getIntent().putExtra("request_type", 6);
        activity.getIntent().putExtra("need_history", false);
        activity.getIntent().putExtra("key_need_hide_top_padding", true);
        activity.getIntent().putExtra("key_finder_object_id", activity.f128650z);
        if (lk5.s.b(activity)) {
            bh5.c cVar = new bh5.c();
            cVar.f20922a.f20924a = activity;
            cVar.d(activity.getIntent());
            cVar.b(com.tencent.mm.plugin.finder.view.FinderAtSearchHalfScreenDialogFragment.class);
            cVar.a("com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI");
            cVar.h(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        } else {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Intent i17 = activity.getIntent();
            i0Var.getClass();
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(i17, "i");
            com.tencent.mm.plugin.finder.search.l4.f125763c = null;
            jx3.f.INSTANCE.idkeyStat(1265L, 2L, 1L, false);
            i17.setClass(activity, com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI.class);
            activity.startActivityForResult(i17, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        }
        com.tencent.mm.plugin.finder.ui.ac acVar = this.f130089e;
        acVar.f128857d = false;
        acVar.notifyItemRemoved(0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
