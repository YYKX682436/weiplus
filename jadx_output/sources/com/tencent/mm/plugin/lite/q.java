package com.tencent.mm.plugin.lite;

/* loaded from: classes11.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f144156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f144157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.s f144160h;

    public q(com.tencent.mm.plugin.lite.s sVar, long j17, int i17, java.lang.String str, java.lang.String str2) {
        this.f144160h = sVar;
        this.f144156d = j17;
        this.f144157e = i17;
        this.f144158f = str;
        this.f144159g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String format = java.lang.String.format("%d_%d", java.lang.Long.valueOf(this.f144156d), java.lang.Integer.valueOf(this.f144157e));
        com.tencent.mm.plugin.lite.s sVar = this.f144160h;
        ((java.util.HashSet) sVar.f144164a).add(format);
        if (sVar.f144167d.onDispatch(this.f144156d, this.f144158f, com.tencent.mm.plugin.lite.s.a(this.f144159g), this.f144157e)) {
            ((java.util.HashSet) sVar.f144164a).remove(format);
        } else if (((java.util.HashSet) sVar.f144164a).contains(format)) {
            ((java.util.HashSet) sVar.f144164a).remove(format);
            com.tencent.mm.plugin.lite.LiteAppCenter.storeSendResult(sVar.f144166c, this.f144156d, this.f144157e, "json", "null");
        }
    }
}
