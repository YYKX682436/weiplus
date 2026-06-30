package g22;

/* loaded from: classes12.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g22.e f267800d;

    public d(g22.e eVar) {
        this.f267800d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        g22.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerSingleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        g22.e eVar = this.f267800d;
        r45.ri0 ri0Var = eVar.f267805g;
        if (ri0Var != null && (aVar = eVar.f267803e) != null) {
            kotlin.jvm.internal.o.d(ri0Var);
            eVar.getLayoutPosition();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12787, 1, 0, ri0Var.f384886d, "", ri0Var.f384889g, ri0Var.f384892m, 6);
            int i17 = com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerSingleFragment.f98411d;
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerSingleFragment emojiStoreDesignerSingleFragment = ((g22.c) aVar).f267798a;
            android.content.Context requireContext = emojiStoreDesignerSingleFragment.requireContext();
            kotlin.jvm.internal.o.f(requireContext, "requireContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(requireContext instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.emoji.ui.v2.a) zVar.a((androidx.appcompat.app.AppCompatActivity) requireContext).a(com.tencent.mm.plugin.emoji.ui.v2.a.class)).f98349e.f56030f++;
            com.tencent.mm.storage.emotion.EmojiInfo i18 = n22.m.i(ri0Var);
            n22.f fVar = n22.f.f334290a;
            android.content.Context context = emojiStoreDesignerSingleFragment.getContext();
            kotlin.jvm.internal.o.d(context);
            n22.f.d(fVar, context, i18, false, null, null, "", 0, 0L, 6, 5, 0L, null, null, null, null, 31744, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerSingleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
