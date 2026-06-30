package ni5;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.MvvmContactListUI f337790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.ui.mvvm.MvvmContactListUI mvvmContactListUI) {
        super(0);
        this.f337790d = mvvmContactListUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f337790d.getIntent().getIntExtra("KOrientation", -1));
    }
}
