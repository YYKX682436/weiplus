package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class z implements ot0.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.h0 f201587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201588e;

    public z(com.tencent.mm.ui.chatting.gallery.h0 h0Var, com.tencent.mm.storage.f9 f9Var) {
        this.f201587d = h0Var;
        this.f201588e = f9Var;
    }

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return false;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 job) {
        kotlin.jvm.internal.o.g(job, "job");
    }

    @Override // ot0.f3
    public void f2(ot0.e3 job) {
        kotlin.jvm.internal.o.g(job, "job");
    }

    @Override // ot0.f3
    public void k6(ot0.e3 job) {
        com.tencent.mm.storage.f9 f9Var;
        kotlin.jvm.internal.o.g(job, "job");
        if (job == ot0.e3.del) {
            com.tencent.mm.ui.chatting.gallery.h0 h0Var = this.f201587d;
            java.util.Iterator it = ((java.util.ArrayList) h0Var.f200974g).iterator();
            int i17 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                f9Var = this.f201588e;
                if (!hasNext) {
                    i17 = -1;
                    break;
                }
                com.tencent.mm.storage.f9 f9Var2 = ((zb5.c) it.next()).f471309b;
                if (f9Var2 != null && f9Var2.getMsgId() == f9Var.getMsgId()) {
                    break;
                } else {
                    i17++;
                }
            }
            ((java.util.ArrayList) h0Var.f200974g).removeIf(new com.tencent.mm.ui.chatting.gallery.x(f9Var));
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.chatting.gallery.y(h0Var, i17));
            com.tencent.mars.xlog.Log.i("EmojiHistoryListAdapter", "[handleDel] msg with msgId: " + f9Var.getMsgId() + " removed");
            if (h0Var.f200973f) {
                return;
            }
            android.content.Context context = h0Var.f200971d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((ee5.h0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(ee5.h0.class)).P6(new ae5.j(null, null, null, null, null, null, null, null, f9Var.getMsgId(), null, null, 0L, 3839, null));
        }
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}
