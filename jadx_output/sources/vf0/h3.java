package vf0;

/* loaded from: classes12.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f436174a;

    /* renamed from: b, reason: collision with root package name */
    public final vf0.u2 f436175b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f436176c;

    /* renamed from: d, reason: collision with root package name */
    public vf0.i3 f436177d;

    /* renamed from: e, reason: collision with root package name */
    public oi3.h f436178e;

    /* renamed from: f, reason: collision with root package name */
    public y15.d f436179f;

    /* renamed from: g, reason: collision with root package name */
    public gp.a f436180g;

    /* renamed from: h, reason: collision with root package name */
    public qi3.f0 f436181h;

    /* renamed from: i, reason: collision with root package name */
    public vf0.j1 f436182i;

    /* renamed from: j, reason: collision with root package name */
    public final vf0.k3 f436183j;

    /* renamed from: k, reason: collision with root package name */
    public qi3.d0 f436184k;

    /* renamed from: l, reason: collision with root package name */
    public qi3.k0 f436185l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f436186m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Map f436187n;

    /* renamed from: o, reason: collision with root package name */
    public final vf0.d3 f436188o;

    public h3(java.lang.String toUser, vf0.u2 sendVideoElement, boolean z17, vf0.i3 i3Var) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        kotlin.jvm.internal.o.g(sendVideoElement, "sendVideoElement");
        this.f436174a = toUser;
        this.f436175b = sendVideoElement;
        this.f436176c = z17;
        this.f436177d = i3Var;
        this.f436179f = new y15.d();
        this.f436183j = new vf0.k3(null, null, false, 7, null);
        this.f436186m = new java.util.concurrent.atomic.AtomicReference(java.lang.Float.valueOf(0.0f));
        this.f436188o = new vf0.d3(false, 0, null, null, null, false, 63, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r4 = this;
            boolean r0 = r4.f436176c
            r1 = 1
            if (r0 != 0) goto L23
            vf0.i3 r0 = r4.f436177d
            r2 = 0
            if (r0 == 0) goto L1e
            vf0.j3 r0 = r0.f436196a
            if (r0 == 0) goto L1e
            vf0.j3 r3 = vf0.j3.f436205g
            if (r0 == r3) goto L19
            vf0.j3 r3 = vf0.j3.f436206h
            if (r0 != r3) goto L17
            goto L19
        L17:
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 != r1) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vf0.h3.a():boolean");
    }

    public java.lang.String toString() {
        return "VideoSendParams(toUser='" + this.f436174a + "', sendVideoElement=" + this.f436175b + ", isResend=" + this.f436176c + ", extra=" + this.f436177d + ')';
    }

    public /* synthetic */ h3(java.lang.String str, vf0.u2 u2Var, boolean z17, vf0.i3 i3Var, int i17, kotlin.jvm.internal.i iVar) {
        this(str, u2Var, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? null : i3Var);
    }
}
