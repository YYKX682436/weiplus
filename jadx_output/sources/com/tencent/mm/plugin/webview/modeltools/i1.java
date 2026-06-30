package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f183288a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f183289b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f183290c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f183291d = new java.util.HashMap();

    public void a(int i17, java.lang.String str) {
        boolean y17 = com.tencent.mm.sdk.platformtools.t8.y(str, false);
        java.util.HashSet hashSet = this.f183290c;
        if (y17) {
            hashSet.add(java.lang.Integer.valueOf(i17));
        } else {
            hashSet.remove(java.lang.Integer.valueOf(i17));
        }
    }
}
