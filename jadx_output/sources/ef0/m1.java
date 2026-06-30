package ef0;

/* loaded from: classes2.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f252271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.v70 f252272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.app.Activity activity, bw5.v70 v70Var) {
        super(0);
        this.f252271d = activity;
        this.f252272e = v70Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f252271d;
        try {
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                com.tencent.mm.plugin.ting.view.TingAddToListenEducationDialog tingAddToListenEducationDialog = new com.tencent.mm.plugin.ting.view.TingAddToListenEducationDialog(activity, null);
                bw5.v70 listenItem = this.f252272e;
                kotlin.jvm.internal.o.g(listenItem, "listenItem");
                tingAddToListenEducationDialog.show();
            }
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f302826a;
    }
}
