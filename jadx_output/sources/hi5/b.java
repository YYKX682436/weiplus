package hi5;

/* loaded from: classes8.dex */
public final class b implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmec.NewCardPackageTipPreference f281560a;

    public b(com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference) {
        this.f281560a = newCardPackageTipPreference;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.tencent.mars.xlog.Log.i("NewCardPackageTipPreference", "settings_mm_cardpackage_new_view eventId:" + str);
        boolean b17 = kotlin.jvm.internal.o.b(str, "view_exp");
        com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference = this.f281560a;
        if (b17) {
            newCardPackageTipPreference.f209149m3 = true;
        } else if (kotlin.jvm.internal.o.b(str, "view_unexp")) {
            newCardPackageTipPreference.f209149m3 = false;
            newCardPackageTipPreference.f209150n3 = "";
            newCardPackageTipPreference.f209151o3 = "";
        }
    }
}
