package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class rw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(0);
        this.f135837d = sxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.finder.viewmodel.component.qw(this.f135837d));
    }
}
