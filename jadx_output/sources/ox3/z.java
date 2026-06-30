package ox3;

/* loaded from: classes10.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f349785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f349786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.g f349787f;

    public z(ox3.f0 f0Var, in5.s0 s0Var, ox3.g gVar) {
        this.f349785d = f0Var;
        this.f349786e = s0Var;
        this.f349787f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ox3.f0 f0Var = this.f349785d;
        in5.s0 s0Var = this.f349786e;
        pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.y(f0Var, s0Var));
        f0Var.f349744h.invoke(java.lang.Integer.valueOf(s0Var.getAdapterPosition()), this.f349787f);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
