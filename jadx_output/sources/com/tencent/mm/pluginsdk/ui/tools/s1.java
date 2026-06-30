package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public abstract class s1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.a2 f191883d;

    /* renamed from: e, reason: collision with root package name */
    public int f191884e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f191885f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f191886g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191887h;

    /* renamed from: i, reason: collision with root package name */
    public int f191888i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f191889m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191890n;

    public s1(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI, com.tencent.mm.pluginsdk.ui.tools.a2 adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f191890n = fileSelectorUI;
        this.f191883d = adapter;
        this.f191884e = 100;
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.o.f(synchronizedList, "synchronizedList(...)");
        this.f191885f = synchronizedList;
        java.util.List synchronizedList2 = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.o.f(synchronizedList2, "synchronizedList(...)");
        this.f191886g = synchronizedList2;
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        this.f191889m = r17;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String string;
        java.lang.String r17 = c01.z1.r();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191890n;
        if (K0 || kotlin.jvm.internal.o.b(str, r17)) {
            string = fileSelectorUI.getString(com.tencent.mm.R.string.h5m);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            string = c01.a2.e(str);
        }
        java.lang.String string2 = fileSelectorUI.getString(com.tencent.mm.R.string.f490891b65, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    public final java.lang.CharSequence b(java.lang.String str, java.lang.CharSequence charSequence) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        int I = r26.n0.I(charSequence, str, 0, true);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.plugin.fts.ui.c.f138023a), I, str.length() + I, 33);
        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public final java.util.List c(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.List list = this.f191886g;
        list.clear();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(key);
        java.util.List<com.tencent.mm.pluginsdk.ui.tools.d2> list2 = this.f191885f;
        if (K0) {
            for (com.tencent.mm.pluginsdk.ui.tools.d2 d2Var : list2) {
                d2Var.f191563g = java.lang.String.valueOf(d2Var.f191563g);
                java.lang.String obj = d2Var.f191564h.toString();
                kotlin.jvm.internal.o.g(obj, "<set-?>");
                d2Var.f191564h = obj;
                list.add(d2Var.a());
            }
        } else {
            for (com.tencent.mm.pluginsdk.ui.tools.d2 d2Var2 : list2) {
                java.lang.CharSequence charSequence = d2Var2.f191563g;
                if (charSequence == null) {
                    charSequence = "";
                }
                boolean B = r26.n0.B(d2Var2.f191564h, key, true);
                boolean B2 = r26.n0.B(charSequence, key, true);
                if (B || B2) {
                    if (B) {
                        d2Var2.f191564h = b(key, d2Var2.f191564h);
                    }
                    if (B2) {
                        d2Var2.f191563g = b(key, charSequence);
                    }
                    list.add(d2Var2);
                }
            }
        }
        return list;
    }
}
