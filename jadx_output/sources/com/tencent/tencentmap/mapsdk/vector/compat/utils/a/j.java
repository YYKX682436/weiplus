package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes13.dex */
public class j<T extends com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g f215401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f215402b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List<T> f215403c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List<com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<T>> f215404d;

    /* loaded from: classes13.dex */
    public interface a {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h getPoint();
    }

    public j(double d17, double d18, double d19, double d27) {
        this(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g(d17, d18, d19, d27));
    }

    public void a(T t17) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h point = t17.getPoint();
        if (this.f215401a.a(point.f215397a, point.f215398b)) {
            a(point.f215397a, point.f215398b, t17);
        }
    }

    public final void b() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        this.f215404d = arrayList;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar = this.f215401a;
        arrayList.add(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j(gVar.f215391a, gVar.f215395e, gVar.f215392b, gVar.f215396f, this.f215402b + 1));
        java.util.List<com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<T>> list = this.f215404d;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar2 = this.f215401a;
        list.add(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<>(gVar2.f215395e, gVar2.f215393c, gVar2.f215392b, gVar2.f215396f, this.f215402b + 1));
        java.util.List<com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<T>> list2 = this.f215404d;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar3 = this.f215401a;
        list2.add(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<>(gVar3.f215391a, gVar3.f215395e, gVar3.f215396f, gVar3.f215394d, this.f215402b + 1));
        java.util.List<com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<T>> list3 = this.f215404d;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar4 = this.f215401a;
        list3.add(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<>(gVar4.f215395e, gVar4.f215393c, gVar4.f215396f, gVar4.f215394d, this.f215402b + 1));
        java.util.List<T> list4 = this.f215403c;
        this.f215403c = null;
        for (T t17 : list4) {
            a(t17.getPoint().f215397a, t17.getPoint().f215398b, t17);
        }
    }

    public j(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar) {
        this(gVar, 0);
    }

    public j(double d17, double d18, double d19, double d27, int i17) {
        this(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g(d17, d18, d19, d27), i17);
    }

    public j(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar, int i17) {
        this.f215404d = null;
        this.f215401a = gVar;
        this.f215402b = i17;
    }

    public final void a(double d17, double d18, T t17) {
        java.util.List<com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<T>> list = this.f215404d;
        if (list != null) {
            com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar = this.f215401a;
            if (d18 < gVar.f215396f) {
                if (d17 < gVar.f215395e) {
                    list.get(0).a(d17, d18, t17);
                    return;
                } else {
                    list.get(1).a(d17, d18, t17);
                    return;
                }
            }
            if (d17 < gVar.f215395e) {
                list.get(2).a(d17, d18, t17);
                return;
            } else {
                list.get(3).a(d17, d18, t17);
                return;
            }
        }
        if (this.f215403c == null) {
            this.f215403c = new java.util.ArrayList();
        }
        this.f215403c.add(t17);
        if (this.f215403c.size() <= 50 || this.f215402b >= 40) {
            return;
        }
        b();
    }

    public boolean b(T t17) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h point = t17.getPoint();
        if (this.f215401a.a(point.f215397a, point.f215398b)) {
            return b(point.f215397a, point.f215398b, t17);
        }
        return false;
    }

    public final boolean b(double d17, double d18, T t17) {
        java.util.List<com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<T>> list = this.f215404d;
        if (list != null) {
            com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar = this.f215401a;
            if (d18 < gVar.f215396f) {
                if (d17 < gVar.f215395e) {
                    return list.get(0).b(d17, d18, t17);
                }
                return list.get(1).b(d17, d18, t17);
            }
            if (d17 < gVar.f215395e) {
                return list.get(2).b(d17, d18, t17);
            }
            return list.get(3).b(d17, d18, t17);
        }
        return this.f215403c.remove(t17);
    }

    public void a() {
        this.f215404d = null;
        java.util.List<T> list = this.f215403c;
        if (list != null) {
            list.clear();
        }
    }

    public java.util.Collection<T> a(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(gVar, arrayList);
        return arrayList;
    }

    public final void a(com.tencent.tencentmap.mapsdk.vector.compat.utils.a.g gVar, java.util.Collection<T> collection) {
        if (this.f215401a.b(gVar)) {
            java.util.List<com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<T>> list = this.f215404d;
            if (list != null) {
                java.util.Iterator<com.tencent.tencentmap.mapsdk.vector.compat.utils.a.j<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(gVar, collection);
                }
            } else if (this.f215403c != null) {
                if (gVar.a(this.f215401a)) {
                    collection.addAll(this.f215403c);
                    return;
                }
                for (T t17 : this.f215403c) {
                    if (gVar.a(t17.getPoint())) {
                        collection.add(t17);
                    }
                }
            }
        }
    }
}
