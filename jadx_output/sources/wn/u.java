package wn;

/* loaded from: classes11.dex */
public class u extends com.tencent.mm.ui.component.UIComponent implements wn.q, wn.s {

    /* renamed from: d, reason: collision with root package name */
    public wn.t f447380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wn.q
    public void G4() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIEnter] ...");
    }

    public wn.t O6() {
        if (wn.p.f447379a == null) {
            return null;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new rb5.l((com.tencent.mm.ui.MMActivity) activity);
    }

    @Override // wn.q
    public boolean c3() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIExit] ...");
        return true;
    }

    @Override // wn.s
    public void d6() {
        wn.t tVar = this.f447380d;
        if (tVar != null) {
            ((rb5.l) tVar).b();
        }
    }

    @Override // wn.s
    public void l6() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        wn.t tVar = this.f447380d;
        if (tVar != null) {
            ((rb5.l) tVar).f(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public final void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(50);
        }
        wn.t tVar = this.f447380d;
        if (tVar != null) {
            ((rb5.l) tVar).g();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        wn.t O6 = O6();
        this.f447380d = O6;
        if (O6 != null) {
            ((rb5.l) O6).f393895v.add(this);
        }
        wn.t tVar = this.f447380d;
        if (tVar != null) {
            ((rb5.l) tVar).h();
        }
        wn.t tVar2 = this.f447380d;
        if (tVar2 != null) {
            ((rb5.l) tVar2).f393898y = true;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        wn.t tVar = this.f447380d;
        if (tVar != null) {
            ((rb5.l) tVar).f393895v.remove(this);
        }
        wn.t tVar2 = this.f447380d;
        if (tVar2 != null) {
            ((rb5.l) tVar2).i();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        wn.t tVar = this.f447380d;
        boolean z17 = false;
        if (tVar != null && ((rb5.l) tVar).c(event)) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        wn.t tVar = this.f447380d;
        boolean z17 = false;
        if (tVar != null && ((rb5.l) tVar).c(event)) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.onKeyUp(i17, event);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        wn.t tVar = this.f447380d;
        if (tVar != null) {
            ((rb5.l) tVar).f393893t = rb5.k.ACTIVITY_PAUSE;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        wn.t tVar = this.f447380d;
        if (tVar == null || (chattingUIFragment = ((rb5.l) tVar).f393882f) == null) {
            return;
        }
        chattingUIFragment.onRequestPermissionsResult(i17, permissions, grantResults);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        wn.t tVar = this.f447380d;
        if (tVar != null) {
            ((rb5.l) tVar).j();
        }
    }
}
