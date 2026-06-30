package zo1;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        super(0);
        this.f474549d = checkPackageContentUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = ((android.view.ViewStub) this.f474549d.findViewById(com.tencent.mm.R.id.rjt)).inflate();
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (android.widget.LinearLayout) inflate;
    }
}
