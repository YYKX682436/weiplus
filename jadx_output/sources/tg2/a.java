package tg2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg2.b f419155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg2.i f419156e;

    public a(tg2.b bVar, tg2.i iVar) {
        this.f419155d = bVar;
        this.f419156e = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/FinderLiveChooseGiftConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f419155d.f419158f;
        tg2.i iVar = this.f419156e;
        lVar.invoke(new com.tencent.mm.plugin.finder.live.plugin.lj(iVar.f419175d, iVar.f419176e, iVar.f419177f));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/FinderLiveChooseGiftConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
