package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.playlist.s1 s1Var) {
        super(0);
        this.f122420d = s1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f122420d.i().getStringExtra("key_from_user_name");
        return stringExtra == null ? "" : stringExtra;
    }
}
