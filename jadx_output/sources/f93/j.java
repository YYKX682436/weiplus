package f93;

/* loaded from: classes11.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog) {
        super(0);
        this.f260361d = absLabelUserDialog;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f260361d.f281403i;
        if (view != null) {
            return (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.n8q);
        }
        return null;
    }
}
