package wj;

/* loaded from: classes5.dex */
public final class f0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f446400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj.t0 f446401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj.u0 f446402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446403g;

    public f0(wj.j0 j0Var, wj.t0 t0Var, wj.u0 u0Var, java.lang.String str) {
        this.f446400d = j0Var;
        this.f446401e = t0Var;
        this.f446402f = u0Var;
        this.f446403g = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        r45.m93 m93Var;
        com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData magicAdIPCCgiCallbackData = (com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData) obj;
        if (magicAdIPCCgiCallbackData != null) {
            wj.j0 j0Var = this.f446400d;
            wj.t0 t0Var = this.f446401e;
            wj.u0 u0Var = this.f446402f;
            java.lang.String str = this.f446403g;
            if (!magicAdIPCCgiCallbackData.f53148d) {
                wj.j0.wi(j0Var, t0Var, u0Var, str, wj.o.f446454e, "net", null);
                return;
            }
            r45.m93 m93Var2 = new r45.m93();
            byte[] bArr = magicAdIPCCgiCallbackData.f53149e;
            if (bArr != null) {
                try {
                    m93Var2.parseFrom(bArr);
                    m93Var = m93Var2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
                if (m93Var == null && m93Var.getInteger(0) == 0) {
                    wj.j0.wi(j0Var, t0Var, u0Var, str, wj.o.f446453d, "0", m93Var);
                    return;
                }
                if (m93Var != null || (r8 = java.lang.Integer.valueOf(m93Var.getInteger(0)).toString()) == null) {
                    java.lang.String str2 = "null";
                }
                wj.j0.wi(j0Var, t0Var, u0Var, str, wj.o.f446454e, str2, m93Var);
            }
            m93Var = null;
            if (m93Var == null) {
            }
            if (m93Var != null) {
            }
            java.lang.String str22 = "null";
            wj.j0.wi(j0Var, t0Var, u0Var, str, wj.o.f446454e, str22, m93Var);
        }
    }
}
