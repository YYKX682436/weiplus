package hr3;

/* loaded from: classes11.dex */
public class qb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.rb f283921d;

    public qb(hr3.rb rbVar) {
        this.f283921d = rbVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.rb rbVar = this.f283921d;
        if (rbVar.f283948h.L.o2()) {
            c01.e2.F0(rbVar.f283948h.L);
            rbVar.f283948h.L.r3();
            rbVar.f();
        } else {
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = rbVar.f283948h;
            android.content.Context context = normalUserFooterPreference.f197770d;
            db5.e1.u(context, context.getString(com.tencent.mm.storage.z3.m4(normalUserFooterPreference.L.d1()) ? com.tencent.mm.R.string.bfe : com.tencent.mm.R.string.bfd), rbVar.f283948h.f197770d.getString(com.tencent.mm.R.string.bfc), new hr3.pb(this), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
