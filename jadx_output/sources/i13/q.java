package i13;

/* loaded from: classes5.dex */
public final class q extends i13.r {

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f287318m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String id6, java.lang.String title, java.lang.String msg, long j17, yz5.l lVar) {
        super(id6, title, msg, j17);
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f287318m = lVar;
    }

    @Override // i13.c
    public android.graphics.drawable.Drawable b() {
        return null;
    }

    @Override // i13.c
    public boolean e() {
        return true;
    }

    @Override // i13.c
    public boolean f() {
        return false;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // i13.c
    public void k(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        yz5.l lVar = this.f287318m;
        if (lVar != null) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            lVar.invoke(context);
        }
    }
}
