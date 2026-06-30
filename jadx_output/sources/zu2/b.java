package zu2;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f475706d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vg0 f475707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f475706d = "Finder.ShareEcSourceUIC";
    }

    public final void O6() {
        com.tencent.mars.xlog.Log.i(this.f475706d, "registerInterceptor");
        ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).f453177g = new zu2.a(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        long longExtra = getIntent().getLongExtra("feed_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_ec_source");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (longExtra != 0) {
            if (stringExtra.length() == 0) {
                return;
            }
            r45.vg0 vg0Var = new r45.vg0();
            vg0Var.set(0, java.lang.Long.valueOf(longExtra));
            vg0Var.set(1, stringExtra);
            this.f475707e = vg0Var;
            O6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate ecSourceReqStruct ");
            r45.vg0 vg0Var2 = this.f475707e;
            sb6.append(pm0.v.u(vg0Var2 != null ? vg0Var2.getLong(0) : 0L));
            sb6.append(", ");
            r45.vg0 vg0Var3 = this.f475707e;
            sb6.append(vg0Var3 != null ? vg0Var3.getString(1) : null);
            com.tencent.mars.xlog.Log.i(this.f475706d, sb6.toString());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i(this.f475706d, "unregisterInterceptor");
        ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).f453177g = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        O6();
    }
}
