package xc2;

/* loaded from: classes2.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f453315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f453316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f453317f;

    public v2(android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f453315d = context;
        this.f453316e = finderItem;
        this.f453317f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/jumper/JumperUtils$showPromotionUserListGuide$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUI.f129654t.a(this.f453315d, this.f453316e.getFeedObject(), true, false);
        this.f453317f.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/jumper/JumperUtils$showPromotionUserListGuide$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
