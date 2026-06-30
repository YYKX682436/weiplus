package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class gg implements r35.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f204036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f204037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot0.s0 f204038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f204040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.zf f204041f;

    public gg(com.tencent.mm.ui.chatting.viewitems.zf zfVar, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, ot0.s0 s0Var, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f204041f = zfVar;
        this.f204036a = weakReference;
        this.f204037b = weakReference2;
        this.f204038c = s0Var;
        this.f204039d = f9Var;
        this.f204040e = i17;
    }

    @Override // r35.q3
    public void onFinish() {
        java.lang.ref.WeakReference weakReference = this.f204036a;
        if (weakReference.get() != null) {
            java.lang.ref.WeakReference weakReference2 = this.f204037b;
            if (weakReference2.get() != null) {
                this.f204041f.r0((com.tencent.mm.ui.chatting.viewitems.qf) weakReference.get(), (com.tencent.mm.ui.chatting.viewitems.of) weakReference2.get(), this.f204038c, this.f204039d, this.f204040e, true);
            }
        }
    }

    @Override // r35.q3
    public void onStart() {
    }
}
