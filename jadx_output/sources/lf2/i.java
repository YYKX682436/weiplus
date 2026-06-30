package lf2;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf2.s f318287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lf2.l f318289f;

    public i(lf2.s sVar, int i17, lf2.l lVar) {
        this.f318287d = sVar;
        this.f318288e = i17;
        this.f318289f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$mReverberationAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lf2.s sVar = this.f318287d;
        java.util.Iterator it = sVar.e0().iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            int i18 = this.f318288e;
            if (!hasNext) {
                java.lang.Object obj = sVar.e0().get(i18);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                ((kotlinx.coroutines.flow.h3) ((om2.e) sVar.H.a(om2.e.class)).f346297p).k(((lf2.b) obj).f318274a);
                this.f318289f.notifyDataSetChanged();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$mReverberationAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.Object next = it.next();
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((lf2.b) next).f318275b = i17 == i18;
            i17 = i19;
        }
    }
}
