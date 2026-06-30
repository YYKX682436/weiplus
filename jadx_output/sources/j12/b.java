package j12;

/* loaded from: classes15.dex */
public abstract class b extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f297151d;

    /* renamed from: e, reason: collision with root package name */
    public j12.f f297152e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.h0 f297153f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f297154g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashMap f297155h;

    public b(android.content.Context context) {
        this.f297151d = context;
        if (context == null) {
            return;
        }
        this.f297155h = new java.util.HashMap();
    }

    public void a() {
        java.util.HashMap hashMap = this.f297155h;
        if (hashMap != null) {
            hashMap.clear();
            this.f297155h = null;
        }
        j12.f fVar = this.f297152e;
        if (fVar != null) {
            java.util.ArrayList arrayList = fVar.f297158d;
            if (arrayList != null) {
                arrayList.clear();
                fVar.f297158d = null;
            }
            java.util.HashMap hashMap2 = fVar.f297159e;
            if (hashMap2 != null) {
                hashMap2.clear();
                fVar.f297159e = null;
            }
            java.util.HashMap hashMap3 = fVar.f297160f;
            if (hashMap3 != null) {
                hashMap3.clear();
                fVar.f297160f = null;
            }
            this.f297152e = null;
        }
        this.f297154g = false;
    }

    public abstract int c();

    public final java.lang.String d(j12.i iVar) {
        if (iVar == null) {
            return null;
        }
        if (iVar.f297166a != j12.h.cellset) {
            return iVar.f297167b.f392128d;
        }
        return "" + iVar.f297169d.f378729g + "_cell";
    }

    public abstract int f();

    public abstract boolean g(int i17);

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList;
        j12.f fVar = this.f297152e;
        if (fVar == null || (arrayList = fVar.f297158d) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        i12.c cVar = view != null ? (i12.c) view.getTag() : null;
        j12.i item = getItem(i17);
        if (cVar == null) {
            cVar = l(this.f297151d, view);
            view = cVar.A;
            this.f297155h.put(d(item), cVar);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(d(item))) {
            if (this.f297155h.containsValue(cVar)) {
                this.f297155h.remove(cVar.e());
            }
            this.f297155h.put(d(item), cVar);
        }
        cVar.f287172d = i17;
        cVar.f287171c = item;
        android.view.View j17 = j(i17, view, viewGroup);
        cVar.h();
        return j17;
    }

    @Override // android.widget.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public j12.i getItem(int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        j12.f fVar = this.f297152e;
        if (fVar == null || (arrayList = fVar.f297158d) == null || arrayList.size() <= i17 || i17 < 0 || (arrayList2 = fVar.f297158d) == null) {
            return null;
        }
        return (j12.i) arrayList2.get(i17);
    }

    public abstract android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup);

    public abstract int k();

    public abstract i12.c l(android.content.Context context, android.view.View view);

    public void m() {
        if (this.f297154g) {
            super.notifyDataSetChanged();
        }
    }

    public void n(j12.i iVar, java.lang.String str, int i17) {
        if (iVar == null || str == null) {
            return;
        }
        iVar.c(i17);
        com.tencent.mm.storage.f5 f5Var = (com.tencent.mm.storage.f5) this.f297152e.f297159e.get(str);
        if (f5Var == null) {
            return;
        }
        f5Var.a(i17);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.f297154g = false;
        j12.f fVar = this.f297152e;
        if (fVar != null && fVar.f297158d != null) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            fVar.f297160f = com.tencent.mm.storage.n5.f().b().b1();
            java.util.Iterator it = fVar.f297158d.iterator();
            while (it.hasNext()) {
                j12.i iVar = (j12.i) it.next();
                r45.zj0 zj0Var = iVar.f297167b;
                if (zj0Var != null) {
                    if (n22.l.c(zj0Var)) {
                        iVar.c(n22.l.a() ? 7 : 3);
                    } else {
                        java.lang.String str = zj0Var.f392128d;
                        com.tencent.mm.storage.f5 f5Var = (com.tencent.mm.storage.f5) fVar.f297159e.get(str);
                        java.util.HashMap hashMap = fVar.f297160f;
                        iVar.b(fVar.f297161g, f5Var, hashMap == null ? false : hashMap.containsKey(str));
                    }
                }
            }
            fVar.d();
        }
        java.util.HashMap hashMap2 = this.f297155h;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        super.notifyDataSetChanged();
        this.f297154g = true;
    }

    public abstract void o(int i17);

    public abstract void p(int i17);

    public abstract void q(int i17);

    public void r(java.lang.String str, int i17) {
        j12.f fVar;
        if (this.f297155h == null || (fVar = this.f297152e) == null || str == null) {
            return;
        }
        j12.i g17 = fVar.g(str);
        if (g17 != null) {
            if (i17 >= 0 && i17 < 100) {
                n(g17, str, 6);
                g17.f297170e = i17;
            }
            if (i17 >= 100) {
                n(g17, str, 7);
            }
        }
        java.util.HashMap hashMap = this.f297155h;
        i12.c cVar = hashMap == null ? null : (i12.c) hashMap.get(str);
        if (cVar == null) {
            return;
        }
        java.lang.String e17 = cVar.e() != null ? cVar.e() : null;
        if (e17 == null || !e17.equals(str)) {
            return;
        }
        cVar.h();
    }

    public void s(java.lang.String str, int i17) {
        j12.f fVar;
        if (this.f297155h == null || (fVar = this.f297152e) == null || str == null) {
            return;
        }
        j12.i g17 = fVar.g(str);
        if (g17 != null) {
            n(g17, str, i17);
        }
        if (g17 != null && this.f297152e != null && g17.f297171f == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseEmojiListAdapter", "force refresh status");
            j12.f fVar2 = this.f297152e;
            boolean z17 = fVar2.f297161g;
            com.tencent.mm.storage.f5 f5Var = (com.tencent.mm.storage.f5) fVar2.f297159e.get(str);
            java.util.HashMap hashMap = this.f297152e.f297160f;
            g17.b(z17, f5Var, hashMap == null ? false : hashMap.containsKey(str));
        }
        java.util.HashMap hashMap2 = this.f297155h;
        i12.c cVar = hashMap2 == null ? null : (i12.c) hashMap2.get(str);
        if (cVar == null) {
            return;
        }
        java.lang.String e17 = cVar.e() != null ? cVar.e() : null;
        if (e17 == null || !e17.equals(str)) {
            return;
        }
        cVar.h();
    }
}
