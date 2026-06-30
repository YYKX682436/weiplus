package lk5;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASActivity f319035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.ui.vas.VASActivity vASActivity) {
        super(0);
        this.f319035d = vASActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        uk5.f fVar = com.tencent.mm.ui.MMFragmentActivity.aReporter;
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f319035d;
        fVar.c(vASActivity.getIntent(), java.lang.System.currentTimeMillis());
        com.tencent.mm.ui.MMFragmentActivity.aReporter.a(vASActivity.getIntent());
        return jz5.f0.f302826a;
    }
}
