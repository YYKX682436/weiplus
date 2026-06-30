package mq2;

/* loaded from: classes15.dex */
public final class w implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC f330766d;

    public w(com.tencent.mm.plugin.finder.nearby.person.NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f330766d = nearbyPersonV1UIC;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        java.lang.Object obj = this.f330766d.f330723e;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
        d17.d((com.tencent.mm.modelbase.m1) obj);
    }
}
