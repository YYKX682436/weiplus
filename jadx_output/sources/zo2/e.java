package zo2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f474849a;

    /* renamed from: b, reason: collision with root package name */
    public int f474850b;

    /* renamed from: c, reason: collision with root package name */
    public int f474851c;

    public e(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f474849a = i17;
        recyclerView.i(new zo2.d(this));
    }

    public /* synthetic */ e(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(recyclerView, (i18 & 2) != 0 ? 2 : i17);
    }
}
