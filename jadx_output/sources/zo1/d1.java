package zo1;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f474578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f474579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.ref.WeakReference weakReference, java.util.List list) {
        super(0);
        this.f474577d = u3Var;
        this.f474578e = weakReference;
        this.f474579f = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f474577d.dismiss();
        yz5.l lVar = (yz5.l) this.f474578e.get();
        if (lVar != null) {
            lVar.invoke(this.f474579f);
        }
        return jz5.f0.f302826a;
    }
}
