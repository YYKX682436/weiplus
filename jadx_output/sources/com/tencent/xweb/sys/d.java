package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class d extends com.tencent.xweb.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.WebResourceError f220550a;

    public d(android.webkit.WebResourceError webResourceError) {
        this.f220550a = webResourceError;
    }

    @Override // com.tencent.xweb.w0
    public java.lang.CharSequence a() {
        return this.f220550a.getDescription();
    }

    @Override // com.tencent.xweb.w0
    public int b() {
        return this.f220550a.getErrorCode();
    }
}
