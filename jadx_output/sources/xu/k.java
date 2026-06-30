package xu;

/* loaded from: classes9.dex */
public final class k extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.text.SimpleDateFormat f457180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f457180d = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);
    }

    public final void T6() {
        l15.c cVar;
        jz5.f0 f0Var;
        j75.f Q6;
        java.lang.String string;
        java.lang.String stringExtra = getIntent().getStringExtra("params");
        if (stringExtra == null) {
            getActivity().finish();
            return;
        }
        hu.f fVar = new hu.f();
        fVar.fromJsonStr(stringExtra);
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(fVar.q(), fVar.n());
        java.lang.String str = "";
        jz5.f0 f0Var2 = null;
        if (k17 != null) {
            cVar = new l15.c();
            java.lang.String U1 = k17.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.fromXml(U1);
        } else {
            cVar = null;
        }
        s15.w wVar = new s15.w();
        hu.f fVar2 = r26.n0.N(fVar.r()) ^ true ? fVar : null;
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        if (fVar2 != null) {
            wVar.fromXml(fVar2.r());
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (cVar != null) {
                v05.b k18 = cVar.k();
                if (k18 != null && (string = k18.getString(k18.f432315e + 44)) != null) {
                    str = string;
                }
                wVar.fromXml(str);
                f0Var2 = f0Var3;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailDataUIC", "invalid input");
                getActivity().finish();
                return;
            }
        }
        j75.f Q62 = Q6();
        if (Q62 == null || ((hu.e) Q62.getState()) == null || (Q6 = Q6()) == null) {
            return;
        }
        Q6.B3(new hu.a(fVar, wVar));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), new xu.h(this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(getActivity(), new xu.i(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new xu.j(this, null), 1, null);
        }
    }
}
