package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f144575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f144577g;

    public x(com.tencent.mm.plugin.lite.w wVar, java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        this.f144574d = str;
        this.f144575e = i17;
        this.f144576f = str2;
        this.f144577g = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = ((java.util.HashSet) com.tencent.mm.plugin.lite.w.f144513p).iterator();
        while (it.hasNext()) {
            ((q80.a0) it.next()).onStoreSendResult(this.f144574d, this.f144575e, this.f144576f, this.f144577g);
        }
    }
}
