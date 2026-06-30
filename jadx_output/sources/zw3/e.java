package zw3;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final zw3.e f476876d = new zw3.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object parent = it.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.String format = java.lang.String.format("这是%s的头像", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(view != null ? view.getTag(com.tencent.mm.R.id.nwn) : null)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
