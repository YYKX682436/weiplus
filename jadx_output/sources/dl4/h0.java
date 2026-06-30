package dl4;

/* loaded from: classes3.dex */
public final class h0 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f235406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f235407b;

    public h0(yz5.l lVar, android.view.View view) {
        this.f235406a = lVar;
        this.f235407b = view;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        pm0.v.X(new dl4.g0(zVar, this.f235407b));
        yz5.l lVar = this.f235406a;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(zVar != null));
        }
    }
}
