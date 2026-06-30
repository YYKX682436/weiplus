package ex5;

/* loaded from: classes7.dex */
public class d implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.weui.base.preference.WeUIPreference f257248d;

    public d(com.tencent.weui.base.preference.WeUIPreference weUIPreference) {
        this.f257248d = weUIPreference;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.preference.Preference preference = (android.preference.Preference) adapterView.getAdapter().getItem(i17);
        if (preference == null || !preference.isEnabled() || !preference.isSelectable() || (preference instanceof com.tencent.weui.base.preference.CheckBoxPreference) || preference.getKey() == null) {
            return;
        }
        com.tencent.weui.base.preference.WeUIPreference weUIPreference = this.f257248d;
        weUIPreference.T6(weUIPreference.f220127z, preference);
    }
}
