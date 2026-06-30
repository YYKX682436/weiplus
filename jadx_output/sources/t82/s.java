package t82;

/* loaded from: classes12.dex */
public final class s extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public long f416407d;

    /* renamed from: e, reason: collision with root package name */
    public final int f416408e;

    /* renamed from: f, reason: collision with root package name */
    public final v82.b f416409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f416410g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f416408e = -1;
        this.f416409f = new v82.b();
    }

    public final void O6(int i17, boolean z17) {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(t82.d.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        int Q6 = ((t82.d) a17).Q6();
        int i18 = 0;
        int i19 = this.f416408e;
        if (i19 == 1) {
            i18 = 2;
        } else {
            if (i19 == 0) {
                i18 = 1;
            }
        }
        v82.b bVar = this.f416409f;
        java.lang.String str = bVar.f434073g;
        int i27 = bVar.f434074h;
        if (!z17) {
            i27 = (int) (bVar.f434078l - bVar.f434077k);
        }
        kotlin.jvm.internal.o.d(str);
        bVar.f434067a = i17;
        bVar.f434069c = i18;
        bVar.f434068b = 2;
        bVar.f434072f = 10;
        bVar.f434070d = ((int) (java.lang.System.currentTimeMillis() - this.f416407d)) / 1000;
        bVar.f434073g = str;
        bVar.f434074h = i27;
        bVar.f434076j = Q6;
        bVar.b();
        this.f416410g = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f416407d = java.lang.System.currentTimeMillis();
        java.lang.String a17 = v82.b.a();
        v82.b bVar = this.f416409f;
        bVar.f434073g = a17;
        bVar.f434077k = this.f416407d;
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(getContext(), new o04.e(r45.fq0.class, 17, true));
        bVar.e((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getContext(), 17, r45.fq0.class));
        this.f416410g = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (this.f416410g) {
            return;
        }
        O6(1, false);
    }
}
