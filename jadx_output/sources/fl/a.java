package fl;

/* loaded from: classes12.dex */
public final class a extends xm1.j {

    /* renamed from: k, reason: collision with root package name */
    public final f25.f f263685k;

    /* renamed from: l, reason: collision with root package name */
    public f25.m0 f263686l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f263687m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f263688n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f263689o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f263690p;

    /* renamed from: q, reason: collision with root package name */
    public tl.h f263691q;

    public a(f25.f onAudioFocusChanged) {
        kotlin.jvm.internal.o.g(onAudioFocusChanged, "onAudioFocusChanged");
        this.f263685k = onAudioFocusChanged;
        this.f263687m = true;
        this.f263688n = true;
        i();
        ym1.f.f463134h.h(this, "music");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r0.isPlaying() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(boolean r6, boolean r7) {
        /*
            r5 = this;
            tl.h r0 = r5.f263691q
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.isPlaying()
            r2 = 1
            if (r0 != r2) goto Ld
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 == 0) goto L19
            tl.h r0 = r5.f263691q
            if (r0 == 0) goto L19
            boolean r6 = r0.f(r6)
            goto L1a
        L19:
            r6 = r1
        L1a:
            java.lang.Class<ym1.f> r0 = ym1.f.class
            i95.m r2 = i95.n0.c(r0)
            java.lang.String r3 = "getService(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            ym1.f r2 = (ym1.f) r2
            xm1.h r2 = r2.f463136e
            if (r2 != 0) goto L4b
            xm1.j r2 = new xm1.j
            r2.<init>()
            i95.m r4 = i95.n0.c(r0)
            kotlin.jvm.internal.o.f(r4, r3)
            ym1.f r4 = (ym1.f) r4
            r4.f463136e = r2
            i95.m r0 = i95.n0.c(r0)
            kotlin.jvm.internal.o.f(r0, r3)
            ym1.f r0 = (ym1.f) r0
            java.lang.String r3 = "music"
            java.lang.String[] r0 = r0.f463138g
            r0[r1] = r3
        L4b:
            r2.v()
            boolean r0 = r5.f263689o
            if (r0 == 0) goto L68
            if (r7 == 0) goto L68
            f25.m0 r7 = r5.f263686l
            if (r7 == 0) goto L63
            java.lang.Class<f25.n0> r0 = f25.n0.class
            i95.m r0 = i95.n0.c(r0)
            f25.n0 r0 = (f25.n0) r0
            r0.yg(r7)
        L63:
            r7 = 0
            r5.f263686l = r7
            r5.f263689o = r1
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.a.D(boolean, boolean):boolean");
    }

    public final void E(boolean z17) {
        v();
        if (!z17) {
            q("music");
        }
        if (this.f263689o) {
            f25.m0 m0Var = this.f263686l;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            this.f263686l = null;
            this.f263689o = false;
        }
    }

    public final void F() {
        tl.h hVar = this.f263691q;
        if (hVar != null) {
            hVar.i(false);
        }
        if (this.f263687m) {
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.j0.f259100c, this.f263685k);
            this.f263686l = m96;
            this.f263689o = m96 != null ? ((g25.e) m96).f267980c : false;
        }
        this.f263688n = true;
        if (ym1.f.f463134h.j()) {
            r("music", 1);
        } else {
            r("music", 2);
        }
    }

    public final void G(java.lang.String filepath, int i17) {
        tl.h hVar;
        kotlin.jvm.internal.o.g(filepath, "filepath");
        if (this.f263687m && (hVar = this.f263691q) != null) {
            hVar.setMute(!this.f263689o);
        }
        tl.h hVar2 = this.f263691q;
        kotlin.jvm.internal.o.d(hVar2);
        if (hVar2.e(filepath, this.f263690p, i17)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceAudioManager", "start play error fileName[" + filepath + "], [" + this.f263690p + ']');
        q("music");
    }

    @Override // xm1.h, cv.y0
    public void a(boolean z17) {
        tl.h hVar;
        if (this.f263690p == z17 || (hVar = this.f263691q) == null) {
            return;
        }
        boolean z18 = false;
        if (hVar != null && hVar.isPlaying()) {
            z18 = true;
        }
        if (z18) {
            A(z17);
            tl.h hVar2 = this.f263691q;
            if (hVar2 != null) {
                hVar2.g(z17);
            }
            this.f263690p = z17;
        }
    }

    @Override // xm1.h
    public void o(int i17) {
        if (i17 == 2) {
            a(false);
        }
    }
}
