package com.tencent.mm.plugin.gamelife.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/gamelife/ui/GameLifeChattingCompatUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lwn/q;", "Lwn/s;", "Lwn/r;", "<init>", "()V", "plugin-gamelife_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class GameLifeChattingCompatUI extends com.tencent.mm.ui.MMActivity implements wn.q, wn.s, wn.r {

    /* renamed from: d, reason: collision with root package name */
    public wn.t f141987d;

    @Override // wn.q
    public void G4() {
        com.tencent.mars.xlog.Log.i("GameLife.ChattingCompatUI", "[onChattingUIEnter] ...");
    }

    @Override // wn.q
    public boolean c3() {
        com.tencent.mars.xlog.Log.i("GameLife.ChattingCompatUI", "[onChattingUIExit] ...");
        return true;
    }

    @Override // wn.s
    public void d6() {
        com.tencent.mars.xlog.Log.i("GameLife.ChattingCompatUI", "[onChattingFinishEnd] ...");
        wn.t tVar = this.f141987d;
        if (tVar != null) {
            ((rb5.l) tVar).b();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        wn.t tVar = this.f141987d;
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
        com.tencent.mars.xlog.Log.i("GameLife.ChattingCompatUI", "[onChattingFinishBegin] ...");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        rb5.l lVar = wn.p.f447379a != null ? new rb5.l(this) : null;
        this.f141987d = lVar;
        if (lVar != null) {
            lVar.f393895v.add(this);
        }
        wn.t tVar = this.f141987d;
        if (tVar != null) {
            ((rb5.l) tVar).f393896w = this;
        }
        if (tVar != null) {
            ((rb5.l) tVar).h();
        }
        super.onCreate(bundle);
        wn.t tVar2 = this.f141987d;
        if (tVar2 != null) {
            ((rb5.l) tVar2).g();
        }
        getWindow().setSoftInputMode(50);
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        wn.t tVar = this.f141987d;
        if (tVar != null) {
            ((rb5.l) tVar).f393895v.remove(this);
        }
        wn.t tVar2 = this.f141987d;
        if (tVar2 != null) {
            ((rb5.l) tVar2).i();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        wn.t tVar = this.f141987d;
        if (tVar != null) {
            ((rb5.l) tVar).f393893t = rb5.k.ACTIVITY_PAUSE;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        wn.t tVar = this.f141987d;
        if (tVar != null) {
            ((rb5.l) tVar).j();
        }
    }
}
