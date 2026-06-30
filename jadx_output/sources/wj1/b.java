package wj1;

/* loaded from: classes14.dex */
public class b implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag f446573a;

    public b(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag appBrandIDCardShowFrag) {
        this.f446573a = appBrandIDCardShowFrag;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        android.widget.Button button = this.f446573a.f89524o;
        if (button != null) {
            button.setEnabled(z17);
        }
    }
}
