package w24;

/* loaded from: classes.dex */
public final class d extends xm3.a {

    /* renamed from: n, reason: collision with root package name */
    public static int f442612n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442613d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442614e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f442615f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f442616g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f442617h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup.LayoutParams f442618i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup.LayoutParams f442619m;

    public d(java.lang.String key, int i17, kotlin.jvm.internal.i iVar) {
        key = (i17 & 1) != 0 ? "" : key;
        kotlin.jvm.internal.o.g(key, "key");
        this.f442613d = key;
        java.lang.String str = "GroupItem@UniqueId_" + f442612n;
        f442612n++;
        this.f442614e = str;
        this.f442616g = new java.util.ArrayList();
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        w24.d other = (w24.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        java.util.ArrayList arrayList = (java.util.ArrayList) other.f442616g;
        if (arrayList.size() != ((java.util.ArrayList) this.f442616g).size()) {
            return false;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (!kotlin.jvm.internal.o.b((w24.l) next, r1.get(i17))) {
                arrayList2.add(next);
            }
            i17 = i18;
        }
        return arrayList2.isEmpty();
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        w24.d other = (w24.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    public final void n(w24.l item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.GroupListControl", this + ' ' + this.f442613d + " switch addItem: " + item.f442627a);
        if (item.f442628b != null) {
            throw new java.lang.IllegalArgumentException("parent is not null! this item has attach parent: " + item.f442628b);
        }
        item.f442628b = this;
        yz5.l lVar = this.f442617h;
        if (lVar != null) {
            lVar.invoke(this);
        }
        ((java.util.ArrayList) this.f442616g).add(item);
    }

    public final void o(yz5.l notifyCallback) {
        kotlin.jvm.internal.o.g(notifyCallback, "notifyCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.GroupListControl", this + ' ' + this.f442613d + " bindNotifyCallback");
        this.f442617h = notifyCallback;
    }

    public final w24.l p(java.lang.String key) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Iterator it = this.f442616g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((w24.l) obj).f442627a, key)) {
                break;
            }
        }
        return (w24.l) obj;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f442613d;
        return str.length() == 0 ? this.f442614e : str;
    }
}
