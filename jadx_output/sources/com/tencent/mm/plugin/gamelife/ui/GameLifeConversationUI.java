package com.tencent.mm.plugin.gamelife.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI;", "Lcom/tencent/mm/plugin/gamelife/ui/GameLifeChattingCompatUI;", "Lg63/t0;", "<init>", "()V", "plugin-gamelife_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class GameLifeConversationUI extends com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI implements g63.t0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f141988o = 0;

    /* renamed from: e, reason: collision with root package name */
    public final g63.j f141989e;

    /* renamed from: f, reason: collision with root package name */
    public final g63.f0 f141990f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f141991g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f141992h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView f141993i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.gamelife.ui.GameLifeEmptyCoverView f141994m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f141995n;

    public GameLifeConversationUI() {
        g63.j jVar = new g63.j();
        this.f141989e = jVar;
        this.f141990f = new g63.f0(this, jVar);
        this.f141991g = jz5.h.b(new g63.j0(this));
        this.f141992h = true;
        this.f141995n = jz5.h.b(new g63.h0(this));
    }

    public final a63.c T6() {
        return (a63.c) ((jz5.n) this.f141995n).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bi8;
    }

    @Override // com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.fqb);
        androidx.recyclerview.widget.RecyclerView recyclerView = T6().f1752d;
        recyclerView.setLayoutManager((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) this.f141991g).getValue());
        recyclerView.setAdapter(this.f141989e);
        recyclerView.setItemAnimator(null);
        T6().f1753e.setActionCallback(new g63.m0(this));
        com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView gameLifeLoadingCoverView = new com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView(this, null, 0, 6, null);
        gameLifeLoadingCoverView.setOnClickListener(new g63.n0(this));
        this.f141993i = gameLifeLoadingCoverView;
        com.tencent.mm.plugin.gamelife.ui.GameLifeEmptyCoverView gameLifeEmptyCoverView = new com.tencent.mm.plugin.gamelife.ui.GameLifeEmptyCoverView(this, null, 0, 6, null);
        gameLifeEmptyCoverView.setVisibility(8);
        this.f141994m = gameLifeEmptyCoverView;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = T6().f1751c;
        com.tencent.mm.plugin.gamelife.ui.GameLifeEmptyCoverView gameLifeEmptyCoverView2 = this.f141994m;
        if (gameLifeEmptyCoverView2 == null) {
            kotlin.jvm.internal.o.o("emptyCoverView");
            throw null;
        }
        frameLayout.addView(gameLifeEmptyCoverView2, layoutParams);
        e63.a.f249817a = getIntent().getIntExtra("game_report_from_scene", 0);
        g63.f0 f0Var = this.f141990f;
        g63.j jVar = f0Var.f269107b;
        jVar.f269127d.f269172b = f0Var.f269111f;
        jVar.f269127d.f269173c = new g63.n(g63.b0.f269094d);
        ((z53.q) f0Var.f269109d).wi(f0Var.f269112g);
        u53.y yVar = (u53.y) i95.n0.c(u53.y.class);
        l75.q0 q0Var = f0Var.f269113h;
        ((y53.x) yVar).getClass();
        if (q0Var != null) {
            ((t53.m0) i95.n0.c(t53.m0.class)).Ri().add(q0Var);
        }
        z53.o.f470261a.c(0, 15, new g63.v(f0Var));
    }

    @Override // com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        g63.f0 f0Var = this.f141990f;
        f0Var.f269106a = null;
        ((z53.q) f0Var.f269109d).Vi(f0Var.f269112g);
        u53.y yVar = (u53.y) i95.n0.c(u53.y.class);
        l75.q0 q0Var = f0Var.f269113h;
        ((y53.x) yVar).getClass();
        if (q0Var != null) {
            ((t53.m0) i95.n0.c(t53.m0.class)).Ri().remove(q0Var);
        }
    }

    public void onFinish() {
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            e63.a.f249817a = intent.getIntExtra("game_report_from_scene", 0);
        }
    }

    @Override // com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        jz5.l lVar;
        int intValue;
        int intValue2;
        super.onResume();
        g63.f0 f0Var = this.f141990f;
        f0Var.getClass();
        long j17 = e63.a.f249817a;
        com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
        gameLifeSessionStruct.f58340d = 2L;
        gameLifeSessionStruct.f58341e = 0L;
        gameLifeSessionStruct.f58342f = 0L;
        gameLifeSessionStruct.f58343g = 1L;
        gameLifeSessionStruct.f58344h = j17;
        gameLifeSessionStruct.k();
        com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct2 = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
        gameLifeSessionStruct2.f58340d = 2L;
        gameLifeSessionStruct2.f58341e = 201L;
        gameLifeSessionStruct2.f58342f = 0L;
        gameLifeSessionStruct2.f58343g = 1L;
        gameLifeSessionStruct2.f58344h = j17;
        gameLifeSessionStruct2.k();
        boolean z17 = false;
        if (f0Var.f269108c) {
            f0Var.f269108c = false;
            return;
        }
        e63.a.f249817a = 301L;
        f0Var.a();
        g63.j jVar = f0Var.f269107b;
        jVar.f269128e.getClass();
        jVar.f269129f.getClass();
        g63.t0 t0Var = f0Var.f269106a;
        if (t0Var != null) {
            wn.t tVar = ((com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI) t0Var).f141987d;
            if (tVar != null ? ((rb5.l) tVar).f393887n : true) {
                z17 = true;
            }
        }
        if (!z17) {
            return;
        }
        if (t0Var != null) {
            com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI = (com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI) t0Var;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) gameLifeConversationUI.f141991g).getValue()).w());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) gameLifeConversationUI.f141991g).getValue()).y());
            lVar = new jz5.l(valueOf, valueOf2);
            valueOf.intValue();
            valueOf2.intValue();
        } else {
            lVar = null;
        }
        if (lVar == null || (intValue = ((java.lang.Number) lVar.f302833d).intValue()) > (intValue2 = ((java.lang.Number) lVar.f302834e).intValue())) {
            return;
        }
        while (true) {
            java.lang.Object obj = jVar.f269130g.get(intValue);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            z53.i iVar = (z53.i) obj;
            boolean u07 = iVar.u0();
            com.tencent.mm.game.report.d dVar = com.tencent.mm.game.report.e.f68194a;
            if (u07) {
                int x17 = jVar.x();
                java.lang.String field_sessionId = iVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                dVar.e(intValue + 1, 1L, x17, field_sessionId, 0L, "", 0L, "", iVar.t0(), e63.a.f249817a, (r35 & 1024) != 0 ? null : null);
            } else {
                y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(iVar.field_selfUserName);
                if (Di != null) {
                    int x18 = jVar.x();
                    java.lang.String field_sessionId2 = iVar.field_sessionId;
                    kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
                    long j18 = Di.field_accountType;
                    java.lang.String field_selfUserName = iVar.field_selfUserName;
                    kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
                    y53.m mVar = iVar.F;
                    kotlin.jvm.internal.o.d(mVar);
                    long j19 = mVar.field_accountType;
                    java.lang.String field_talker = iVar.field_talker;
                    kotlin.jvm.internal.o.f(field_talker, "field_talker");
                    dVar.e(intValue + 1, 1L, x18, field_sessionId2, j18, field_selfUserName, j19, field_talker, iVar.t0(), e63.a.f249817a, (r35 & 1024) != 0 ? null : null);
                }
            }
            if (intValue == intValue2) {
                return;
            } else {
                intValue++;
            }
        }
    }
}
