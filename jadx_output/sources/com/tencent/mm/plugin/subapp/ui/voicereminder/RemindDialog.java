package com.tencent.mm.plugin.subapp.ui.voicereminder;

@db5.a(3)
/* loaded from: classes11.dex */
public class RemindDialog extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f172438i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public static boolean f172439m = false;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f172443g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f172440d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f172441e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f172442f = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: h, reason: collision with root package name */
    public final c01.r8 f172444h = new hg4.a(this);

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.tencent.mm.sdk.platformtools.x2.f193075e == null) ? super.getResources() : com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = of5.b.a(this).getString(com.tencent.mm.R.string.k_a);
        aVar.f211729s = " ";
        aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.k_8);
        aVar.E = new hg4.b(this);
        aVar.f211733w = of5.b.a(this).getString(com.tencent.mm.R.string.k__);
        aVar.F = new hg4.c(this);
        aVar.H = new hg4.d(this);
        this.f172440d = getIntent().getStringExtra("_RemindDialog_User");
        java.lang.String stringExtra = getIntent().getStringExtra("_RemindDialog_Remind");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f172441e;
        arrayList.clear();
        arrayList.add(stringExtra);
        java.util.Iterator it = ((java.util.ArrayList) f172438i).iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        this.f172443g = j0Var;
        j0Var.setCanceledOnTouchOutside(false);
        this.f172443g.show();
        this.f172442f.post(new hg4.e(this));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.r8 r8Var;
        f172439m = false;
        zf4.l wi6 = zf4.l.wi();
        if (wi6 != null && (r8Var = this.f172444h) != null) {
            ((java.util.HashSet) wi6.f472676h).remove(r8Var);
        }
        super.onPause();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        c01.r8 r8Var;
        f172439m = true;
        zf4.l wi6 = zf4.l.wi();
        if (wi6 != null && (r8Var = this.f172444h) != null) {
            ((java.util.HashSet) wi6.f472676h).add(r8Var);
        }
        super.onResume();
    }
}
