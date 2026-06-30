package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/ReadyChattingCompatUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lwn/q;", "Lwn/s;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class ReadyChattingCompatUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements wn.q, wn.s {

    /* renamed from: t, reason: collision with root package name */
    public wn.t f128819t;

    @Override // wn.q
    public void G4() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIEnter] ...");
    }

    @Override // wn.q
    public boolean c3() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIExit] ...");
        return true;
    }

    @Override // wn.s
    public void d6() {
        wn.t tVar = this.f128819t;
        if (tVar != null) {
            ((rb5.l) tVar).b();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        wn.t tVar = this.f128819t;
        boolean z17 = false;
        if (tVar != null && ((rb5.l) tVar).c(keyEvent)) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // wn.s
    public void l6() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        wn.t tVar = this.f128819t;
        if (tVar != null) {
            ((rb5.l) tVar).f(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        rb5.l lVar = wn.p.f447379a != null ? new rb5.l(this) : null;
        this.f128819t = lVar;
        if (lVar != null) {
            lVar.f393895v.add(this);
        }
        wn.t tVar = this.f128819t;
        if (tVar != null) {
            ((rb5.l) tVar).h();
        }
        super.onCreate(bundle);
        getWindow().setSoftInputMode(50);
        wn.t tVar2 = this.f128819t;
        if (tVar2 != null) {
            ((rb5.l) tVar2).g();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        wn.t tVar = this.f128819t;
        if (tVar != null) {
            ((rb5.l) tVar).f393895v.remove(this);
        }
        wn.t tVar2 = this.f128819t;
        if (tVar2 != null) {
            ((rb5.l) tVar2).i();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        wn.t tVar = this.f128819t;
        if (tVar != null) {
            ((rb5.l) tVar).f393893t = rb5.k.ACTIVITY_PAUSE;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment;
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        wn.t tVar = this.f128819t;
        if (tVar == null || (chattingUIFragment = ((rb5.l) tVar).f393882f) == null) {
            return;
        }
        chattingUIFragment.onRequestPermissionsResult(i17, permissions, grantResults);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        wn.t tVar = this.f128819t;
        if (tVar != null) {
            ((rb5.l) tVar).j();
        }
    }
}
