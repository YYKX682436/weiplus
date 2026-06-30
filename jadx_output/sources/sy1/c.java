package sy1;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f413835a;

    /* renamed from: b, reason: collision with root package name */
    public final ly1.b f413836b;

    /* renamed from: c, reason: collision with root package name */
    public final yy1.b f413837c;

    public c(sy1.b bVar, sy1.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f413835a = arrayList;
        this.f413837c = new yy1.a();
        if (bVar != null) {
            java.util.List list = bVar.f413832a;
            if (list != null && ((java.util.ArrayList) list).size() > 0) {
                arrayList.addAll(list);
            }
            yy1.b bVar2 = bVar.f413834c;
            if (bVar2 != null) {
                this.f413837c = bVar2;
            }
            this.f413836b = bVar.f413833b;
        }
    }
}
