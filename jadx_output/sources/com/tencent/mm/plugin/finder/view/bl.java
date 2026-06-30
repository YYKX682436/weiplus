package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class bl extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f131727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(android.animation.AnimatorSet animatorSet) {
        super(1);
        this.f131727d = animatorSet;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        try {
            this.f131727d.cancel();
        } catch (java.lang.Exception unused) {
        }
        return jz5.f0.f302826a;
    }
}
