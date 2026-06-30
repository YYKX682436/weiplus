package com.tencent.mm.plugin.textstatus.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Landroid/view/View;", "f", "Landroid/view/View;", "getIvMask", "()Landroid/view/View;", "setIvMask", "(Landroid/view/View;)V", "ivMask", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes11.dex */
public final class TextStatusDetailActivity extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f173502q = 0;

    /* renamed from: d, reason: collision with root package name */
    public mj4.h f173503d;

    /* renamed from: e, reason: collision with root package name */
    public cj4.l1 f173504e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View ivMask;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f173506g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout f173507h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f173508i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f173509m;

    /* renamed from: n, reason: collision with root package name */
    public pj4.o0 f173510n;

    /* renamed from: o, reason: collision with root package name */
    public al5.a0 f173511o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f173512p;

    public final void T6() {
        kk4.b player;
        kk4.b player2;
        android.widget.FrameLayout frameLayout = this.f173506g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        android.widget.FrameLayout frameLayout2 = this.f173506g;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f173507h;
        if (mMTPEffectVideoLayout != null && (player2 = mMTPEffectVideoLayout.getPlayer()) != null) {
            ((kk4.v) player2).P();
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f173507h;
        if (mMTPEffectVideoLayout2 != null && (player = mMTPEffectVideoLayout2.getPlayer()) != null) {
            player.recycle();
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.f173507h;
        if (mMTPEffectVideoLayout3 != null) {
            mMTPEffectVideoLayout3.g();
        }
    }

    public final mj4.h U6() {
        mj4.h hVar = this.f173503d;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.o.o("info");
        throw null;
    }

    public final cj4.l1 V6() {
        cj4.l1 l1Var = this.f173504e;
        if (l1Var != null) {
            return l1Var;
        }
        kotlin.jvm.internal.o.o("loadLogic");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if ((r3 != null && com.tencent.mm.plugin.textstatus.ui.c.b(r3, r9)) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(mj4.h r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r9 == 0) goto La
            pj4.o0 r9 = xe0.j0.a(r9, r2, r0, r1)
            goto Lb
        La:
            r9 = r1
        Lb:
            if (r9 == 0) goto La2
            java.lang.String r3 = wi4.a.d(r9)
            if (r3 == 0) goto L1c
            boolean r3 = r26.n0.N(r3)
            if (r3 == 0) goto L1a
            goto L1c
        L1a:
            r3 = r2
            goto L1d
        L1c:
            r3 = r0
        L1d:
            if (r3 != 0) goto La2
            al5.a0 r3 = r8.f173511o
            if (r3 != 0) goto L24
            goto L33
        L24:
            pj4.o0 r3 = r8.f173510n
            if (r3 == 0) goto L30
            boolean r3 = com.tencent.mm.plugin.textstatus.ui.c.b(r3, r9)
            if (r3 != r0) goto L30
            r3 = r0
            goto L31
        L30:
            r3 = r2
        L31:
            if (r3 != 0) goto L34
        L33:
            r0 = r2
        L34:
            if (r0 != 0) goto L99
            al5.a0 r0 = r8.f173511o
            if (r0 == 0) goto L3d
            r0.i()
        L3d:
            al5.a0 r0 = r8.f173511o
            if (r0 == 0) goto L44
            r0.g()
        L44:
            al5.a0 r0 = r8.f173511o
            if (r0 == 0) goto L4b
            r0.onDestroy()
        L4b:
            r8.f173511o = r1
            r8.f173510n = r1
            android.widget.FrameLayout r0 = r8.f173509m
            if (r0 == 0) goto L56
            r0.removeAllViews()
        L56:
            java.lang.String r0 = wi4.a.d(r9)
            if (r0 != 0) goto L5e
            java.lang.String r0 = ""
        L5e:
            java.util.LinkedList r3 = r9.f355216g
            pj4.t r4 = new pj4.t
            r4.<init>()
            r4.f355288d = r2
            r5 = 3
            r4.f355289e = r5
            mj4.h r5 = r8.U6()
            mj4.k r5 = (mj4.k) r5
            mj4.a r5 = r5.f327067b
            int r5 = r5.field_CreateTime
            r4.f355291g = r5
            android.widget.FrameLayout r5 = r8.f173509m     // Catch: java.lang.Throwable -> L95
            if (r5 != 0) goto L7b
            goto L95
        L7b:
            if (r3 == 0) goto L82
            pj4.j0 r3 = sj4.a1.a(r3)     // Catch: java.lang.Throwable -> L95
            goto L83
        L82:
            r3 = r1
        L83:
            sj4.z0 r6 = sj4.z0.f408908a     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L8a
            java.lang.String r7 = r3.f355139d     // Catch: java.lang.Throwable -> L95
            goto L8b
        L8a:
            r7 = r1
        L8b:
            bi4.r0 r6 = r6.a(r7)     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L95
            al5.a0 r1 = r6.A1(r0, r5, r3, r4)     // Catch: java.lang.Throwable -> L95
        L95:
            r8.f173511o = r1
            r8.f173510n = r9
        L99:
            android.widget.FrameLayout r9 = r8.f173509m
            if (r9 != 0) goto L9e
            goto Lcc
        L9e:
            r9.setVisibility(r2)
            goto Lcc
        La2:
            al5.a0 r9 = r8.f173511o
            if (r9 == 0) goto La9
            r9.i()
        La9:
            al5.a0 r9 = r8.f173511o
            if (r9 == 0) goto Lb0
            r9.g()
        Lb0:
            al5.a0 r9 = r8.f173511o
            if (r9 == 0) goto Lb7
            r9.onDestroy()
        Lb7:
            r8.f173511o = r1
            r8.f173510n = r1
            android.widget.FrameLayout r9 = r8.f173509m
            if (r9 == 0) goto Lc2
            r9.removeAllViews()
        Lc2:
            android.widget.FrameLayout r9 = r8.f173509m
            if (r9 != 0) goto Lc7
            goto Lcc
        Lc7:
            r0 = 8
            r9.setVisibility(r0)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity.W6(mj4.h):void");
    }

    public final void X6() {
        java.lang.String o17 = ((mj4.k) U6()).o();
        mj4.k kVar = (mj4.k) U6();
        mj4.a aVar = kVar.f327067b;
        if (aVar.field_MediaType != 2) {
            T6();
            return;
        }
        android.widget.FrameLayout frameLayout = this.f173506g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = new com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout(this);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        android.widget.FrameLayout frameLayout2 = this.f173506g;
        if (frameLayout2 != null) {
            frameLayout2.addView(mMTPEffectVideoLayout, layoutParams);
        }
        android.widget.FrameLayout frameLayout3 = this.f173506g;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        kVar.j();
        byte[] bytes = kVar.j().getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        if (g17 == null) {
            g17 = "";
        }
        java.lang.String str = g17;
        kVar.j();
        java.lang.String j17 = kVar.j();
        java.lang.String c17 = bk4.n.f21513a.c(kVar.j(), o17);
        int i17 = aVar.field_mediaWidth;
        int i18 = aVar.field_mediaHeight;
        if (i17 <= 0 || i18 <= 0) {
            com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(this);
            com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(this);
            i17 = a17.f197135a;
            i18 = a18.f197136b;
        }
        dk4.a aVar2 = new dk4.a(str, c17, j17, i17, i18);
        aVar2.f234468e = false;
        mMTPEffectVideoLayout.setMediaInfo(aVar2);
        kk4.b player = mMTPEffectVideoLayout.getPlayer();
        if (player != null) {
            ((kk4.v) player).f308585j = true;
        }
        kk4.b player2 = mMTPEffectVideoLayout.getPlayer();
        if (player2 != null) {
            ((kk4.v) player2).A(true);
        }
        mMTPEffectVideoLayout.getEffectManager().d();
        if (kVar.v()) {
            uq5.b b17 = mMTPEffectVideoLayout.getEffectManager().b();
            b17.d(5.0f);
            b17.e(1.0f);
        }
        this.f173507h = mMTPEffectVideoLayout;
        kk4.b player3 = mMTPEffectVideoLayout.getPlayer();
        if (player3 != null) {
            ((kk4.v) player3).O();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489560cz2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:17|(4:(3:19|(1:21)(1:50)|(11:23|(1:25)|26|27|28|(2:30|(1:32))|47|(2:35|(1:37))(2:44|(1:46))|38|39|40))|38|39|40)|51|(1:53)|26|27|28|(0)|47|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0224, code lost:
    
        if (r3.q(r21.f173508i) == true) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0233  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        T6();
        V6().o();
        V6().n();
        al5.a0 a0Var = this.f173511o;
        if (a0Var != null) {
            a0Var.i();
        }
        al5.a0 a0Var2 = this.f173511o;
        if (a0Var2 != null) {
            a0Var2.g();
        }
        al5.a0 a0Var3 = this.f173511o;
        if (a0Var3 != null) {
            a0Var3.onDestroy();
        }
        this.f173511o = null;
        this.f173510n = null;
        gm0.j1.d().q(5967, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        kk4.b player;
        super.onPause();
        al5.a0 a0Var = this.f173511o;
        if (a0Var != null) {
            a0Var.i();
        }
        al5.a0 a0Var2 = this.f173511o;
        if (a0Var2 != null) {
            a0Var2.g();
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f173507h;
        if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
            return;
        }
        kk4.b.i(player, false, false, 3, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        kk4.b player;
        super.onResume();
        al5.a0 a0Var = this.f173511o;
        if (a0Var != null) {
            a0Var.j();
        }
        al5.a0 a0Var2 = this.f173511o;
        if (a0Var2 != null) {
            a0Var2.h();
        }
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f173507h;
        if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).O();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        if (m1Var instanceof ej4.a) {
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            ((ej4.a) m1Var).getClass();
            d17.q(5967, this);
            if (i17 == 0 && i18 == 0) {
                z17 = true;
            } else {
                androidx.appcompat.app.AppCompatActivity context = getContext();
                if (context != null) {
                    db5.e1.s(context, context.getString(com.tencent.mm.R.string.f493360jv3), "");
                }
                z17 = false;
            }
            if (z17) {
                finish();
            }
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f173512p;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    public final void setIvMask(android.view.View view) {
        this.ivMask = view;
    }
}
