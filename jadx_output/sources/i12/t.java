package i12;

/* loaded from: classes15.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i12.x f287243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ri0 f287244e;

    public t(i12.x xVar, r45.ri0 ri0Var) {
        this.f287243d = xVar;
        this.f287244e = ri0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder$onBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.emoji.api.s5 s5Var = (com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class);
        i12.x xVar = this.f287243d;
        ((com.tencent.mm.feature.emoji.b0) s5Var).ij(xVar.f287251f, this.f287244e, xVar.f287254i, 69, xVar.f287255m);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder$onBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
