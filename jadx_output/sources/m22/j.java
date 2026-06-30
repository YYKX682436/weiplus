package m22;

/* loaded from: classes12.dex */
public class j implements m22.y {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f323051a;

    /* renamed from: b, reason: collision with root package name */
    public final int f323052b;

    /* renamed from: c, reason: collision with root package name */
    public final int f323053c;

    public j(android.content.Context context, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f323051a = context;
        this.f323052b = i17;
        this.f323053c = i18;
    }

    @Override // m22.y
    public void a(m22.i item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (item instanceof m22.l) {
            java.util.LinkedList linkedList2 = ((m22.l) item).f323056b;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.storage.emotion.EmojiGroupInfo) it.next()).field_productID);
            }
            linkedList.addAll(arrayList);
        } else if (item instanceof m22.k) {
            linkedList.add(((m22.k) item).f323054a.field_productID);
        }
        com.tencent.mm.plugin.emoji.model.l lVar = new com.tencent.mm.plugin.emoji.model.l(this.f323051a, linkedList);
        kotlinx.coroutines.l.d(lVar.f97575d, null, null, new com.tencent.mm.plugin.emoji.model.k(lVar, null), 3, null);
    }
}
