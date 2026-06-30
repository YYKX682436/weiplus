package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f144579e;

    public y(com.tencent.mm.plugin.lite.w wVar, java.lang.String str, java.util.Map map) {
        this.f144578d = str;
        this.f144579e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = ((java.util.HashSet) com.tencent.mm.plugin.lite.w.f144513p).iterator();
        while (it.hasNext()) {
            ((q80.a0) it.next()).onStoreSetData(this.f144578d, this.f144579e);
        }
    }
}
