package ms2;

/* loaded from: classes2.dex */
public final class c implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ig4 f330969d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.dg4 f330970e;

    /* renamed from: f, reason: collision with root package name */
    public int f330971f;

    /* renamed from: g, reason: collision with root package name */
    public int f330972g;

    public c(r45.ig4 item, r45.dg4 dg4Var) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f330969d = item;
        this.f330970e = dg4Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof ms2.c)) {
            return 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.ig4 ig4Var = ((ms2.c) obj).f330969d;
        sb6.append(ig4Var.f377017d);
        r45.gg4 gg4Var = ig4Var.B;
        sb6.append(gg4Var != null ? gg4Var.f375221d : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        r45.ig4 ig4Var2 = this.f330969d;
        sb8.append(ig4Var2.f377017d);
        r45.gg4 gg4Var2 = ig4Var2.B;
        sb8.append(gg4Var2 != null ? gg4Var2.f375221d : null);
        return !android.text.TextUtils.equals(sb7, sb8.toString()) ? 1 : 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return ms2.c.class.hashCode();
    }
}
