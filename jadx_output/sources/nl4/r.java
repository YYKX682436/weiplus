package nl4;

/* loaded from: classes11.dex */
public final class r implements ll4.d, ll4.c {

    /* renamed from: a, reason: collision with root package name */
    public ll4.a f338231a;

    /* renamed from: b, reason: collision with root package name */
    public long f338232b;

    /* renamed from: c, reason: collision with root package name */
    public long f338233c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f338234d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f338235e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f338236f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.lp0 f338237g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f338238h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f338239i;

    /* renamed from: j, reason: collision with root package name */
    public final kk4.b f338240j;

    /* renamed from: k, reason: collision with root package name */
    public final int f338241k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f338242l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f338243m;

    public r(android.content.Context context) {
        kk4.c cVar;
        kotlin.jvm.internal.o.g(context, "context");
        this.f338239i = kotlinx.coroutines.z0.b();
        int hashCode = hashCode();
        this.f338241k = hashCode;
        this.f338242l = "MicroMsg.TingFinderPlayerCore@" + hashCode;
        jz5.g b17 = jz5.h.b(new nl4.j(this));
        kk4.b Ai = ((cf0.q) ((df0.q) i95.n0.c(df0.q.class))).Ai(context);
        this.f338240j = Ai;
        kk4.v vVar = (kk4.v) Ai;
        vVar.I(new nl4.e(this), 400L);
        vVar.f308575J = new nl4.f(this);
        vVar.K = new nl4.g(this);
        kk4.c cVar2 = vVar.f308577b;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).setOnInfoListener(new nl4.h(this));
        }
        vVar.D(new nl4.i(this));
        if (!(((java.lang.Boolean) ((jz5.n) b17).getValue()).booleanValue() && ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj()) || (cVar = vVar.f308577b) == null) {
            return;
        }
        ((cf0.q) ((df0.q) i95.n0.c(df0.q.class))).getClass();
        ((kk4.f0) cVar).b(new lk4.b("finder", 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(nl4.r r5, long r6, java.lang.String r8, bw5.gq0 r9, kotlin.coroutines.Continuation r10) {
        /*
            r5.getClass()
            boolean r0 = r10 instanceof nl4.k
            if (r0 == 0) goto L16
            r0 = r10
            nl4.k r0 = (nl4.k) r0
            int r1 = r0.f338213g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f338213g = r1
            goto L1b
        L16:
            nl4.k r0 = new nl4.k
            r0.<init>(r5, r10)
        L1b:
            java.lang.Object r10 = r0.f338211e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f338213g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r5 = r0.f338210d
            nl4.r r5 = (nl4.r) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L30
            goto Laf
        L30:
            r6 = move-exception
            goto Lb3
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r9 == 0) goto L53
            boolean[] r10 = r9.f27967w
            r2 = 3
            boolean r10 = r10[r2]
            if (r10 == 0) goto L4a
            com.tencent.mm.protobuf.g r9 = r9.f27953f
            goto L4c
        L4a:
            com.tencent.mm.protobuf.g r9 = com.tencent.mm.protobuf.g.f192155b
        L4c:
            if (r9 == 0) goto L53
            byte[] r9 = r9.g()
            goto L54
        L53:
            r9 = r3
        L54:
            if (r9 == 0) goto La4
            int r10 = r9.length
            if (r10 != 0) goto L5b
            r10 = r4
            goto L5c
        L5b:
            r10 = 0
        L5c:
            r10 = r10 ^ r4
            if (r10 == 0) goto La4
            com.tencent.mm.protocal.protobuf.FinderObject r10 = new com.tencent.mm.protocal.protobuf.FinderObject
            r10.<init>()
            r10.parseFrom(r9)     // Catch: java.io.IOException -> L9c
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r10.getObjectDesc()     // Catch: java.io.IOException -> L9c
            if (r9 == 0) goto L87
            java.util.LinkedList r9 = r9.getMedia()     // Catch: java.io.IOException -> L9c
            if (r9 == 0) goto L87
            java.lang.Object r9 = r9.getFirst()     // Catch: java.io.IOException -> L9c
            com.tencent.mm.protocal.protobuf.FinderMedia r9 = (com.tencent.mm.protocal.protobuf.FinderMedia) r9     // Catch: java.io.IOException -> L9c
            if (r9 == 0) goto L87
            r45.kb1 r9 = r9.getHls_spec()     // Catch: java.io.IOException -> L9c
            if (r9 == 0) goto L87
            r2 = 2
            java.lang.String r9 = r9.getString(r2)     // Catch: java.io.IOException -> L9c
            goto L88
        L87:
            r9 = r3
        L88:
            r5.f338238h = r9     // Catch: java.io.IOException -> L9c
            java.lang.Class<zy2.b6> r9 = zy2.b6.class
            i95.m r9 = i95.n0.c(r9)     // Catch: java.io.IOException -> L9c
            zy2.b6 r9 = (zy2.b6) r9     // Catch: java.io.IOException -> L9c
            c61.l7 r9 = (c61.l7) r9     // Catch: java.io.IOException -> L9c
            dk4.a r9 = r9.sj(r10)     // Catch: java.io.IOException -> L9c
            if (r9 == 0) goto La4
            r1 = r9
            goto Lcc
        L9c:
            java.lang.String r9 = r5.f338242l
            java.lang.String r10 = "parseFrom finderObject fail"
            com.tencent.mars.xlog.Log.w(r9, r10)
        La4:
            r0.f338210d = r5     // Catch: java.lang.Exception -> L30
            r0.f338213g = r4     // Catch: java.lang.Exception -> L30
            java.lang.Object r10 = r5.r(r6, r8, r0)     // Catch: java.lang.Exception -> L30
            if (r10 != r1) goto Laf
            goto Lcc
        Laf:
            r1 = r10
            dk4.a r1 = (dk4.a) r1     // Catch: java.lang.Exception -> L30
            goto Lcc
        Lb3:
            java.lang.String r5 = r5.f338242l
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "requestFinderData fail "
            r7.<init>(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.mars.xlog.Log.w(r5, r6)
            r1 = r3
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nl4.r.q(nl4.r, long, java.lang.String, bw5.gq0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ll4.c
    public yz5.l a() {
        return this.f338243m;
    }

    @Override // ll4.d
    public bw5.lp0 b() {
        bw5.lp0 lp0Var = this.f338237g;
        if (lp0Var == null) {
            bw5.lp0 lp0Var2 = bw5.lp0.f29890v;
            kotlin.jvm.internal.o.f(lp0Var2, "getDefaultInstance(...)");
            return lp0Var2;
        }
        if (lp0Var != null) {
            return lp0Var;
        }
        kotlin.jvm.internal.o.o("mPlayingItem");
        throw null;
    }

    @Override // ll4.d
    public void c(float f17) {
        kk4.v vVar = (kk4.v) this.f338240j;
        vVar.f308587l = f17;
        kk4.c cVar = vVar.f308577b;
        if (cVar != null) {
            cVar.setPlaySpeedRatio(f17);
        }
    }

    @Override // ll4.d
    public long d() {
        return 0L;
    }

    @Override // ll4.d
    public void e(ll4.a aVar) {
        com.tencent.mars.xlog.Log.i(this.f338242l, "set callback " + aVar);
        this.f338231a = aVar;
    }

    @Override // ll4.d
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f338242l, "pause");
        this.f338236f = true;
        kk4.b.i(this.f338240j, true, false, 2, null);
    }

    @Override // ll4.d
    public java.lang.String g() {
        return "TingFinderPlayerCore";
    }

    @Override // ll4.d
    public float h() {
        return ((kk4.v) this.f338240j).f308587l;
    }

    @Override // ll4.d
    public void i(ll4.b bVar) {
    }

    @Override // ll4.d
    public void j(bw5.kq0 tingPlayerContext) {
        kotlin.jvm.internal.o.g(tingPlayerContext, "tingPlayerContext");
        if (tingPlayerContext.f29494m[1]) {
            com.tencent.mars.xlog.Log.i(this.f338242l, "try begin startPlay");
            kotlinx.coroutines.l.d(this.f338239i, null, null, new nl4.q(tingPlayerContext, this, null), 3, null);
        } else {
            ll4.a aVar = this.f338231a;
            if (aVar != null) {
                ll4.a.a(aVar, 12, null, 2, null);
            }
        }
    }

    @Override // ll4.d
    public long k() {
        return this.f338232b;
    }

    @Override // ll4.d
    public bw5.ap0 l() {
        return null;
    }

    @Override // ll4.d
    public long m() {
        return this.f338233c;
    }

    @Override // ll4.d
    public void n(byte[] buffer, java.lang.String listenId, boolean z17, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(listenId, "listenId");
        com.tencent.mars.xlog.Log.i(this.f338242l, "setAudioMixPcmBuffer sr:" + i18 + ", ch:" + i27 + ", format:" + i19 + ", len:" + buffer.length);
    }

    @Override // ll4.d
    public int o() {
        return this.f338241k;
    }

    @Override // ll4.c
    public void p(yz5.l lVar) {
        this.f338243m = lVar;
        if (!((kk4.v) this.f338240j).t() || lVar == null) {
            return;
        }
        lVar.invoke(this);
    }

    public final java.lang.Object r(long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        nl4.m mVar = new nl4.m(this, b6Var, nVar);
        c61.l7 l7Var = (c61.l7) b6Var;
        com.tencent.mm.protocal.protobuf.FinderObject ml6 = l7Var.ml(j17, str, 0, false, false, "", mVar);
        if (ml6 != null) {
            dk4.a sj6 = l7Var.sj(ml6);
            if (sj6 != null) {
                nVar.resumeWith(kotlin.Result.m521constructorimpl(sj6));
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("media Info from cache finderObject failed"))));
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // ll4.d
    public void release() {
        com.tencent.mars.xlog.Log.i(this.f338242l, "release");
        stop();
    }

    @Override // ll4.d
    public void reset() {
    }

    @Override // ll4.d
    public void resume() {
        com.tencent.mars.xlog.Log.i(this.f338242l, "resume");
        this.f338236f = false;
        ((kk4.v) this.f338240j).O();
    }

    @Override // ll4.d
    public void seek(long j17) {
        com.tencent.mars.xlog.Log.i(this.f338242l, "seek " + j17);
        ll4.a aVar = this.f338231a;
        if (aVar != null) {
            ll4.a.a(aVar, 9, null, 2, null);
        }
        ((kk4.v) this.f338240j).z((int) j17, false, new nl4.o(this));
    }

    @Override // ll4.c
    public void setSurface(android.view.Surface surface) {
        kk4.b.h(this.f338240j, surface, false, 2, null);
    }

    @Override // ll4.d
    public void setVolume(float f17) {
        ((kk4.v) this.f338240j).K(f17);
    }

    @Override // ll4.d
    public void stop() {
        com.tencent.mars.xlog.Log.i(this.f338242l, "stop");
        this.f338231a = null;
        this.f338235e = true;
        ((kk4.v) this.f338240j).stop();
    }

    @Override // ll4.c
    public int videoHeight() {
        kk4.c cVar = ((kk4.v) this.f338240j).f308577b;
        if (cVar != null) {
            return ((kk4.f0) cVar).getVideoHeight();
        }
        return 0;
    }

    @Override // ll4.c
    public int videoWidth() {
        kk4.c cVar = ((kk4.v) this.f338240j).f308577b;
        if (cVar != null) {
            return ((kk4.f0) cVar).getVideoWidth();
        }
        return 0;
    }
}
