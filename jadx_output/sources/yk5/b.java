package yk5;

/* loaded from: classes11.dex */
public class b implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yk5.e f462864a;

    public b(yk5.e eVar) {
        this.f462864a = eVar;
    }

    @Override // bb5.e
    public int a() {
        return this.f462864a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            yk5.e eVar = this.f462864a;
            if (i17 < eVar.getCount()) {
                com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) eVar.getItem(i17);
                if (l4Var == null) {
                    return null;
                }
                return l4Var.h1();
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SearchConversationAdapter", "pos is invalid");
        return null;
    }
}
