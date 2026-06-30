package dl4;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.z f235400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f235401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ff0.z zVar, android.view.View view) {
        super(0);
        this.f235400d = zVar;
        this.f235401e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ff0.z zVar = this.f235400d;
        if (zVar != null) {
            int i17 = zVar.f261596b | (-16777216);
            boolean C = com.tencent.mm.ui.bk.C();
            android.view.View view = this.f235401e;
            if (C) {
                if (view != null) {
                    view.setBackgroundColor(e3.b.c(i17, -16777216, 0.5f));
                }
            } else if (view != null) {
                view.setBackgroundColor(i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
