package y20;

/* loaded from: classes.dex */
public final class r implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.test.EcsTestUI f459022d;

    public r(com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI) {
        this.f459022d = ecsTestUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI = this.f459022d;
        com.tencent.mm.feature.ecs.test.EcsTestUI.U6(ecsTestUI, str);
        boolean z17 = str.length() > 0;
        android.widget.Button button = ecsTestUI.e;
        if (button != null) {
            button.setVisibility(z17 ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("clearSearchBtn");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
