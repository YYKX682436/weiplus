package qy2;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter f367781d;

    public b(com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter finderEditFooter) {
        this.f367781d = finderEditFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter finderEditFooter = this.f367781d;
        int i17 = finderEditFooter.f136946o;
        int i18 = com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter.f136940p;
        if (i17 == 202) {
            android.widget.ImageButton imageButton = finderEditFooter.f136941g;
            if (imageButton == null) {
                kotlin.jvm.internal.o.o("emojiBtn");
                throw null;
            }
            imageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = finderEditFooter.f136943i;
            if (chatFooterPanel == null) {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
            chatFooterPanel.h();
            android.content.Context context = finderEditFooter.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).showVKB();
            finderEditFooter.f136946o = 201;
        } else {
            android.content.Context context2 = finderEditFooter.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context2).hideVKB();
            android.widget.ImageButton imageButton2 = finderEditFooter.f136941g;
            if (imageButton2 == null) {
                kotlin.jvm.internal.o.o("emojiBtn");
                throw null;
            }
            imageButton2.setImageResource(com.tencent.mm.R.raw.icons_outlined_keyboard);
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = finderEditFooter.f136943i;
            if (chatFooterPanel2 == null) {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
            chatFooterPanel2.setVisibility(0);
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = finderEditFooter.f136943i;
            if (chatFooterPanel3 == null) {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
            chatFooterPanel3.i();
            finderEditFooter.f136946o = 202;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
