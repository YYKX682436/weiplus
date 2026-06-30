package gx0;

/* loaded from: classes5.dex */
public final class h9 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f276504d;

    public h9(gx0.p9 p9Var) {
        this.f276504d = p9Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17;
        cx0.c cVar = (cx0.c) obj;
        java.util.List list = cVar.f224500a;
        boolean z18 = list instanceof java.util.Collection;
        boolean z19 = true;
        gx0.p9 p9Var = this.f276504d;
        if (!z18 || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (p9Var.f276833u.contains(((cx0.b) it.next()).f224497b)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        java.util.List list2 = cVar.f224501b;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                if (p9Var.f276833u.contains(((cx0.b) it6.next()).f224497b)) {
                    break;
                }
            }
        }
        z19 = false;
        if (z17 || z19) {
            com.tencent.mars.xlog.Log.i("MovieMusicTipUIC", "observeTimelineMutation: inserts=" + cVar.f224500a.size() + ", deletes=" + list2.size() + ", updates=" + cVar.f224502c.size());
            p9Var.o7();
        }
    }
}
