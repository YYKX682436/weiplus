package zm4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f474177a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f474178b;

    /* renamed from: c, reason: collision with root package name */
    public r45.f03 f474179c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f474180d;

    /* renamed from: e, reason: collision with root package name */
    public int f474181e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f474182f;

    public final java.util.Map a() {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f474178b;
        r45.f03 f03Var = this.f474179c;
        if (jbVar == null || f03Var == null) {
            return null;
        }
        dn4.a aVar = dn4.a.f242033a;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        hashMap.put("my_finder_username", xy2.c.e(context));
        aVar.a(hashMap, jbVar);
        hashMap.put("show_path", f03Var.f373892i);
        hashMap.put("show_type", java.lang.Integer.valueOf(f03Var.f373887d));
        hashMap.put("show_parent_path", f03Var.f373893m);
        return hashMap;
    }

    public final java.util.Map b() {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f474180d;
        int i17 = this.f474181e;
        if (jbVar == null || i17 <= 0) {
            return null;
        }
        dn4.a aVar = dn4.a.f242033a;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        hashMap.put("my_finder_username", xy2.c.e(context));
        aVar.a(hashMap, jbVar);
        hashMap.put("message_num", java.lang.Integer.valueOf(i17));
        return hashMap;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{category:");
        sb6.append(this.f474177a);
        sb6.append(" isBubbleShowInTab:");
        sb6.append(this.f474182f);
        sb6.append(" hasContentRedDot:");
        sb6.append((this.f474178b == null || this.f474179c == null) ? false : true);
        sb6.append(" hasNumRedDot:");
        sb6.append(this.f474180d != null && this.f474181e > 0);
        sb6.append(" contentRedDot:");
        sb6.append(a());
        sb6.append(" numRedDot:");
        sb6.append(b());
        sb6.append('}');
        return sb6.toString();
    }
}
