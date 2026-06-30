package nx1;

/* loaded from: classes10.dex */
public class n extends java.lang.Thread implements java.lang.Runnable {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f341301r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.Object f341302s = new byte[0];

    /* renamed from: t, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.i6 f341303t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f341304d;

    /* renamed from: i, reason: collision with root package name */
    public final nx1.o f341309i;

    /* renamed from: m, reason: collision with root package name */
    public final ix1.i f341310m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f341311n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f341312o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.z2 f341313p = new com.tencent.mm.pluginsdk.model.z2();

    /* renamed from: q, reason: collision with root package name */
    public boolean f341314q = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f341305e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f341306f = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f341308h = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f341307g = new java.util.ArrayList();

    public n(java.util.List list, java.lang.String str, java.lang.String str2, ix1.i iVar, nx1.o oVar) {
        this.f341304d = list;
        this.f341309i = oVar;
        this.f341310m = iVar;
        this.f341312o = str2;
        this.f341311n = str;
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2, int i18, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, android.content.Context context, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompress", "finish to import %s to %s | ret %d | duration %d", str2, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            ((java.util.ArrayList) this.f341305e).add(java.lang.Integer.valueOf(i17));
            ((java.util.ArrayList) this.f341306f).add(str);
            ((java.util.ArrayList) this.f341307g).add(str2);
            ((java.util.ArrayList) this.f341308h).add(java.lang.Integer.valueOf(i18));
        }
        if (i17 != -50002 && i17 != -50008) {
            if (i17 == -50006) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EditorVideoCompress", "do insertVideoStorage, but file name is null");
                } else {
                    t21.v2 v2Var = new t21.v2();
                    v2Var.f415000a = str;
                    v2Var.f415015m = 1;
                    v2Var.f415019q = null;
                    v2Var.f415021s = (java.lang.String) gm0.j1.u().c().l(2, "");
                    v2Var.f415012j = com.tencent.mm.sdk.platformtools.t8.i1();
                    v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
                    v2Var.f415025w = null;
                    v2Var.f415024v = str2;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        v2Var.f415022t = 1;
                    }
                    v2Var.f415008f = 0;
                    t21.o2.Ui().x(v2Var, true);
                }
                if (f341303t == null) {
                    f341303t = new com.tencent.mm.sdk.platformtools.i6(10, "remuxing-thread-" + java.lang.System.currentTimeMillis(), 1, android.os.Looper.getMainLooper());
                }
                nx1.m mVar = new nx1.m(null);
                synchronized (f341302s) {
                    f341301r.put(str, mVar);
                }
                mVar.f189224d = str;
                mVar.f189225e = str2;
                mVar.f189226f = this.f341312o;
                mVar.f189231n = videoTransPara;
                mVar.f189229i = 1;
                mVar.f341300z = this.f341309i;
                mVar.f341299y = this.f341310m;
                mVar.f189239v = com.tencent.mm.modelvideoh265toh264.j.h(str2);
                new java.util.ArrayList();
                new java.util.ArrayList();
                mVar.f189232o = this.f341313p.f189509a;
                f341303t.a(mVar);
            } else if (i17 >= 0) {
                this.f341314q = true;
            }
        }
        if (this.f341309i != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new nx1.l(this, i17, str3));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|(2:10|(8:12|13|14|15|(1:17)(1:139)|18|(2:20|21)(4:23|(4:25|(1:27)(2:86|(1:88)(6:89|(1:91)(1:131)|92|(6:119|(1:121)|122|(1:124)|(1:130)(1:128)|129)(1:95)|96|(2:115|(2:117|29)(3:118|102|29))(2:99|(3:101|102|29)(4:103|(1:105)(4:107|(1:109)(1:114)|(1:111)(1:113)|112)|106|29))))|28|29)(5:132|(1:134)|135|(1:137)|138)|30|31)|22))|143|13|14|15|(0)(0)|18|(0)(0)|22|6) */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00c2, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditorVideoCompress", r0, "", new java.lang.Object[r11]);
        r0 = null;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x02bc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x039e  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.n.run():void");
    }
}
