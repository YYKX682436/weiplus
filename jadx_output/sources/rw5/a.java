package rw5;

/* loaded from: classes8.dex */
public final class a implements defpackage.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow5.a f400648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f400649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f400650c;

    public a(ow5.a aVar, java.lang.String str, long j17) {
        this.f400648a = aVar;
        this.f400649b = str;
        this.f400650c = j17;
    }

    @Override // defpackage.l
    public void a() {
        java.lang.String format = "appId[" + this.f400650c + "], notifyDestroyBiz";
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.String tag = this.f400649b;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        defpackage.m mVar = this.f400648a.f349435g;
        if (mVar != null) {
            mVar.a();
        }
    }
}
