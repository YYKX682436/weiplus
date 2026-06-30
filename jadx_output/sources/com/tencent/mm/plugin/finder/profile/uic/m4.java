package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(0);
        this.f123970d = finderProfileFeedUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f123970d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
