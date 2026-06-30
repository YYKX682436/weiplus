package yw3;

/* loaded from: classes.dex */
public final class f3 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardChangeDemoUI f466739d;

    public f3(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardChangeDemoUI repairerKeyboardChangeDemoUI) {
        this.f466739d = repairerKeyboardChangeDemoUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        androidx.appcompat.app.AppCompatActivity activity = this.f466739d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((vm3.d) pf5.z.f353948a.a(activity).a(vm3.d.class)).V6(z17);
    }
}
