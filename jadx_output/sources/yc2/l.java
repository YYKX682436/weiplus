package yc2;

/* loaded from: classes2.dex */
public final class l extends yc2.c {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f460835g = jz5.h.b(new yc2.k(this));

    @Override // yc2.c
    public java.lang.String v() {
        android.content.Context context;
        android.content.res.Resources resources;
        in5.s0 s0Var = this.f453161a;
        java.lang.String string = (s0Var == null || (context = s0Var.f293121e) == null || (resources = context.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.p5q);
        return string == null ? "" : string;
    }

    @Override // yc2.c
    public java.lang.String w() {
        android.content.Context context;
        android.content.res.Resources resources;
        in5.s0 s0Var = this.f453161a;
        java.lang.String string = (s0Var == null || (context = s0Var.f293121e) == null || (resources = context.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.f493799p43);
        return string == null ? "" : string;
    }

    @Override // yc2.c
    public java.util.Map x(yc2.b bVar) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        xc2.p0 p0Var = this.f453162b;
        if (p0Var == null || (baseFinderFeed = p0Var.f453244f) == null || (str = jz5.x.a(baseFinderFeed.getItemId())) == null) {
            str = "0";
        }
        linkedHashMap.put("feed_id", str);
        if (bVar != null) {
            linkedHashMap.put("post_ip_clk_area", java.lang.String.valueOf(bVar.f460828d));
        }
        return linkedHashMap;
    }

    @Override // yc2.c
    public java.lang.String y() {
        return "post_ip_identify";
    }

    @Override // yc2.c
    public void z() {
        xc2.p0 p0Var = this.f453162b;
        if (p0Var == null) {
            return;
        }
        in5.s0 s0Var = this.f453161a;
        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
        if (context == null) {
            return;
        }
        xc2.y2.L(xc2.y2.f453343a, context, p0Var, s0Var, (com.tencent.mm.plugin.lite.s) ((jz5.n) this.f460835g).getValue(), null, 16, null);
    }
}
