package hi5;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmec.NewCardPackageTipPreference f281562d;

    public d(com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference) {
        this.f281562d = newCardPackageTipPreference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
        com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference = this.f281562d;
        androidx.lifecycle.k0 bj6 = ((c61.t8) caVar).bj(new hi5.c(newCardPackageTipPreference));
        android.content.Context context = newCardPackageTipPreference.Y1;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        pm0.v.X(new c61.n8((androidx.appcompat.app.AppCompatActivity) context, bj6));
        android.content.Context context2 = newCardPackageTipPreference.Y1;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        pm0.v.X(new c61.p8((androidx.appcompat.app.AppCompatActivity) context2, bj6));
    }
}
