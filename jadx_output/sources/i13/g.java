package i13;

/* loaded from: classes8.dex */
public abstract class g extends i13.c {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f287281h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f287282i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Bitmap f287283m;

    /* renamed from: n, reason: collision with root package name */
    public final int f287284n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String id6, java.lang.String title, java.lang.String desc, android.graphics.Bitmap bitmap, int i17, long j17) {
        super(id6, j17);
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f287281h = title;
        this.f287282i = desc;
        this.f287283m = bitmap;
        this.f287284n = i17;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 2;
    }

    @Override // i13.c
    public void k(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    public abstract void r(in5.s0 s0Var, int i17, int i18, boolean z17, java.util.List list);
}
