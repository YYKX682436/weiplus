package f93;

/* loaded from: classes11.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog) {
        super(0);
        this.f260465d = absLabelUserDialog;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f260465d.f281403i;
        if (view != null) {
            return view.findViewById(com.tencent.mm.R.id.n8t);
        }
        return null;
    }
}
