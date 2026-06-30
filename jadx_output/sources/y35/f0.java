package y35;

/* loaded from: classes11.dex */
public class f0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.SpecialCheckBoxPreference f459210a;

    public f0(com.tencent.mm.pluginsdk.ui.preference.SpecialCheckBoxPreference specialCheckBoxPreference) {
        this.f459210a = specialCheckBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        com.tencent.mm.storage.z3 z3Var;
        int id6 = compoundButton.getId();
        com.tencent.mm.pluginsdk.ui.preference.SpecialCheckBoxPreference specialCheckBoxPreference = this.f459210a;
        if (id6 == com.tencent.mm.R.id.m78) {
            if (specialCheckBoxPreference.P != null) {
                if (((com.tencent.mm.storage.m4) c01.d9.b().r()).K(specialCheckBoxPreference.P.d1())) {
                    c01.e2.B0(specialCheckBoxPreference.P.d1(), true, true);
                    return;
                } else {
                    c01.e2.t0(specialCheckBoxPreference.P.d1(), true, true);
                    return;
                }
            }
            return;
        }
        if (id6 == com.tencent.mm.R.id.m77) {
            boolean z18 = !specialCheckBoxPreference.V;
            specialCheckBoxPreference.V = z18;
            if (specialCheckBoxPreference.S) {
                int i17 = !z18 ? 1 : 0;
                ((e21.z0) c01.d9.b().w()).c(new mn.a(specialCheckBoxPreference.R, i17, 0));
                specialCheckBoxPreference.P.J2(i17);
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(specialCheckBoxPreference.R, specialCheckBoxPreference.P);
            }
            specialCheckBoxPreference.M();
            return;
        }
        if (id6 != com.tencent.mm.R.id.m79 || (z3Var = specialCheckBoxPreference.P) == null) {
            return;
        }
        boolean r27 = z3Var.r2();
        android.content.Context context = specialCheckBoxPreference.Q;
        if (!r27) {
            c01.e2.d0(specialCheckBoxPreference.P);
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f492899i65));
        } else {
            specialCheckBoxPreference.P.s3();
            c01.e2.g0(specialCheckBoxPreference.P, true);
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f492896i62));
        }
    }
}
