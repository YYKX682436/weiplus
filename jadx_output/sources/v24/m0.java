package v24;

/* loaded from: classes15.dex */
public class m0 implements v24.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f432937a;

    public m0(com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f432937a = checkBoxPreference;
    }

    @Override // v24.n0
    public boolean a() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f432937a;
        if (checkBoxPreference != null) {
            return checkBoxPreference.N();
        }
        return false;
    }

    @Override // v24.n0
    public void b(boolean z17) {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f432937a;
        if (checkBoxPreference != null) {
            checkBoxPreference.S(z17);
        }
    }
}
