package k93;

/* loaded from: classes3.dex */
public class y implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.b7 f305930a;

    public y(com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel, db5.b7 b7Var) {
        this.f305930a = b7Var;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.c(str, "view_clk")) {
            hashMap.put("tag_clk_status", java.lang.Integer.valueOf(((java.lang.Integer) this.f305930a.f228296b.getTag()).intValue() == 1 ? 2 : 1));
        }
        return hashMap;
    }
}
