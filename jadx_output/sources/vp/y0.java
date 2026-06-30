package vp;

/* loaded from: classes16.dex */
public class y0 extends vp.x0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f438862p = (int) (((i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 168.0f) * 1.0f) * j65.f.g()) / 400.0f);

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f438863g;

    /* renamed from: h, reason: collision with root package name */
    public int f438864h;

    /* renamed from: i, reason: collision with root package name */
    public int f438865i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f438866j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f438867k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f438868l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f438869m;

    /* renamed from: n, reason: collision with root package name */
    public int f438870n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f438871o;

    public y0(xp.d dVar, vp.b bVar, zp.i iVar, zp.e eVar) {
        super(dVar, bVar, iVar, eVar);
        this.f438863g = "Danmaku_PreLayoutR2LWindow";
        this.f438863g = dVar.f455841i + "_PreLayoutR2LWindow";
    }

    @Override // vp.x0
    public void a() {
        java.util.List list;
        int size = ((java.util.ArrayList) this.f438867k).size();
        int i17 = 0;
        while (true) {
            list = this.f438854b;
            if (i17 >= size) {
                break;
            }
            java.util.Iterator it = ((java.util.List) ((java.util.ArrayList) this.f438867k).get(i17)).iterator();
            while (it.hasNext()) {
                wp.a aVar = (wp.a) it.next();
                it.remove();
                this.f438853a--;
                ((java.util.LinkedList) list).add(aVar);
                aVar.x(false);
            }
            i17++;
        }
        if (this.f438868l == null) {
            return;
        }
        for (int i18 = 0; i18 < ((java.util.ArrayList) this.f438868l).size(); i18++) {
            java.util.Iterator it6 = ((java.util.List) ((java.util.ArrayList) this.f438868l).get(i18)).iterator();
            while (it6.hasNext()) {
                wp.a aVar2 = (wp.a) it6.next();
                it6.remove();
                this.f438853a--;
                ((java.util.LinkedList) list).add(aVar2);
                aVar2.x(false);
            }
        }
    }

    @Override // vp.x0
    public wp.a d(zp.m mVar) {
        int size = ((java.util.ArrayList) this.f438867k).size();
        for (int i17 = 0; i17 < size; i17++) {
            for (wp.a aVar : (java.util.List) ((java.util.ArrayList) this.f438867k).get(i17)) {
                aVar.getClass();
                if (xp.d.f().f455851h) {
                    android.graphics.Point point = mVar.f474923b;
                    if (aVar.k(point.x, point.y, mVar.f474924c, mVar.f474922a)) {
                        if (com.tencent.mars.xlog.Log.getLogLevel() <= 0) {
                            aVar.toString();
                            aVar.i();
                        }
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    @Override // vp.x0
    public void e() {
        xp.i f17 = xp.d.f();
        this.f438864h = f17.f455845b;
        this.f438865i = f17.f455846c;
        xp.i f18 = xp.d.f();
        java.util.LinkedList linkedList = f18.f455863t;
        java.util.List list = f18.f455864u;
        int i17 = this.f438865i;
        boolean z17 = f18.f455859p;
        java.lang.String str = this.f438863g;
        int i18 = f438862p;
        if (list != null && !list.isEmpty() && z17) {
            int integer = ((r45.f43) list.get(0)).getInteger(4);
            if (integer <= 0) {
                integer = this.f438865i;
            }
            int e17 = this.f438856d.e();
            i17 = java.lang.Math.max(1, java.lang.Math.min(integer, i18 / e17));
            f18.f455861r = i17;
            int[] iArr = this.f438866j;
            if (iArr == null || iArr.length != i17) {
                this.f438866j = new int[i17];
            }
            for (int i19 = 0; i19 < i17; i19++) {
                this.f438866j[i19] = (i19 * e17) + this.f438864h;
            }
            com.tencent.mars.xlog.Log.i(str, "relayoutDanmakuLines: followInfo maxLineCount=%d, actualLineCount=%d, lineHeight=%d, maxHeight=%d", java.lang.Integer.valueOf(integer), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(i18));
        } else if (linkedList == null || linkedList.isEmpty() || !z17) {
            int i27 = this.f438865i;
            f18.f455861r = i27;
            int[] iArr2 = this.f438866j;
            if (iArr2 == null || iArr2.length != i27) {
                this.f438866j = new int[i27];
            }
            int e18 = this.f438856d.e();
            for (int i28 = 0; i28 < this.f438865i; i28++) {
                this.f438866j[i28] = (i28 * e18) + this.f438864h;
            }
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
            linkedList2.sort(java.util.Comparator.comparingInt(new vp.y0$$a()));
            int[] iArr3 = this.f438866j;
            if (iArr3 == null || iArr3.length != this.f438865i) {
                this.f438866j = new int[this.f438865i];
            }
            int e19 = this.f438856d.e();
            int i29 = 0;
            while (true) {
                if (i29 >= this.f438865i) {
                    break;
                }
                int i37 = i29 > 0 ? this.f438866j[i29 - 1] + e19 : this.f438864h;
                int i38 = i37 + e19;
                for (int i39 = 0; i39 < linkedList2.size(); i39++) {
                    android.graphics.Rect rect = (android.graphics.Rect) linkedList2.get(i39);
                    int i47 = rect.top;
                    int i48 = rect.bottom;
                    if (i37 >= i48 || i38 <= i47) {
                        if (i38 < i47) {
                            break;
                        }
                    } else {
                        i38 = i48 + e19;
                        i37 = i48;
                    }
                }
                if (i37 + e19 > i18) {
                    i17 = java.lang.Math.max(1, i29);
                    f18.f455861r = i17;
                    break;
                } else {
                    this.f438866j[i29] = i37;
                    i29++;
                }
            }
        }
        java.util.List list2 = this.f438867k;
        java.util.List list3 = this.f438854b;
        if (list2 != null) {
            int size = ((java.util.ArrayList) list2).size();
            if (size < i17) {
                for (int size2 = ((java.util.ArrayList) this.f438867k).size(); size2 < i17; size2++) {
                    ((java.util.ArrayList) this.f438867k).add(new java.util.LinkedList());
                }
            } else {
                for (int i49 = size - 1; i49 >= i17; i49--) {
                    list3.addAll((java.util.List) ((java.util.ArrayList) this.f438867k).remove(i49));
                }
            }
        } else {
            this.f438867k = new java.util.ArrayList(i17);
            for (int i57 = 0; i57 < i17; i57++) {
                ((java.util.ArrayList) this.f438867k).add(new java.util.LinkedList());
            }
        }
        f(this.f438867k, this.f438866j);
        xp.i f19 = xp.d.f();
        java.util.List list4 = f19.f455864u;
        boolean z18 = f19.f455859p;
        if (list4 == null || list4.isEmpty() || !z18) {
            java.util.List list5 = this.f438868l;
            if (list5 != null) {
                java.util.Iterator it = ((java.util.ArrayList) list5).iterator();
                while (it.hasNext()) {
                    java.util.List<wp.a> list6 = (java.util.List) it.next();
                    for (wp.a aVar : list6) {
                        list3.add(aVar);
                        aVar.x(false);
                    }
                    list6.clear();
                }
            }
            this.f438870n = 0;
            this.f438869m = null;
        } else {
            int integer2 = ((r45.f43) list4.get(0)).getInteger(4);
            if (integer2 <= 0) {
                integer2 = this.f438865i;
            }
            int e27 = this.f438856d.e();
            int min = java.lang.Math.min(integer2, i18 / e27);
            this.f438870n = min;
            int max = java.lang.Math.max(1, min);
            this.f438870n = max;
            int[] iArr4 = this.f438869m;
            if (iArr4 == null || iArr4.length != max) {
                this.f438869m = new int[max];
            }
            for (int i58 = 0; i58 < this.f438870n; i58++) {
                this.f438869m[i58] = (i58 * e27) + this.f438864h;
            }
            com.tencent.mars.xlog.Log.i(str, "relayoutFollowDanmakuLines: maxLineCount=%d, actualLineCount=%d, lineHeight=%d, maxHeight=%d", java.lang.Integer.valueOf(integer2), java.lang.Integer.valueOf(this.f438870n), java.lang.Integer.valueOf(e27), java.lang.Integer.valueOf(i18));
        }
        java.util.List list7 = this.f438868l;
        if (list7 != null) {
            int size3 = ((java.util.ArrayList) list7).size();
            int i59 = this.f438870n;
            if (size3 < i59) {
                while (size3 < this.f438870n) {
                    ((java.util.ArrayList) this.f438868l).add(new java.util.LinkedList());
                    size3++;
                }
            } else if (size3 > i59) {
                for (int i66 = size3 - 1; i66 >= this.f438870n; i66--) {
                    list3.addAll((java.util.List) ((java.util.ArrayList) this.f438868l).remove(i66));
                }
            }
        } else {
            this.f438868l = new java.util.ArrayList(this.f438870n);
            for (int i67 = 0; i67 < this.f438870n; i67++) {
                ((java.util.ArrayList) this.f438868l).add(new java.util.LinkedList());
            }
        }
        f(this.f438868l, this.f438869m);
    }

    public final void f(java.util.List list, int[] iArr) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Iterator it = ((java.util.List) list.get(i17)).iterator();
            while (it.hasNext()) {
                wp.f fVar = (wp.f) ((wp.a) it.next());
                fVar.c();
                long j17 = this.f438858f.f474908a;
                int i18 = (int) fVar.D;
                fVar.f448353x = true;
                fVar.f448352w = true;
                float f17 = fVar.f448338i;
                vp.d0.b(this.f438856d, fVar);
                float h17 = (fVar.f448338i + fVar.h()) / (f17 + fVar.h());
                fVar.f448334e.f474913a = ((float) r7.f474913a) * h17;
                fVar.u(j17);
                fVar.E = iArr[i17];
                fVar.D = i18;
            }
        }
    }
}
