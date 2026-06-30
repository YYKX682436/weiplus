package ox3;

/* loaded from: classes4.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f349775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f349776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.g f349777f;

    public v(ox3.f0 f0Var, in5.s0 s0Var, ox3.g gVar) {
        this.f349775d = f0Var;
        this.f349776e = s0Var;
        this.f349777f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f349775d.f349742f.invoke(java.lang.Integer.valueOf(this.f349776e.getAdapterPosition()), this.f349777f);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
