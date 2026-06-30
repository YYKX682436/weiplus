package p12;

/* loaded from: classes10.dex */
public class w extends p12.h {

    /* renamed from: g, reason: collision with root package name */
    public rm5.k f351054g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView f351055h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f351056i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout f351057j;

    /* renamed from: k, reason: collision with root package name */
    public android.util.Range f351058k;

    /* renamed from: l, reason: collision with root package name */
    public final p12.v f351059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.app.Activity activity, com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorPreviewLayout previewLayout) {
        super(activity, previewLayout);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(previewLayout, "previewLayout");
        this.f351056i = kotlinx.coroutines.z0.b();
        this.f351057j = new com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout(activity);
        this.f351058k = new android.util.Range(0, 0);
        this.f351059l = new p12.v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x027b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(p12.w r20, java.lang.String r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p12.w.g(p12.w, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p12.h
    public android.view.View a() {
        return this.f351057j;
    }

    @Override // p12.h
    public void b() {
        rm5.k kVar = this.f351054g;
        if (kVar != null) {
            kVar.destroy();
        }
        this.f351054g = null;
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f351057j;
        kk4.b player = mMTPEffectVideoLayout.getPlayer();
        kotlin.jvm.internal.o.d(player);
        kk4.b.e(player, null, 1, null);
        kk4.v vVar = (kk4.v) player;
        vVar.R();
        vVar.P();
        player.recycle();
        mMTPEffectVideoLayout.g();
        kotlinx.coroutines.z0.e(this.f351056i, null, 1, null);
    }

    @Override // p12.h
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        return g(this, null, continuation);
    }

    public l12.a d() {
        if (this.f351024c > 5000) {
            android.util.Range range = new android.util.Range(0, 5000);
            this.f351026e = range;
            this.f351058k = range;
            f(true);
            return l12.a.f314980e;
        }
        android.util.Range range2 = new android.util.Range(0, java.lang.Integer.valueOf(this.f351024c));
        this.f351026e = range2;
        this.f351058k = range2;
        f(false);
        return l12.a.f314981f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p12.i
            if (r0 == 0) goto L13
            r0 = r6
            p12.i r0 = (p12.i) r0
            int r1 = r0.f351032h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f351032h = r1
            goto L18
        L13:
            p12.i r0 = new p12.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f351030f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f351032h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f351029e
            n12.n r5 = (n12.n) r5
            java.lang.Object r0 = r0.f351028d
            p12.w r0 = (p12.w) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L56
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            r4.f351027f = r6
            n12.n r6 = new n12.n
            r2 = 0
            r6.<init>(r5, r2)
            r0.f351028d = r4
            r0.f351029e = r6
            r0.f351032h = r3
            java.lang.Object r5 = r6.b(r0)
            if (r5 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r5 = r6
        L56:
            kotlinx.coroutines.flow.j2 r6 = r0.f351025d
            kotlinx.coroutines.flow.j2 r1 = r5.f334104d
            kotlinx.coroutines.flow.h3 r1 = (kotlinx.coroutines.flow.h3) r1
            java.lang.Object r1 = r1.getValue()
            kotlinx.coroutines.flow.h3 r6 = (kotlinx.coroutines.flow.h3) r6
            r6.k(r1)
            int r5 = r5.f334103c
            r0.f351024c = r5
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p12.w.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(boolean z17) {
        dk4.a aVar = new dk4.a();
        java.io.File file = this.f351027f;
        aVar.f234482s = file != null ? file.getAbsolutePath() : null;
        aVar.f234468e = true;
        java.io.File file2 = this.f351027f;
        aVar.f234483t = file2 != null ? file2.getAbsolutePath() : null;
        kk4.b player = this.f351057j.getPlayer();
        kotlin.jvm.internal.o.d(player);
        kk4.v vVar = (kk4.v) player;
        vVar.B(aVar);
        vVar.f308585j = true;
        vVar.A(true);
        vVar.C(true);
        vVar.G(p12.m.f351038d);
        vVar.D(p12.n.f351039d);
        vVar.f308595t = p12.o.f351040d;
        vVar.f308593r = new p12.p(this);
        if (z17) {
            vVar.H(0L, 5000L);
            vVar.I(new p12.r(this), 16L);
        }
        vVar.O();
    }
}
