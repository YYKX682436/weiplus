package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f180924a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f180925b = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f180926c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f180927d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f180928e;

    public m() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BankcardLogoReadyEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BankcardLogoReadyEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$1
            {
                this.__eventId = 585646942;
            }

            /* JADX WARN: Code restructure failed: missing block: B:75:0x0114, code lost:
            
                r1.unlock();
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0117, code lost:
            
                return true;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.BankcardLogoReadyEvent r8) {
                /*
                    Method dump skipped, instructions count: 281
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f180926c = iListener;
        iListener.alive();
    }

    public void a() {
        this.f180926c.dead();
        java.util.ArrayList arrayList = this.f180924a;
        if (arrayList != null) {
            arrayList.clear();
            this.f180924a = null;
        }
    }

    public boolean b(android.content.Context context, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        at4.k c17 = c01.z1.I() ? dt4.b.c(context, bankcard.field_bankName, false) : dt4.b.c(context, bankcard.field_bankcardType, bankcard.F0());
        return (c17 == null || c17.f13884g) ? false : true;
    }

    public void c(android.content.Context context, java.util.List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = list.size();
        this.f180927d = new java.util.LinkedList();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) list.get(i17);
            if (bankcard.v0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankcardLogoHelper", "ignore balance");
            } else if (!b(context, bankcard)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankcardLogoHelper", bankcard.field_bankcardType + "'s url is null or need update");
                this.f180927d.add(bankcard.field_bankcardType);
            }
        }
        if (this.f180927d.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankcardLogoHelper", "use cache bankcard logo data");
            new com.tencent.mm.autogen.events.BankcardLogoReadyEvent().e();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankcardLogoHelper", "doScene to get bankcard logo");
        ss4.f fVar = new ss4.f(this.f180927d);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1650, new com.tencent.mm.plugin.wallet_core.utils.e(this, context));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(fVar);
    }

    public void d(android.content.Context context, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, android.widget.ImageView imageView, android.view.View view, android.widget.ImageView imageView2, android.widget.TextView textView) {
        com.tencent.mm.plugin.wallet_core.utils.l lVar = new com.tencent.mm.plugin.wallet_core.utils.l();
        lVar.f180920m = false;
        lVar.f180914d = bankcard;
        if (imageView != null) {
            imageView.setTag(com.tencent.mm.R.id.pbo, bankcard.field_bankcardType);
            lVar.f180915e = new java.lang.ref.WeakReference(imageView);
        }
        if (view != null) {
            lVar.f180916f = new java.lang.ref.WeakReference(view);
        }
        if (imageView2 != null) {
            lVar.f180917g = new java.lang.ref.WeakReference(imageView2);
        }
        if (textView != null) {
            lVar.f180918h = new java.lang.ref.WeakReference(textView);
        }
        this.f180924a.add(lVar);
        java.lang.String str = c01.z1.I() ? bankcard.field_bankName : bankcard.field_bankcardType;
        java.util.LinkedList linkedList = this.f180927d;
        if (linkedList != null && linkedList.contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankcardLogoHelper", "waiting resp:" + str);
        } else {
            if (b(context, bankcard)) {
                new com.tencent.mm.autogen.events.BankcardLogoReadyEvent().e();
                return;
            }
            if (this.f180928e == null) {
                this.f180928e = new java.util.LinkedList();
            }
            this.f180928e.add(bankcard);
            if (this.f180927d == null) {
                c(context, this.f180928e);
            }
        }
    }

    public void e(android.content.Context context, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, android.widget.ImageView imageView) {
        d(context, bankcard, imageView, null, null, null);
    }

    public void f(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, android.widget.ImageView imageView) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.wallet_core.utils.l lVar = new com.tencent.mm.plugin.wallet_core.utils.l();
        lVar.f180914d = bankcard;
        if (imageView != null) {
            imageView.setTag(com.tencent.mm.R.id.pbo, bankcard.field_bankcardType);
            lVar.f180915e = new java.lang.ref.WeakReference(imageView);
        }
        at4.k kVar = bankcard.f179562a3;
        if (kVar == null || (weakReference = lVar.f180915e) == null || weakReference.get() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BankcardLogoHelper", "bankUrls == null");
            return;
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) lVar.f180915e.get();
        if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.f13878a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BankcardLogoHelper", "bankcard logoUrl == null");
            return;
        }
        lVar.f180919i = kVar.f13878a;
        lVar.f180920m = true;
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        gt4.c1 c1Var = new gt4.c1(kVar.f13878a);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
        if (d17 != null) {
            imageView2.setImageBitmap(d17);
        }
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(lVar);
    }
}
