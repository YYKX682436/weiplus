package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class s0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f144053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GetA8KeyRedirectEvent f144054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.t0 f144055c;

    public s0(com.tencent.mm.plugin.lite.logic.t0 t0Var, boolean z17, com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent) {
        this.f144055c = t0Var;
        this.f144053a = z17;
        this.f144054b = getA8KeyRedirectEvent;
    }

    @Override // q80.f0
    public void fail() {
        if (this.f144053a) {
            return;
        }
        com.tencent.mm.plugin.lite.logic.t0.b(this.f144055c, this.f144054b);
    }

    @Override // q80.f0
    public void success() {
        if (this.f144053a) {
            return;
        }
        com.tencent.mm.plugin.lite.logic.t0.b(this.f144055c, this.f144054b);
    }
}
