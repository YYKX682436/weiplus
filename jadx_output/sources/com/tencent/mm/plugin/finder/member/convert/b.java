package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.convert.c f121128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.member.convert.c cVar) {
        super(0);
        this.f121128d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.member.convert.c cVar = this.f121128d;
        boolean z17 = cVar.f121132d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = cVar.f121130b;
        return java.lang.Integer.valueOf(z17 ? ym5.x.a(appCompatActivity, 1.0f) : ym5.x.a(appCompatActivity, 8.0f));
    }
}
