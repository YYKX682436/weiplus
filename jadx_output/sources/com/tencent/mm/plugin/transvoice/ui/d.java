package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.e f175416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f175417e;

    public d(com.tencent.mm.plugin.transvoice.ui.e eVar, int i17) {
        this.f175416d = eVar;
        this.f175417e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog$updateSelectedType$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.transvoice.ui.e eVar = this.f175416d;
        eVar.f175422i = this.f175417e;
        eVar.D();
        com.tencent.mm.plugin.transvoice.ui.e eVar2 = this.f175416d;
        com.tencent.mm.plugin.transvoice.ui.a aVar = eVar2.f175427q;
        if (aVar != null) {
            int i17 = eVar2.f175422i;
            com.tencent.mm.plugin.transvoice.ui.b0 b0Var = (com.tencent.mm.plugin.transvoice.ui.b0) aVar;
            com.tencent.mm.plugin.transvoice.ui.e eVar3 = b0Var.f175413a.f175478J;
            if (eVar3 != null) {
                eVar3.dismiss();
            }
            com.tencent.mm.plugin.transvoice.ui.v0 v0Var = b0Var.f175413a;
            v0Var.N.edit().putInt(v0Var.M, i17).apply();
            com.tencent.mm.plugin.transvoice.ui.v0 v0Var2 = b0Var.f175413a;
            if (i17 != v0Var2.f175495x) {
                if (com.tencent.mars.comm.NetStatusUtil.isConnected(v0Var2.getContext())) {
                    com.tencent.mm.plugin.transvoice.ui.v0 v0Var3 = b0Var.f175413a;
                    v0Var3.f175481h = false;
                    v0Var3.P = false;
                    com.tencent.mm.plugin.transvoice.model.e eVar4 = v0Var3.f175479f;
                    eVar4.f175390n = v0Var3.f175480g;
                    eVar4.f175393q = 0;
                    eVar4.f175394r = 0L;
                    eVar4.f175395s = 0;
                    eVar4.f175398v = 0;
                    eVar4.f175399w = 0;
                    eVar4.f175400x = 0;
                    v0Var3.L();
                    com.tencent.mm.sdk.platformtools.n3 n3Var = v0Var3.L;
                    if (n3Var != null) {
                        n3Var.sendEmptyMessageDelayed(5000, 5000L);
                    }
                    com.tencent.mm.sdk.platformtools.b4 b4Var = v0Var3.H;
                    if (b4Var != null) {
                        b4Var.c(500L, 500L);
                    }
                    v0Var3.f175495x = i17;
                    long nanoTime = java.lang.System.nanoTime() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                    if (nanoTime < 0) {
                        nanoTime = java.lang.Math.abs(nanoTime);
                    }
                    z21.a0 a0Var = new z21.a0(java.lang.String.valueOf(nanoTime));
                    z21.a0 a0Var2 = v0Var3.f175497y;
                    if (a0Var2 != null) {
                        ((java.util.concurrent.locks.ReentrantReadWriteLock) a0Var2.f469553d).readLock().lock();
                        for (z21.z zVar : a0Var2.f469552c.values()) {
                            z21.z zVar2 = new z21.z(a0Var2, a0Var.f469550a);
                            zVar2.f469705d = zVar.f469705d;
                            a0Var.f469552c.put(zVar2.f469702a, zVar2);
                        }
                        ((java.util.concurrent.locks.ReentrantReadWriteLock) a0Var2.f469553d).readLock().unlock();
                    }
                    com.tencent.mm.plugin.transvoice.model.c cVar = new com.tencent.mm.plugin.transvoice.model.c(a0Var, i17, new com.tencent.mm.plugin.transvoice.ui.u0(v0Var3));
                    v0Var3.f175494w = cVar;
                    cVar.d();
                } else {
                    android.content.Context context = b0Var.f175413a.getContext();
                    com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
                    aVar2.f211729s = b0Var.f175413a.getContext().getResources().getString(com.tencent.mm.R.string.f490500wu);
                    aVar2.f211732v = b0Var.f175413a.getContext().getResources().getString(com.tencent.mm.R.string.h7x);
                    aVar2.W = b0Var.f175413a.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100);
                    com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                    j0Var.e(aVar2);
                    com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar2.f211723m;
                    if (d0Var != null) {
                        d0Var.a(j0Var.f211837r);
                    }
                    j0Var.show();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog$updateSelectedType$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
