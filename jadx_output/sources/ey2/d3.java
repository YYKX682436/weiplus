package ey2;

/* loaded from: classes2.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ym5 f257342a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f257343b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f257344c;

    /* renamed from: d, reason: collision with root package name */
    public long f257345d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f257346e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f257347f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f257348g;

    /* renamed from: h, reason: collision with root package name */
    public long f257349h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f257350i;

    /* renamed from: j, reason: collision with root package name */
    public int f257351j;

    /* renamed from: k, reason: collision with root package name */
    public long f257352k;

    public d3(r45.ym5 session, int i17, kotlin.jvm.internal.i iVar) {
        session = (i17 & 1) != 0 ? new r45.ym5() : session;
        kotlin.jvm.internal.o.g(session, "session");
        this.f257342a = session;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6;
        if (this.f257348g) {
            sb6 = new java.lang.StringBuilder();
            sb6.append("left exposed time=" + this.f257349h + " isExp=" + this.f257347f + " count=" + this.f257351j + ' ' + this.f257350i);
        } else {
            sb6 = null;
        }
        if (this.f257344c) {
            if (sb6 == null) {
                sb6 = new java.lang.StringBuilder();
            }
            sb6.append("right exposed time=" + this.f257345d + " isExp=" + this.f257343b + ' ' + this.f257346e);
        }
        java.lang.String sb7 = sb6 != null ? sb6.toString() : null;
        return sb7 == null ? "" : sb7;
    }
}
