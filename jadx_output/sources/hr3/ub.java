package hr3;

/* loaded from: classes4.dex */
public final class ub extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f284081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f284082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI f284083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284084g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI openIMKefuProfileSettingUI, java.lang.String str) {
        super(1);
        this.f284081d = u3Var;
        this.f284082e = checkBoxPreference;
        this.f284083f = openIMKefuProfileSettingUI;
        this.f284084g = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f284081d.hide();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f284082e;
        if (booleanValue) {
            java.lang.String str = this.f284084g;
            k41.g0 c17 = k41.o0.c(str);
            if (c17 != null) {
                c17.field_needReport = checkBoxPreference.N();
                c17.field_hasSetReport = true;
                k41.o0.f(c17);
                if (java.lang.Boolean.valueOf(c17.field_needReport).booleanValue()) {
                    l41.r1 r1Var = l41.r1.f315913a;
                    kotlin.jvm.internal.o.d(str);
                    java.lang.String field_locationType = c17.field_locationType;
                    kotlin.jvm.internal.o.f(field_locationType, "field_locationType");
                    l41.r1.b(r1Var, str, field_locationType, 3, null, 8, null);
                }
            }
        } else {
            checkBoxPreference.S(!checkBoxPreference.N());
            com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI openIMKefuProfileSettingUI = this.f284083f;
            androidx.appcompat.app.AppCompatActivity context = openIMKefuProfileSettingUI.getContext();
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211729s = openIMKefuProfileSettingUI.getContext().getString(com.tencent.mm.R.string.g0f);
            aVar.f211732v = openIMKefuProfileSettingUI.getContext().getString(com.tencent.mm.R.string.g0e);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
        }
        return jz5.f0.f302826a;
    }
}
