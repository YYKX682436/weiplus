package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class z4 {

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.storage.z4 f196391j = new com.tencent.mm.storage.z4();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f196393b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f196392a = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f196394c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f196395d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f196396e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f196397f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f196398g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f196399h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Comparator f196400i = new com.tencent.mm.storage.a5(this);

    public final void a(java.util.ArrayList arrayList, int i17) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z85.j jVar = (z85.j) it.next();
            java.lang.String str = jVar.field_desc;
            java.lang.String str2 = jVar.field_md5;
            java.lang.String str3 = jVar.field_lang;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                java.lang.String lowerCase = str.toLowerCase();
                java.util.HashMap hashMap = this.f196397f;
                if (hashMap.containsKey(lowerCase)) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap.get(lowerCase);
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    arrayList2.add(new com.tencent.mm.storage.c5(this, str2, i17, -1, -1));
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(new com.tencent.mm.storage.c5(this, str2, i17, -1, -1));
                    hashMap.put(lowerCase, arrayList3);
                }
                boolean equals = str3.equals(this.f196393b);
                java.util.HashMap hashMap2 = this.f196394c;
                if (equals) {
                    hashMap2.put(str2, lowerCase);
                } else if (str3.equals("default") && !hashMap2.containsKey(str2)) {
                    hashMap2.put(str2, lowerCase);
                }
            }
        }
    }

    public final void b() {
        java.util.HashMap hashMap = this.f196394c;
        if (hashMap != null) {
            hashMap.clear();
        }
        java.util.HashMap hashMap2 = this.f196395d;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        java.util.HashMap hashMap3 = this.f196396e;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
        synchronized (this) {
            this.f196397f.clear();
            this.f196398g.clear();
        }
    }

    public java.lang.String c(java.lang.String str) {
        java.util.HashMap hashMap = this.f196394c;
        if (hashMap != null && hashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "getCurLangDesc: from map");
            return (java.lang.String) hashMap.get(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "getCurLangDesc: from db");
        z85.k a17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().a();
        a17.getClass();
        java.lang.String format = java.lang.String.format("select %s from %s where %s=?", "desc", "EmojiInfoDesc", "md5_lang");
        java.lang.String[] strArr = {str + com.tencent.mm.sdk.platformtools.m2.d().toLowerCase()};
        l75.k0 k0Var = a17.f470805d;
        android.database.Cursor f17 = k0Var.f(format, strArr, 2);
        java.lang.String string = f17.moveToFirst() ? f17.getString(f17.getColumnIndex("desc")) : null;
        f17.close();
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            android.database.Cursor f18 = k0Var.f(format, new java.lang.String[]{str + "default"}, 2);
            if (f18.moveToFirst()) {
                string = f18.getString(f18.getColumnIndex("desc"));
            }
            f18.close();
        }
        return string;
    }

    public boolean d() {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_custom_emoji_recognition, false) || ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return false;
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.toUpperCase().equals("CN");
    }

    public boolean e() {
        return (!d() || com.tencent.mm.storage.h5.f195006d.wi() || (c01.z1.j() & 1152921504606846976L) == 0) ? false : true;
    }

    public final boolean f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f196398g.containsKey(str)) {
            return true;
        }
        if (this.f196399h <= 0 || str.length() > 32 || e()) {
            return false;
        }
        int a17 = com.tencent.mm.ui.tools.v4.a(str);
        return (a17 <= 0 || a17 != str.length()) ? str.length() + a17 >= this.f196399h * 2 : str.length() >= this.f196399h;
    }

    public void g() {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.storage.b5(this), "MicroMsg.emoji.EmojiDescNewMgr|newinit");
    }

    public void h(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiDescNewMgr", "setCustomEmotionRecognitionEnabled: enabled=" + z17);
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new z85.g0(z17, null), 3, null);
        long j17 = c01.z1.j();
        c01.z1.Q(java.lang.Long.valueOf(z17 ? j17 | 1152921504606846976L : j17 & (-1152921504606846977L)));
        g();
    }

    public final java.lang.String i(java.lang.String str) {
        java.lang.String replace = str.toLowerCase().replace(" ", "");
        if (replace == null) {
            return null;
        }
        char[] charArray = replace.toCharArray();
        for (int i17 = 0; i17 < charArray.length; i17++) {
            char c17 = charArray[i17];
            if (c17 == 12288) {
                charArray[i17] = ' ';
            } else if (c17 > 65280 && c17 < 65375) {
                charArray[i17] = (char) (c17 - 65248);
            }
        }
        return new java.lang.String(charArray);
    }
}
