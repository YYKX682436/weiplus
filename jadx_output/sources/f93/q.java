package f93;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog) {
        super(0);
        this.f260435d = absLabelUserDialog;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(this.f260435d.getContext());
    }
}
