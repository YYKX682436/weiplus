package fr4;

/* loaded from: classes11.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f265816d;

    public d0(fr4.g0 g0Var) {
        this.f265816d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lr4.k kVar;
        java.lang.ref.WeakReference weakReference = this.f265816d.f265830q;
        if (weakReference == null || (kVar = (lr4.k) weakReference.get()) == null) {
            return;
        }
        java.util.Iterator it = kVar.f320743f.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((kr4.g) next).t0()) {
                kVar.notifyItemChanged(i17);
            }
            i17 = i18;
        }
        kVar.notifyDataSetChanged();
    }
}
