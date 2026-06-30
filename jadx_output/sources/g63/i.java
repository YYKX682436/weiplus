package g63;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f269123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f269124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g63.j jVar, java.util.List list) {
        super(0);
        this.f269123d = jVar;
        this.f269124e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g63.j jVar = this.f269123d;
        int itemCount = jVar.getItemCount();
        java.util.LinkedList linkedList = jVar.f269130g;
        java.util.List list = this.f269124e;
        linkedList.addAll(list);
        jVar.notifyItemRangeInserted(itemCount, list.size());
        return jz5.f0.f302826a;
    }
}
