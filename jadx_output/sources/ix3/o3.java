package ix3;

/* loaded from: classes.dex */
public final class o3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f295516d;

    /* renamed from: e, reason: collision with root package name */
    public rl5.r f295517e;

    /* renamed from: f, reason: collision with root package name */
    public int f295518f;

    /* renamed from: g, reason: collision with root package name */
    public int f295519g;

    /* renamed from: h, reason: collision with root package name */
    public ex3.e f295520h;

    /* renamed from: i, reason: collision with root package name */
    public final ix3.m3 f295521i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295521i = new ix3.m3(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 || i17 == 2) {
            ex3.e eVar = this.f295520h;
            if (eVar == null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f295516d;
                if (mvvmList != null) {
                    com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList, null, 1, null);
                    return;
                }
                return;
            }
            ex3.e eVar2 = (ex3.e) eVar.y0();
            java.lang.String a17 = xw3.b.f457727g.a(eVar.f257209f, false);
            kotlin.jvm.internal.o.g(a17, "<set-?>");
            eVar2.f257210g = a17;
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2 = this.f295516d;
            if (mvvmList2 != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList2, eVar2, false, 2, null);
            }
            this.f295520h = null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new ix3.n3(this));
    }
}
