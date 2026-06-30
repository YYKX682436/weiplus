package ik4;

/* loaded from: classes4.dex */
public final class p implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, ik4.r {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f291956d;

    /* renamed from: e, reason: collision with root package name */
    public ik4.g f291957e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Surface f291958f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f291959g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f291960h;

    /* renamed from: i, reason: collision with root package name */
    public int f291961i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f291962m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f291963n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f291964o;

    /* renamed from: p, reason: collision with root package name */
    public fk4.u f291965p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f291966q;

    public p(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f291956d = context;
        this.f291960h = true;
        this.f291962m = "";
        this.f291964o = "";
        this.f291966q = true;
    }

    @Override // ik4.r
    public void a(android.view.Surface surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        f("onSurfaceDestroyed");
    }

    @Override // ik4.r
    public void b(android.view.Surface surface, int i17, int i18, int i19) {
        android.view.Surface surface2;
        kotlin.jvm.internal.o.g(surface, "surface");
        if (!kotlin.jvm.internal.o.b(this.f291958f, surface) && (surface2 = this.f291958f) != null) {
            surface2.release();
        }
        this.f291958f = surface;
        ik4.g gVar = this.f291957e;
        if (gVar != null) {
            gVar.setOutputMute(this.f291959g);
        }
        ik4.g gVar2 = this.f291957e;
        if (gVar2 != null) {
            int i27 = this.f291961i;
            if (d()) {
                gVar2.f308536l = surface;
                gVar2.f308537m = i27;
            }
            gVar2.switchHdrModeWithSurface(surface, i27);
        }
        f("onSurfaceAvailable width:" + i17 + " height:" + i18 + " surfaceType:" + i19);
    }

    public final java.lang.String c() {
        if (!android.text.TextUtils.isEmpty(this.f291964o)) {
            return this.f291964o;
        }
        fk4.u uVar = this.f291965p;
        if (uVar != null) {
            return ((fk4.k) uVar).n();
        }
        return null;
    }

    public final boolean d() {
        java.lang.Object obj;
        ik4.l lVar = ik4.l.f291941a;
        ik4.g gVar = this.f291957e;
        if (gVar == null) {
            return false;
        }
        java.util.Set entrySet = ik4.l.f291944d.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((jz5.l) ((java.util.Map.Entry) obj).getValue()).f302834e, gVar)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return entry == null || kotlin.jvm.internal.o.b(((jz5.l) entry.getValue()).f302833d, this);
    }

    public final void e(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.Flexible@" + hashCode(), "[" + this.f291962m + ']' + str);
    }

    public final void f(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Flexible@" + hashCode(), "[" + this.f291962m + ']' + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(boolean r11, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ik4.p.g(boolean, com.tencent.thumbplayer.api.ITPPlayerListener$IOnInfoListener, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h(kk4.c cVar, fk4.u uVar) {
        fk4.k kVar = (fk4.k) uVar;
        kk4.f0 f0Var = (kk4.f0) cVar;
        f0Var.setVideoInfo(new com.tencent.thumbplayer.api.TPVideoInfo.Builder().fileId(kVar.f()).downloadParam(new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(11)).build());
        f0Var.enableTPAssetResourceLoader(new fk4.l(kVar));
        java.lang.String f17 = kVar.f();
        kotlin.jvm.internal.o.d(f17);
        f0Var.d(f17, this.f291963n);
        f0Var.setDataSource("http://127.0.0.1:1234/mock_url");
    }

    public final boolean i(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            e("invalid media id");
            return false;
        }
        if (android.text.TextUtils.isEmpty(this.f291962m)) {
            this.f291962m = str;
            this.f291963n = str2;
            return true;
        }
        e("repeat set media id,id:" + this.f291962m + " to " + str);
        return false;
    }

    public final void j(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num) {
        if (bool != null) {
            this.f291959g = bool.booleanValue();
            ik4.g gVar = this.f291957e;
            if (gVar != null) {
                gVar.setOutputMute(bool.booleanValue());
            }
        }
        if (bool2 != null) {
            this.f291960h = bool2.booleanValue();
            ik4.g gVar2 = this.f291957e;
            if (gVar2 != null) {
                gVar2.setLoopback(bool2.booleanValue());
            }
        }
        if (num == null || this.f291961i == num.intValue()) {
            return;
        }
        this.f291961i = num.intValue();
        ik4.g gVar3 = this.f291957e;
        if (gVar3 != null) {
            android.view.Surface surface = this.f291958f;
            int intValue = num.intValue();
            if (d()) {
                gVar3.f308536l = surface;
                gVar3.f308537m = intValue;
            }
            gVar3.switchHdrModeWithSurface(surface, intValue);
        }
        f("[" + this.f291962m + "]updateConfig mute:" + bool + " playMode:" + num);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        f("onPrepared and trigger start1");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new ik4.n(this, iTPPlayer, null), 3, null);
    }
}
