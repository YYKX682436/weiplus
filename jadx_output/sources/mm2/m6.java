package mm2;

/* loaded from: classes10.dex */
public final class m6 extends mm2.e {

    /* renamed from: z6, reason: collision with root package name */
    public static volatile java.lang.Boolean f329239z6;
    public int A;
    public int B;
    public boolean C;
    public java.lang.String D;
    public boolean E;
    public int F;
    public final kotlinx.coroutines.flow.j2 G;
    public final kotlinx.coroutines.flow.f3 H;
    public final kotlinx.coroutines.flow.j2 I;

    /* renamed from: J, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329240J;

    /* renamed from: f, reason: collision with root package name */
    public final dk2.s f329241f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f329242g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f329243h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.j0 f329244i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.j0 f329245m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.j0 f329246n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f329247o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f329248p;

    /* renamed from: q, reason: collision with root package name */
    public final dk2.t f329249q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329250r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329251s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329252t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f329253u;

    /* renamed from: v, reason: collision with root package name */
    public final int f329254v;

    /* renamed from: w, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329255w;

    /* renamed from: x, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329256x;

    /* renamed from: y, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329257y;

    /* renamed from: z, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329258z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        java.lang.Boolean bool = f329239z6;
        f329239z6 = null;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            com.tencent.mars.xlog.Log.i("LiveSingSongSlice", "consume pending isNewVersionSongList on init, value=" + booleanValue);
            this.f329248p = booleanValue;
        }
        this.f329241f = new dk2.s();
        this.f329242g = new androidx.lifecycle.j0("");
        this.f329243h = new androidx.lifecycle.j0("");
        this.f329244i = new androidx.lifecycle.j0(null);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        this.f329245m = new androidx.lifecycle.j0(bool2);
        this.f329246n = new androidx.lifecycle.j0(bool2);
        this.f329247o = new java.util.LinkedList();
        this.f329249q = new dk2.t();
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(mm2.g6.f329093a);
        this.f329250r = a17;
        this.f329251s = a17;
        this.f329252t = kotlinx.coroutines.flow.i3.a(mm2.k6.f329199d);
        this.f329253u = new java.util.LinkedList();
        this.f329254v = 10;
        kotlinx.coroutines.flow.j2 a18 = kotlinx.coroutines.flow.i3.a(bool2);
        this.f329255w = a18;
        this.f329256x = a18;
        kotlinx.coroutines.flow.j2 a19 = kotlinx.coroutines.flow.i3.a(bool2);
        this.f329257y = a19;
        this.f329258z = a19;
        this.A = 50;
        this.B = 50;
        this.D = "#FFFFFFFF";
        kotlinx.coroutines.flow.j2 a27 = kotlinx.coroutines.flow.i3.a(0);
        this.G = a27;
        this.H = a27;
        kotlinx.coroutines.flow.j2 a28 = kotlinx.coroutines.flow.i3.a(null);
        this.I = a28;
        this.f329240J = a28;
    }

    public final java.lang.String N6() {
        mm2.j6 j6Var = (mm2.j6) ((kotlinx.coroutines.flow.h3) this.f329251s).getValue();
        if (j6Var instanceof mm2.g6 ? true : j6Var instanceof mm2.h6) {
            return null;
        }
        if (j6Var instanceof mm2.i6) {
            return ((mm2.i6) j6Var).f329141a.f391632i;
        }
        throw new jz5.j();
    }

    public final androidx.lifecycle.j0 O6() {
        return this.f329246n;
    }

    public final r45.z22 P6(r45.z22 z22Var) {
        java.lang.Integer valueOf;
        java.util.ArrayList arrayList = this.f329249q.f234085a;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (z22Var == null) {
            java.lang.Object value = ((kotlinx.coroutines.flow.h3) this.f329251s).getValue();
            mm2.i6 i6Var = value instanceof mm2.i6 ? (mm2.i6) value : null;
            z22Var = i6Var != null ? i6Var.f329141a : null;
        }
        int i17 = -1;
        if (z22Var != null) {
            java.util.Iterator it = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.z22 z22Var2 = (r45.z22) it.next();
                if (kotlin.jvm.internal.o.b(z22Var2.f391627d, z22Var.f391627d) && z22Var2.f391628e == z22Var.f391628e) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
        }
        int ordinal = ((mm2.k6) ((kotlinx.coroutines.flow.h3) this.f329252t).getValue()).ordinal();
        if (ordinal == 0) {
            if (i17 < 0 || i17 >= arrayList.size() - 1) {
                return null;
            }
            return (r45.z22) arrayList.get(i17 + 1);
        }
        if (ordinal == 1) {
            if (i17 >= 0) {
                return (r45.z22) arrayList.get(i17);
            }
            return null;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        e06.k g17 = kz5.c0.g(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : g17) {
            if (!this.f329253u.contains(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()))) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            valueOf = (java.lang.Integer) kz5.n0.v0(arrayList2, c06.e.f37716d);
        } else if (arrayList.size() <= 1 || i17 < 0) {
            e06.k g18 = kz5.c0.g(arrayList);
            c06.d random = c06.e.f37716d;
            kotlin.jvm.internal.o.g(random, "random");
            valueOf = g18.isEmpty() ? null : java.lang.Integer.valueOf(c06.f.c(random, g18));
        } else {
            e06.k g19 = kz5.c0.g(arrayList);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : g19) {
                if (((java.lang.Number) obj2).intValue() != i17) {
                    arrayList3.add(obj2);
                }
            }
            valueOf = (java.lang.Integer) kz5.n0.w0(arrayList3, c06.e.f37716d);
        }
        if (valueOf != null) {
            return (r45.z22) arrayList.get(valueOf.intValue());
        }
        return null;
    }

    public final androidx.lifecycle.j0 Q6() {
        return this.f329243h;
    }

    public final androidx.lifecycle.j0 R6() {
        return this.f329245m;
    }

    public final void S6() {
        ((kotlinx.coroutines.flow.h3) this.G).k(0);
    }

    public final void T6(boolean z17) {
        this.f329248p = z17;
    }

    public final void U6(mm2.j6 newState) {
        kotlin.jvm.internal.o.g(newState, "newState");
        if (newState instanceof mm2.i6) {
            r45.z22 songInfo = ((mm2.i6) newState).f329141a;
            kotlin.jvm.internal.o.g(songInfo, "songInfo");
            java.util.Iterator it = this.f329249q.f234085a.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                r45.z22 z22Var = (r45.z22) it.next();
                if (kotlin.jvm.internal.o.b(z22Var.f391627d, songInfo.f391627d) && z22Var.f391628e == songInfo.f391628e) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                java.util.LinkedList linkedList = this.f329253u;
                if (!linkedList.contains(java.lang.Integer.valueOf(i17))) {
                    linkedList.addLast(java.lang.Integer.valueOf(i17));
                    while (linkedList.size() > this.f329254v) {
                        linkedList.removeFirst();
                    }
                }
            }
        }
        ((kotlinx.coroutines.flow.h3) this.f329250r).k(newState);
    }

    public final void V6(r45.z22 songInfo) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        java.lang.String str = songInfo.f391629f;
        if (str == null) {
            return;
        }
        dk2.t tVar = this.f329249q;
        java.util.Iterator it = tVar.f234085a.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((r45.z22) it.next()).f391629f, str)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 >= 0) {
            tVar.f234085a.set(i17, songInfo);
        } else {
            tVar.f234085a.add(songInfo);
        }
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        ((kotlinx.coroutines.flow.h3) this.f329250r).k(mm2.g6.f329093a);
        S6();
        ((kotlinx.coroutines.flow.h3) this.I).k(null);
        kotlinx.coroutines.flow.j2 j2Var = this.f329255w;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ((kotlinx.coroutines.flow.h3) j2Var).k(bool);
        ((kotlinx.coroutines.flow.h3) this.f329257y).k(bool);
        this.f329253u.clear();
    }
}
