package du3;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.q f243668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f243669e;

    public o(du3.q qVar, com.tencent.mm.modelbase.f fVar) {
        this.f243668d = qVar;
        this.f243669e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        du3.q qVar = this.f243668d;
        qVar.f243681f.clear();
        java.util.ArrayList arrayList = qVar.f243681f;
        java.util.LinkedList<r45.y6> list = ((r45.pg7) ((r45.z86) this.f243669e.f70618d).getCustom(1)).getList(0);
        kotlin.jvm.internal.o.f(list, "getAiImgEditTags(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.y6 y6Var : list) {
            du3.a aVar = du3.b.f243513e;
            java.lang.String string = y6Var.getString(0);
            kotlin.jvm.internal.o.f(string, "getId(...)");
            java.lang.String string2 = y6Var.getString(1);
            kotlin.jvm.internal.o.f(string2, "getTagName(...)");
            java.lang.String string3 = y6Var.getString(2);
            kotlin.jvm.internal.o.f(string3, "getHostUrl(...)");
            arrayList2.add(new du3.b(du3.b.f243519k, string, string2, string3));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(du3.b.f243513e.b());
        qVar.notifyDataSetChanged();
    }
}
