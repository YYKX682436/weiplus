package xc2;

/* loaded from: classes2.dex */
public final class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f453329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f453330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f453331f;

    public w2(android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f453329d = context;
        this.f453330e = finderItem;
        this.f453331f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/jumper/JumperUtils$showPromotionUserListGuide$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUI.f129654t.a(this.f453329d, this.f453330e.getFeedObject(), true, true);
        this.f453331f.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/jumper/JumperUtils$showPromotionUserListGuide$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
