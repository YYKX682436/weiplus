package pl2;

/* loaded from: classes3.dex */
public final class i extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356628a;

    public i(pl2.s sVar) {
        this.f356628a = sVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        pl2.s sVar;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) parent;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(exposedHolders, 10));
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((androidx.recyclerview.widget.k3) it.next()).getAdapterPosition()));
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        int childCount = recyclerView.getChildCount();
        int i17 = 0;
        while (true) {
            sVar = this.f356628a;
            if (i17 >= childCount) {
                break;
            }
            android.view.View childAt = recyclerView.getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            androidx.recyclerview.widget.k3 w07 = recyclerView.w0(childAt);
            kotlin.jvm.internal.o.f(w07, "getChildViewHolder(...)");
            if (!X0.contains(java.lang.Integer.valueOf(w07.getAdapterPosition()))) {
                com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) childAt.findViewById(com.tencent.mm.R.id.toa);
                com.tencent.mars.xlog.Log.i(sVar.f356647b, "Starting sidebar item play. " + w07.getAdapterPosition());
                nearbyLivePreviewView.stop();
                nearbyLivePreviewView.release();
            }
            i17++;
        }
        java.util.Iterator it6 = exposedHolders.iterator();
        while (it6.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it6.next();
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView2 = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) k3Var.itemView.findViewById(com.tencent.mm.R.id.toa);
            if (!nearbyLivePreviewView2.isPlaying()) {
                com.tencent.mars.xlog.Log.i(sVar.f356647b, "Stopping sidebar item play. " + k3Var.getAdapterPosition());
                nearbyLivePreviewView2.t();
            }
        }
        if (sVar.f356659n) {
            android.content.Context b17 = sVar.b();
            pf5.z zVar = pf5.z.f353948a;
            if (!(b17 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            pl2.w wVar = ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) b17).a(pl2.x.class)).f356687m;
            java.util.ArrayList sideBarDataList = sVar.f356656k;
            wVar.getClass();
            kotlin.jvm.internal.o.g(sideBarDataList, "sideBarDataList");
            java.util.HashSet hashSet = new java.util.HashSet();
            androidx.recyclerview.widget.k3 k3Var2 = (androidx.recyclerview.widget.k3) kz5.n0.Z(exposedHolders);
            int adapterPosition = k3Var2 != null ? k3Var2.getAdapterPosition() : 1000;
            java.util.Iterator it7 = exposedHolders.iterator();
            int i18 = -1;
            while (it7.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var3 = (androidx.recyclerview.widget.k3) it7.next();
                if (k3Var3.getAdapterPosition() > i18 && k3Var3.getAdapterPosition() >= 0) {
                    i18 = k3Var3.getAdapterPosition();
                }
                if (k3Var3.getAdapterPosition() < adapterPosition && k3Var3.getAdapterPosition() >= 0) {
                    adapterPosition = k3Var3.getAdapterPosition();
                }
            }
            if (adapterPosition <= i18) {
                while (true) {
                    hashSet.add(java.lang.Integer.valueOf(adapterPosition));
                    if (adapterPosition == i18) {
                        break;
                    } else {
                        adapterPosition++;
                    }
                }
            }
            pm0.v.L("SideBarReport", true, new pl2.t(hashSet, wVar, wVar.f356680j, sideBarDataList));
        }
    }
}
