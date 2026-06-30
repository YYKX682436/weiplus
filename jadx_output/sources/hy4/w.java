package hy4;

/* loaded from: classes8.dex */
public final class w implements ik1.k0 {

    /* renamed from: f, reason: collision with root package name */
    public static final hy4.v f286200f = new hy4.v(null);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f286201g = jz5.h.b(hy4.u.f286199d);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f286202d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f286203e;

    public w(android.content.Context mContext) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f286202d = mContext;
        this.f286203e = "";
    }

    @Override // ik1.k0
    public java.lang.String identity() {
        return " MicroMessenger/";
    }

    @Override // ik1.k0
    public java.lang.String version() {
        android.content.pm.PackageInfo packageInfo;
        if (!android.text.TextUtils.isEmpty(this.f286203e)) {
            return this.f286203e;
        }
        try {
            packageInfo = ik1.b.a(this.f286202d, com.tencent.mm.sdk.platformtools.x2.f193072b);
        } catch (java.lang.Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f286203e += com.tencent.mm.sdk.platformtools.a0.a(null, o45.wf.f343029g);
            this.f286203e += '.' + packageInfo.versionCode;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f286203e);
            sb6.append('(');
            java.lang.String format = java.lang.String.format("0x%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            sb6.append(format);
            sb6.append("; MicroMessenger/Prefetcher 2.0)");
            this.f286203e = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(this.f286203e);
            sb7.append(" WeChat/");
            sb7.append(wo.w0.q() ? "arm64" : "arm32");
            this.f286203e = sb7.toString();
            java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
            com.tencent.mm.sdk.platformtools.z8 z8Var = yp5.a.f464409a;
            this.f286203e += " Weixin";
            if (com.tencent.mm.sdk.platformtools.a0.c()) {
                this.f286203e += " GPVersion/1";
            }
        }
        java.lang.String str2 = this.f286203e;
        if (com.tencent.mm.ui.bk.A()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.contains("Android Tablet")) {
                str2 = str2.concat(" Android Tablet");
            }
        }
        kotlin.jvm.internal.o.f(str2, "appendTabletTag(...)");
        this.f286203e = str2;
        return str2;
    }
}
