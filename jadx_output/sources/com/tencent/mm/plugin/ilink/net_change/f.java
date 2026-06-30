package com.tencent.mm.plugin.ilink.net_change;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/ilink/net_change/f;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "a", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class f implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f142430d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.network.s0 f142431e = new com.tencent.mm.plugin.ilink.net_change.e();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/ilink/net_change/f$a;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes8.dex */
    public static final class a implements com.tencent.mm.ipcinvoker.j {
        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
            android.os.Bundle data = (android.os.Bundle) obj;
            kotlin.jvm.internal.o.g(data, "data");
            kotlin.jvm.internal.o.g(callback, "callback");
            if (!d83.e0.f226959b) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetworkChangeSubProcessImpl", "ilink not initialized, just return");
                return;
            }
            int i17 = data.getInt("newState", 0);
            com.tencent.ilink.IlinkContext.getInstance().networkChanged();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("err_code", 0);
            bundle.putString("err_desc", ya.b.SUCCESS);
            callback.a(bundle);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "invoke: IPCInvokeAsyncTask_OnNetworkChange " + i17);
        }
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        java.lang.String str;
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String string = data.getString("from_process", "");
        int i17 = -1;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            kotlin.jvm.internal.o.d(string);
            if (r26.i0.y(string, "com.tencent.mm", false)) {
                int i18 = data.getInt("opcode", -1);
                com.tencent.mm.network.s0 s0Var = f142431e;
                java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = f142430d;
                if (i18 == 0) {
                    copyOnWriteArraySet.add(string);
                    gm0.j1.n().a(s0Var);
                } else {
                    if (i18 != 1) {
                        i17 = -2;
                        str = "not valid op code";
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putInt("err_code", i17);
                        bundle.putString("err_desc", str);
                        callback.a(bundle);
                    }
                    gm0.j1.n().d(s0Var);
                    copyOnWriteArraySet.remove(string);
                }
                str = ya.b.SUCCESS;
                i17 = 0;
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("err_code", i17);
                bundle2.putString("err_desc", str);
                callback.a(bundle2);
            }
        }
        str = "invalid package name " + string;
        android.os.Bundle bundle22 = new android.os.Bundle();
        bundle22.putInt("err_code", i17);
        bundle22.putString("err_desc", str);
        callback.a(bundle22);
    }
}
