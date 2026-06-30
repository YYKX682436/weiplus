package im2;

/* loaded from: classes3.dex */
public final class n extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public long f292449d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f292450e;

    /* renamed from: f, reason: collision with root package name */
    public r45.li4 f292451f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.ta4 ta4Var;
        r45.ta4 ta4Var2;
        r45.ta4 ta4Var3;
        r45.nw1 nw1Var;
        gk2.e eVar = gk2.e.f272471n;
        boolean z17 = false;
        long j17 = 0;
        long j18 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
        dk2.x4 a17 = dk2.x4.C.a(getIntent());
        r45.li4 li4Var = null;
        if (a17 == null && j18 != 0) {
            dk2.ef efVar = dk2.ef.f233372a;
            km2.n nVar = dk2.ef.H;
            a17 = nVar != null ? nVar.f309155g : null;
        }
        if (a17 != null && (ta4Var3 = a17.B) != null) {
            j17 = ta4Var3.getLong(17);
        }
        this.f292449d = j17;
        if (a17 != null && (ta4Var2 = a17.B) != null) {
            z17 = ta4Var2.getBoolean(19);
        }
        this.f292450e = z17;
        if (a17 != null && (ta4Var = a17.B) != null) {
            li4Var = (r45.li4) ta4Var.getCustom(18);
        }
        this.f292451f = li4Var;
    }
}
