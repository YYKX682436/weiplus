package com.tencent.mm.ui.chatting.component;

/* loaded from: classes12.dex */
public class hc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ic f199160d;

    public hc(com.tencent.mm.ui.chatting.component.ic icVar) {
        this.f199160d = icVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.ic icVar = this.f199160d;
        sb5.z zVar = icVar.f199222b;
        long msgId = icVar.f199223c.getMsgId();
        com.tencent.mm.storage.f9 f9Var = icVar.f199223c;
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
        java.util.HashMap hashMap = (java.util.HashMap) kVar.Q;
        if (hashMap.containsKey(java.lang.Long.valueOf(msgId))) {
            if (((java.util.HashMap) kVar.R).containsKey(java.lang.Long.valueOf(msgId))) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(java.lang.Long.valueOf(msgId));
                android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
                if (view != null) {
                    java.lang.Object tag = view.getTag();
                    if (tag instanceof ze5.w6) {
                        ze5.w6 w6Var = (ze5.w6) tag;
                        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView chattingImgMvvmView = w6Var.f472284c;
                        android.app.Activity g17 = kVar.K.g();
                        kotlin.jvm.internal.o.f(g17, "getContext(...)");
                        java.lang.String z07 = f9Var != null ? f9Var.z0() : null;
                        if (z07 == null) {
                            z07 = "";
                        }
                        int i17 = !w6Var.chattingItem.M() ? 1 : 0;
                        chattingImgMvvmView.getClass();
                        j15.a ij6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).ij(f9Var);
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b1.Di().y4(f9Var, chattingImgMvvmView.getHolder().b(), z07, i65.a.g(g17), ij6.q(), ij6.n(), true, com.tencent.mm.R.drawable.bzt, chattingImgMvvmView.getHolder().c(), com.tencent.mm.R.drawable.f481147lw, i17, true, null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "msg not display, " + msgId);
    }
}
