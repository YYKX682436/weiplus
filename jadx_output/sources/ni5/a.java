package ni5;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.MvvmContactListUI f337785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.ui.mvvm.MvvmContactListUI mvvmContactListUI) {
        super(0);
        this.f337785d = mvvmContactListUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f337785d.getIntent().getBooleanExtra("INTENT_KEY_KEEP_ACTIVITY_WHEN_BACK_PRESSED", false));
    }
}
