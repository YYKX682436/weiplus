package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class t1 {

    /* renamed from: n, reason: collision with root package name */
    public static com.tencent.mm.smiley.t1 f193376n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f193377o;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String[] f193384a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f193385b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f193386c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f193387d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f193388e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f193389f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f193390g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f193391h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f193392i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public boolean f193393j = true;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.smiley.m1 f193394k = new com.tencent.mm.smiley.m1();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f193395l = true;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.smiley.n1 f193375m = new com.tencent.mm.smiley.n1(null);

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f193378p = lp0.b.h() + "emoji/newemoji/";

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f193379q = lp0.b.h() + "emoji/qqemoji/";

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f193380r = "assets:///newemoji/";

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f193381s = "assets:///emoji/qqemoji/";

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f193382t = "config.conf";

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f193383u = "newemoji-config.xml";

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t1(android.content.Context r19, kotlin.jvm.internal.i r20) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.t1.<init>(android.content.Context, kotlin.jvm.internal.i):void");
    }

    public static final com.tencent.mm.smiley.t1 a() {
        return f193375m.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.t1.b(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final android.graphics.drawable.Drawable c(int i17) {
        java.lang.String str = i17 + ".wxam";
        gr.q.f274676a.getClass();
        android.graphics.Bitmap c17 = gr.q.f274677b.c(str);
        if (c17 == null) {
            byte[] N = com.tencent.mm.vfs.w6.N("assets:///emoji/qqemoji/" + str, 0, -1);
            com.tencent.mm.emoji.decode.MMGIFJNIFactory.Companion companion = com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE;
            boolean z17 = this.f193395l;
            c17 = companion.decodeThumb(N, str, z17);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QQSmileyManager", "qqemoji decoder error");
            } else {
                gr.q.f274676a.getClass();
                gr.q.f274677b.e(str, z17, c17);
            }
        }
        return new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), c17);
    }

    public final com.tencent.mm.smiley.h1 d(java.lang.CharSequence charSequence, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            return null;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        this.f193394k.b(charSequence, i17, -1, new com.tencent.mm.smiley.q1(i17, h0Var));
        return (com.tencent.mm.smiley.h1) h0Var.f310123d;
    }

    public final android.graphics.drawable.Drawable e(com.tencent.mm.smiley.h1 item) {
        kotlin.jvm.internal.o.g(item, "item");
        int i17 = item.f193266a;
        return i17 >= 0 ? c(i17) : b(item.f193269d);
    }

    public final com.tencent.mm.storage.emotion.SmileyInfo f(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.storage.emotion.SmileyInfo smileyInfo = (com.tencent.mm.storage.emotion.SmileyInfo) this.f193391h.get(key);
        if (smileyInfo == null) {
            smileyInfo = (com.tencent.mm.storage.emotion.SmileyInfo) this.f193392i.get(key);
        }
        if (smileyInfo != null) {
            return smileyInfo;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", "getSmileyInfo failed. smiley map no contains key:%s", r26.i0.t(key, "\\", "\\\\", false));
        return null;
    }

    public final synchronized void g(boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f193394k = new com.tencent.mm.smiley.m1();
        java.util.Collection<com.tencent.mm.storage.emotion.SmileyInfo> values = this.f193391h.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (com.tencent.mm.storage.emotion.SmileyInfo smileyInfo : values) {
            com.tencent.mm.smiley.m1 m1Var = this.f193394k;
            int i17 = smileyInfo.field_position;
            java.lang.String field_key = smileyInfo.field_key;
            kotlin.jvm.internal.o.f(field_key, "field_key");
            java.lang.String field_key2 = smileyInfo.field_key;
            kotlin.jvm.internal.o.f(field_key2, "field_key");
            m1Var.a(new com.tencent.mm.smiley.h1(i17, field_key, field_key2, smileyInfo.field_fileName));
            com.tencent.mm.smiley.m1 m1Var2 = this.f193394k;
            int i18 = smileyInfo.field_position;
            java.lang.String field_key3 = smileyInfo.field_key;
            kotlin.jvm.internal.o.f(field_key3, "field_key");
            java.lang.String field_qqValue = smileyInfo.field_qqValue;
            kotlin.jvm.internal.o.f(field_qqValue, "field_qqValue");
            m1Var2.a(new com.tencent.mm.smiley.h1(i18, field_key3, field_qqValue, smileyInfo.field_fileName));
            com.tencent.mm.smiley.m1 m1Var3 = this.f193394k;
            int i19 = smileyInfo.field_position;
            java.lang.String field_key4 = smileyInfo.field_key;
            kotlin.jvm.internal.o.f(field_key4, "field_key");
            java.lang.String field_cnValue = smileyInfo.field_cnValue;
            kotlin.jvm.internal.o.f(field_cnValue, "field_cnValue");
            m1Var3.a(new com.tencent.mm.smiley.h1(i19, field_key4, field_cnValue, smileyInfo.field_fileName));
            com.tencent.mm.smiley.m1 m1Var4 = this.f193394k;
            int i27 = smileyInfo.field_position;
            java.lang.String field_key5 = smileyInfo.field_key;
            kotlin.jvm.internal.o.f(field_key5, "field_key");
            java.lang.String field_twValue = smileyInfo.field_twValue;
            kotlin.jvm.internal.o.f(field_twValue, "field_twValue");
            m1Var4.a(new com.tencent.mm.smiley.h1(i27, field_key5, field_twValue, smileyInfo.field_fileName));
            com.tencent.mm.smiley.m1 m1Var5 = this.f193394k;
            int i28 = smileyInfo.field_position;
            java.lang.String field_key6 = smileyInfo.field_key;
            kotlin.jvm.internal.o.f(field_key6, "field_key");
            java.lang.String field_enValue = smileyInfo.field_enValue;
            kotlin.jvm.internal.o.f(field_enValue, "field_enValue");
            m1Var5.a(new com.tencent.mm.smiley.h1(i28, field_key6, field_enValue, smileyInfo.field_fileName));
            com.tencent.mm.smiley.m1 m1Var6 = this.f193394k;
            int i29 = smileyInfo.field_position;
            java.lang.String field_key7 = smileyInfo.field_key;
            kotlin.jvm.internal.o.f(field_key7, "field_key");
            java.lang.String field_thValue = smileyInfo.field_thValue;
            kotlin.jvm.internal.o.f(field_thValue, "field_thValue");
            m1Var6.a(new com.tencent.mm.smiley.h1(i29, field_key7, field_thValue, smileyInfo.field_fileName));
        }
        this.f193392i.clear();
        if (!z17) {
            gr.q.f274676a.getClass();
            gr.q.f274677b.a(this.f193395l);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f193378p;
        sb6.append(str);
        java.lang.String str2 = f193382t;
        sb6.append(str2);
        int d17 = rr.t.d(sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String str3 = f193380r;
        sb7.append(str3);
        sb7.append(str2);
        int d18 = rr.t.d(sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(str);
        java.lang.String str4 = f193383u;
        sb8.append(str4);
        java.lang.String sb9 = sb8.toString();
        java.lang.String str5 = str3 + str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", "updateSmiley: local:%s, asset:%s", java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(d18));
        if (d17 <= 0 || d17 < d18 || !com.tencent.mm.vfs.w6.j(sb9)) {
            this.f193390g = new java.util.ArrayList();
        } else {
            this.f193393j = false;
            java.util.ArrayList c17 = rr.t.c(new com.tencent.mm.vfs.r6(sb9));
            this.f193390g = c17;
            com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", "updateSmiley: local size: %s", java.lang.Integer.valueOf(c17.size()));
        }
        if (this.f193390g.size() <= 0) {
            this.f193393j = true;
            java.util.ArrayList c18 = rr.t.c(new com.tencent.mm.vfs.r6(str5));
            this.f193390g = c18;
            com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", "updateSmiley: asset size: %s", java.lang.Integer.valueOf(c18.size()));
        }
        for (com.tencent.mm.storage.emotion.SmileyInfo smileyInfo2 : this.f193390g) {
            java.util.HashMap hashMap = this.f193392i;
            java.lang.String field_key8 = smileyInfo2.field_key;
            kotlin.jvm.internal.o.f(field_key8, "field_key");
            hashMap.put(field_key8, smileyInfo2);
            com.tencent.mm.smiley.m1 m1Var7 = this.f193394k;
            int i37 = smileyInfo2.field_position;
            java.lang.String field_key9 = smileyInfo2.field_key;
            kotlin.jvm.internal.o.f(field_key9, "field_key");
            java.lang.String field_key10 = smileyInfo2.field_key;
            kotlin.jvm.internal.o.f(field_key10, "field_key");
            m1Var7.a(new com.tencent.mm.smiley.h1(i37, field_key9, field_key10, smileyInfo2.field_fileName));
            com.tencent.mm.smiley.m1 m1Var8 = this.f193394k;
            int i38 = smileyInfo2.field_position;
            java.lang.String field_key11 = smileyInfo2.field_key;
            kotlin.jvm.internal.o.f(field_key11, "field_key");
            java.lang.String field_qqValue2 = smileyInfo2.field_qqValue;
            kotlin.jvm.internal.o.f(field_qqValue2, "field_qqValue");
            m1Var8.a(new com.tencent.mm.smiley.h1(i38, field_key11, field_qqValue2, smileyInfo2.field_fileName));
            com.tencent.mm.smiley.m1 m1Var9 = this.f193394k;
            int i39 = smileyInfo2.field_position;
            java.lang.String field_key12 = smileyInfo2.field_key;
            kotlin.jvm.internal.o.f(field_key12, "field_key");
            java.lang.String field_cnValue2 = smileyInfo2.field_cnValue;
            kotlin.jvm.internal.o.f(field_cnValue2, "field_cnValue");
            m1Var9.a(new com.tencent.mm.smiley.h1(i39, field_key12, field_cnValue2, smileyInfo2.field_fileName));
            com.tencent.mm.smiley.m1 m1Var10 = this.f193394k;
            int i47 = smileyInfo2.field_position;
            java.lang.String field_key13 = smileyInfo2.field_key;
            kotlin.jvm.internal.o.f(field_key13, "field_key");
            java.lang.String field_twValue2 = smileyInfo2.field_twValue;
            kotlin.jvm.internal.o.f(field_twValue2, "field_twValue");
            m1Var10.a(new com.tencent.mm.smiley.h1(i47, field_key13, field_twValue2, smileyInfo2.field_fileName));
            com.tencent.mm.smiley.m1 m1Var11 = this.f193394k;
            int i48 = smileyInfo2.field_position;
            java.lang.String field_key14 = smileyInfo2.field_key;
            kotlin.jvm.internal.o.f(field_key14, "field_key");
            java.lang.String field_enValue2 = smileyInfo2.field_enValue;
            kotlin.jvm.internal.o.f(field_enValue2, "field_enValue");
            m1Var11.a(new com.tencent.mm.smiley.h1(i48, field_key14, field_enValue2, smileyInfo2.field_fileName));
            com.tencent.mm.smiley.m1 m1Var12 = this.f193394k;
            int i49 = smileyInfo2.field_position;
            java.lang.String field_key15 = smileyInfo2.field_key;
            kotlin.jvm.internal.o.f(field_key15, "field_key");
            java.lang.String field_thValue2 = smileyInfo2.field_thValue;
            kotlin.jvm.internal.o.f(field_thValue2, "field_thValue");
            m1Var12.a(new com.tencent.mm.smiley.h1(i49, field_key15, field_thValue2, smileyInfo2.field_fileName));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", "updateSmiley end use time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
