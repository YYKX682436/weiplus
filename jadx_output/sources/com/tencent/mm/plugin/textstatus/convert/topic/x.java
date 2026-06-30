package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.convert.topic.x f173385d = new com.tencent.mm.plugin.textstatus.convert.topic.x();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemDecoration$onDrawOver$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SquareTitleItemDecoration", "unFoldIv click");
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemDecoration$onDrawOver$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
