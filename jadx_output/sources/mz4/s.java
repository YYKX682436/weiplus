package mz4;

/* loaded from: classes10.dex */
public class s extends java.lang.Thread {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f333336r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.Object f333337s = new byte[0];

    /* renamed from: t, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.i6 f333338t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f333339d;

    /* renamed from: i, reason: collision with root package name */
    public final mz4.q f333344i;

    /* renamed from: m, reason: collision with root package name */
    public final iz4.k f333345m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f333346n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f333347o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f333348p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f333349q = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f333340e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f333341f = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f333343h = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f333342g = new java.util.ArrayList();

    public s(java.util.List list, java.lang.String str, java.lang.String str2, iz4.k kVar, mz4.q qVar) {
        this.f333339d = list;
        this.f333344i = qVar;
        this.f333345m = kVar;
        this.f333347o = str2;
        this.f333346n = str;
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2, int i18, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, android.content.Context context, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteVideoCompress", "finish to import %s to %s | ret %d | duration %d", str2, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            ((java.util.ArrayList) this.f333340e).add(java.lang.Integer.valueOf(i17));
            ((java.util.ArrayList) this.f333341f).add(str);
            ((java.util.ArrayList) this.f333342g).add(str2);
            ((java.util.ArrayList) this.f333343h).add(java.lang.Integer.valueOf(i18));
        }
        if (i17 == -50002) {
            com.tencent.mm.sdk.platformtools.u3.h(new mz4.p(this, context, context.getString(com.tencent.mm.R.string.k76)));
        } else if (i17 == -50008) {
            com.tencent.mm.sdk.platformtools.u3.h(new mz4.p(this, context, context.getString(com.tencent.mm.R.string.f493444k74)));
        } else if (i17 == -50006) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NoteVideoCompress", "do insertVideoStorage, but file name is null");
            } else {
                t21.v2 v2Var = new t21.v2();
                v2Var.f415000a = str;
                v2Var.f415015m = 1;
                v2Var.f415019q = null;
                v2Var.f415021s = (java.lang.String) c01.d9.b().p().l(2, "");
                v2Var.f415012j = com.tencent.mm.sdk.platformtools.t8.i1();
                v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
                v2Var.f415025w = null;
                v2Var.f415024v = str2;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    v2Var.f415022t = 1;
                }
                v2Var.f415008f = 0;
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().x(v2Var, true);
            }
            if (f333338t == null) {
                f333338t = new com.tencent.mm.sdk.platformtools.i6(5, "remuxing-thread-" + java.lang.System.currentTimeMillis(), 1, android.os.Looper.getMainLooper());
            }
            mz4.r rVar = new mz4.r(null);
            synchronized (f333337s) {
                f333336r.put(str, rVar);
            }
            rVar.f333326d = str;
            rVar.f333327e = str2;
            rVar.f333328f = this.f333347o;
            rVar.f333330h = videoTransPara;
            rVar.f333335p = this.f333344i;
            rVar.f333331i = this.f333345m;
            f333338t.a(rVar);
        } else if (i17 < 0) {
            com.tencent.mm.sdk.platformtools.u3.h(new mz4.p(this, context, context.getString(com.tencent.mm.R.string.f493445k75)));
        } else {
            this.f333349q = true;
        }
        if (this.f333344i == null || this.f333348p) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new mz4.o(this, str3, i17));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:10|(2:12|(8:14|15|16|17|(1:19)(1:118)|20|(2:22|23)(4:25|(3:27|(1:29)(4:87|(1:89)(2:92|(2:109|91)(2:96|(4:101|(1:103)(1:108)|(1:105)(1:107)|106)(1:100)))|90|91)|30)(4:110|(1:112)(1:117)|113|(1:115)(1:116))|31|32)|24))|122|15|16|17|(0)(0)|20|(0)(0)|24|6) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00c5, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NoteVideoCompress", r0, "", new java.lang.Object[r11]);
        r0 = null;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0224. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0302  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz4.s.run():void");
    }
}
