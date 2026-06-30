package zn2;

/* loaded from: classes2.dex */
public class b implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f474489d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup.MarginLayoutParams f474490e;

    public b(java.lang.String desc, android.view.ViewGroup.MarginLayoutParams lp6) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(lp6, "lp");
        this.f474489d = desc;
        this.f474490e = lp6;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof zn2.b) {
            return kotlin.jvm.internal.o.b(this.f474489d, ((zn2.b) obj).f474489d) ? 0 : -1;
        }
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 11000;
    }
}
