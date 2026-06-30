package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f183321a = new java.util.LinkedList();

    public final void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        synchronized (this.f183321a) {
            java.lang.String str2 = (java.lang.String) this.f183321a.peekLast();
            java.lang.String encode = java.net.URLEncoder.encode(str);
            if (str2 == null || !str2.equals(encode)) {
                this.f183321a.addLast(encode);
            }
            if (this.f183321a.size() > 10) {
                this.f183321a.removeFirst();
            }
        }
    }

    public java.lang.String[] b() {
        java.lang.String[] strArr;
        synchronized (this.f183321a) {
            strArr = new java.lang.String[this.f183321a.size()];
            java.util.Iterator it = this.f183321a.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                strArr[i17] = (java.lang.String) it.next();
                i17++;
            }
        }
        return strArr;
    }
}
