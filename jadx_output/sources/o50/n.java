package o50;

/* loaded from: classes.dex */
public final class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f343075d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f343076e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f343077f;

    /* renamed from: g, reason: collision with root package name */
    public final int f343078g;

    /* renamed from: h, reason: collision with root package name */
    public final int f343079h;

    /* renamed from: i, reason: collision with root package name */
    public final int f343080i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f343081m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f343082n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String stringExtra = getIntent().getStringExtra("ForwardParams_ReportSessionId");
        stringExtra = stringExtra == null ? java.lang.String.valueOf(hashCode()) : stringExtra;
        kotlin.jvm.internal.o.d(stringExtra);
        this.f343076e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("ForwardParams_ReportForwardObjList");
        this.f343077f = stringExtra2 == null ? "" : stringExtra2;
        this.f343078g = getIntent().getIntExtra("ForwardParams_ReportConfirmScreenFrom", 0);
        this.f343079h = getIntent().getIntExtra("ForwardParams_ReportFromScene", 0);
        this.f343080i = getIntent().getIntExtra("ForwardParams_ForwardMsgType", 0);
        java.lang.String stringExtra3 = getIntent().getStringExtra("Select_Conv_User");
        this.f343081m = r26.n0.f0(stringExtra3 == null ? "" : stringExtra3, new java.lang.String[]{","}, false, 0, 6, null);
        this.f343082n = jz5.h.b(new o50.m(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        this.f343075d = 4;
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        this.f343075d = 3;
        return super.onClickDialogSpaceOnHalfScreenMode();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e eVar = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a;
        java.lang.String forwardObjList = this.f343077f;
        kotlin.jvm.internal.o.g(forwardObjList, "forwardObjList");
        if (!kotlin.jvm.internal.o.b(this.f343076e, com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b)) {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b = com.tencent.mm.sdk.platformtools.w2.a(gm0.j1.b().j()) + c01.id.c();
        }
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209297d = this.f343078g;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209298e = forwardObjList;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.L2(getActivity(), new o50.k(this));
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(getActivity());
        ((cy1.a) ((cy1.a) aVar.ak(getActivity(), iy1.c.ForwardConfirmHalfScreen)).ik(getActivity(), 12, 32337)).Ai(getActivity(), new o50.l(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }
}
