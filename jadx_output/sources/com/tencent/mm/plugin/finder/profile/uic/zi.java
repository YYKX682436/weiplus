package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class zi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f124434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        super(0);
        this.f124434d = dkVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f124434d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class)).T6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
