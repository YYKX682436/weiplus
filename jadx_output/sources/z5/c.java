package z5;

/* loaded from: classes9.dex */
public final class c implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f470160a;

    public c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f470160a = context;
    }

    @Override // z5.b
    public boolean a(java.lang.Object obj) {
        return this.f470160a.getResources().getResourceEntryName(((java.lang.Number) obj).intValue()) != null;
    }

    @Override // z5.b
    public java.lang.Object d(java.lang.Object obj) {
        android.net.Uri parse = android.net.Uri.parse("android.resource://" + ((java.lang.Object) this.f470160a.getPackageName()) + '/' + ((java.lang.Number) obj).intValue());
        kotlin.jvm.internal.o.f(parse, "parse(this)");
        return parse;
    }
}
