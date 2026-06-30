package vw3;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f440970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Field f440971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f440972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.CDNDebugIPConfigUI f440973g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.widget.EditText editText, java.lang.reflect.Field field, java.lang.Class cls, com.tencent.mm.plugin.repairer.ui.CDNDebugIPConfigUI cDNDebugIPConfigUI) {
        super(0);
        this.f440970d = editText;
        this.f440971e = field;
        this.f440972f = cls;
        this.f440973g = cDNDebugIPConfigUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        android.text.Editable text = this.f440970d.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        java.lang.String obj = r26.n0.u0(text).toString();
        java.lang.reflect.Field field = this.f440971e;
        java.lang.Class cls = this.f440972f;
        com.tencent.mm.plugin.repairer.ui.CDNDebugIPConfigUI cDNDebugIPConfigUI = this.f440973g;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            field.set(cls, obj);
            cDNDebugIPConfigUI.d.edit().putString(field.getName(), obj).apply();
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        return kotlin.Result.m520boximpl(m521constructorimpl);
    }
}
