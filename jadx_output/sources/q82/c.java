package q82;

/* loaded from: classes12.dex */
public class c extends u13.g {
    public static final java.lang.String A = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fgj);
    public static final java.util.regex.Pattern B = java.util.regex.Pattern.compile("['\r\n' | '\n']+");
    public static final com.tencent.mm.sdk.platformtools.n3 C = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    public p13.y f360738q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f360739r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f360740s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f360741t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f360742u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f360743v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f360744w;

    /* renamed from: x, reason: collision with root package name */
    public int f360745x;

    /* renamed from: y, reason: collision with root package name */
    public final q82.b f360746y;

    /* renamed from: z, reason: collision with root package name */
    public final q82.a f360747z;

    public c(int i17) {
        super(6, i17);
        this.f360746y = new q82.b(this);
        this.f360747z = new q82.a(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:104:0x02df. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a8  */
    /* JADX WARN: Type inference failed for: r3v61, types: [java.lang.CharSequence] */
    @Override // u13.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r20, u13.e r21, java.lang.Object... r22) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q82.c.a(android.content.Context, u13.e, java.lang.Object[]):void");
    }

    @Override // u13.g
    public int j() {
        return this.f360738q.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f360746y;
    }

    public final java.lang.String o(android.content.Context context, com.tencent.mm.storage.z3 z3Var) {
        java.lang.String w07 = z3Var.w0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
            w07 = z3Var.P0();
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(w07) ? context.getString(com.tencent.mm.R.string.ffp) : w07;
    }

    public final java.lang.String p(com.tencent.mm.storage.z3 z3Var, boolean z17) {
        java.lang.String P0 = z17 ? com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0()) ? z3Var.P0() : z3Var.w0() : z3Var.P0();
        return com.tencent.mm.sdk.platformtools.t8.K0(P0) ? z3Var.d1() : P0;
    }
}
