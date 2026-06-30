package xh2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f454531a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f454532b;

    /* renamed from: c, reason: collision with root package name */
    public int f454533c;

    /* renamed from: d, reason: collision with root package name */
    public final int f454534d;

    /* renamed from: e, reason: collision with root package name */
    public final int f454535e;

    /* renamed from: f, reason: collision with root package name */
    public final int f454536f;

    /* renamed from: g, reason: collision with root package name */
    public final float f454537g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f454538h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f454539i;

    public c(java.util.LinkedList dataList, android.graphics.Rect viewRect, int i17, int i18, int i19, int i27, float f17, boolean z17, java.util.LinkedList holeDataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(viewRect, "viewRect");
        kotlin.jvm.internal.o.g(holeDataList, "holeDataList");
        this.f454531a = dataList;
        this.f454532b = viewRect;
        this.f454533c = i17;
        this.f454534d = i18;
        this.f454535e = i19;
        this.f454536f = i27;
        this.f454537g = f17;
        this.f454538h = z17;
        this.f454539i = holeDataList;
    }

    public final xh2.c a() {
        java.util.LinkedList linkedList = this.f454531a;
        kotlin.jvm.internal.o.g(linkedList, "<this>");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((xh2.a) it.next()).a());
        }
        return new xh2.c(linkedList2, this.f454532b, this.f454533c, this.f454534d, this.f454535e, this.f454536f, this.f454537g, this.f454538h, this.f454539i);
    }

    public final boolean b() {
        int i17 = this.f454534d;
        return (i17 == 0 && this.f454536f == 2) || (i17 == 2 && this.f454535e == 2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.c)) {
            return false;
        }
        xh2.c cVar = (xh2.c) obj;
        return kotlin.jvm.internal.o.b(this.f454531a, cVar.f454531a) && kotlin.jvm.internal.o.b(this.f454532b, cVar.f454532b) && this.f454533c == cVar.f454533c && this.f454534d == cVar.f454534d && this.f454535e == cVar.f454535e && this.f454536f == cVar.f454536f && java.lang.Float.compare(this.f454537g, cVar.f454537g) == 0 && this.f454538h == cVar.f454538h && kotlin.jvm.internal.o.b(this.f454539i, cVar.f454539i);
    }

    public int hashCode() {
        return (((((((((((((((this.f454531a.hashCode() * 31) + this.f454532b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f454533c)) * 31) + java.lang.Integer.hashCode(this.f454534d)) * 31) + java.lang.Integer.hashCode(this.f454535e)) * 31) + java.lang.Integer.hashCode(this.f454536f)) * 31) + java.lang.Float.hashCode(this.f454537g)) * 31) + java.lang.Boolean.hashCode(this.f454538h)) * 31) + this.f454539i.hashCode();
    }

    public java.lang.String toString() {
        return "FinderLiveMicNotifyEvent(dataList=" + this.f454531a + ", viewRect=" + this.f454532b + ", mode=" + this.f454533c + ", liveMode=" + this.f454534d + ", liveSubMode=" + this.f454535e + ", voiceMode=" + this.f454536f + ", anchorVideoRate=" + this.f454537g + ", shouldShowMicTopic=" + this.f454538h + ", holeDataList=" + this.f454539i + ')';
    }
}
