package ib0;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.ui.OpenMsgHalfScreenDialog f290032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.feature.openmsg.ui.OpenMsgHalfScreenDialog openMsgHalfScreenDialog, android.content.Context context) {
        super(0);
        this.f290032d = openMsgHalfScreenDialog;
        this.f290033e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.feature.openmsg.ui.OpenMsgHalfScreenDialog.H;
        return java.lang.Integer.valueOf(((int) (this.f290032d.w0() * 0.6d)) - com.tencent.mm.ui.bl.c(this.f290033e));
    }
}
