package ex5;

/* loaded from: classes3.dex */
public class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.weui.base.preference.CheckBoxPreference f257246a;

    public a(com.tencent.weui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f257246a = checkBoxPreference;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        this.f257246a.callChangeListener(java.lang.Boolean.valueOf(z17));
    }
}
