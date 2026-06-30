package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.k.class)
/* loaded from: classes9.dex */
public final class s0 extends com.tencent.mm.ui.chatting.component.a implements yn.e, sb5.k {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.event.pending.UIPendingEventNotifier f199893f;

    /* renamed from: e, reason: collision with root package name */
    public final a75.b f199892e = new com.tencent.mm.ui.chatting.component.r0(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f199894g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f199895h = new java.util.LinkedHashMap();

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f199893f = null;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        if (this.f199893f == null && (this.f198580d.g() instanceof androidx.appcompat.app.AppCompatActivity)) {
            a75.b bVar = this.f199892e;
            android.app.Activity g17 = this.f198580d.g();
            kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            this.f199893f = new com.tencent.mm.sdk.event.pending.UIPendingEventNotifier(1000L, bVar, (androidx.appcompat.app.AppCompatActivity) g17);
        }
    }
}
