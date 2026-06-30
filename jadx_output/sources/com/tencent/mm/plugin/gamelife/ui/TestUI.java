package com.tencent.mm.plugin.gamelife.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gamelife/ui/TestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-gamelife_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TestUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f141998h = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141999d = "U1_BgAAHED13WDGBipLzICG_mkIR7gtkryaxyn7Ed4@gamelife";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142000e = "U1_BgAAHED13WDGBipLsjCl-jj_DtzKiu7ntwVX5oE@gamelife";

    /* renamed from: f, reason: collision with root package name */
    public boolean f142001f = true;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f142002g = jz5.h.b(new g63.u0(this));

    public final a63.a T6() {
        return (a63.a) ((jz5.n) this.f142002g).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489162bi5;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String j17 = gm0.j1.b().j();
        if (kotlin.jvm.internal.o.b(j17, "3193176932")) {
            this.f142000e = "U1_BgAAHED13WDGBipLzICG_mkIR7gtkryaxyn7Ed4@gamelife";
            this.f141999d = "U1_BgAAHED13WDGBipLsjCl-jj_DtzKiu7ntwVX5oE@gamelife";
        } else if (kotlin.jvm.internal.o.b(j17, "3191137690")) {
            this.f142000e = "U1_BgAAHED13WDGBipLsjCl-jj_DtzKiu7ntwVX5oE@gamelife";
            this.f141999d = "U1_BgAAHED13WDGBipLzICG_mkIR7gtkryaxyn7Ed4@gamelife";
        }
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f485154gr4)).setOnClickListener(new g63.c1(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.gqv)).setOnClickListener(new g63.d1(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.gqt)).setOnClickListener(new g63.e1(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.mne)).setOnClickListener(new g63.f1(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.mnf)).setOnClickListener(new g63.g1(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.gqu)).setOnClickListener(g63.h1.f269122d);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.mno)).setOnClickListener(g63.i1.f269126d);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.orw)).setOnClickListener(g63.j1.f269132d);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f484112d25)).setOnClickListener(g63.k1.f269136d);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.b5m)).setOnClickListener(g63.v0.f269178d);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f486850mm5)).setOnClickListener(new g63.w0(this));
        T6().f1734c.setOnClickListener(new g63.x0(this));
        T6().f1733b.setOnClickListener(g63.y0.f269184d);
        T6().f1736e.setOnClickListener(new g63.z0(this));
        T6().f1737f.setOnClickListener(new g63.a1(this));
        T6().f1735d.setOnClickListener(g63.b1.f269095d);
    }
}
