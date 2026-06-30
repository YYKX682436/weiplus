package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes11.dex */
public final class r6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI f191879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI qBFileShareProxyUI) {
        super(0);
        this.f191879d = qBFileShareProxyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f191879d.getIntent().getStringExtra("to_user");
        if (stringExtra != null) {
            return stringExtra;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.QBFileShareProxyUI", "username null?");
        return "";
    }
}
