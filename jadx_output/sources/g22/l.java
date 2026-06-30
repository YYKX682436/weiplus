package g22;

/* loaded from: classes15.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final g22.l f267845d = new g22.l();

    public l() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j22.k it = (j22.k) obj;
        kotlin.jvm.internal.o.g(it, "it");
        for (java.util.Map.Entry entry : it.f297262a.entrySet()) {
            com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct b17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();
            b17.f56076j = ((java.lang.Number) entry.getKey()).intValue();
            b17.f56072f = 1;
            b17.f56071e = 1;
            b17.f56070d = j22.a.f297249a;
            j22.j.f297257e.a(b17, (java.util.List) entry.getValue());
            b17.k();
        }
        return jz5.f0.f302826a;
    }
}
