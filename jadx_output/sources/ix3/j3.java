package ix3;

/* loaded from: classes.dex */
public final class j3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f295466d;

    /* renamed from: e, reason: collision with root package name */
    public final ix3.h3 f295467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295467e = new ix3.h3(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 1 || (mvvmList = this.f295466d) == null) {
            return;
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList, null, 1, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new ix3.i3(this));
    }
}
