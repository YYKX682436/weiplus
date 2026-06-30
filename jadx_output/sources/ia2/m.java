package ia2;

/* loaded from: classes2.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f289948d;

    /* renamed from: e, reason: collision with root package name */
    public int f289949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity f289950f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289950f = finderFlutterPOIActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ia2.m(this.f289950f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ia2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g76;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f289949e;
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = this.f289950f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.f96 f96Var = finderFlutterPOIActivity.f101784x;
            com.tencent.mm.plugin.location.model.LocationInfo b17 = f96Var != null ? ia2.e0.b(f96Var, false, 1, null) : new com.tencent.mm.plugin.location.model.LocationInfo();
            androidx.appcompat.app.AppCompatActivity context = finderFlutterPOIActivity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f289948d = b17;
            this.f289949e = 1;
            g76 = com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.g7(finderFlutterPOIActivity, context, this);
            if (g76 == aVar) {
                return aVar;
            }
            locationInfo = b17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.tencent.mm.plugin.location.model.LocationInfo locationInfo2 = (com.tencent.mm.plugin.location.model.LocationInfo) this.f289948d;
            kotlin.ResultKt.throwOnFailure(obj);
            g76 = obj;
            locationInfo = locationInfo2;
        }
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo3 = (com.tencent.mm.plugin.location.model.LocationInfo) g76;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo4 = locationInfo3 == null ? new com.tencent.mm.plugin.location.model.LocationInfo() : locationInfo3;
        long longExtra = finderFlutterPOIActivity.getIntent().getLongExtra("kMsgId", -1L);
        java.lang.String stringExtra = finderFlutterPOIActivity.getIntent().getStringExtra("map_talker_name");
        z80.p0 p0Var = new z80.p0(locationInfo, locationInfo4, longExtra, stringExtra == null ? "" : stringExtra, finderFlutterPOIActivity.f101777l1);
        java.lang.ref.WeakReference weakReference = finderFlutterPOIActivity.f101781u;
        androidx.fragment.app.FragmentActivity fragmentActivity = weakReference != null ? (androidx.fragment.app.FragmentActivity) weakReference.get() : null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (fragmentActivity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderFlutterPOIActivity", "onNavigateButtonTap: failed, parentActivity null");
            return f0Var;
        }
        z80.k0 k0Var = (z80.k0) i95.n0.c(z80.k0.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("page_state", new java.lang.Integer(finderFlutterPOIActivity.D ? 2 : 1));
        java.lang.String str3 = finderFlutterPOIActivity.D1;
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("poi_sessionid", str3);
        r45.f96 f96Var2 = finderFlutterPOIActivity.f101784x;
        if (f96Var2 == null || (str = f96Var2.getString(17)) == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("poi_category_key", str);
        java.lang.Integer num = finderFlutterPOIActivity.E1;
        lVarArr[3] = new jz5.l("poi_biz_source", new java.lang.Integer(num != null ? num.intValue() : 0));
        r45.f96 f96Var3 = finderFlutterPOIActivity.f101784x;
        if (f96Var3 == null || (str2 = f96Var3.getString(5)) == null) {
            str2 = "";
        }
        lVarArr[4] = new jz5.l("poiid", str2);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        y80.y0 y0Var = (y80.y0) k0Var;
        y0Var.getClass();
        com.tencent.mars.xlog.Log.i(y0Var.f459960e, "showJump3rdAppMenu: " + p0Var);
        if (p0Var.f470659e) {
            p0Var.f470655a.f144594p = "";
        }
        int Ai = y0Var.Ai();
        if (Ai == 1 || Ai == 3) {
            za3.d dVar = new za3.d(fragmentActivity);
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) fragmentActivity, 1, false);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            androidx.fragment.app.FragmentActivity fragmentActivity2 = fragmentActivity;
            k0Var2.f211872n = new y80.w0(y0Var, fragmentActivity2, dVar, linkedHashMap, p0Var);
            k0Var2.f211881s = new y80.x0(y0Var, fragmentActivity2, linkedHashMap, dVar, p0Var);
            k0Var2.v();
        } else if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            new za3.s(fragmentActivity, p0Var, k17).show();
        }
        y0Var.f459962g = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        y0Var.wi(true);
        return f0Var;
    }
}
