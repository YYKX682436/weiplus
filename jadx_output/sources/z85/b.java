package z85;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f470782e = {l75.n0.getCreateSQLs(z85.a.f470781r, "EmojiDesignerProduct")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470783d;

    public b(l75.k0 k0Var) {
        super(k0Var, z85.a.f470781r, "EmojiDesignerProduct", null);
        this.f470783d = k0Var;
    }

    public void y0(com.tencent.mm.storage.e5 e5Var) {
        java.lang.String[] strArr = {e5Var.f193857a + ""};
        l75.k0 k0Var = this.f470783d;
        k0Var.delete("EmojiDesignerProduct", "designerUin=? ", strArr);
        java.util.Iterator it = e5Var.f193858b.iterator();
        while (it.hasNext()) {
            k0Var.l("EmojiDesignerProduct", "", ((z85.a) it.next()).convertTo());
        }
    }
}
