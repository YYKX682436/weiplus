package qs3;

/* loaded from: classes15.dex */
public final class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarMemberView f366367d;

    public o(com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView) {
        this.f366367d = radarMemberView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        s17.length();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f366367d.f154990y;
        android.widget.Button f17 = j0Var != null ? j0Var.f(-1) : null;
        if (f17 == null) {
            return;
        }
        f17.setEnabled(s17.length() > 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }
}
