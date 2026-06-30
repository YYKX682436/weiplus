package fc2;

/* loaded from: classes2.dex */
public final class w extends fc2.t {

    /* renamed from: p, reason: collision with root package name */
    public long f261000p;

    /* renamed from: q, reason: collision with root package name */
    public int f261001q;

    /* renamed from: r, reason: collision with root package name */
    public int f261002r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f261003s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f261004t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.LinkedList f261005u;

    public w(int i17) {
        super(i17);
        this.f261000p = -1L;
        this.f261001q = -1;
        this.f261002r = -1;
    }

    public final java.util.List g() {
        return this.f261003s;
    }

    public final long h() {
        return this.f261000p;
    }

    public final int i() {
        return this.f261001q;
    }

    public final int j() {
        return this.f261002r;
    }

    public final java.util.List k() {
        return this.f261004t;
    }

    public final java.util.LinkedList l() {
        return this.f261005u;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ScrollEvent(type=");
        sb6.append(this.f260985d);
        sb6.append(", ");
        sb6.append(this.f260986e);
        sb6.append(", ");
        sb6.append(this.f260987f);
        sb6.append(", ");
        sb6.append(this.f260988g);
        sb6.append(", ");
        sb6.append(this.f260989h);
        sb6.append(", itemCount=");
        sb6.append(this.f260990i);
        sb6.append(", newState=");
        sb6.append(this.f260991j);
        sb6.append(") idleAcrossFeedList=");
        java.util.List list = this.f261003s;
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        return sb6.toString();
    }
}
