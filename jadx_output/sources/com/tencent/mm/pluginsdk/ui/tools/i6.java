package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes11.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI f191717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI qBFileShareProxyUI) {
        super(0);
        this.f191717d = qBFileShareProxyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f191717d.getIntent().getStringExtra("file_name");
        if (stringExtra != null) {
            return stringExtra;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.QBFileShareProxyUI", "fileName null?");
        return "";
    }
}
