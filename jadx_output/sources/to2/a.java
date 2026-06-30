package to2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final to2.a f420939a = new to2.a();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.convert.eh f420940b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.convert.zk f420941c;

    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.convert.eh ehVar = f420940b;
        if (ehVar != null) {
            ehVar.j(recyclerView);
        }
        com.tencent.mm.plugin.finder.convert.zk zkVar = f420941c;
        if (zkVar != null) {
            zkVar.j(recyclerView);
        }
        f420940b = null;
        f420941c = null;
    }
}
