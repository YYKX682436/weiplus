package org.chromium.base;

/* loaded from: classes16.dex */
public final /* synthetic */ class Promise$$c implements org.chromium.base.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.chromium.base.Promise f347709d;

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void lambda$bind$0(java.lang.Object obj) {
        this.f347709d.reject((java.lang.Exception) obj);
    }
}
