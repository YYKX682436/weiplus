package in2;

/* loaded from: classes.dex */
public abstract class b1 {
    public static final void a(android.widget.TextView textView, dk2.yg songItem) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        kotlin.jvm.internal.o.g(songItem, "songItem");
        int i17 = songItem.f234401i;
        if (i17 == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapterKt", "updateAuditStatus", "(Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/live/model/SongItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapterKt", "updateAuditStatus", "(Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/live/model/SongItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.FG_2));
            textView.setText(textView.getContext().getText(com.tencent.mm.R.string.lri));
            return;
        }
        if (i17 != 2) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapterKt", "updateAuditStatus", "(Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/live/model/SongItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapterKt", "updateAuditStatus", "(Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/live/model/SongItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText("");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(textView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapterKt", "updateAuditStatus", "(Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/live/model/SongItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapterKt", "updateAuditStatus", "(Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/live/model/SongItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.Red_100));
        textView.setText(textView.getContext().getText(com.tencent.mm.R.string.lkw));
    }
}
