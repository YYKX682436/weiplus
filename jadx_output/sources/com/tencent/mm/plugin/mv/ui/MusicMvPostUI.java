package com.tencent.mm.plugin.mv.ui;

@db5.a(33)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvPostUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvPostUI extends com.tencent.mm.plugin.mv.ui.BaseMusicMvUI {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f150882n = 0;

    /* renamed from: e, reason: collision with root package name */
    public r45.ss4 f150883e;

    /* renamed from: f, reason: collision with root package name */
    public ya2.b2 f150884f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f150885g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f150886h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f150887i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f150888m;

    public final void U6(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImageMode", 1);
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("music_mv_cover_");
        r45.ss4 ss4Var = this.f150883e;
        sb6.append(ss4Var != null ? java.lang.Long.valueOf(ss4Var.getLong(4)) : null);
        sb6.append('_');
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        intent.putExtra("CropImage_OutputPath", e9Var.e(sb6.toString()));
        intent.putExtra("CropImage_ImgPath", str);
        intent.putExtra("CropImage_from_scene", 4);
        this.f150887i = true;
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).getClass();
        o25.t1 b17 = f14.g.b();
        kotlin.jvm.internal.o.f(b17, "uiCallback(...)");
        ((com.tencent.mm.app.y7) b17).p(this, intent, 1003);
    }

    public final void V6(boolean z17) {
        jz5.f0 f0Var;
        r45.ss4 ss4Var;
        jm3.v0 v0Var = new jm3.v0(this);
        W6();
        if (this.f150884f == null || (ss4Var = this.f150883e) == null) {
            f0Var = null;
        } else {
            jm3.h1.f300322a.b(ss4Var);
            v0Var.invoke(ss4Var);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPostUI", "create finder contact");
            if (z17) {
                i95.m c17 = i95.n0.c(zy2.b6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                if (zy2.b6.Mh((zy2.b6) c17, this, null, null, null, 12, null)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(this, "com.tencent.mm.plugin.finder.ui.FinderCreateContactUI");
                    intent.putExtra("key_create_scene", 7);
                    intent.putExtra("key_router_to_profile", false);
                    intent.putExtra("key_mv_status", 2);
                    startActivityForResult(intent, 1002);
                }
            }
        }
    }

    public final void W6() {
        if (this.f150884f == null) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (xy2.c.e(context).length() > 0) {
                ya2.g gVar = ya2.h.f460484a;
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                this.f150884f = gVar.b(xy2.c.e(context2));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c57;
    }

    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.o1.c(com.tencent.mm.plugin.mv.ui.uic.x6.class));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        switch (i17) {
            case 1000:
                if (i18 != -1 || intent == null) {
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("KEY_RECORD_PHOTO_PATH");
                if (stringExtra == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMvPostUI", "capture null: ");
                    return;
                } else {
                    this.f150886h = stringExtra;
                    U6(stringExtra);
                    return;
                }
            case 1001:
                if (intent == null || i18 != -1) {
                    return;
                }
                java.lang.String b17 = com.tencent.mm.ui.tools.i1.b(getContext(), intent, g83.a.a());
                if (b17 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPostUI", "onActivityResult: choose path null");
                    return;
                } else {
                    U6(b17);
                    return;
                }
            case 1002:
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPostUI", "callback create finder contact post");
                V6(false);
                return;
            case 1003:
                if (intent != null) {
                    java.lang.String stringExtra2 = intent.getStringExtra("CropImage_OutputPath");
                    if (stringExtra2 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPostUI", "onActivityResult: crop path null");
                        return;
                    }
                    com.tencent.mm.vfs.w6.h(this.f150886h);
                    if (i18 != -1) {
                        com.tencent.mm.vfs.w6.h(stringExtra2);
                        return;
                    }
                    com.tencent.mm.vfs.w6.h(this.f150885g);
                    this.f150885g = stringExtra2;
                    r45.ss4 ss4Var = this.f150883e;
                    if (ss4Var != null) {
                        ss4Var.set(2, stringExtra2);
                    }
                    android.view.View findViewById = findViewById(com.tencent.mm.R.id.asz);
                    android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487295o70);
                    if (imageView != null) {
                        o11.f fVar = new o11.f();
                        fVar.f342077a = true;
                        fVar.f342085i = 1;
                        n11.a.b().i(stringExtra2, imageView, fVar.a(), new jm3.b1(this, findViewById));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((com.tencent.mm.plugin.mv.ui.uic.x6) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.mv.ui.uic.x6.class)).O6(this.f150883e, true, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x008e, code lost:
    
        if (r8 == null) goto L12;
     */
    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.MusicMvPostUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ll3.z0.a(ll3.z0.f319264a, false, 1, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f150887i) {
            this.f150887i = false;
        }
    }
}
