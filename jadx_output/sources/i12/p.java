package i12;

/* loaded from: classes15.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i12.d f287231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f287232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i12.s f287233f;

    public p(i12.s sVar, i12.d dVar, int i17) {
        this.f287233f = sVar;
        this.f287231d = dVar;
        this.f287232e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i12.q qVar = this.f287233f.f287241r;
        if (qVar != null) {
            android.view.View view2 = this.f287231d.f287202b;
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = (com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment) qVar;
            int i17 = this.f287232e;
            if (i17 < 0) {
                emojiStoreV2BaseFragment.getClass();
            } else if (i17 < ((i12.s) emojiStoreV2BaseFragment.f98246u).t()) {
                emojiStoreV2BaseFragment.o0(emojiStoreV2BaseFragment.f98246u.getItem(i17), i17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
