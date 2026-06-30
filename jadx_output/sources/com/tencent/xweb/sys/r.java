package com.tencent.xweb.sys;

/* loaded from: classes8.dex */
public class r implements tx5.e {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.WebStorage f220569a;

    public r() {
        by5.c4.c("SysWebStorage", "SysWebStorage, Default.");
        this.f220569a = android.webkit.WebStorage.getInstance();
    }

    @Override // tx5.e
    public void a() {
        this.f220569a.deleteAllData();
    }

    @Override // tx5.e
    public void b(java.lang.String str) {
        this.f220569a.deleteOrigin(str);
    }

    public r(android.webkit.WebStorage webStorage) {
        this.f220569a = webStorage;
    }
}
