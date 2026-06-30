package df;

/* loaded from: classes13.dex */
public final class j extends android.content.MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public android.content.res.Resources f229494a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (this.f229494a == null) {
            this.f229494a = new df.e1(super.getResources());
        }
        android.content.res.Resources resources = this.f229494a;
        if (resources != null) {
            return resources;
        }
        kotlin.jvm.internal.o.o("mResources");
        throw null;
    }

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(android.content.Context context) {
        boolean z17 = !kotlin.jvm.internal.o.b(context, getBaseContext());
        super.setBaseContext(context);
        if (!z17 || this.f229494a == null) {
            return;
        }
        this.f229494a = new df.e1(super.getResources());
    }
}
