package du0;

/* loaded from: classes5.dex */
public abstract class p1 extends du0.g {

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f243409i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f243410m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f243411n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f243412o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f243413p;

    /* renamed from: q, reason: collision with root package name */
    public ev0.c f243414q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f243415r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f243416s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f243417t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243415r = jz5.h.b(new du0.n1(this));
        this.f243416s = jz5.h.b(new du0.c1(this));
    }

    public void C6() {
    }

    public final void U6(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo followAudioInfo) {
        kotlin.jvm.internal.o.g(followAudioInfo, "followAudioInfo");
        Z6();
        V6(followAudioInfo);
        ev0.c cVar = this.f243414q;
        if (cVar != null) {
            cVar.g().setLocalAudioList(kz5.b0.c(followAudioInfo));
        }
        ev0.c cVar2 = this.f243414q;
        if (cVar2 != null) {
            cVar2.g().onSelectMusic(followAudioInfo);
        }
    }

    public void V6(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        q7(audioCacheInfo);
    }

    public void W6(float f17) {
    }

    public void X6(float f17) {
    }

    public boolean Y6(boolean z17) {
        return true;
    }

    public final ev0.c Z6() {
        ev0.c cVar = this.f243414q;
        if (cVar == null) {
            cVar = new ev0.c(c7().l2().f69348m, getContext(), new du0.d1(this));
            cVar.p(c7().N5(), b7());
            cVar.f222361k = new du0.e1(this);
            cVar.f222362l = new du0.f1(this);
            kotlin.jvm.internal.o.f(i95.n0.c(m40.k0.class), "getService(...)");
            cVar.f222363m = new du0.g1(!((c61.p7) ((m40.k0) r1)).hj(m40.j0.f323413i), null);
            cVar.b(new du0.h1(this), new du0.i1(cVar, this), new du0.j1(cVar, this), 200);
        }
        this.f243414q = cVar;
        return cVar;
    }

    public float a7() {
        return 0.5f;
    }

    public com.tencent.maas.model.time.MJTime b7() {
        return null;
    }

    public final yt0.c c7() {
        return (yt0.c) ((jz5.n) this.f243415r).getValue();
    }

    public ex0.o d7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return null;
    }

    public float e7() {
        return 0.5f;
    }

    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f7() {
        return this.f243417t;
    }

    public int g7() {
        ev0.c cVar = this.f243414q;
        if (cVar != null) {
            return cVar.f();
        }
        return 0;
    }

    public boolean h7() {
        return false;
    }

    public boolean i7() {
        return false;
    }

    public final void k7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.o d76 = d7(segmentID);
        if (d76 != null) {
            d76.f257155r = (du0.s1) ou0.d.a(getActivity(), du0.s1.class);
            kotlinx.coroutines.l.d(getMainScope(), null, null, new du0.m1(d76, this, null), 3, null);
        }
    }

    public rv0.n1 l7() {
        return null;
    }

    public abstract yt0.c m7();

    public final void n7(boolean z17) {
        if (z17) {
            android.view.View view = this.f243413p;
            if (view == null) {
                kotlin.jvm.internal.o.o("removeMusicBtn");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f243413p;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("removeMusicBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void o7() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMediaItemsChanged: isShowing=");
        ev0.c cVar = this.f243414q;
        sb6.append(cVar != null ? java.lang.Boolean.valueOf(cVar.f222354d) : null);
        com.tencent.mars.xlog.Log.i("MusicTipUIC", sb6.toString());
        kotlinx.coroutines.r2 r2Var = this.f243409i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f243409i = kotlinx.coroutines.l.d(getMainScope(), null, null, new du0.o1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[RETURN] */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onBackPressed() {
        /*
            r4 = this;
            ev0.c r0 = r4.f243414q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r3 = r0.f222354d
            if (r3 != 0) goto Lb
            goto Lf
        Lb:
            boolean r3 = r0.f222354d
            if (r3 != 0) goto L11
        Lf:
            r0 = r2
            goto L19
        L11:
            cu0.y r0 = r0.g()
            r0.setShow(r2)
            r0 = r1
        L19:
            if (r0 != r1) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            if (r0 == 0) goto L21
            return r1
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: du0.p1.onBackPressed():boolean");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.ViewGroup viewGroup = this.f243410m;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("musicTipContainer");
            throw null;
        }
        viewGroup.setOnClickListener(new du0.k1(this));
        android.view.View view = this.f243413p;
        if (view != null) {
            view.setOnClickListener(new du0.l1(this));
        } else {
            kotlin.jvm.internal.o.o("removeMusicBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kotlinx.coroutines.r2 r2Var = this.f243409i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ev0.c cVar = this.f243414q;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        ev0.c cVar = this.f243414q;
        if (cVar == null || !cVar.f222354d) {
            return;
        }
        ev0.t.c(cVar.f222353c, false, null, 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        ev0.c cVar = this.f243414q;
        if (cVar == null || !cVar.f222354d) {
            return;
        }
        cVar.f222353c.d();
    }

    @Override // du0.g, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ufk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f243410m = viewGroup;
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.viv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f243411n = (android.widget.TextView) findViewById2;
        android.view.ViewGroup viewGroup2 = this.f243410m;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("musicTipContainer");
            throw null;
        }
        android.view.View findViewById3 = viewGroup2.findViewById(com.tencent.mm.R.id.u7d);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f243412o = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.view.ViewGroup viewGroup3 = this.f243410m;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("musicTipContainer");
            throw null;
        }
        android.view.View findViewById4 = viewGroup3.findViewById(com.tencent.mm.R.id.f483502hw1);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f243413p = findViewById4;
    }

    public void p7(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18) {
    }

    public void q7(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        this.f243417t = audioCacheInfo;
        java.lang.String str = audioCacheInfo != null ? audioCacheInfo.f155723t : null;
        if (str == null) {
            s7();
            return;
        }
        android.widget.TextView textView = this.f243411n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("musicNameTv");
            throw null;
        }
        textView.setText(str);
        android.widget.TextView textView2 = this.f243411n;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("musicNameTv");
            throw null;
        }
        textView2.requestFocus();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f243412o;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("musicIconIv");
            throw null;
        }
        weImageView.setIconColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.Brand_100));
        n7(true);
    }

    public void r7(zw0.b entrance) {
        kotlin.jvm.internal.o.g(entrance, "entrance");
        Z6();
        ev0.c cVar = this.f243414q;
        if (cVar != null) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f76 = f7();
            boolean z17 = !(this instanceof nu0.d4);
            boolean i76 = i7();
            boolean h76 = h7();
            int g76 = g7();
            if (!cVar.f222354d) {
                cVar.f222356f = i76;
                cVar.f222355e = f76;
                cVar.f222357g = g76;
                cVar.g().e().p(z17, i76);
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) cVar.g().e().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
                if (e0Var != null) {
                    com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.B(e0Var, h76, false, false, 2, null);
                    if (h76 && !e0Var.s(1)) {
                        e0Var.y();
                    }
                }
                cVar.g().setShow(true);
            }
        }
        ((du0.b1) T6(du0.b1.class)).O6();
    }

    public final void s7() {
        android.view.ViewGroup viewGroup = this.f243410m;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("musicTipContainer");
            throw null;
        }
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.lng);
        android.widget.TextView textView = this.f243411n;
        if (textView == null) {
            kotlin.jvm.internal.o.o("musicNameTv");
            throw null;
        }
        textView.setText(r17);
        android.widget.TextView textView2 = this.f243411n;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("musicNameTv");
            throw null;
        }
        textView2.requestFocus();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f243412o;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("musicIconIv");
            throw null;
        }
        weImageView.setIconColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.ac8));
        n7(false);
    }
}
