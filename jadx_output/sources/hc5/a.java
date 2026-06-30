package hc5;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f280369a;

    public a(yb5.d mChattingContext) {
        kotlin.jvm.internal.o.g(mChattingContext, "mChattingContext");
        this.f280369a = mChattingContext;
    }

    public abstract int a(java.util.List list);

    public int b() {
        return 0;
    }

    public abstract java.lang.String c();

    public rd5.d d(java.util.List msgInfos) {
        kotlin.jvm.internal.o.g(msgInfos, "msgInfos");
        return (rd5.d) msgInfos.get(b());
    }

    public abstract java.lang.Class e(rd5.d dVar);

    public void f() {
    }

    public void g(java.util.List msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
    }

    public abstract java.lang.String h(rd5.d dVar);
}
