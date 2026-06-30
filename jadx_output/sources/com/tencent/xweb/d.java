package com.tencent.xweb;

/* loaded from: classes8.dex */
public class d implements tx5.b {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.xweb.d f220235b;

    /* renamed from: a, reason: collision with root package name */
    public tx5.b f220236a;

    public static synchronized com.tencent.xweb.d g() {
        com.tencent.xweb.d dVar;
        synchronized (com.tencent.xweb.d.class) {
            if (f220235b == null) {
                f220235b = new com.tencent.xweb.d();
            }
            dVar = f220235b;
        }
        return dVar;
    }

    @Override // tx5.b
    public java.lang.String a(java.lang.String str) {
        tx5.b bVar = this.f220236a;
        if (bVar != null) {
            return bVar.a(str);
        }
        return null;
    }

    @Override // tx5.b
    public void b(java.lang.String str, java.lang.String str2) {
        tx5.b bVar = this.f220236a;
        if (bVar != null) {
            bVar.b(str, str2);
        }
    }

    @Override // tx5.b
    public void c() {
        tx5.b bVar = this.f220236a;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // tx5.b
    public synchronized void d(boolean z17) {
        tx5.b bVar = this.f220236a;
        if (bVar != null) {
            bVar.d(z17);
        }
    }

    @Override // tx5.b
    public void e() {
        tx5.b bVar = this.f220236a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // tx5.b
    public void f(com.tencent.xweb.WebView webView, boolean z17) {
        tx5.b bVar = this.f220236a;
        if (bVar != null) {
            bVar.f(webView, z17);
        }
    }

    @Override // tx5.b
    public void flush() {
        tx5.b bVar = this.f220236a;
        if (bVar != null) {
            bVar.flush();
        }
    }
}
