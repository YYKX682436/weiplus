package fm;

@j95.b(dependencies = {com.tencent.mm.udr.e0.class, bt.g1.class})
/* loaded from: classes13.dex */
public final class h extends i95.w implements k65.j {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f263991d = jz5.h.b(fm.g.f263987d);

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f263992e;

    /* renamed from: f, reason: collision with root package name */
    public long f263993f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f263994g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct Ai() {
        /*
            r7 = this;
            java.lang.String r0 = r7.Bi()
            java.lang.String r1 = r7.Di()
            com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct
            r2.<init>()
            gm0.m r3 = gm0.j1.b()
            boolean r3 = r3.n()
            r2.f58773d = r3
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.m2.f(r3)
            java.lang.String r4 = "userLanguage"
            r5 = 1
            java.lang.String r3 = r2.b(r4, r3, r5)
            r2.f58774e = r3
            java.util.Locale r3 = com.tencent.mm.sdk.platformtools.m2.f192848b
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "systemLanguage"
            java.lang.String r3 = r2.b(r4, r3, r5)
            r2.f58775f = r3
            java.lang.String r3 = "curResVersion"
            java.lang.String r4 = "96b2c56e4056b923191227d71602c0ce"
            java.lang.String r3 = r2.b(r3, r4, r5)
            r2.f58778i = r3
            int r3 = r0.length()
            r4 = 0
            if (r3 != 0) goto L49
            r3 = r5
            goto L4a
        L49:
            r3 = r4
        L4a:
            if (r3 != 0) goto L5a
            int r3 = r1.length()
            if (r3 != 0) goto L54
            r3 = r5
            goto L55
        L54:
            r3 = r4
        L55:
            if (r3 == 0) goto L58
            goto L5a
        L58:
            r3 = r5
            goto L5b
        L5a:
            r3 = r4
        L5b:
            r2.f58777h = r3
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            int r0 = r0.length()
            if (r0 != 0) goto L6a
            r0 = r5
            goto L6b
        L6a:
            r0 = r4
        L6b:
            java.lang.String r6 = "resourcePathEmpty"
            org.json.JSONObject r0 = r3.put(r6, r0)
            int r1 = r1.length()
            if (r1 != 0) goto L79
            goto L7a
        L79:
            r5 = r4
        L7a:
            java.lang.String r1 = "resourcePostPathEmpty"
            org.json.JSONObject r0 = r0.put(r1, r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.String r1 = ","
            java.lang.String r3 = ";"
            java.lang.String r0 = r26.i0.t(r0, r1, r3, r4)
            r2.p(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fm.h.Ai():com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct");
    }

    public java.lang.String Bi() {
        java.lang.String path;
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        k65.l lVar = k65.l.f304617a;
        k65.k[] kVarArr = k65.k.f304616d;
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_9f0a6b36", "mm_base_string_resource_96b2c56e4056b923191227d71602c0ce");
        return (Ui == null || (path = Ui.getPath()) == null) ? "" : path;
    }

    public java.lang.String Di() {
        java.lang.String c17;
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        k65.l lVar = k65.l.f304617a;
        k65.k[] kVarArr = k65.k.f304616d;
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_9f0a6b36", "mm_base_string_resource_96b2c56e4056b923191227d71602c0ce");
        return (Ui == null || (c17 = Ui.c()) == null) ? "" : c17;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        this.f263994g = true;
        com.tencent.mars.xlog.Log.i("BaseStringResFeatureService", "BaseStringResFeatureService onCreate");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object wi(java.lang.String r25, int r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm.h.wi(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
